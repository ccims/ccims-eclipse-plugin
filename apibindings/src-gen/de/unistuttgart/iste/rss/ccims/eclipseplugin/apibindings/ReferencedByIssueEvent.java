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

public class ReferencedByIssueEvent extends AbstractResponse<ReferencedByIssueEvent> implements IssueTimelineItem, Node {
    public ReferencedByIssueEvent() {
    }

    public ReferencedByIssueEvent(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issue": {
                    responseData.put(key, new Issue(jsonAsObject(field.getValue(), key)));

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

                case "createdAt": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "mentionedAt": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "mentionedInComment": {
                    IssueComment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueComment(jsonAsObject(field.getValue(), key));
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

    public ReferencedByIssueEvent(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "ReferencedByIssueEvent";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public ReferencedByIssueEvent setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public ReferencedByIssueEvent setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public ReferencedByIssueEvent setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public Issue getMentionedAt() {
        return (Issue) get("mentionedAt");
    }

    public ReferencedByIssueEvent setMentionedAt(Issue arg) {
        optimisticData.put(getKey("mentionedAt"), arg);
        return this;
    }

    public IssueComment getMentionedInComment() {
        return (IssueComment) get("mentionedInComment");
    }

    public ReferencedByIssueEvent setMentionedInComment(IssueComment arg) {
        optimisticData.put(getKey("mentionedInComment"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "issue": return true;

            case "createdBy": return true;

            case "createdAt": return false;

            case "mentionedAt": return true;

            case "mentionedInComment": return true;

            default: return false;
        }
    }
}

