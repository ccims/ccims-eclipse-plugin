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

public class IssueFilter implements Serializable {
    private Input<List<String>> title = Input.undefined();

    private Input<List<ID>> components = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<List<ID>> createdBy = Input.undefined();

    private Input<List<ID>> editedBy = Input.undefined();

    private Input<String> createdAfter = Input.undefined();

    private Input<String> createdBefore = Input.undefined();

    private Input<String> editedAfter = Input.undefined();

    private Input<String> editedBefore = Input.undefined();

    private Input<String> updatedAfter = Input.undefined();

    private Input<String> updatedBefore = Input.undefined();

    private Input<Boolean> isOpen = Input.undefined();

    private Input<Boolean> isDuplicate = Input.undefined();

    private Input<List<IssueCategory>> category = Input.undefined();

    private Input<List<ID>> linkedIssues = Input.undefined();

    private Input<List<List<String>>> reactions = Input.undefined();

    private Input<List<ID>> assignees = Input.undefined();

    private Input<List<LabelFilter>> labels = Input.undefined();

    private Input<List<ID>> participants = Input.undefined();

    private Input<List<ID>> locations = Input.undefined();

    private Input<Boolean> currentUserCanEdit = Input.undefined();

    private Input<Boolean> currentUserCanComment = Input.undefined();

    private Input<String> startDateAfter = Input.undefined();

    private Input<String> startDateBefore = Input.undefined();

    private Input<String> dueDateAfter = Input.undefined();

    private Input<String> dueDateBefore = Input.undefined();

    private Input<String> estimatedTimeGreaterThan = Input.undefined();

    private Input<String> estimatedTimeLowerThan = Input.undefined();

    private Input<String> spentTimeGreaterThan = Input.undefined();

    private Input<String> spentTimeLowerThan = Input.undefined();

    public List<String> getTitle() {
        return title.getValue();
    }

    public Input<List<String>> getTitleInput() {
        return title;
    }

    public IssueFilter setTitle(List<String> title) {
        this.title = Input.optional(title);
        return this;
    }

    public IssueFilter setTitleInput(Input<List<String>> title) {
        if (title == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.title = title;
        return this;
    }

    public List<ID> getComponents() {
        return components.getValue();
    }

    public Input<List<ID>> getComponentsInput() {
        return components;
    }

    public IssueFilter setComponents(List<ID> components) {
        this.components = Input.optional(components);
        return this;
    }

    public IssueFilter setComponentsInput(Input<List<ID>> components) {
        if (components == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.components = components;
        return this;
    }

    public String getBody() {
        return body.getValue();
    }

    public Input<String> getBodyInput() {
        return body;
    }

    public IssueFilter setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public IssueFilter setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public List<ID> getCreatedBy() {
        return createdBy.getValue();
    }

    public Input<List<ID>> getCreatedByInput() {
        return createdBy;
    }

    public IssueFilter setCreatedBy(List<ID> createdBy) {
        this.createdBy = Input.optional(createdBy);
        return this;
    }

    public IssueFilter setCreatedByInput(Input<List<ID>> createdBy) {
        if (createdBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBy = createdBy;
        return this;
    }

    public List<ID> getEditedBy() {
        return editedBy.getValue();
    }

    public Input<List<ID>> getEditedByInput() {
        return editedBy;
    }

    public IssueFilter setEditedBy(List<ID> editedBy) {
        this.editedBy = Input.optional(editedBy);
        return this;
    }

    public IssueFilter setEditedByInput(Input<List<ID>> editedBy) {
        if (editedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedBy = editedBy;
        return this;
    }

    public String getCreatedAfter() {
        return createdAfter.getValue();
    }

    public Input<String> getCreatedAfterInput() {
        return createdAfter;
    }

    public IssueFilter setCreatedAfter(String createdAfter) {
        this.createdAfter = Input.optional(createdAfter);
        return this;
    }

    public IssueFilter setCreatedAfterInput(Input<String> createdAfter) {
        if (createdAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAfter = createdAfter;
        return this;
    }

    public String getCreatedBefore() {
        return createdBefore.getValue();
    }

    public Input<String> getCreatedBeforeInput() {
        return createdBefore;
    }

    public IssueFilter setCreatedBefore(String createdBefore) {
        this.createdBefore = Input.optional(createdBefore);
        return this;
    }

    public IssueFilter setCreatedBeforeInput(Input<String> createdBefore) {
        if (createdBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBefore = createdBefore;
        return this;
    }

    public String getEditedAfter() {
        return editedAfter.getValue();
    }

    public Input<String> getEditedAfterInput() {
        return editedAfter;
    }

    public IssueFilter setEditedAfter(String editedAfter) {
        this.editedAfter = Input.optional(editedAfter);
        return this;
    }

    public IssueFilter setEditedAfterInput(Input<String> editedAfter) {
        if (editedAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedAfter = editedAfter;
        return this;
    }

    public String getEditedBefore() {
        return editedBefore.getValue();
    }

    public Input<String> getEditedBeforeInput() {
        return editedBefore;
    }

    public IssueFilter setEditedBefore(String editedBefore) {
        this.editedBefore = Input.optional(editedBefore);
        return this;
    }

    public IssueFilter setEditedBeforeInput(Input<String> editedBefore) {
        if (editedBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedBefore = editedBefore;
        return this;
    }

    public String getUpdatedAfter() {
        return updatedAfter.getValue();
    }

    public Input<String> getUpdatedAfterInput() {
        return updatedAfter;
    }

    public IssueFilter setUpdatedAfter(String updatedAfter) {
        this.updatedAfter = Input.optional(updatedAfter);
        return this;
    }

    public IssueFilter setUpdatedAfterInput(Input<String> updatedAfter) {
        if (updatedAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedAfter = updatedAfter;
        return this;
    }

    public String getUpdatedBefore() {
        return updatedBefore.getValue();
    }

    public Input<String> getUpdatedBeforeInput() {
        return updatedBefore;
    }

    public IssueFilter setUpdatedBefore(String updatedBefore) {
        this.updatedBefore = Input.optional(updatedBefore);
        return this;
    }

    public IssueFilter setUpdatedBeforeInput(Input<String> updatedBefore) {
        if (updatedBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.updatedBefore = updatedBefore;
        return this;
    }

    public Boolean getIsOpen() {
        return isOpen.getValue();
    }

    public Input<Boolean> getIsOpenInput() {
        return isOpen;
    }

    public IssueFilter setIsOpen(Boolean isOpen) {
        this.isOpen = Input.optional(isOpen);
        return this;
    }

    public IssueFilter setIsOpenInput(Input<Boolean> isOpen) {
        if (isOpen == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isOpen = isOpen;
        return this;
    }

    public Boolean getIsDuplicate() {
        return isDuplicate.getValue();
    }

    public Input<Boolean> getIsDuplicateInput() {
        return isDuplicate;
    }

    public IssueFilter setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = Input.optional(isDuplicate);
        return this;
    }

    public IssueFilter setIsDuplicateInput(Input<Boolean> isDuplicate) {
        if (isDuplicate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.isDuplicate = isDuplicate;
        return this;
    }

    public List<IssueCategory> getCategory() {
        return category.getValue();
    }

    public Input<List<IssueCategory>> getCategoryInput() {
        return category;
    }

    public IssueFilter setCategory(List<IssueCategory> category) {
        this.category = Input.optional(category);
        return this;
    }

    public IssueFilter setCategoryInput(Input<List<IssueCategory>> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
        return this;
    }

    public List<ID> getLinkedIssues() {
        return linkedIssues.getValue();
    }

    public Input<List<ID>> getLinkedIssuesInput() {
        return linkedIssues;
    }

    public IssueFilter setLinkedIssues(List<ID> linkedIssues) {
        this.linkedIssues = Input.optional(linkedIssues);
        return this;
    }

    public IssueFilter setLinkedIssuesInput(Input<List<ID>> linkedIssues) {
        if (linkedIssues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.linkedIssues = linkedIssues;
        return this;
    }

    public List<List<String>> getReactions() {
        return reactions.getValue();
    }

    public Input<List<List<String>>> getReactionsInput() {
        return reactions;
    }

    public IssueFilter setReactions(List<List<String>> reactions) {
        this.reactions = Input.optional(reactions);
        return this;
    }

    public IssueFilter setReactionsInput(Input<List<List<String>>> reactions) {
        if (reactions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reactions = reactions;
        return this;
    }

    public List<ID> getAssignees() {
        return assignees.getValue();
    }

    public Input<List<ID>> getAssigneesInput() {
        return assignees;
    }

    public IssueFilter setAssignees(List<ID> assignees) {
        this.assignees = Input.optional(assignees);
        return this;
    }

    public IssueFilter setAssigneesInput(Input<List<ID>> assignees) {
        if (assignees == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignees = assignees;
        return this;
    }

    public List<LabelFilter> getLabels() {
        return labels.getValue();
    }

    public Input<List<LabelFilter>> getLabelsInput() {
        return labels;
    }

    public IssueFilter setLabels(List<LabelFilter> labels) {
        this.labels = Input.optional(labels);
        return this;
    }

    public IssueFilter setLabelsInput(Input<List<LabelFilter>> labels) {
        if (labels == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.labels = labels;
        return this;
    }

    public List<ID> getParticipants() {
        return participants.getValue();
    }

    public Input<List<ID>> getParticipantsInput() {
        return participants;
    }

    public IssueFilter setParticipants(List<ID> participants) {
        this.participants = Input.optional(participants);
        return this;
    }

    public IssueFilter setParticipantsInput(Input<List<ID>> participants) {
        if (participants == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.participants = participants;
        return this;
    }

    public List<ID> getLocations() {
        return locations.getValue();
    }

    public Input<List<ID>> getLocationsInput() {
        return locations;
    }

    public IssueFilter setLocations(List<ID> locations) {
        this.locations = Input.optional(locations);
        return this;
    }

    public IssueFilter setLocationsInput(Input<List<ID>> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locations = locations;
        return this;
    }

    public Boolean getCurrentUserCanEdit() {
        return currentUserCanEdit.getValue();
    }

    public Input<Boolean> getCurrentUserCanEditInput() {
        return currentUserCanEdit;
    }

    public IssueFilter setCurrentUserCanEdit(Boolean currentUserCanEdit) {
        this.currentUserCanEdit = Input.optional(currentUserCanEdit);
        return this;
    }

    public IssueFilter setCurrentUserCanEditInput(Input<Boolean> currentUserCanEdit) {
        if (currentUserCanEdit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currentUserCanEdit = currentUserCanEdit;
        return this;
    }

    public Boolean getCurrentUserCanComment() {
        return currentUserCanComment.getValue();
    }

    public Input<Boolean> getCurrentUserCanCommentInput() {
        return currentUserCanComment;
    }

    public IssueFilter setCurrentUserCanComment(Boolean currentUserCanComment) {
        this.currentUserCanComment = Input.optional(currentUserCanComment);
        return this;
    }

    public IssueFilter setCurrentUserCanCommentInput(Input<Boolean> currentUserCanComment) {
        if (currentUserCanComment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currentUserCanComment = currentUserCanComment;
        return this;
    }

    public String getStartDateAfter() {
        return startDateAfter.getValue();
    }

    public Input<String> getStartDateAfterInput() {
        return startDateAfter;
    }

    public IssueFilter setStartDateAfter(String startDateAfter) {
        this.startDateAfter = Input.optional(startDateAfter);
        return this;
    }

    public IssueFilter setStartDateAfterInput(Input<String> startDateAfter) {
        if (startDateAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.startDateAfter = startDateAfter;
        return this;
    }

    public String getStartDateBefore() {
        return startDateBefore.getValue();
    }

    public Input<String> getStartDateBeforeInput() {
        return startDateBefore;
    }

    public IssueFilter setStartDateBefore(String startDateBefore) {
        this.startDateBefore = Input.optional(startDateBefore);
        return this;
    }

    public IssueFilter setStartDateBeforeInput(Input<String> startDateBefore) {
        if (startDateBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.startDateBefore = startDateBefore;
        return this;
    }

    public String getDueDateAfter() {
        return dueDateAfter.getValue();
    }

    public Input<String> getDueDateAfterInput() {
        return dueDateAfter;
    }

    public IssueFilter setDueDateAfter(String dueDateAfter) {
        this.dueDateAfter = Input.optional(dueDateAfter);
        return this;
    }

    public IssueFilter setDueDateAfterInput(Input<String> dueDateAfter) {
        if (dueDateAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dueDateAfter = dueDateAfter;
        return this;
    }

    public String getDueDateBefore() {
        return dueDateBefore.getValue();
    }

    public Input<String> getDueDateBeforeInput() {
        return dueDateBefore;
    }

    public IssueFilter setDueDateBefore(String dueDateBefore) {
        this.dueDateBefore = Input.optional(dueDateBefore);
        return this;
    }

    public IssueFilter setDueDateBeforeInput(Input<String> dueDateBefore) {
        if (dueDateBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dueDateBefore = dueDateBefore;
        return this;
    }

    public String getEstimatedTimeGreaterThan() {
        return estimatedTimeGreaterThan.getValue();
    }

    public Input<String> getEstimatedTimeGreaterThanInput() {
        return estimatedTimeGreaterThan;
    }

    public IssueFilter setEstimatedTimeGreaterThan(String estimatedTimeGreaterThan) {
        this.estimatedTimeGreaterThan = Input.optional(estimatedTimeGreaterThan);
        return this;
    }

    public IssueFilter setEstimatedTimeGreaterThanInput(Input<String> estimatedTimeGreaterThan) {
        if (estimatedTimeGreaterThan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.estimatedTimeGreaterThan = estimatedTimeGreaterThan;
        return this;
    }

    public String getEstimatedTimeLowerThan() {
        return estimatedTimeLowerThan.getValue();
    }

    public Input<String> getEstimatedTimeLowerThanInput() {
        return estimatedTimeLowerThan;
    }

    public IssueFilter setEstimatedTimeLowerThan(String estimatedTimeLowerThan) {
        this.estimatedTimeLowerThan = Input.optional(estimatedTimeLowerThan);
        return this;
    }

    public IssueFilter setEstimatedTimeLowerThanInput(Input<String> estimatedTimeLowerThan) {
        if (estimatedTimeLowerThan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.estimatedTimeLowerThan = estimatedTimeLowerThan;
        return this;
    }

    public String getSpentTimeGreaterThan() {
        return spentTimeGreaterThan.getValue();
    }

    public Input<String> getSpentTimeGreaterThanInput() {
        return spentTimeGreaterThan;
    }

    public IssueFilter setSpentTimeGreaterThan(String spentTimeGreaterThan) {
        this.spentTimeGreaterThan = Input.optional(spentTimeGreaterThan);
        return this;
    }

    public IssueFilter setSpentTimeGreaterThanInput(Input<String> spentTimeGreaterThan) {
        if (spentTimeGreaterThan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.spentTimeGreaterThan = spentTimeGreaterThan;
        return this;
    }

    public String getSpentTimeLowerThan() {
        return spentTimeLowerThan.getValue();
    }

    public Input<String> getSpentTimeLowerThanInput() {
        return spentTimeLowerThan;
    }

    public IssueFilter setSpentTimeLowerThan(String spentTimeLowerThan) {
        this.spentTimeLowerThan = Input.optional(spentTimeLowerThan);
        return this;
    }

    public IssueFilter setSpentTimeLowerThanInput(Input<String> spentTimeLowerThan) {
        if (spentTimeLowerThan == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.spentTimeLowerThan = spentTimeLowerThan;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.title.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("title:");
            if (title.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : title.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.components.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("components:");
            if (components.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : components.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.body.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("body:");
            if (body.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, body.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdBy:");
            if (createdBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : createdBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.editedBy.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("editedBy:");
            if (editedBy.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : editedBy.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdAfter:");
            if (createdAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, createdAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.createdBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("createdBefore:");
            if (createdBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, createdBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.editedAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("editedAfter:");
            if (editedAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, editedAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.editedBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("editedBefore:");
            if (editedBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, editedBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updatedAfter:");
            if (updatedAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, updatedAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.updatedBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("updatedBefore:");
            if (updatedBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, updatedBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isOpen.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isOpen:");
            if (isOpen.getValue() != null) {
                _queryBuilder.append(isOpen.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.isDuplicate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("isDuplicate:");
            if (isDuplicate.getValue() != null) {
                _queryBuilder.append(isDuplicate.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (IssueCategory item1 : category.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append(item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.linkedIssues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("linkedIssues:");
            if (linkedIssues.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : linkedIssues.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.reactions.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reactions:");
            if (reactions.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (List<String> item1 : reactions.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        _queryBuilder.append('[');
                        {
                            String listSeperator2 = "";
                            for (String item2 : item1) {
                                _queryBuilder.append(listSeperator2);
                                listSeperator2 = ",";
                                Query.appendQuotedString(_queryBuilder, item2.toString());
                            }
                        }
                        _queryBuilder.append(']');
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.assignees.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("assignees:");
            if (assignees.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : assignees.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.labels.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("labels:");
            if (labels.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (LabelFilter item1 : labels.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        item1.appendTo(_queryBuilder);
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.participants.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("participants:");
            if (participants.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : participants.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.locations.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("locations:");
            if (locations.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : locations.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currentUserCanEdit.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currentUserCanEdit:");
            if (currentUserCanEdit.getValue() != null) {
                _queryBuilder.append(currentUserCanEdit.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.currentUserCanComment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("currentUserCanComment:");
            if (currentUserCanComment.getValue() != null) {
                _queryBuilder.append(currentUserCanComment.getValue());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.startDateAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("startDateAfter:");
            if (startDateAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, startDateAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.startDateBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("startDateBefore:");
            if (startDateBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, startDateBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dueDateAfter.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dueDateAfter:");
            if (dueDateAfter.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dueDateAfter.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dueDateBefore.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dueDateBefore:");
            if (dueDateBefore.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dueDateBefore.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.estimatedTimeGreaterThan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("estimatedTimeGreaterThan:");
            if (estimatedTimeGreaterThan.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, estimatedTimeGreaterThan.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.estimatedTimeLowerThan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("estimatedTimeLowerThan:");
            if (estimatedTimeLowerThan.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, estimatedTimeLowerThan.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.spentTimeGreaterThan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("spentTimeGreaterThan:");
            if (spentTimeGreaterThan.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, spentTimeGreaterThan.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.spentTimeLowerThan.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("spentTimeLowerThan:");
            if (spentTimeLowerThan.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, spentTimeLowerThan.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
