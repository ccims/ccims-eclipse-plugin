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

public class ComponentQuery extends Query<ComponentQuery> {
    ComponentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public ComponentQuery name() {
        startField("name");

        return this;
    }

    public ComponentQuery owner(UserQueryDefinition queryDef) {
        startField("owner");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentQuery description() {
        startField("description");

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

    public ComponentQuery issues(IssuePageQueryDefinition queryDef) {
        return issues(args -> {}, queryDef);
    }

    public ComponentQuery issues(IssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("issues");

        IssuesArguments args = new IssuesArguments(_queryBuilder);
        argsDef.define(args);
        IssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ProjectsArguments extends Arguments {
        ProjectsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ProjectsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ProjectsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ProjectsArguments filterBy(ProjectFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ProjectsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ProjectsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ProjectsArgumentsDefinition {
        void define(ProjectsArguments args);
    }

    public ComponentQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    public ComponentQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class InterfacesArguments extends Arguments {
        InterfacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public InterfacesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public InterfacesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public InterfacesArguments filterBy(ComponentInterfaceFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public InterfacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public InterfacesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface InterfacesArgumentsDefinition {
        void define(InterfacesArguments args);
    }

    public ComponentQuery interfaces(ComponentInterfacePageQueryDefinition queryDef) {
        return interfaces(args -> {}, queryDef);
    }

    public ComponentQuery interfaces(InterfacesArgumentsDefinition argsDef, ComponentInterfacePageQueryDefinition queryDef) {
        startField("interfaces");

        InterfacesArguments args = new InterfacesArguments(_queryBuilder);
        argsDef.define(args);
        InterfacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfacePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ConsumedInterfacesArguments extends Arguments {
        ConsumedInterfacesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ConsumedInterfacesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ConsumedInterfacesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ConsumedInterfacesArguments filterBy(ComponentInterfaceFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ConsumedInterfacesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ConsumedInterfacesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ConsumedInterfacesArgumentsDefinition {
        void define(ConsumedInterfacesArguments args);
    }

    public ComponentQuery consumedInterfaces(ComponentInterfacePageQueryDefinition queryDef) {
        return consumedInterfaces(args -> {}, queryDef);
    }

    public ComponentQuery consumedInterfaces(ConsumedInterfacesArgumentsDefinition argsDef, ComponentInterfacePageQueryDefinition queryDef) {
        startField("consumedInterfaces");

        ConsumedInterfacesArguments args = new ConsumedInterfacesArguments(_queryBuilder);
        argsDef.define(args);
        ConsumedInterfacesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentInterfacePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public ComponentQuery imsType() {
        startField("imsType");

        return this;
    }

    public ComponentQuery imsData() {
        startField("imsData");

        return this;
    }
}
