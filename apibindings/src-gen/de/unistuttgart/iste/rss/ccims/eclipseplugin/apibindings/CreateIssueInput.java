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

public class CreateIssueInput implements Serializable {
    private String title;

    private List<ID> componentIds;

    private Input<String> body = Input.undefined();

    private Input<IssueCategory> category = Input.undefined();

    private Input<List<ID>> labels = Input.undefined();

    private Input<List<ID>> assignees = Input.undefined();

    private Input<List<ID>> locations = Input.undefined();

    private Input<String> startDate = Input.undefined();

    private Input<String> dueDate = Input.undefined();

    private Input<String> estimatedTime = Input.undefined();

    private Input<String> clientMutationId = Input.undefined();

    public CreateIssueInput(String title, List<ID> componentIds) {
        this.title = title;

        this.componentIds = componentIds;
    }

    public String getTitle() {
        return title;
    }

    public CreateIssueInput setTitle(String title) {
        this.title = title;
        return this;
    }

    public List<ID> getComponentIds() {
        return componentIds;
    }

    public CreateIssueInput setComponentIds(List<ID> componentIds) {
        this.componentIds = componentIds;
        return this;
    }

    public String getBody() {
        return body.getValue();
    }

    public Input<String> getBodyInput() {
        return body;
    }

    public CreateIssueInput setBody(String body) {
        this.body = Input.optional(body);
        return this;
    }

    public CreateIssueInput setBodyInput(Input<String> body) {
        if (body == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.body = body;
        return this;
    }

    public IssueCategory getCategory() {
        return category.getValue();
    }

    public Input<IssueCategory> getCategoryInput() {
        return category;
    }

    public CreateIssueInput setCategory(IssueCategory category) {
        this.category = Input.optional(category);
        return this;
    }

    public CreateIssueInput setCategoryInput(Input<IssueCategory> category) {
        if (category == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.category = category;
        return this;
    }

    public List<ID> getLabels() {
        return labels.getValue();
    }

    public Input<List<ID>> getLabelsInput() {
        return labels;
    }

    public CreateIssueInput setLabels(List<ID> labels) {
        this.labels = Input.optional(labels);
        return this;
    }

    public CreateIssueInput setLabelsInput(Input<List<ID>> labels) {
        if (labels == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.labels = labels;
        return this;
    }

    public List<ID> getAssignees() {
        return assignees.getValue();
    }

    public Input<List<ID>> getAssigneesInput() {
        return assignees;
    }

    public CreateIssueInput setAssignees(List<ID> assignees) {
        this.assignees = Input.optional(assignees);
        return this;
    }

    public CreateIssueInput setAssigneesInput(Input<List<ID>> assignees) {
        if (assignees == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignees = assignees;
        return this;
    }

    public List<ID> getLocations() {
        return locations.getValue();
    }

    public Input<List<ID>> getLocationsInput() {
        return locations;
    }

    public CreateIssueInput setLocations(List<ID> locations) {
        this.locations = Input.optional(locations);
        return this;
    }

    public CreateIssueInput setLocationsInput(Input<List<ID>> locations) {
        if (locations == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.locations = locations;
        return this;
    }

    public String getStartDate() {
        return startDate.getValue();
    }

    public Input<String> getStartDateInput() {
        return startDate;
    }

    public CreateIssueInput setStartDate(String startDate) {
        this.startDate = Input.optional(startDate);
        return this;
    }

    public CreateIssueInput setStartDateInput(Input<String> startDate) {
        if (startDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.startDate = startDate;
        return this;
    }

    public String getDueDate() {
        return dueDate.getValue();
    }

    public Input<String> getDueDateInput() {
        return dueDate;
    }

    public CreateIssueInput setDueDate(String dueDate) {
        this.dueDate = Input.optional(dueDate);
        return this;
    }

    public CreateIssueInput setDueDateInput(Input<String> dueDate) {
        if (dueDate == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.dueDate = dueDate;
        return this;
    }

    public String getEstimatedTime() {
        return estimatedTime.getValue();
    }

    public Input<String> getEstimatedTimeInput() {
        return estimatedTime;
    }

    public CreateIssueInput setEstimatedTime(String estimatedTime) {
        this.estimatedTime = Input.optional(estimatedTime);
        return this;
    }

    public CreateIssueInput setEstimatedTimeInput(Input<String> estimatedTime) {
        if (estimatedTime == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.estimatedTime = estimatedTime;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public CreateIssueInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public CreateIssueInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("title:");
        Query.appendQuotedString(_queryBuilder, title.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("componentIDs:");
        _queryBuilder.append('[');
        {
            String listSeperator1 = "";
            for (ID item1 : componentIds) {
                _queryBuilder.append(listSeperator1);
                listSeperator1 = ",";
                Query.appendQuotedString(_queryBuilder, item1.toString());
            }
        }
        _queryBuilder.append(']');

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

        if (this.category.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("category:");
            if (category.getValue() != null) {
                _queryBuilder.append(category.getValue().toString());
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
                    for (ID item1 : labels.getValue()) {
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

        if (this.startDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("startDate:");
            if (startDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, startDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.dueDate.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("dueDate:");
            if (dueDate.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, dueDate.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.estimatedTime.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("estimatedTime:");
            if (estimatedTime.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, estimatedTime.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.clientMutationId.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("clientMutationID:");
            if (clientMutationId.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, clientMutationId.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
