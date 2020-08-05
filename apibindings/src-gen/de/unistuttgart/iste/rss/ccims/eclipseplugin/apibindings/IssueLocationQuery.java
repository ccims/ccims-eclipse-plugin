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

public class IssueLocationQuery extends Query<IssueLocationQuery> {
    IssueLocationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public IssueLocationQuery onComponent(ComponentQueryDefinition queryDef) {
        startInlineFragment("Component");
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public IssueLocationQuery onComponentInterface(ComponentInterfaceQueryDefinition queryDef) {
        startInlineFragment("ComponentInterface");
        queryDef.define(new ComponentInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
