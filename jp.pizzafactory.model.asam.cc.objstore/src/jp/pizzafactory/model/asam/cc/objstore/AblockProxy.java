package jp.pizzafactory.model.asam.cc.objstore;

import java.io.File;

import org.eclipse.core.runtime.CoreException;

import asam.cc.Ablock;

public interface AblockProxy {

    public abstract File toFile(Ablock ablock, String classifier, String version)
            throws CoreException;

}