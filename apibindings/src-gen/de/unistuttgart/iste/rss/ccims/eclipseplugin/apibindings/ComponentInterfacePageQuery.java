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

public class ComponentInterfacePageQuery extends Query<ComponentInterfacePageQuery> {
    ComponentInterfacePageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public ComponentInterfacePageQuery nodes(ComponentInterfaceQueryDefinition queryDef) {
        startField("nodes");

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentInterfacePageQuery edges(ComponentInterfaceEdgeQueryDefinition queryDef) {
        startField("edges");

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfaceEdgeQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentInterfacePageQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentInterfacePageQuery totalCount() {
        startField("totalCount");

        return this;
    }
}
