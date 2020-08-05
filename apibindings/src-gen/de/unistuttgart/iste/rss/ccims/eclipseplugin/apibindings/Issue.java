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

public class Issue extends AbstractResponse<Issue> implements Comment {
    public Issue() {
    }

    public Issue(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "title": {
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

                case "updatedAt": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "isOpen": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "isDuplicate": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "category": {
                    responseData.put(key, IssueCategory.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "issueComments": {
                    IssueCommentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueCommentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkedIssues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
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

                case "assignees": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "labels": {
                    LabelPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LabelPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "participants": {
                    UserPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UserPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pinnedOn": {
                    ComponentPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "timeline": {
                    IssueTimelineItemPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueTimelineItemPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "locations": {
                    IssueLocationPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssueLocationPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "currentUserCanEdit": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "currentUserCanComment": {
                    responseData.put(key, jsonAsBoolean(field.getValue(), key));

                    break;
                }

                case "startDate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "dueDate": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "estimatedTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "spentTime": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
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
        return "Issue";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public Issue setId(ID arg) {
        optimisticData.put(getKey("id"), arg);
        return this;
    }

    public String getTitle() {
        return (String) get("title");
    }

    public Issue setTitle(String arg) {
        optimisticData.put(getKey("title"), arg);
        return this;
    }

    public ComponentPage getComponents() {
        return (ComponentPage) get("components");
    }

    public Issue setComponents(ComponentPage arg) {
        optimisticData.put(getKey("components"), arg);
        return this;
    }

    public String getBody() {
        return (String) get("body");
    }

    public Issue setBody(String arg) {
        optimisticData.put(getKey("body"), arg);
        return this;
    }

    public String getBodyRendered() {
        return (String) get("bodyRendered");
    }

    public Issue setBodyRendered(String arg) {
        optimisticData.put(getKey("bodyRendered"), arg);
        return this;
    }

    public User getCreatedBy() {
        return (User) get("createdBy");
    }

    public Issue setCreatedBy(User arg) {
        optimisticData.put(getKey("createdBy"), arg);
        return this;
    }

    public User getEditedBy() {
        return (User) get("editedBy");
    }

    public Issue setEditedBy(User arg) {
        optimisticData.put(getKey("editedBy"), arg);
        return this;
    }

    public String getCreatedAt() {
        return (String) get("createdAt");
    }

    public Issue setCreatedAt(String arg) {
        optimisticData.put(getKey("createdAt"), arg);
        return this;
    }

    public String getEditedAt() {
        return (String) get("editedAt");
    }

    public Issue setEditedAt(String arg) {
        optimisticData.put(getKey("editedAt"), arg);
        return this;
    }

    public String getUpdatedAt() {
        return (String) get("updatedAt");
    }

    public Issue setUpdatedAt(String arg) {
        optimisticData.put(getKey("updatedAt"), arg);
        return this;
    }

    public Boolean getIsOpen() {
        return (Boolean) get("isOpen");
    }

    public Issue setIsOpen(Boolean arg) {
        optimisticData.put(getKey("isOpen"), arg);
        return this;
    }

    public Boolean getIsDuplicate() {
        return (Boolean) get("isDuplicate");
    }

    public Issue setIsDuplicate(Boolean arg) {
        optimisticData.put(getKey("isDuplicate"), arg);
        return this;
    }

    public IssueCategory getCategory() {
        return (IssueCategory) get("category");
    }

    public Issue setCategory(IssueCategory arg) {
        optimisticData.put(getKey("category"), arg);
        return this;
    }

    public IssueCommentPage getIssueComments() {
        return (IssueCommentPage) get("issueComments");
    }

    public Issue setIssueComments(IssueCommentPage arg) {
        optimisticData.put(getKey("issueComments"), arg);
        return this;
    }

    public IssuePage getLinkedIssues() {
        return (IssuePage) get("linkedIssues");
    }

    public Issue setLinkedIssues(IssuePage arg) {
        optimisticData.put(getKey("linkedIssues"), arg);
        return this;
    }

    public ReactionGroupPage getReactions() {
        return (ReactionGroupPage) get("reactions");
    }

    public Issue setReactions(ReactionGroupPage arg) {
        optimisticData.put(getKey("reactions"), arg);
        return this;
    }

    public UserPage getAssignees() {
        return (UserPage) get("assignees");
    }

    public Issue setAssignees(UserPage arg) {
        optimisticData.put(getKey("assignees"), arg);
        return this;
    }

    public LabelPage getLabels() {
        return (LabelPage) get("labels");
    }

    public Issue setLabels(LabelPage arg) {
        optimisticData.put(getKey("labels"), arg);
        return this;
    }

    public UserPage getParticipants() {
        return (UserPage) get("participants");
    }

    public Issue setParticipants(UserPage arg) {
        optimisticData.put(getKey("participants"), arg);
        return this;
    }

    public ComponentPage getPinnedOn() {
        return (ComponentPage) get("pinnedOn");
    }

    public Issue setPinnedOn(ComponentPage arg) {
        optimisticData.put(getKey("pinnedOn"), arg);
        return this;
    }

    public IssueTimelineItemPage getTimeline() {
        return (IssueTimelineItemPage) get("timeline");
    }

    public Issue setTimeline(IssueTimelineItemPage arg) {
        optimisticData.put(getKey("timeline"), arg);
        return this;
    }

    public IssueLocationPage getLocations() {
        return (IssueLocationPage) get("locations");
    }

    public Issue setLocations(IssueLocationPage arg) {
        optimisticData.put(getKey("locations"), arg);
        return this;
    }

    public Boolean getCurrentUserCanEdit() {
        return (Boolean) get("currentUserCanEdit");
    }

    public Issue setCurrentUserCanEdit(Boolean arg) {
        optimisticData.put(getKey("currentUserCanEdit"), arg);
        return this;
    }

    public Boolean getCurrentUserCanComment() {
        return (Boolean) get("currentUserCanComment");
    }

    public Issue setCurrentUserCanComment(Boolean arg) {
        optimisticData.put(getKey("currentUserCanComment"), arg);
        return this;
    }

    public String getStartDate() {
        return (String) get("startDate");
    }

    public Issue setStartDate(String arg) {
        optimisticData.put(getKey("startDate"), arg);
        return this;
    }

    public String getDueDate() {
        return (String) get("dueDate");
    }

    public Issue setDueDate(String arg) {
        optimisticData.put(getKey("dueDate"), arg);
        return this;
    }

    public String getEstimatedTime() {
        return (String) get("estimatedTime");
    }

    public Issue setEstimatedTime(String arg) {
        optimisticData.put(getKey("estimatedTime"), arg);
        return this;
    }

    public String getSpentTime() {
        return (String) get("spentTime");
    }

    public Issue setSpentTime(String arg) {
        optimisticData.put(getKey("spentTime"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "title": return false;

            case "components": return true;

            case "body": return false;

            case "bodyRendered": return false;

            case "createdBy": return true;

            case "editedBy": return true;

            case "createdAt": return false;

            case "editedAt": return false;

            case "updatedAt": return false;

            case "isOpen": return false;

            case "isDuplicate": return false;

            case "category": return false;

            case "issueComments": return true;

            case "linkedIssues": return true;

            case "reactions": return true;

            case "assignees": return true;

            case "labels": return true;

            case "participants": return true;

            case "pinnedOn": return true;

            case "timeline": return true;

            case "locations": return true;

            case "currentUserCanEdit": return false;

            case "currentUserCanComment": return false;

            case "startDate": return false;

            case "dueDate": return false;

            case "estimatedTime": return false;

            case "spentTime": return false;

            default: return false;
        }
    }
}

