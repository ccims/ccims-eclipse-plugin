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

public class ComponentInterfaceQuery extends Query<ComponentInterfaceQuery> {
    ComponentInterfaceQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public ComponentInterfaceQuery name() {
        startField("name");

        return this;
    }

    public ComponentInterfaceQuery owner(UserQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentInterfaceQuery description() {
        startField("description");

        return this;
    }

    public ComponentInterfaceQuery component(ComponentQueryDefinition queryDef) {
        startField("component");

        _queryBuilder.append('{');
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConsumedByArguments extends Arguments {
        ConsumedByArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ConsumedByArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ConsumedByArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ConsumedByArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ConsumedByArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ConsumedByArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConsumedByArgumentsDefinition {
        void define(ConsumedByArguments args);
    }

    public ComponentInterfaceQuery consumedBy(ComponentPageQueryDefinition queryDef) {
        return consumedBy(args -> {}, queryDef);
    }

    public ComponentInterfaceQuery consumedBy(ConsumedByArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("consumedBy");

        ConsumedByArguments args = new ConsumedByArguments(_queryBuilder);
        argsDef.define(args);
        ConsumedByArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
