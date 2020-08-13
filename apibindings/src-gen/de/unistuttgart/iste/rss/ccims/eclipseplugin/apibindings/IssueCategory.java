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
* The category of an issue. The issue will be displayed accordingly in the ccims
*/
public enum IssueCategory {
    /**
    * If an issue is classified _bug_ it describes an error, flaw or fault in one ore multiple
    * component(s) or interface(s)
    */
    BUG,

    /**
    * If an issue is defined a _feature request_, it describes a functionality that is to be implemented
    * at some point
    */
    FEATURE_REQUEST,

    /**
    * The category for issues, that either weren't yet assigned to a category or that don't fit into one
    * of the other categories
    */
    UNCLASSIFIED,

    UNKNOWN_VALUE;

    public static IssueCategory fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "BUG": {
                return BUG;
            }

            case "FEATURE_REQUEST": {
                return FEATURE_REQUEST;
            }

            case "UNCLASSIFIED": {
                return UNCLASSIFIED;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case BUG: {
                return "BUG";
            }

            case FEATURE_REQUEST: {
                return "FEATURE_REQUEST";
            }

            case UNCLASSIFIED: {
                return "UNCLASSIFIED";
            }

            default: {
                return "";
            }
        }
    }
}

