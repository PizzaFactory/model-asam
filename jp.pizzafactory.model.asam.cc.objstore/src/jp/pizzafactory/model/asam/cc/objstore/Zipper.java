package jp.pizzafactory.model.asam.cc.objstore;

import java.io.File;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;

public interface Zipper {

    public abstract File buildZipArchive() throws CoreException;

    public abstract Map<String, String> getPathMap();

}