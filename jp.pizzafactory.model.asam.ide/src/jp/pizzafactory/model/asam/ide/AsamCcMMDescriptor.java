package jp.pizzafactory.model.asam.ide;

import org.eclipse.sphinx.emf.metamodel.AbstractMetaModelDescriptor;

public class AsamCcMMDescriptor extends AbstractMetaModelDescriptor {

	private static final String ID = "jp.pizzafactory.model.asam.cc";

	private static final String NAMESPACE = "http://pizzafactory.jp/asam/cc";

	private static final String NAME = "ASAM Container Catalog";

	public static final AsamCcMMDescriptor INSTANCE = new AsamCcMMDescriptor();

	protected AsamCcMMDescriptor() {
		super(ID, NAMESPACE, NAME);
	}

	@Override
	public String getDefaultContentTypeId() {
		return "jp.pizzafactory.model.asam.cc";
	}

}
