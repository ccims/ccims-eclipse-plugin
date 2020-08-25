package de.unistuttgart.iste.rss.ccims.eclipseplugin.resourcemanager.apiadapter;

import java.lang.reflect.Type;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.shopify.graphql.support.SchemaViolationError;

import de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings.Query;

public class QueryDeserializer implements JsonDeserializer<Query>{
	@Override
	public Query deserialize(JsonElement json, Type type, JsonDeserializationContext context) throws JsonParseException {
		try {
			return new Query(json.getAsJsonObject());
		} catch (SchemaViolationError e) {
			throw new JsonParseException(e);
		}
	}
}
