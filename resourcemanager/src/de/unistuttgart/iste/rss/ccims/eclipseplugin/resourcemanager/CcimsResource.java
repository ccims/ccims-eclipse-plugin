package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URISyntaxException;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Query;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.datamodel.CrossComponentIssueManagementSystem;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager.apiadapter.ApiQueryManager;

public class CcimsResource extends ResourceImpl {

	private ApiQueryManager apiQueryManager;
	private DataMapper dataMapper;
	
	public CcimsResource(URI uri) {
		super(uri);
		try {
			java.net.URI apiUri = convertUri(uri);
			apiQueryManager = new ApiQueryManager(apiUri);
			dataMapper = new DataMapper(apiUri.toString());
		} catch (URISyntaxException | UnsupportedEncodingException e) {
			throw new IllegalStateException("Could not generate api request uri", e);
		}
	}

	/**
	 * This implementation directly loads the EObjects from the API without
	 * deserialization. Therefore this does call neither
	 * {@link ResourceImpl#load(Map)} nor {@link #load(InputStream, Map)}.
	 * <p>
	 * As all currently defined options only relate to the format of the file on
	 * disk, the options parameter is not used here.
	 * 
	 * @param options Options for loading. Not used.
	 */
	@Override
	public void load(Map<?, ?> options) throws IOException {
		try {
			Query apiQuery = apiQueryManager.query();
			CrossComponentIssueManagementSystem ccims = dataMapper.mapToEObject(apiQuery);
			this.getContents().add(ccims);
		} catch (IOException | InterruptedException e) {
			throw new IOException("Failed to load data from api", e);
		}
	}

	@Override
	public void save(Map<?, ?> options) throws IOException {
		// TODO: implememnt
	}

	/**
	 * Converts eclispe ecore uri with ccims schema to java.net uri with http schema.
	 * @param uri The eclipse ecore uri with a ccims based schema
	 * @return The java.net uri with a http based schema
	 * @throws URISyntaxException When the resulting uri is not legal
	 */
	private java.net.URI convertUri(URI uri) throws URISyntaxException{
		return new java.net.URI(uri.scheme().replace("ccims", "http"), uri.userInfo(), uri.host(), uri.port() == null ? -1 : Integer.parseInt(uri.port()), uri.path(), uri.query(),
				uri.fragment());
	}
	
}
