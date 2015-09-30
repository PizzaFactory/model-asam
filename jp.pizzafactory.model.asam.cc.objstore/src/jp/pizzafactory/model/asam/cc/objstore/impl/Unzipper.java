package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import jp.pizzafactory.model.asam.cc.objstore.internal.Activator;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

import asam.cc.Ablock;

public class Unzipper {

    public Map<String, String> getPathHash(final Ablock ablock)
            throws CoreException {
        MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, 0, "Duplicate file paths specified", null);
        final Map<String, String> pathHash = new HashMap<String, String>();
        for (String filePath : ablock.getFiles().getFile()) {
            if (pathHash.get(filePath) != null) {
                IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        filePath);
                multiStatus.add(status);
            }
            pathHash.put(filePath, filePath);
        }

        if (!multiStatus.isOK()) {
            throw new CoreException(multiStatus);
        }
        return pathHash;
    }

    public void unzip(File zipFile, Ablock ablock, RepositoryConfiguration conf)
            throws CoreException {
        final Map<String, String> pathHash = getPathHash(ablock);
        final File basedir = conf.getBasedir();

        try {
            final FileInputStream fis = new FileInputStream(zipFile);
            final ZipInputStream zis = new ZipInputStream(fis);
            ZipEntry entry = null;
            while ((entry = zis.getNextEntry()) != null) {
                if (!entry.isDirectory()) {
                    final String relativePath = entry.getName();
                    if (pathHash.get(relativePath) != null) {
                        final File outFile = new File(basedir, relativePath);
                        final File parentDir = outFile.getParentFile();
                        parentDir.mkdirs();
                        final FileOutputStream fos = new FileOutputStream(
                                outFile);
                        IOUtils.copy(zis, fos);
                        pathHash.put(relativePath, null);
                    }
                }
            }
        } catch (IOException e) {
            IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                    "Internal error: unzip failed.", e);
            throw new CoreException(status);
        }
        
        checkMissingFiles(pathHash);
    }

    /**
     * Check if missing files are available
     */
    private void checkMissingFiles(Map<String, String> pathHash)
            throws CoreException {
        MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID, 0, "Specified file(s) are not found.", null);
        for (String path : pathHash.values()) {
            if (!new File(path).exists()) {
                multiStatus.add(new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        path, null));
            }
        }
        if (!multiStatus.isOK()) {
            throw new CoreException(multiStatus);
        }

    }
}
