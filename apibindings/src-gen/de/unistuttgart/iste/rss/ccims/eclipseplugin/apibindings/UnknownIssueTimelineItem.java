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

public class UnknownIssueTimelineItem extends AbstractResponse<UnknownIssueTimelineItem> implements IssueTimelineItem {
    public UnknownIssueTimelineItem() {
    }

    public UnknownIssueTimelineItem(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
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

    public static IssueTimelineItem create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "AddedLocationEvent": {
                return new AddedLocationEvent(fields);
            }

            case "AssignedEvent": {
                return new AssignedEvent(fields);
            }

            case "CategoryChangedEvent": {
                return new CategoryChangedEvent(fields);
            }

            case "ClosedEvent": {
                return new ClosedEvent(fields);
            }

            case "DeletedIssueComment": {
                return new DeletedIssueComment(fields);
            }

            case "DueDateChangedEvent": {
                return new DueDateChangedEvent(fields);
            }

            case "EstimatedTimeChangedEvent": {
                return new EstimatedTimeChangedEvent(fields);
            }

            case "IssueComment": {
                return new IssueComment(fields);
            }

            case "LabelledEvent": {
                return new LabelledEvent(fields);
            }

            case "LinkEvent": {
                return new LinkEvent(fields);
            }

            case "MarkedAsDuplicateEvent": {
                return new MarkedAsDuplicateEvent(fields);
            }

            case "PinnedEvent": {
                return new PinnedEvent(fields);
            }

            case "PriorityChangedEvent": {
                return new PriorityChangedEvent(fields);
            }

            case "ReferencedByIssueEvent": {
                return new ReferencedByIssueEvent(fields);
            }

            case "ReferencedByOtherEvent": {
                return new ReferencedByOtherEvent(fields);
            }

            case "RemovedLocationEvent": {
                return new RemovedLocationEvent(fields);
            }

            case "RenamedTitleEvent": {
                return new RenamedTitleEvent(fields);
            }

            case "ReopenedEvent": {
                return new ReopenedEvent(fields);
            }

            case "StartDateChangedEvent": {
                return new StartDateChangedEvent(fields);
            }

            case "UnassignedEvent": {
                return new UnassignedEvent(fields);
            }

            case "UnlabelledEvent": {
                return new UnlabelledEvent(fields);
            }

            case "UnlinkEvent": {
                return new UnlinkEvent(fields);
            }

            case "UnmarkedAsDuplicateEvent": {
                return new UnmarkedAsDuplicateEvent(fields);
            }

            case "UnpinnedEvent": {
                return new UnpinnedEvent(fields);
            }

            case "WasLinkedEvent": {
                return new WasLinkedEvent(fields);
            }

            case "WasUnlinkedEvent": {
                return new WasUnlinkedEvent(fields);
            }

            default: {
                return new UnknownIssueTimelineItem(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public Issue getIssue() {
        return (Issue) get("issue");
    }

    public UnknownIssueTimelineItem setIssue(Issue arg) {
        optimisticData.put(getKey("issue"), arg);
        return this;
    }

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public UnknownIssueTimelineItem setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public UnknownIssueTimelineItem setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "issue": return true;

            case "createdBy": return true;

            case "createdAt": return false;

            default: return false;
        }
    }
}

