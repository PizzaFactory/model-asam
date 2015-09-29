package jp.pizzafactory.model.asam.cc.objstore.impl;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

import jp.pizzafactory.model.asam.cc.objstore.Zipper;
import jp.pizzafactory.model.asam.cc.objstore.internal.Activator;
import jp.pizzafactory.model.asam.cc.objstore.internal.RepositoryConfiguration;

import org.apache.commons.io.IOUtils;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.MultiStatus;
import org.eclipse.core.runtime.Status;

import asam.cc.Ablock;

public class ZipperImpl implements Zipper {
    private HashMap<String, String> pathMap;
    private Ablock ablock;
    private RepositoryConfiguration conf;

    ZipperImpl(Ablock ablock, RepositoryConfiguration conf) {
        this.ablock = ablock;
        this.conf = conf;
    }

    private void storeEntries(ZipOutputStream zos)
            throws CoreException {

        MultiStatus multiStatus = new MultiStatus(Activator.PLUGIN_ID,
                IStatus.OK, "Invalid URL(s)", null);

        for (String filePath : ablock.getFiles().getFile()) {
            InputStream is = null;
            try {
                final ZipEntry entry = new ZipEntry(filePath);

                /* Use the mapped location if it was specified */
                if (pathMap != null && pathMap.get(filePath) != null) {
                    filePath = pathMap.get(filePath);
                }

                File file = new File(filePath);
                if (!file.isAbsolute()) {
                    file = new File(conf.getBasedir(), filePath);
                }
                final FileInputStream fis = new FileInputStream(file);
                zos.putNextEntry(entry);
                is = new BufferedInputStream(fis);
                IOUtils.copy(is, zos);
            } catch (IOException e) {
                final IStatus status = new Status(IStatus.ERROR,
                        Activator.PLUGIN_ID,
                        filePath);
                multiStatus.add(status);
            } finally {
                IOUtils.closeQuietly(is);
            }
        }

        if (!multiStatus.isOK()) {
            throw new CoreException(multiStatus);
        }
    }

    /* (non-Javadoc)
     * @see jp.pizzafactory.model.asam.cc.objstore.impl.Zipper#buildZipArchive()
     */
    @Override
    public File buildZipArchive() throws CoreException {

        final File zipFile;
        ZipOutputStream zos = null;

        try {
            try {
                Path zipPath = Files.createTempFile(null, null);
                zipFile = zipPath.toFile();
                FileOutputStream fos = new FileOutputStream(zipFile);
                zos = new ZipOutputStream(new BufferedOutputStream(fos));
            } catch (IOException e) {
                IStatus status = new Status(IStatus.ERROR, Activator.PLUGIN_ID,
                        "Internal error: can't create zip file.", e);
                throw new CoreException(status);
            }

            storeEntries(zos);
        } finally {
            IOUtils.closeQuietly(zos);
        }

        return zipFile;
    }

    /* (non-Javadoc)
     * @see jp.pizzafactory.model.asam.cc.objstore.impl.Zipper#getPathMap()
     */
    @Override
    public Map<String, String> getPathMap() {
        if (pathMap == null) {
            pathMap = new HashMap<String, String>();
        }
        return pathMap;
    }
}
