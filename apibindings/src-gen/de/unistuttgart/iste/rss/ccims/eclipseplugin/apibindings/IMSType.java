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

/**
* The type of the Issue management system. Currently only GitHub and ccims internal are available
*/
public enum IMSType {
    /**
    * ccims itself is the only IMS for the component, there is no external IMS
    */
    CCIMS,

    /**
    * GitHub (or GitHub enterprise server) is the IMS for the component
    */
    GITHUB,

    UNKNOWN_VALUE;

    public static IMSType fromGraphQl(String value) {
        if (value == null) {
            return null;
        }

        switch (value) {
            case "CCIMS": {
                return CCIMS;
            }

            case "GITHUB": {
                return GITHUB;
            }

            default: {
                return UNKNOWN_VALUE;
            }
        }
    }
    public String toString() {
        switch (this) {
            case CCIMS: {
                return "CCIMS";
            }

            case GITHUB: {
                return "GITHUB";
            }

            default: {
                return "";
            }
        }
    }
}

