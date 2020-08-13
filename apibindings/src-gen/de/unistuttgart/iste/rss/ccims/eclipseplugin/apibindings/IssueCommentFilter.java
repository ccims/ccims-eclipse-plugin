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

public class IssueCommentFilter implements Serializable {
    private Input<List<ID>> issue = Input.undefined();

    private Input<List<ID>> createdBy = Input.undefined();

    private Input<List<ID>> editedBy = Input.undefined();

    private Input<Date> createdAfter = Input.undefined();

    private Input<Date> createdBefore = Input.undefined();

    private Input<Date> editedAfter = Input.undefined();

    private Input<Date> editedBefore = Input.undefined();

    private Input<String> body = Input.undefined();

    private Input<List<List<String>>> reactions = Input.undefined();

    private Input<Boolean> currentUserCanEdit = Input.undefined();

    public List<ID> getIssue() {
        return issue.getValue();
    }

    public Input<List<ID>> getIssueInput() {
        return issue;
    }

    public IssueCommentFilter setIssue(List<ID> issue) {
        this.issue = Input.optional(issue);
        return this;
    }

    public IssueCommentFilter setIssueInput(Input<List<ID>> issue) {
        if (issue == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issue = issue;
        return this;
    }

    public List<ID> getCreatedBy() {
        return createdBy.getValue();
    }

    public Input<List<ID>> getCreatedByInput() {
        return createdBy;
    }

    public IssueCommentFilter setCreatedBy(List<ID> createdBy) {
        this.createdBy = Input.optional(createdBy);
        return this;
    }

    public IssueCommentFilter setCreatedByInput(Input<List<ID>> createdBy) {
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

    public IssueCommentFilter setEditedBy(List<ID> editedBy) {
        this.editedBy = Input.optional(editedBy);
        return this;
    }

    public IssueCommentFilter setEditedByInput(Input<List<ID>> editedBy) {
        if (editedBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedBy = editedBy;
        return this;
    }

    public Date getCreatedAfter() {
        return createdAfter.getValue();
    }

    public Input<Date> getCreatedAfterInput() {
        return createdAfter;
    }

    public IssueCommentFilter setCreatedAfter(Date createdAfter) {
        this.createdAfter = Input.optional(createdAfter);
        return this;
    }

    public IssueCommentFilter setCreatedAfterInput(Input<Date> createdAfter) {
        if (createdAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdAfter = createdAfter;
        return this;
    }

    public Date getCreatedBefore() {
        return createdBefore.getValue();
    }

    public Input<Date> getCreatedBeforeInput() {
        return createdBefore;
    }

    public IssueCommentFilter setCreatedBefore(Date createdBefore) {
        this.createdBefore = Input.optional(createdBefore);
        return this;
    }

    public IssueCommentFilter setCreatedBeforeInput(Input<Date> createdBefore) {
        if (createdBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBefore = createdBefore;
        return this;
    }

    public Date getEditedAfter() {
        return editedAfter.getValue();
    }

    public Input<Date> getEditedAfterInput() {
        return editedAfter;
    }

    public IssueCommentFilter setEditedAfter(Date editedAfter) {
        this.editedAfter = Input.optional(editedAfter);
        return this;
    }

    public IssueCommentFilter setEditedAfterInput(Input<Date> editedAfter) {
        if (editedAfter == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedAfter = editedAfter;
        return this;
    }

    public Date getEditedBefore() {
        return editedBefore.getValue();
    }

    public Input<Date> getEditedBeforeInput() {
        return editedBefore;
    }

    public IssueCommentFilter setEditedBefore(Date editedBefore) {
        this.editedBefore = Input.optional(editedBefore);
        return this;
    }

    public IssueCommentFilter setEditedBeforeInput(Input<Date> editedBefore) {
        if (editedBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.editedBefore = editedBefore;
        return this;
    }

    public String getBody() {
        return body.getValue();
    }

    public Input<String> getBodyInput() {
        return body;
    }

    public IssueCommentFilter setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public IssueCommentFilter setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public List<List<String>> getReactions() {
        return reactions.getValue();
    }

    public Input<List<List<String>>> getReactionsInput() {
        return reactions;
    }

    public IssueCommentFilter setReactions(List<List<String>> reactions) {
        this.reactions = Input.optional(reactions);
        return this;
    }

    public IssueCommentFilter setReactionsInput(Input<List<List<String>>> reactions) {
        if (reactions == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reactions = reactions;
        return this;
    }

    public Boolean getCurrentUserCanEdit() {
        return currentUserCanEdit.getValue();
    }

    public Input<Boolean> getCurrentUserCanEditInput() {
        return currentUserCanEdit;
    }

    public IssueCommentFilter setCurrentUserCanEdit(Boolean currentUserCanEdit) {
        this.currentUserCanEdit = Input.optional(currentUserCanEdit);
        return this;
    }

    public IssueCommentFilter setCurrentUserCanEditInput(Input<Boolean> currentUserCanEdit) {
        if (currentUserCanEdit == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.currentUserCanEdit = currentUserCanEdit;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.issue.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issue:");
            if (issue.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : issue.getValue()) {
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

        _queryBuilder.append('}');
    }
}
