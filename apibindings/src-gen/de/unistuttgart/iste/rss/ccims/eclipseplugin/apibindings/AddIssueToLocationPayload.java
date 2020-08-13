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

public class AddIssueToLocationPayload extends AbstractResponse<AddIssueToLocationPayload> {
    public AddIssueToLocationPayload() {
    }

    public AddIssueToLocationPayload(JsonObject fields) throws SchemaViolationError {
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

                case "addedLocation": {
                    IssueLocation optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = UnknownIssueLocation.create(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "event": {
                    AddedLocationEvent optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddedLocationEvent(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locationEdge": {
                    IssueLocationEdge optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueLocationEdge(jsonAsObject(field.getValue(), key));
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
        return "AddIssueToLocationPayload";
    }

    public String getClientMutationId() {
        return (String) get("clientMutationID");
    }

    public AddIssueToLocationPayload setClientMutationId(String arg) {
        optimisticData.put(getKey("clientMutationID"), arg);
        return this;
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public AddIssueToLocationPayload setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public IssueLocation getAddedLocation() {
        return (IssueLocation) get("addedLocation");
    }

    public AddIssueToLocationPayload setAddedLocation(IssueLocation arg) {
        optimisticData.put(getKey("addedLocation"), arg);
        return this;
    }

    public AddedLocationEvent getEvent() {
        return (AddedLocationEvent) get("event");
    }

    public AddIssueToLocationPayload setEvent(AddedLocationEvent arg) {
        optimisticData.put(getKey("event"), arg);
        return this;
    }

    public IssueLocationEdge getLocationEdge() {
        return (IssueLocationEdge) get("locationEdge");
    }

    public AddIssueToLocationPayload setLocationEdge(IssueLocationEdge arg) {
        optimisticData.put(getKey("locationEdge"), arg);
        return this;
    }

    public IssueTimelineItemEdge getTimelineEdge() {
        return (IssueTimelineItemEdge) get("timelineEdge");
    }

    public AddIssueToLocationPayload setTimelineEdge(IssueTimelineItemEdge arg) {
        optimisticData.put(getKey("timelineEdge"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "clientMutationID": return false;

            case "issue": return true;

            case "addedLocation": return false;

            case "event": return true;

            case "locationEdge": return true;

            case "timelineEdge": return true;

            default: return false;
        }
    }
}

