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

public class ReopenIssuePayload extends AbstractResponse<ReopenIssuePayload> {
    public ReopenIssuePayload() {
    }

    public ReopenIssuePayload(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "clientMutationID": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "reopenedIssue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    ReopenedEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReopenedEvent(jsonAsObject(field.getValue(), key));
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
        return "ReopenIssuePayload";
    }

    public ID getClientMutationId() {
        return (ID) get("clientMutationID");
    }

    public ReopenIssuePayload setClientMutationId(ID arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public Issue getReopenedIssue() {
        return (Issue) get("reopenedIssue");
    }

    public ReopenIssuePayload setReopenedIssue(Issue arg) {
        optimisticData.put(getKey("reopenedIssue"), arg);
        return this;
    }

    public ReopenedEvent getEvent() {
        return (ReopenedEvent) get("event");
    }

    public ReopenIssuePayload setEvent(ReopenedEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public ReopenIssuePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "reopenedIssue": return true;

            case "event": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

