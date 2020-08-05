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

public class ChangeIssueDueDateInput implements Serializable {
    private ID issue;

    private String newDueDate;

    private Input<String> clientMutationId = Input.undefined();

    public ChangeIssueDueDateInput(ID issue, String newDueDate) {
        this.issue = issue;

        this.newDueDate = newDueDate;
    }

    public ID getIssue() {
        return issue;
    }

    public ChangeIssueDueDateInput setIssue(ID issue) {
        this.issue = issue;
        return this;
    }

    public String getNewDueDate() {
        return newDueDate;
    }

    public ChangeIssueDueDateInput setNewDueDate(String newDueDate) {
        this.newDueDate = newDueDate;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public ChangeIssueDueDateInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public ChangeIssueDueDateInput setClientMutationIdInput(Input<String> clientMutationId) {
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
        _queryBuilder.append("issue:");
        Query.appendQuotedString(_queryBuilder, issue.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("newDueDate:");
        Query.appendQuotedString(_queryBuilder, newDueDate.toString());

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