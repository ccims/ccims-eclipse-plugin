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

public class IssueQuery extends Query<IssueQuery> {
    IssueQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public IssueQuery id() {
        startField("id");

        return this;
    }

    public IssueQuery title() {
        startField("title");

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

    public IssueQuery components(ComponentPageQueryDefinition queryDef) {
        return components(args -> {}, queryDef);
    }

    public IssueQuery components(ComponentsArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("components");

        ComponentsArguments args = new ComponentsArguments(_queryBuilder);
        argsDef.define(args);
        ComponentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public IssueQuery body() {
        startField("body");

        return this;
    }

    public IssueQuery bodyRendered() {
        startField("bodyRendered");

        return this;
    }

    public IssueQuery createdBy(UserQueryDefinition queryDef) {
        startField("createdBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public IssueQuery editedBy(UserQueryDefinition queryDef) {
        startField("editedBy");

        _queryBuilder.append('{');
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public IssueQuery createdAt() {
        startField("createdAt");

        return this;
    }

    public IssueQuery editedAt() {
        startField("editedAt");

        return this;
    }

    public IssueQuery updatedAt() {
        startField("updatedAt");

        return this;
    }

    public IssueQuery isOpen() {
        startField("isOpen");

        return this;
    }

    public IssueQuery isDuplicate() {
        startField("isDuplicate");

        return this;
    }

    public IssueQuery category() {
        startField("category");

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

    public IssueQuery issueComments(IssueCommentPageQueryDefinition queryDef) {
        return issueComments(args -> {}, queryDef);
    }

    public IssueQuery issueComments(IssueCommentsArgumentsDefinition argsDef, IssueCommentPageQueryDefinition queryDef) {
        startField("issueComments");

        IssueCommentsArguments args = new IssueCommentsArguments(_queryBuilder);
        argsDef.define(args);
        IssueCommentsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LinkedIssuesArguments extends Arguments {
        LinkedIssuesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public LinkedIssuesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LinkedIssuesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LinkedIssuesArguments filterBy(IssueFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public LinkedIssuesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public LinkedIssuesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LinkedIssuesArgumentsDefinition {
        void define(LinkedIssuesArguments args);
    }

    public IssueQuery linkedIssues(IssuePageQueryDefinition queryDef) {
        return linkedIssues(args -> {}, queryDef);
    }

    public IssueQuery linkedIssues(LinkedIssuesArgumentsDefinition argsDef, IssuePageQueryDefinition queryDef) {
        startField("linkedIssues");

        LinkedIssuesArguments args = new LinkedIssuesArguments(_queryBuilder);
        argsDef.define(args);
        LinkedIssuesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');

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

    public IssueQuery reactions(ReactionGroupPageQueryDefinition queryDef) {
        return reactions(args -> {}, queryDef);
    }

    public IssueQuery reactions(ReactionsArgumentsDefinition argsDef, ReactionGroupPageQueryDefinition queryDef) {
        startField("reactions");

        ReactionsArguments args = new ReactionsArguments(_queryBuilder);
        argsDef.define(args);
        ReactionsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ReactionGroupPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class AssigneesArguments extends Arguments {
        AssigneesArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public AssigneesArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public AssigneesArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public AssigneesArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public AssigneesArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public AssigneesArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface AssigneesArgumentsDefinition {
        void define(AssigneesArguments args);
    }

    public IssueQuery assignees(UserPageQueryDefinition queryDef) {
        return assignees(args -> {}, queryDef);
    }

    public IssueQuery assignees(AssigneesArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("assignees");

        AssigneesArguments args = new AssigneesArguments(_queryBuilder);
        argsDef.define(args);
        AssigneesArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LabelsArguments extends Arguments {
        LabelsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public LabelsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LabelsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LabelsArguments filterBy(LabelFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public LabelsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public LabelsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LabelsArgumentsDefinition {
        void define(LabelsArguments args);
    }

    public IssueQuery labels(LabelPageQueryDefinition queryDef) {
        return labels(args -> {}, queryDef);
    }

    public IssueQuery labels(LabelsArgumentsDefinition argsDef, LabelPageQueryDefinition queryDef) {
        startField("labels");

        LabelsArguments args = new LabelsArguments(_queryBuilder);
        argsDef.define(args);
        LabelsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new LabelPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class ParticipantsArguments extends Arguments {
        ParticipantsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public ParticipantsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ParticipantsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public ParticipantsArguments filterBy(UserFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public ParticipantsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public ParticipantsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface ParticipantsArgumentsDefinition {
        void define(ParticipantsArguments args);
    }

    public IssueQuery participants(UserPageQueryDefinition queryDef) {
        return participants(args -> {}, queryDef);
    }

    public IssueQuery participants(ParticipantsArgumentsDefinition argsDef, UserPageQueryDefinition queryDef) {
        startField("participants");

        ParticipantsArguments args = new ParticipantsArguments(_queryBuilder);
        argsDef.define(args);
        ParticipantsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class PinnedOnArguments extends Arguments {
        PinnedOnArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public PinnedOnArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public PinnedOnArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public PinnedOnArguments filterBy(ComponentFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public PinnedOnArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public PinnedOnArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface PinnedOnArgumentsDefinition {
        void define(PinnedOnArguments args);
    }

    public IssueQuery pinnedOn(ComponentPageQueryDefinition queryDef) {
        return pinnedOn(args -> {}, queryDef);
    }

    public IssueQuery pinnedOn(PinnedOnArgumentsDefinition argsDef, ComponentPageQueryDefinition queryDef) {
        startField("pinnedOn");

        PinnedOnArguments args = new PinnedOnArguments(_queryBuilder);
        argsDef.define(args);
        PinnedOnArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class TimelineArguments extends Arguments {
        TimelineArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public TimelineArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public TimelineArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public TimelineArguments filterBy(IssueTimelineItemFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public TimelineArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public TimelineArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface TimelineArgumentsDefinition {
        void define(TimelineArguments args);
    }

    public IssueQuery timeline(IssueTimelineItemPageQueryDefinition queryDef) {
        return timeline(args -> {}, queryDef);
    }

    public IssueQuery timeline(TimelineArgumentsDefinition argsDef, IssueTimelineItemPageQueryDefinition queryDef) {
        startField("timeline");

        TimelineArguments args = new TimelineArguments(_queryBuilder);
        argsDef.define(args);
        TimelineArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueTimelineItemPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public class LocationsArguments extends Arguments {
        LocationsArguments(StringBuilder _queryBuilder) {
            super(_queryBuilder, true);
        }

        public LocationsArguments after(String value) {
            if (value != null) {
                startArgument("after");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LocationsArguments before(String value) {
            if (value != null) {
                startArgument("before");
                Query.appendQuotedString(_queryBuilder, value.toString());
            }
            return this;
        }

        public LocationsArguments filterBy(IssueLocationFilter value) {
            if (value != null) {
                startArgument("filterBy");
                value.appendTo(_queryBuilder);
            }
            return this;
        }

        public LocationsArguments first(Integer value) {
            if (value != null) {
                startArgument("first");
                _queryBuilder.append(value);
            }
            return this;
        }

        public LocationsArguments last(Integer value) {
            if (value != null) {
                startArgument("last");
                _queryBuilder.append(value);
            }
            return this;
        }
    }

    public interface LocationsArgumentsDefinition {
        void define(LocationsArguments args);
    }

    public IssueQuery locations(IssueLocationPageQueryDefinition queryDef) {
        return locations(args -> {}, queryDef);
    }

    public IssueQuery locations(LocationsArgumentsDefinition argsDef, IssueLocationPageQueryDefinition queryDef) {
        startField("locations");

        LocationsArguments args = new LocationsArguments(_queryBuilder);
        argsDef.define(args);
        LocationsArguments.end(args);

        _queryBuilder.append('{');
        queryDef.define(new IssueLocationPageQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public IssueQuery currentUserCanEdit() {
        startField("currentUserCanEdit");

        return this;
    }

    public IssueQuery currentUserCanComment() {
        startField("currentUserCanComment");

        return this;
    }

    public IssueQuery startDate() {
        startField("startDate");

        return this;
    }

    public IssueQuery dueDate() {
        startField("dueDate");

        return this;
    }

    public IssueQuery estimatedTime() {
        startField("estimatedTime");

        return this;
    }

    public IssueQuery spentTime() {
        startField("spentTime");

        return this;
    }
}
