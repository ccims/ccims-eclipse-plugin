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

public class MutationQuery extends Query<MutationQuery> {
    MutationQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);
    }

    public MutationQuery createIssue(CreateIssueInput input, CreateIssuePayloadQueryDefinition queryDef) {
        startField("createIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CreateIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery addIssueComment(AddIssueCommentInput input, AddIssueCommentPayloadQueryDefinition queryDef) {
        startField("addIssueComment");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddIssueCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery deleteIssueComment(DeleteIssueCommentInput input, DeleteIssueCommentPayloadQueryDefinition queryDef) {
        startField("deleteIssueComment");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new DeleteIssueCommentPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery linkIssue(LinkIssueInput input, LinkIssuePayloadQueryDefinition queryDef) {
        startField("linkIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new LinkIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery unlinkIssue(UnlinkIssueInput input, UnlinkIssuePayloadQueryDefinition queryDef) {
        startField("unlinkIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UnlinkIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery addLabel(AddLabelInput input, AddLabelPayloadQueryDefinition queryDef) {
        startField("addLabel");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddLabelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery removeLabel(RemoveLabelInput input, RemoveLabelPayloadQueryDefinition queryDef) {
        startField("removeLabel");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveLabelPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery pinIssue(PinIssueInput input, PinIssuePayloadQueryDefinition queryDef) {
        startField("pinIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new PinIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery unpinIssue(UnpinIssueInput input, UnpinIssuePayloadQueryDefinition queryDef) {
        startField("unpinIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UnpinIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery renameIssueTitle(RenameIssueTitleInput input, RenameIssueTitlePayloadQueryDefinition queryDef) {
        startField("renameIssueTitle");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RenameIssueTitlePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery changeIssueCategory(ChangeIssueCategoryInput input, ChangeIssueCategoryPayloadQueryDefinition queryDef) {
        startField("changeIssueCategory");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueCategoryPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery addAssignee(AddAssigneeInput input, AddAssigneePayloadQueryDefinition queryDef) {
        startField("addAssignee");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddAssigneePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery removeAssignee(RemoveAssigneeInput input, RemoveAssigneePayloadQueryDefinition queryDef) {
        startField("removeAssignee");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveAssigneePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery closeIssue(CloseIssueInput input, CloseIssuePayloadQueryDefinition queryDef) {
        startField("closeIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new CloseIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery reopenIssue(ReopenIssueInput input, ReopenIssuePayloadQueryDefinition queryDef) {
        startField("reopenIssue");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ReopenIssuePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery changeIssuePriority(ChangeIssuePriorityInput input, ChangeIssuePriorityPayloadQueryDefinition queryDef) {
        startField("changeIssuePriority");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssuePriorityPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery changeIssueStartDate(ChangeIssueStartDateInput input, ChangeIssueStartDatePayloadQueryDefinition queryDef) {
        startField("changeIssueStartDate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueStartDatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery changeIssueDueDate(ChangeIssueDueDateInput input, ChangeIssueDueDatePayloadQueryDefinition queryDef) {
        startField("changeIssueDueDate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueDueDatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery changeIssueEstimatedTime(ChangeIssueEstimatedTimeInput input, ChangeIssueEstimatedTimePayloadQueryDefinition queryDef) {
        startField("changeIssueEstimatedTime");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new ChangeIssueEstimatedTimePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery addIssueToLocation(AddIssueToLocationInput input, AddIssueToLocationPayloadQueryDefinition queryDef) {
        startField("addIssueToLocation");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddIssueToLocationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery removeIssueFromLocation(RemoveIssueFromLocationInput input, RemoveIssueFromLocationPayloadQueryDefinition queryDef) {
        startField("removeIssueFromLocation");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveIssueFromLocationPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery markIssueAsDuplicate(MarkIssueAsDuplicateInput input, MarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        startField("markIssueAsDuplicate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new MarkIssueAsDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery unmarkIssueAsDuplicate(UnmarkIssueAsDuplicateInput input, UnmarkIssueAsDuplicatePayloadQueryDefinition queryDef) {
        startField("unmarkIssueAsDuplicate");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new UnmarkIssueAsDuplicatePayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery addReaction(AddReactionInput input, AddReactionPayloadQueryDefinition queryDef) {
        startField("addReaction");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new AddReactionPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public MutationQuery removeReaction(RemoveReactionInput input, RemoveReactionPayloadQueryDefinition queryDef) {
        startField("removeReaction");

        _queryBuilder.append("(input:");
        input.appendTo(_queryBuilder);

        _queryBuilder.append(')');

        _queryBuilder.append('{');
        queryDef.define(new RemoveReactionPayloadQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public String toString() {
        return _queryBuilder.toString();
    }
}
