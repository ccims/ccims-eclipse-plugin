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

public class AddAssigneePayload extends AbstractResponse<AddAssigneePayload> {
    public AddAssigneePayload() {
    }

    public AddAssigneePayload(JsonObject fields) throws SchemaViolationError {
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

                case "assignee": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    AssignedEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AssignedEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "assigneeEdge": {
                    UserEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserEdge(jsonAsObject(field.getValue(), key));
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
        return "AddAssigneePayload";
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public AddAssigneePayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public AddAssigneePayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public User getAssignee() {
        return (User) get("assignee");
    }

    public AddAssigneePayload setAssignee(User arg) {
        optimisticData.put(getKey("assignee"), arg);
        return this;
    }

    public AssignedEvent getEvent() {
        return (AssignedEvent) get("event");
    }

    public AddAssigneePayload setEvent(AssignedEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    public UserEdge getAssigneeEdge() {
        return (UserEdge) get("assigneeEdge");
    }

    public AddAssigneePayload setAssigneeEdge(UserEdge arg) {
        optimisticData.put(getKey("assigneeEdge"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public AddAssigneePayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "issue": return true;

            case "assignee": return true;

            case "event": return true;

            case "assigneeEdge": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

