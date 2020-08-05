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

public class Mutation extends AbstractResponse<Mutation> {
    public Mutation() {
    }

    public Mutation(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "createIssue": {
                    CreateIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CreateIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addIssueComment": {
                    AddIssueCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddIssueCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "deleteIssueComment": {
                    DeleteIssueCommentPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new DeleteIssueCommentPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "linkIssue": {
                    LinkIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new LinkIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unlinkIssue": {
                    UnlinkIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnlinkIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addLabel": {
                    AddLabelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddLabelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeLabel": {
                    RemoveLabelPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveLabelPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "pinIssue": {
                    PinIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new PinIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unpinIssue": {
                    UnpinIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnpinIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "renameIssueTitle": {
                    RenameIssueTitlePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RenameIssueTitlePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueCategory": {
                    ChangeIssueCategoryPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueCategoryPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addAssignee": {
                    AddAssigneePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddAssigneePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeAssignee": {
                    RemoveAssigneePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveAssigneePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "closeIssue": {
                    CloseIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new CloseIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "reopenIssue": {
                    ReopenIssuePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ReopenIssuePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssuePriority": {
                    ChangeIssuePriorityPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssuePriorityPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueStartDate": {
                    ChangeIssueStartDatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueStartDatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueDueDate": {
                    ChangeIssueDueDatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueDueDatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "changeIssueEstimatedTime": {
                    ChangeIssueEstimatedTimePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ChangeIssueEstimatedTimePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addIssueToLocation": {
                    AddIssueToLocationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddIssueToLocationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeIssueFromLocation": {
                    RemoveIssueFromLocationPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveIssueFromLocationPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "markIssueAsDuplicate": {
                    MarkIssueAsDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new MarkIssueAsDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "unmarkIssueAsDuplicate": {
                    UnmarkIssueAsDuplicatePayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new UnmarkIssueAsDuplicatePayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "addReaction": {
                    AddReactionPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new AddReactionPayload(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "removeReaction": {
                    RemoveReactionPayload optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new RemoveReactionPayload(jsonAsObject(field.getValue(), key));
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
        return "Mutation";
    }

    public CreateIssuePayload getCreateIssue() {
        return (CreateIssuePayload) get("createIssue");
    }

    public Mutation setCreateIssue(CreateIssuePayload arg) {
        optimisticData.put(getKey("createIssue"), arg);
        return this;
    }

    public AddIssueCommentPayload getAddIssueComment() {
        return (AddIssueCommentPayload) get("addIssueComment");
    }

    public Mutation setAddIssueComment(AddIssueCommentPayload arg) {
        optimisticData.put(getKey("addIssueComment"), arg);
        return this;
    }

    public DeleteIssueCommentPayload getDeleteIssueComment() {
        return (DeleteIssueCommentPayload) get("deleteIssueComment");
    }

    public Mutation setDeleteIssueComment(DeleteIssueCommentPayload arg) {
        optimisticData.put(getKey("deleteIssueComment"), arg);
        return this;
    }

    public LinkIssuePayload getLinkIssue() {
        return (LinkIssuePayload) get("linkIssue");
    }

    public Mutation setLinkIssue(LinkIssuePayload arg) {
        optimisticData.put(getKey("linkIssue"), arg);
        return this;
    }

    public UnlinkIssuePayload getUnlinkIssue() {
        return (UnlinkIssuePayload) get("unlinkIssue");
    }

    public Mutation setUnlinkIssue(UnlinkIssuePayload arg) {
        optimisticData.put(getKey("unlinkIssue"), arg);
        return this;
    }

    public AddLabelPayload getAddLabel() {
        return (AddLabelPayload) get("addLabel");
    }

    public Mutation setAddLabel(AddLabelPayload arg) {
        optimisticData.put(getKey("addLabel"), arg);
        return this;
    }

    public RemoveLabelPayload getRemoveLabel() {
        return (RemoveLabelPayload) get("removeLabel");
    }

    public Mutation setRemoveLabel(RemoveLabelPayload arg) {
        optimisticData.put(getKey("removeLabel"), arg);
        return this;
    }

    public PinIssuePayload getPinIssue() {
        return (PinIssuePayload) get("pinIssue");
    }

    public Mutation setPinIssue(PinIssuePayload arg) {
        optimisticData.put(getKey("pinIssue"), arg);
        return this;
    }

    public UnpinIssuePayload getUnpinIssue() {
        return (UnpinIssuePayload) get("unpinIssue");
    }

    public Mutation setUnpinIssue(UnpinIssuePayload arg) {
        optimisticData.put(getKey("unpinIssue"), arg);
        return this;
    }

    public RenameIssueTitlePayload getRenameIssueTitle() {
        return (RenameIssueTitlePayload) get("renameIssueTitle");
    }

    public Mutation setRenameIssueTitle(RenameIssueTitlePayload arg) {
        optimisticData.put(getKey("renameIssueTitle"), arg);
        return this;
    }

    public ChangeIssueCategoryPayload getChangeIssueCategory() {
        return (ChangeIssueCategoryPayload) get("changeIssueCategory");
    }

    public Mutation setChangeIssueCategory(ChangeIssueCategoryPayload arg) {
        optimisticData.put(getKey("changeIssueCategory"), arg);
        return this;
    }

    public AddAssigneePayload getAddAssignee() {
        return (AddAssigneePayload) get("addAssignee");
    }

    public Mutation setAddAssignee(AddAssigneePayload arg) {
        optimisticData.put(getKey("addAssignee"), arg);
        return this;
    }

    public RemoveAssigneePayload getRemoveAssignee() {
        return (RemoveAssigneePayload) get("removeAssignee");
    }

    public Mutation setRemoveAssignee(RemoveAssigneePayload arg) {
        optimisticData.put(getKey("removeAssignee"), arg);
        return this;
    }

    public CloseIssuePayload getCloseIssue() {
        return (CloseIssuePayload) get("closeIssue");
    }

    public Mutation setCloseIssue(CloseIssuePayload arg) {
        optimisticData.put(getKey("closeIssue"), arg);
        return this;
    }

    public ReopenIssuePayload getReopenIssue() {
        return (ReopenIssuePayload) get("reopenIssue");
    }

    public Mutation setReopenIssue(ReopenIssuePayload arg) {
        optimisticData.put(getKey("reopenIssue"), arg);
        return this;
    }

    public ChangeIssuePriorityPayload getChangeIssuePriority() {
        return (ChangeIssuePriorityPayload) get("changeIssuePriority");
    }

    public Mutation setChangeIssuePriority(ChangeIssuePriorityPayload arg) {
        optimisticData.put(getKey("changeIssuePriority"), arg);
        return this;
    }

    public ChangeIssueStartDatePayload getChangeIssueStartDate() {
        return (ChangeIssueStartDatePayload) get("changeIssueStartDate");
    }

    public Mutation setChangeIssueStartDate(ChangeIssueStartDatePayload arg) {
        optimisticData.put(getKey("changeIssueStartDate"), arg);
        return this;
    }

    public ChangeIssueDueDatePayload getChangeIssueDueDate() {
        return (ChangeIssueDueDatePayload) get("changeIssueDueDate");
    }

    public Mutation setChangeIssueDueDate(ChangeIssueDueDatePayload arg) {
        optimisticData.put(getKey("changeIssueDueDate"), arg);
        return this;
    }

    public ChangeIssueEstimatedTimePayload getChangeIssueEstimatedTime() {
        return (ChangeIssueEstimatedTimePayload) get("changeIssueEstimatedTime");
    }

    public Mutation setChangeIssueEstimatedTime(ChangeIssueEstimatedTimePayload arg) {
        optimisticData.put(getKey("changeIssueEstimatedTime"), arg);
        return this;
    }

    public AddIssueToLocationPayload getAddIssueToLocation() {
        return (AddIssueToLocationPayload) get("addIssueToLocation");
    }

    public Mutation setAddIssueToLocation(AddIssueToLocationPayload arg) {
        optimisticData.put(getKey("addIssueToLocation"), arg);
        return this;
    }

    public RemoveIssueFromLocationPayload getRemoveIssueFromLocation() {
        return (RemoveIssueFromLocationPayload) get("removeIssueFromLocation");
    }

    public Mutation setRemoveIssueFromLocation(RemoveIssueFromLocationPayload arg) {
        optimisticData.put(getKey("removeIssueFromLocation"), arg);
        return this;
    }

    public MarkIssueAsDuplicatePayload getMarkIssueAsDuplicate() {
        return (MarkIssueAsDuplicatePayload) get("markIssueAsDuplicate");
    }

    public Mutation setMarkIssueAsDuplicate(MarkIssueAsDuplicatePayload arg) {
        optimisticData.put(getKey("markIssueAsDuplicate"), arg);
        return this;
    }

    public UnmarkIssueAsDuplicatePayload getUnmarkIssueAsDuplicate() {
        return (UnmarkIssueAsDuplicatePayload) get("unmarkIssueAsDuplicate");
    }

    public Mutation setUnmarkIssueAsDuplicate(UnmarkIssueAsDuplicatePayload arg) {
        optimisticData.put(getKey("unmarkIssueAsDuplicate"), arg);
        return this;
    }

    public AddReactionPayload getAddReaction() {
        return (AddReactionPayload) get("addReaction");
    }

    public Mutation setAddReaction(AddReactionPayload arg) {
        optimisticData.put(getKey("addReaction"), arg);
        return this;
    }

    public RemoveReactionPayload getRemoveReaction() {
        return (RemoveReactionPayload) get("removeReaction");
    }

    public Mutation setRemoveReaction(RemoveReactionPayload arg) {
        optimisticData.put(getKey("removeReaction"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "createIssue": return true;

            case "addIssueComment": return true;

            case "deleteIssueComment": return true;

            case "linkIssue": return true;

            case "unlinkIssue": return true;

            case "addLabel": return true;

            case "removeLabel": return true;

            case "pinIssue": return true;

            case "unpinIssue": return true;

            case "renameIssueTitle": return true;

            case "changeIssueCategory": return true;

            case "addAssignee": return true;

            case "removeAssignee": return true;

            case "closeIssue": return true;

            case "reopenIssue": return true;

            case "changeIssuePriority": return true;

            case "changeIssueStartDate": return true;

            case "changeIssueDueDate": return true;

            case "changeIssueEstimatedTime": return true;

            case "addIssueToLocation": return true;

            case "removeIssueFromLocation": return true;

            case "markIssueAsDuplicate": return true;

            case "unmarkIssueAsDuplicate": return true;

            case "addReaction": return true;

            case "removeReaction": return true;

            default: return false;
        }
    }
}

