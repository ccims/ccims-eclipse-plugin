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

public class UserQuery extends Query<UserQuery> {
    UserQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("id");
    }

    public UserQuery username() {
        startField("username");

        return this;
    }

    public UserQuery displayName() {
        startField("displayName");

        return this;
    }

    public UserQuery email() {
        startField("email");

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

    public UserQuery projects(ProjectPageQueryDefinition queryDef) {
        return projects(args -> {}, queryDef);
    }

    public UserQuery projects(ProjectsArgumentsDefinition argsDef, ProjectPageQueryDefinition queryDef) {
        startField("projects");

        ProjectsArguments args = new ProjectsArguments(_queryBuilder);
        argsDef.define(args);
        ProjectsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssignedToIssuesArguments extends Arguments {
        AssignedToIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AssignedToIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public AssignedToIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public AssignedToIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public AssignedToIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public AssignedToIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssignedToIssuesArgumentsDefinition {
        void define(AssignedToIssuesArguments args);
    }

    public UserQuery assignedToIssues(IssuePageQueryDefinition queryDef) {
        return assignedToIssues(args -> {}, queryDef);
    }

    public UserQuery assignedToIssues(AssignedToIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("assignedToIssues");

        AssignedToIssuesArguments args = new AssignedToIssuesArguments(_queryBuilder);
        argsDef.define(args);
        AssignedToIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParticipantOfIssuesArguments extends Arguments {
        ParticipantOfIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ParticipantOfIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ParticipantOfIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ParticipantOfIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ParticipantOfIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ParticipantOfIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParticipantOfIssuesArgumentsDefinition {
        void define(ParticipantOfIssuesArguments args);
    }

    public UserQuery participantOfIssues(IssuePageQueryDefinition queryDef) {
        return participantOfIssues(args -> {}, queryDef);
    }

    public UserQuery participantOfIssues(ParticipantOfIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("participantOfIssues");

        ParticipantOfIssuesArguments args = new ParticipantOfIssuesArguments(_queryBuilder);
        argsDef.define(args);
        ParticipantOfIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class IssueCommentsArguments extends Arguments {
        IssueCommentsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public IssueCommentsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public IssueCommentsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public IssueCommentsArguments filterBy(IssueCommentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public IssueCommentsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public IssueCommentsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface IssueCommentsArgumentsDefinition {
        void define(IssueCommentsArguments args);
    }

    public UserQuery issueComments(IssueCommentPageQueryDefinition queryDef) {
        return issueComments(args -> {}, queryDef);
    }

    public UserQuery issueComments(IssueCommentsArgumentsDefinition argsDef, IssueCommentPageQueryDefinition queryDef) {
        startField("issueComments");

        IssueCommentsArguments args = new IssueCommentsArguments(_queryBuilder);
        argsDef.define(args);
        IssueCommentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }
}
