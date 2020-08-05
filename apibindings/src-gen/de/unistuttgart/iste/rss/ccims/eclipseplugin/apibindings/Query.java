// Generated from graphql_java_gen gem

package de.unistuttgart.iste.rss.ccims.eclipseplugin.apibindings;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.shopify.graphql.support.AbstractResponse;
import com.shopify.graphql.support.Arguments;
import com.shopify.graphql.support.Error;
import com.shopify.graphql.support.TopLevelResponse;
import com.shopify.graphql.support.Input;
import com.shopify.graphql.support.SchemaViolationError;
import com.shopify.graphql.support.ID;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
* All queries
*/
public class Query extends AbstractResponse<Query> {
    public Query() {
    }

    public Query(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "node": {
                    Node optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownNode.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "projects": {
                    ProjectPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProjectPage(jsonAsObject(field.getValue(), key));
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
        return "Query";
    }

    /**
    * Requests an object (node) using the given ID. If the given ID is invalid an error will be returned
    */

    public Node getNode() {
        return (Node) get("node");
    }

    public Query setNode(Node arg) {
        optimisticData.put(getKey("node"), arg);
        return this;
    }

    /**
    * Requests projects in this instance of ccims
    */

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public Query setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "node": return false;

            case "projects": return true;

            default: return false;
        }
    }
}

