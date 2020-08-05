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

public class MarkIssueAsDuplicatePayloadQuery extends Query<MarkIssueAsDuplicatePayloadQuery> {
    MarkIssueAsDuplicatePayloadQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public MarkIssueAsDuplicatePayloadQuery clientMutationId() {
        startField("clientMutationID");

        return this;
    }

    public MarkIssueAsDuplicatePayloadQuery issue(IssueQueryDefinition queryDef) {
        startField("issue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MarkIssueAsDuplicatePayloadQuery originalIssue(IssueQueryDefinition queryDef) {
        startField("originalIssue");

        _queryBuilder.append('{');
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MarkIssueAsDuplicatePayloadQuery event(MarkedAsDuplicateEventQueryDefinition queryDef) {
        startField("event");

        _queryBuilder.append('{');
        queryDef.define(new MarkedAsDuplicateEventQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MarkIssueAsDuplicatePayloadQuery timelineEdge(IssueTimelineItemEdgeQueryDefinition queryDef) {
        startField("timelineEdge");

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
