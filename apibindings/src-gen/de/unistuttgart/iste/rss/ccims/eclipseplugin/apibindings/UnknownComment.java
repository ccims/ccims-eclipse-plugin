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

public class UnknownComment extends AbstractResponse<UnknownComment> implements Comment {
    public UnknownComment() {
    }

    public UnknownComment(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "createdBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "editedBy": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "editedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "body": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "bodyRendered": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reactions": {
                    ReactionGroupPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReactionGroupPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentUserCanEdit": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

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

    public static Comment create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "Issue": {
                return new Issue(fields);
            }

            case "IssueComment": {
                return new IssueComment(fields);
            }

            default: {
                return new UnknownComment(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public ID getId() {
        return (ID) get("id");
    }

    public UnknownComment setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public UnknownComment setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    public User getEditedBy() {
        return (User) get("editedBy");
    }

    public UnknownComment setEditedBy(User arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public UnknownComment setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public String getEditedAt() {
        return (String) get("editedAt");
    }

    public UnknownComment setEditedAt(String arg) {
        optimisticData.put(getKey("editedAt"), arg);
        return this;
    }

    public String getBody() {
        return (String) get("body");
    }

    public UnknownComment setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public UnknownComment setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public UnknownComment setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    public Boolean getCurrentUserCanEdit() {
        return (Boolean) get("currentUserCanEdit");
    }

    public UnknownComment setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "createdBy": return true;

            case "editedBy": return true;

            case "createdAt": return false;

            case "editedAt": return false;

            case "body": return false;

            case "bodyRendered": return false;

            case "reactions": return true;

            case "currentUserCanEdit": return false;

            default: return false;
        }
    }
}

