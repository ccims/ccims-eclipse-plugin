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
* The type of a timeline item/event so it can be filtered for <sup>(because GraphQL doesn't allow to
* filter for a type)</sup>
*/
public enum IssueTimelineItemType {
    /**
    * Event if the cross component issue was added to another location (another component/another)
    */
    ADDED_LOCATION_EVENT,

    /**
    * If a user has been assigned as responsible person for this issue
    */
    ASSIGNED_EVENT,

    /**
    * An event if the category (see `enum IssueCategory`) of the issue has been changed
    */
    CATEGORY_CHANGED_EVENT,

    /**
    * Happens if the issue has been closed by anybody
    */
    CLOSED_EVENT,

    /**
    * A comment that has been deleted by a user. This will contain no text etc., but a message should be
    * shown in place of the comment stating that this is a deleted comment
    */
    DELETED_ISSUE_COMMENT,

    /**
    * An event if the date the issue is due on/must be finished by was changed
    */
    DUE_DATE_CHANGED_EVENT,

    /**
    * The estimated time required to resolve this issue was updated
    */
    ESTIMATED_TIME_CHANGED_EVENT,

    /**
    * A still visible comment on an issue (not including the actual issue text)
    */
    ISSUE_COMMENT,

    /**
    * A label was added to this issue
    */
    LABELLED_EVENT,

    /**
    * A link from this issue to another issue was created
    */
    LINK_EVENT,

    /**
    * Occurs if this issue was marked as duplicate of some other issue which is known to the ccims.
    * (if the issue in unknown to the ccims at time of marking it as a duplicate; it's not guaranteed,
    * that the mark will be synced)
    */
    MARKED_AS_DUPLICATE_EVENT,

    /**
    * This issue was pinned as important issue in the ccims.
    * __This event won't be synced along all subscribed issue management systems__
    */
    PINNED_EVENT,

    /**
    * If the issue priority was changed (see `enum Priority`)
    */
    PRIORITY_CHANGED_EVENT,

    /**
    * An event when this issue was referenced by an other issue in an IMS or the ccims itself
    */
    REFERENCED_BY_ISSUE_EVENT,

    /**
    * An event when this issue was referenced by an element in an IMS that is not an issue (e.g. in a
    * commit message, pull request etc.)
    */
    REFERENCED_BY_OTHER_EVENT,

    /**
    * Event if the cross component issue was removed from a location (another component/another)
    */
    REMOVED_LOCATION_EVENT,

    /**
    * Occurs if the title of the issue has been changed
    */
    RENAMED_TITLE_EVENT,

    /**
    * Happens if the issue has been reopened after being closed by anybody.
    * _This event doesn't occur on the first opening of the issue_
    */
    REOPENED_EVENT,

    /**
    * An event if the date the issue gets relevant/starts has changed
    */
    START_DATE_CHANGED_EVENT,

    /**
    * If a user has been unassigned from this issue and is no longer responsible
    */
    UNASSIGNED_EVENT,

    /**
    * A label was removed from tis issue
    */
    UNLABELLED_EVENT,

    /**
    * A link from this issue to another issue was removed
    */
    UNLINK_EVENT,

    /**
    * An event if the issue is no longer a duplicate of another issue
    */
    UNMARKED_AS_DUPLICATE_EVENT,

    /**
    * This issue was unpinned in the ccims.
    * __This event won't be synced along all subscribed issue management systems__
    */
    UNPINNED_EVENT,

    /**
    * An event if this issue was linked to in another issue
    */
    WAS_LINKED_EVENT,

    /**
    * An event if the link from another issue to this one was removed
    */
    WAS_UNLINKED_EVENT,

    UNKNOWN_VALUE;

    public static IssueTimelineItemType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "ADDED_LOCATION_EVENT": {
                return ADDED_LOCATION_EVENT;
            }

            case "ASSIGNED_EVENT": {
                return ASSIGNED_EVENT;
            }

            case "CATEGORY_CHANGED_EVENT": {
                return CATEGORY_CHANGED_EVENT;
            }

            case "CLOSED_EVENT": {
                return CLOSED_EVENT;
            }

            case "DELETED_ISSUE_COMMENT": {
                return DELETED_ISSUE_COMMENT;
            }

            case "DUE_DATE_CHANGED_EVENT": {
                return DUE_DATE_CHANGED_EVENT;
            }

            case "ESTIMATED_TIME_CHANGED_EVENT": {
                return ESTIMATED_TIME_CHANGED_EVENT;
            }

            case "ISSUE_COMMENT": {
                return ISSUE_COMMENT;
            }

            case "LABELLED_EVENT": {
                return LABELLED_EVENT;
            }

            case "LINK_EVENT": {
                return LINK_EVENT;
            }

            case "MARKED_AS_DUPLICATE_EVENT": {
                return MARKED_AS_DUPLICATE_EVENT;
            }

            case "PINNED_EVENT": {
                return PINNED_EVENT;
            }

            case "PRIORITY_CHANGED_EVENT": {
                return PRIORITY_CHANGED_EVENT;
            }

            case "REFERENCED_BY_ISSUE_EVENT": {
                return REFERENCED_BY_ISSUE_EVENT;
            }

            case "REFERENCED_BY_OTHER_EVENT": {
                return REFERENCED_BY_OTHER_EVENT;
            }

            case "REMOVED_LOCATION_EVENT": {
                return REMOVED_LOCATION_EVENT;
            }

            case "RENAMED_TITLE_EVENT": {
                return RENAMED_TITLE_EVENT;
            }

            case "REOPENED_EVENT": {
                return REOPENED_EVENT;
            }

            case "START_DATE_CHANGED_EVENT": {
                return START_DATE_CHANGED_EVENT;
            }

            case "UNASSIGNED_EVENT": {
                return UNASSIGNED_EVENT;
            }

            case "UNLABELLED_EVENT": {
                return UNLABELLED_EVENT;
            }

            case "UNLINK_EVENT": {
                return UNLINK_EVENT;
            }

            case "UNMARKED_AS_DUPLICATE_EVENT": {
                return UNMARKED_AS_DUPLICATE_EVENT;
            }

            case "UNPINNED_EVENT": {
                return UNPINNED_EVENT;
            }

            case "WAS_LINKED_EVENT": {
                return WAS_LINKED_EVENT;
            }

            case "WAS_UNLINKED_EVENT": {
                return WAS_UNLINKED_EVENT;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case ADDED_LOCATION_EVENT: {
                return "ADDED_LOCATION_EVENT";
            }

            case ASSIGNED_EVENT: {
                return "ASSIGNED_EVENT";
            }

            case CATEGORY_CHANGED_EVENT: {
                return "CATEGORY_CHANGED_EVENT";
            }

            case CLOSED_EVENT: {
                return "CLOSED_EVENT";
            }

            case DELETED_ISSUE_COMMENT: {
                return "DELETED_ISSUE_COMMENT";
            }

            case DUE_DATE_CHANGED_EVENT: {
                return "DUE_DATE_CHANGED_EVENT";
            }

            case ESTIMATED_TIME_CHANGED_EVENT: {
                return "ESTIMATED_TIME_CHANGED_EVENT";
            }

            case ISSUE_COMMENT: {
                return "ISSUE_COMMENT";
            }

            case LABELLED_EVENT: {
                return "LABELLED_EVENT";
            }

            case LINK_EVENT: {
                return "LINK_EVENT";
            }

            case MARKED_AS_DUPLICATE_EVENT: {
                return "MARKED_AS_DUPLICATE_EVENT";
            }

            case PINNED_EVENT: {
                return "PINNED_EVENT";
            }

            case PRIORITY_CHANGED_EVENT: {
                return "PRIORITY_CHANGED_EVENT";
            }

            case REFERENCED_BY_ISSUE_EVENT: {
                return "REFERENCED_BY_ISSUE_EVENT";
            }

            case REFERENCED_BY_OTHER_EVENT: {
                return "REFERENCED_BY_OTHER_EVENT";
            }

            case REMOVED_LOCATION_EVENT: {
                return "REMOVED_LOCATION_EVENT";
            }

            case RENAMED_TITLE_EVENT: {
                return "RENAMED_TITLE_EVENT";
            }

            case REOPENED_EVENT: {
                return "REOPENED_EVENT";
            }

            case START_DATE_CHANGED_EVENT: {
                return "START_DATE_CHANGED_EVENT";
            }

            case UNASSIGNED_EVENT: {
                return "UNASSIGNED_EVENT";
            }

            case UNLABELLED_EVENT: {
                return "UNLABELLED_EVENT";
            }

            case UNLINK_EVENT: {
                return "UNLINK_EVENT";
            }

            case UNMARKED_AS_DUPLICATE_EVENT: {
                return "UNMARKED_AS_DUPLICATE_EVENT";
            }

            case UNPINNED_EVENT: {
                return "UNPINNED_EVENT";
            }

            case WAS_LINKED_EVENT: {
                return "WAS_LINKED_EVENT";
            }

            case WAS_UNLINKED_EVENT: {
                return "WAS_UNLINKED_EVENT";
            }

            default: {
                return "";
            }
        }
    }
}

