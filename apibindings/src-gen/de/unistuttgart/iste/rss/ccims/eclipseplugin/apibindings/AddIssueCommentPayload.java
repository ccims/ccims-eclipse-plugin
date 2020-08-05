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

public class AddIssueCommentPayload extends AbstractResponse<AddIssueCommentPayload> {
    public AddIssueCommentPayload() {
    }

    public AddIssueCommentPayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "comment": {
                    IssueComment optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueComment(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "clientMutationID": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "commentEdge": {
                    IssueCommentEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueCommentEdge(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timelineEdge": {
                    IssueTimelineItemEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemEdge(jsonAsObject(field.getValue(), key));
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
        return "AddIssueCommentPayload";
    }

    public IssueComment getComment() {
        return (IssueComment) get("comment");
    }

    public AddIssueCommentPayload setComment(IssueComment arg) {
        optimisticData.put(getKey("comment"), arg);
        return this;
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public AddIssueCommentPayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public IssueCommentEdge getCommentEdge() {
        return (IssueCommentEdge) get("commentEdge");
    }

    public AddIssueCommentPayload setCommentEdge(IssueCommentEdge arg) {
        optimisticData.put(getKey("commentEdge"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public AddIssueCommentPayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "comment": return true;

            case "clientMutationID": return false;

            case "commentEdge": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

