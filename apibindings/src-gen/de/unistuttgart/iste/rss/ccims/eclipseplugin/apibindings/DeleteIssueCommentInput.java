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

public class DeleteIssueCommentInput implements Serializable {
    private Input<String> clientMutationId = Input.undefined();

    private Input<ID> issueComment = Input.undefined();

    public String getClientMutationId() {
        return clientMutationId.getValue();
    }

    public Input<String> getClientMutationIdInput() {
        return clientMutationId;
    }

    public DeleteIssueCommentInput setClientMutationId(String clientMutationId) {
        this.clientMutationId = Input.optional(clientMutationId);
        return this;
    }

    public DeleteIssueCommentInput setClientMutationIdInput(Input<String> clientMutationId) {
        if (clientMutationId == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.clientMutationId = clientMutationId;
        return this;
    }

    public ID getIssueComment() {
        return issueComment.getValue();
    }

    public Input<ID> getIssueCommentInput() {
        return issueComment;
    }

    public DeleteIssueCommentInput setIssueComment(ID issueComment) {
        this.issueComment = Input.optional(issueComment);
        return this;
    }

    public DeleteIssueCommentInput setIssueCommentInput(Input<ID> issueComment) {
        if (issueComment == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issueComment = issueComment;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        if (this.issueComment.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issueComment:");
            if (issueComment.getValue() != null) {
                Query.appendQuotedString(_queryBuilder, issueComment.getValue().toString());
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
