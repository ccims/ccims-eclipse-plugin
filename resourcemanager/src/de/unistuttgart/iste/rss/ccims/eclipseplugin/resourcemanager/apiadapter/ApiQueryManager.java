package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager.apiadapter;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLEncoder;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Operations;
import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Query;

public class ApiQueryManager {
	private final URI requestUri;
	private Gson gsonInstance;
	private HttpClient httpClient;
	
	
	public ApiQueryManager(final URI apiUri) throws UnsupportedEncodingException, URISyntaxException {
		this.gsonInstance = new GsonBuilder().registerTypeAdapter(Query.class, new QueryDeserializer()).create();
		
		String query = Operations.query(ApiQueries.ALL_PROJECTS_ALL_DATA).toString();
		
		HttpClient.Builder httpClientBuilder = HttpClient.newBuilder();
		httpClient = httpClientBuilder.build();
		
		String queryString = "query=" + URLEncoder.encode(query, "UTF-8");
		requestUri = new URI(apiUri.getScheme() + "://" + apiUri.getRawAuthority() + apiUri.getRawPath() + "?" + queryString);
	}

	public Query query() throws IOException, InterruptedException {				
		HttpRequest.Builder requestBuilder = HttpRequest.newBuilder();
		requestBuilder.GET();
		requestBuilder.uri(requestUri);
		
		HttpResponse<String> response = httpClient.send(requestBuilder.build(), BodyHandlers.ofString());
		
		if(response.statusCode() != 200) {
			throw new IOException("Reuqest failed with " + response.statusCode() + ". Body:\n" + response.body());
		}
		
		String body = response.body();
				
		// Cut {"data": and }
		// This is probably a mismatch between the server and the apibindings generator
		body = body.substring(8, body.length() - 1);
		
		return gsonInstance.fromJson(body, Query.class);
	}

}
