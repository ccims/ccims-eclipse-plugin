package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceFactoryImpl;

public class CcimsResourceFactory implements Resource.Factory {

	@Override
	public Resource createResource(URI uri) {
		return new CcimsResource(uri);
	}

}
