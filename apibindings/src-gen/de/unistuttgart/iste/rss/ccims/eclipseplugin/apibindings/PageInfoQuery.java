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

public class PageInfoQuery extends Query<PageInfoQuery> {
    PageInfoQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public PageInfoQuery startCursor() {
        startField("startCursor");

        return this;
    }

    public PageInfoQuery endCursor() {
        startField("endCursor");

        return this;
    }

    public PageInfoQuery endId() {
        startField("endID");

        return this;
    }

    public PageInfoQuery hasNextPage() {
        startField("hasNextPage");

        return this;
    }

    public PageInfoQuery hasPreviousPage() {
        startField("hasPreviousPage");

        return this;
    }
}
