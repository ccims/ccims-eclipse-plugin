// Generated from graphql_java_gen gem

package de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.Query;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;

import com.shopify.graphql.support.ID;

import java.time.Instant;

import java.time.format.DateTimeFormatter;

import java.time.temporal.TemporalAccessor;

import java.util.Date;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class AddReactionPayload extends AbstractResponse<AddReactionPayload> {
    public AddReactionPayload() {
    }

    public AddReactionPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "clientMutationID": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reaction": {
                    ReactionGroup optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroup(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reactionEdge": {
                    ReactionGroupEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroupEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public String getGraphQlTypeName() {
        return "AddReactionPayload";
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public AddReactionPayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public ReactionGroup getReaction() {
        return (ReactionGroup) get("reaction");
    }

    public AddReactionPayload setReaction(ReactionGroup arg) {
        optimisticData.put(getKey("reaction"), arg);
        return this;
    }

    public ReactionGroupEdge getReactionEdge() {
        return (ReactionGroupEdge) get("reactionEdge");
    }

    public AddReactionPayload setReactionEdge(ReactionGroupEdge arg) {
        optimisticData.put(getKey("reactionEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "reaction": return true;

            case "reactionEdge": return true;

            default: return false;
        }
    }
}

