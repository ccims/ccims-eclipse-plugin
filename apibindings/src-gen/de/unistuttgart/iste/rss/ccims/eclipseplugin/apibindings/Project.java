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

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Project extends AbstractResponse<Project> implements Node {
    public Project() {
    }

    public Project(JsonObject fields) throws SchemaViolationError {
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

                case "components": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "users": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "owner": {
                    responseData.put(key, new User(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "issues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
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

    public Project(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Project";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public String getName() {
        return (String) get("name");
    }

    public Project setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public ComponentPage getComponents() {
        return (ComponentPage) get("components");
    }

    public Project setComponents(ComponentPage arg) {
        optimisticData.put(getKey("components"), arg);
        return this;
    }

    public UserPage getUsers() {
        return (UserPage) get("users");
    }

    public Project setUsers(UserPage arg) {
        optimisticData.put(getKey("users"), arg);
        return this;
    }

    public User getOwner() {
        return (User) get("owner");
    }

    public Project setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    public IssuePage getIssues() {
        return (IssuePage) get("issues");
    }

    public Project setIssues(IssuePage arg) {
        optimisticData.put(getKey("issues"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "components": return true;

            case "users": return true;

            case "owner": return true;

            case "issues": return true;

            default: return false;
        }
    }
}

