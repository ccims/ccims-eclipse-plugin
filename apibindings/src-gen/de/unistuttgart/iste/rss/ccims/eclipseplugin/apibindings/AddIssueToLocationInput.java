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

public class AddIssueToLocationInput implements Serializable {
    private ID issue;

    private ID locationToAdd;

    private Input<String> clientMutationId = Input.undefined();

    public AddIssueToLocationInput(ID issue, ID locationToAdd) {
        this.issue = issue;

        this.locationToAdd = locationToAdd;
    }

    public ID getIssue() {
        return issue;
    }

    public AddIssueToLocationInput setIssue(ID issue) {
        this.issue = issue;
        return this;
    }

    public ID getLocationToAdd() {
        return locationToAdd;
    }

    public AddIssueToLocationInput setLocationToAdd(ID locationToAdd) {
        this.locationToAdd = locationToAdd;
        return this;
    }

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public AddIssueToLocationInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public AddIssueToLocationInput setClientMutationIdInput(Input<String> clientMutationId) {
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
        _queryBuilder.append("locationToAdd:");
        Query.appendQuotedString(_queryBuilder, locationToAdd.toString());

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