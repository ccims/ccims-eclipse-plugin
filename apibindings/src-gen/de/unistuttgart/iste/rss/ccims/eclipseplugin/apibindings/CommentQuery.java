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

public class CommentQuery extends Query<CommentQuery> {
    CommentQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public CommentQuery id() {
        startField("id");

        return this;
    }

    public CommentQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CommentQuery editedBy(UserQueryDefinition queryDef) {
        startField("editedBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CommentQuery createdAt() {
        startField("createdAt");

        return this;
    }

    public CommentQuery editedAt() {
        startField("editedAt");

        return this;
    }

    public CommentQuery body() {
        startField("body");

        return this;
    }

    public CommentQuery bodyRendered() {
        startField("bodyRendered");

        return this;
    }

    public class ReactionsArguments extends Arguments {
        ReactionsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ReactionsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ReactionsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ReactionsArguments filterBy(ReactionGroupFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ReactionsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ReactionsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ReactionsArgumentsDefinition {
        void define(ReactionsArguments args);
    }

    public CommentQuery reactions(ReactionGroupPageQueryDefinition queryDef) {
        return reactions(args -> {}, queryDef);
    }

    public CommentQuery reactions(ReactionsArgumentsDefinition argsDef, ReactionGroupPageQueryDefinition queryDef) {
        startField("reactions");

        ReactionsArguments args = new ReactionsArguments(_queryBuilder);
        argsDef.define(args);
        ReactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReactionGroupPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public CommentQuery currentUserCanEdit() {
        startField("currentUserCanEdit");

        return this;
    }

    public CommentQuery onIssue(IssueQueryDefinition queryDef) {
        startInlineFragment("Issue");
        queryDef.define(new IssueQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public CommentQuery onIssueComment(IssueCommentQueryDefinition queryDef) {
        startInlineFragment("IssueComment");
        queryDef.define(new IssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
