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

public class IssueTimelineItemFilter implements Serializable {
    private Input<List<ID>> createdBy = Input.undefined();

    private Input<String> createdAfter = Input.undefined();

    private Input<String> createdBefore = Input.undefined();

    public List<ID> getCreatedBy() {
        return createdBy.getValue();
    }

    public Input<List<ID>> getCreatedByInput() {
        return createdBy;
    }

    public IssueTimelineItemFilter setCreatedBy(List<ID> createdBy) {
        this.createdBy = Input.optional(createdBy);
        return this;
    }

    public IssueTimelineItemFilter setCreatedByInput(Input<List<ID>> createdBy) {
        if (createdBy == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBy = createdBy;
        return this;
    }

    public String getCreatedAfter() {
        return createdAfter.getValue();
    }

    public Input<String> getCreatedAfterInput() {
        return createdAfter;
    }

    public IssueTimelineItemFilter setCreatedAfter(String createdAfter) {
        this.createdAfter = Input.optional(createdAfter);
        return this;
    }

    public IssueTimelineItemFilter setCreatedAfterInput(Input<String> createdAfter) {
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

    public IssueTimelineItemFilter setCreatedBefore(String createdBefore) {
        this.createdBefore = Input.optional(createdBefore);
        return this;
    }

    public IssueTimelineItemFilter setCreatedBeforeInput(Input<String> createdBefore) {
        if (createdBefore == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.createdBefore = createdBefore;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

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

        _queryBuilder.append('}');
    }
}
