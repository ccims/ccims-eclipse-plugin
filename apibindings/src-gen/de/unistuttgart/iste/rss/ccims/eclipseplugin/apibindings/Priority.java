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
* The Priority which an issue has - how urgent it needs to be resolved
*/
public enum Priority {
    /**
    * Issues with this priority are __very__ urgent and need to be resolved quickly
    */
    HIGH,

    /**
    * The issue has a low priority but higher than issues without priority
    */
    LOW,

    /**
    * The issue has a priority higher than low bot is not absolutely urgent
    */
    MEDIUM,

    UNKNOWN_VALUE;

    public static Priority fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "HIGH": {
                return HIGH;
            }

            case "LOW": {
                return LOW;
            }

            case "MEDIUM": {
                return MEDIUM;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case HIGH: {
                return "HIGH";
            }

            case LOW: {
                return "LOW";
            }

            case MEDIUM: {
                return "MEDIUM";
            }

            default: {
                return "";
            }
        }
    }
}

