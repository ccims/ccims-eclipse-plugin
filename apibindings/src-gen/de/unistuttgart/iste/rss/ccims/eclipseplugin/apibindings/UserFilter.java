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

public class UserFilter implements Serializable {
    private Input<List<String>> username = Input.undefined();

    private Input<String> displayName = Input.undefined();

    private Input<List<String>> email = Input.undefined();

    private Input<List<ID>> projects = Input.undefined();

    private Input<List<ID>> assignedToIssues = Input.undefined();

    private Input<List<ID>> participantOfIssues = Input.undefined();

    private Input<List<ID>> issueComments = Input.undefined();

    public List<String> getUsername() {
        return username.getValue();
    }

    public Input<List<String>> getUsernameInput() {
        return username;
    }

    public UserFilter setUsername(List<String> username) {
        this.username = Input.optional(username);
        return this;
    }

    public UserFilter setUsernameInput(Input<List<String>> username) {
        if (username == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.username = username;
        return this;
    }

    public String getDisplayName() {
        return displayName.getValue();
    }

    public Input<String> getDisplayNameInput() {
        return displayName;
    }

    public UserFilter setDisplayName(String displayName) {
        this.displayName = Input.optional(displayName);
        return this;
    }

    public UserFilter setDisplayNameInput(Input<String> displayName) {
        if (displayName == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.displayName = displayName;
        return this;
    }

    public List<String> getEmail() {
        return email.getValue();
    }

    public Input<List<String>> getEmailInput() {
        return email;
    }

    public UserFilter setEmail(List<String> email) {
        this.email = Input.optional(email);
        return this;
    }

    public UserFilter setEmailInput(Input<List<String>> email) {
        if (email == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.email = email;
        return this;
    }

    public List<ID> getProjects() {
        return projects.getValue();
    }

    public Input<List<ID>> getProjectsInput() {
        return projects;
    }

    public UserFilter setProjects(List<ID> projects) {
        this.projects = Input.optional(projects);
        return this;
    }

    public UserFilter setProjectsInput(Input<List<ID>> projects) {
        if (projects == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.projects = projects;
        return this;
    }

    public List<ID> getAssignedToIssues() {
        return assignedToIssues.getValue();
    }

    public Input<List<ID>> getAssignedToIssuesInput() {
        return assignedToIssues;
    }

    public UserFilter setAssignedToIssues(List<ID> assignedToIssues) {
        this.assignedToIssues = Input.optional(assignedToIssues);
        return this;
    }

    public UserFilter setAssignedToIssuesInput(Input<List<ID>> assignedToIssues) {
        if (assignedToIssues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.assignedToIssues = assignedToIssues;
        return this;
    }

    public List<ID> getParticipantOfIssues() {
        return participantOfIssues.getValue();
    }

    public Input<List<ID>> getParticipantOfIssuesInput() {
        return participantOfIssues;
    }

    public UserFilter setParticipantOfIssues(List<ID> participantOfIssues) {
        this.participantOfIssues = Input.optional(participantOfIssues);
        return this;
    }

    public UserFilter setParticipantOfIssuesInput(Input<List<ID>> participantOfIssues) {
        if (participantOfIssues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.participantOfIssues = participantOfIssues;
        return this;
    }

    public List<ID> getIssueComments() {
        return issueComments.getValue();
    }

    public Input<List<ID>> getIssueCommentsInput() {
        return issueComments;
    }

    public UserFilter setIssueComments(List<ID> issueComments) {
        this.issueComments = Input.optional(issueComments);
        return this;
    }

    public UserFilter setIssueCommentsInput(Input<List<ID>> issueComments) {
        if (issueComments == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issueComments = issueComments;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.username.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("username:");
            if (username.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : username.getValue()) {
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

        if (this.displayName.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("displayName:");
            if (displayName.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, displayName.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.email.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("email:");
            if (email.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : email.getValue()) {
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

        if (this.projects.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("projects:");
            if (projects.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : projects.getValue()) {
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

        if (this.assignedToIssues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("assignedToIssues:");
            if (assignedToIssues.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : assignedToIssues.getValue()) {
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

        if (this.participantOfIssues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("participantOfIssues:");
            if (participantOfIssues.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : participantOfIssues.getValue()) {
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

        if (this.issueComments.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issueComments:");
            if (issueComments.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : issueComments.getValue()) {
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

        _queryBuilder.append('}');
    }
}
