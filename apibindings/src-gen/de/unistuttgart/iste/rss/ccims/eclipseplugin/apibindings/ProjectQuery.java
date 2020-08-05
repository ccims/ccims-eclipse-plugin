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

public class ProjectQuery extends Query<ProjectQuery> {
    ProjectQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public ProjectQuery name() {
        startField("name");

        return this;
    }

    public class ComponentsArguments extends Arguments {
        ComponentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ComponentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ComponentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ComponentsArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ComponentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ComponentsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ComponentsArgumentsDefinition {
        void define(ComponentsArguments args);
    }

    public ProjectQuery components(ComponentPageQueryDefinition queryDef) {
        return components(args -> {}, queryDef);
    }

    public ProjectQuery components(ComponentsArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("components");

        ComponentsArguments args = new ComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class UsersArguments extends Arguments {
        UsersArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public UsersArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public UsersArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public UsersArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public UsersArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public UsersArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface UsersArgumentsDefinition {
        void define(UsersArguments args);
    }

    public ProjectQuery users(UserPageQueryDefinition queryDef) {
        return users(args -> {}, queryDef);
    }

    public ProjectQuery users(UsersArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("users");

        UsersArguments args = new UsersArguments(_queryBuilder);
        argsDef.define(args);
        UsersArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ProjectQuery owner(UserQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class IssuesArguments extends Arguments {
        IssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public IssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public IssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public IssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public IssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public IssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssuesArgumentsDefinition {
        void define(IssuesArguments args);
    }

    public ProjectQuery issues(IssuePageQueryDefinition queryDef) {
        return issues(args -> {}, queryDef);
    }

    public ProjectQuery issues(IssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issues");

        IssuesArguments args = new IssuesArguments(_queryBuilder);
        argsDef.define(args);
        IssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
