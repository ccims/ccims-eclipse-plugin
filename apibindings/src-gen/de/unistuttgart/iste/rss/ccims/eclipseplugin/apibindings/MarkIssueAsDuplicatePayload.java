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

public class MarkIssueAsDuplicatePayload extends AbstractResponse<MarkIssueAsDuplicatePayload> {
    public MarkIssueAsDuplicatePayload() {
    }

    public MarkIssueAsDuplicatePayload(JsonObject fields) throws SchemaViolationError {
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

                case "issue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "originalIssue": {
                    Issue optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new Issue(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    MarkedAsDuplicateEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarkedAsDuplicateEvent(jsonAsObject(field.getValue(), key));
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
        return "MarkIssueAsDuplicatePayload";
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public MarkIssueAsDuplicatePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public MarkIssueAsDuplicatePayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public Issue getOriginalIssue() {
        return (Issue) get("originalIssue");
    }

    public MarkIssueAsDuplicatePayload setOriginalIssue(Issue arg) {
        optimisticData.put(getKey("originalIssue"), arg);
        return this;
    }

    public MarkedAsDuplicateEvent getEvent() {
        return (MarkedAsDuplicateEvent) get("event");
    }

    public MarkIssueAsDuplicatePayload setEvent(MarkedAsDuplicateEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public MarkIssueAsDuplicatePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "issue": return true;

            case "originalIssue": return true;

            case "event": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

