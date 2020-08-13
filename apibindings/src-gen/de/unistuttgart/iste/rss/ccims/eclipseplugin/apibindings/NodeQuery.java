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

/**
* An object which can be identified by an ID - called a node
*/
public class NodeQuery extends Query<NodeQuery> {
    NodeQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    /**
    * The ID of this node. Every node will have an non-empty and non-null edge.
    * If this is ever empty or null, something went wrong.
    */
    public NodeQuery id() {
        startField("id");

        return this;
    }

    public NodeQuery onAddedLocationEvent(AddedLocationEventQueryDefinition queryDef) {
        startInlineFragment("AddedLocationEvent");
        queryDef.define(new AddedLocationEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onAssignedEvent(AssignedEventQueryDefinition queryDef) {
        startInlineFragment("AssignedEvent");
        queryDef.define(new AssignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onCategoryChangedEvent(CategoryChangedEventQueryDefinition queryDef) {
        startInlineFragment("CategoryChangedEvent");
        queryDef.define(new CategoryChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onClosedEvent(ClosedEventQueryDefinition queryDef) {
        startInlineFragment("ClosedEvent");
        queryDef.define(new ClosedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onComponent(ComponentQueryDefinition queryDef) {
        startInlineFragment("Component");
        queryDef.define(new ComponentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onComponentInterface(ComponentInterfaceQueryDefinition queryDef) {
        startInlineFragment("ComponentInterface");
        queryDef.define(new ComponentInterfaceQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDeletedIssueComment(DeletedIssueCommentQueryDefinition queryDef) {
        startInlineFragment("DeletedIssueComment");
        queryDef.define(new DeletedIssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onDueDateChangedEvent(DueDateChangedEventQueryDefinition queryDef) {
        startInlineFragment("DueDateChangedEvent");
        queryDef.define(new DueDateChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onEstimatedTimeChangedEvent(EstimatedTimeChangedEventQueryDefinition queryDef) {
        startInlineFragment("EstimatedTimeChangedEvent");
        queryDef.define(new EstimatedTimeChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onIssueComment(IssueCommentQueryDefinition queryDef) {
        startInlineFragment("IssueComment");
        queryDef.define(new IssueCommentQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLabel(LabelQueryDefinition queryDef) {
        startInlineFragment("Label");
        queryDef.define(new LabelQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLabelledEvent(LabelledEventQueryDefinition queryDef) {
        startInlineFragment("LabelledEvent");
        queryDef.define(new LabelledEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onLinkEvent(LinkEventQueryDefinition queryDef) {
        startInlineFragment("LinkEvent");
        queryDef.define(new LinkEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onMarkedAsDuplicateEvent(MarkedAsDuplicateEventQueryDefinition queryDef) {
        startInlineFragment("MarkedAsDuplicateEvent");
        queryDef.define(new MarkedAsDuplicateEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPinnedEvent(PinnedEventQueryDefinition queryDef) {
        startInlineFragment("PinnedEvent");
        queryDef.define(new PinnedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onPriorityChangedEvent(PriorityChangedEventQueryDefinition queryDef) {
        startInlineFragment("PriorityChangedEvent");
        queryDef.define(new PriorityChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onProject(ProjectQueryDefinition queryDef) {
        startInlineFragment("Project");
        queryDef.define(new ProjectQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReferencedByIssueEvent(ReferencedByIssueEventQueryDefinition queryDef) {
        startInlineFragment("ReferencedByIssueEvent");
        queryDef.define(new ReferencedByIssueEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReferencedByOtherEvent(ReferencedByOtherEventQueryDefinition queryDef) {
        startInlineFragment("ReferencedByOtherEvent");
        queryDef.define(new ReferencedByOtherEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onRemovedLocationEvent(RemovedLocationEventQueryDefinition queryDef) {
        startInlineFragment("RemovedLocationEvent");
        queryDef.define(new RemovedLocationEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onRenamedTitleEvent(RenamedTitleEventQueryDefinition queryDef) {
        startInlineFragment("RenamedTitleEvent");
        queryDef.define(new RenamedTitleEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onReopenedEvent(ReopenedEventQueryDefinition queryDef) {
        startInlineFragment("ReopenedEvent");
        queryDef.define(new ReopenedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onStartDateChangedEvent(StartDateChangedEventQueryDefinition queryDef) {
        startInlineFragment("StartDateChangedEvent");
        queryDef.define(new StartDateChangedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnassignedEvent(UnassignedEventQueryDefinition queryDef) {
        startInlineFragment("UnassignedEvent");
        queryDef.define(new UnassignedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnlabelledEvent(UnlabelledEventQueryDefinition queryDef) {
        startInlineFragment("UnlabelledEvent");
        queryDef.define(new UnlabelledEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnlinkEvent(UnlinkEventQueryDefinition queryDef) {
        startInlineFragment("UnlinkEvent");
        queryDef.define(new UnlinkEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnmarkedAsDuplicateEvent(UnmarkedAsDuplicateEventQueryDefinition queryDef) {
        startInlineFragment("UnmarkedAsDuplicateEvent");
        queryDef.define(new UnmarkedAsDuplicateEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUnpinnedEvent(UnpinnedEventQueryDefinition queryDef) {
        startInlineFragment("UnpinnedEvent");
        queryDef.define(new UnpinnedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onUser(UserQueryDefinition queryDef) {
        startInlineFragment("User");
        queryDef.define(new UserQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onWasLinkedEvent(WasLinkedEventQueryDefinition queryDef) {
        startInlineFragment("WasLinkedEvent");
        queryDef.define(new WasLinkedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public NodeQuery onWasUnlinkedEvent(WasUnlinkedEventQueryDefinition queryDef) {
        startInlineFragment("WasUnlinkedEvent");
        queryDef.define(new WasUnlinkedEventQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
