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

public class LabelPageQuery extends Query<LabelPageQuery> {
    LabelPageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public LabelPageQuery nodes(LabelQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new LabelQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public LabelPageQuery edges(LabelEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new LabelEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public LabelPageQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public LabelPageQuery totalCount() {
        startField("totalCount");

        return this;
    }
}
