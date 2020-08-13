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

public class ComponentInterface extends AbstractResponse<ComponentInterface> implements IssueLocation, Node {
    public ComponentInterface() {
    }

    public ComponentInterface(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "owner": {
                    responseData.put(key, new User(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "component": {
                    responseData.put(key, new Component(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "consumedBy": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
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

    public ComponentInterface(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ComponentInterface";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public String getName() {
        return (String) get("name");
    }

    public ComponentInterface setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public User getOwner() {
        return (User) get("owner");
    }

    public ComponentInterface setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public ComponentInterface setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public Component getComponent() {
        return (Component) get("component");
    }

    public ComponentInterface setComponent(Component arg) {
        optimisticData.put(getKey("component"), arg);
        return this;
    }

    public ComponentPage getConsumedBy() {
        return (ComponentPage) get("consumedBy");
    }

    public ComponentInterface setConsumedBy(ComponentPage arg) {
        optimisticData.put(getKey("consumedBy"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "owner": return true;

            case "description": return false;

            case "component": return true;

            case "consumedBy": return true;

            default: return false;
        }
    }
}

