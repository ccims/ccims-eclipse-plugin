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
* A page (sometimes also called connection) of multiple elements. 
* A page has a content (the list of elements) of some type (depending on the type of page).
* It also has information about the page as well as a count of total elements of that type (not only
* the ones on this page)
*/
public class UnknownPage extends AbstractResponse<UnknownPage> implements Page {
    public UnknownPage() {
    }

    public UnknownPage(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "pageInfo": {
                    responseData.put(key, new PageInfo(jsonAsObject(field.getValue(), key)));

                    break;
                }

                case "totalCount": {
                    responseData.put(key, jsonAsInteger(field.getValue(), key));

                    break;
                }

                case "__typename": {
                    responseData.put(key, jsonAsString(field.getValue(), key));
                    break;
                }
                default: {
                    throw new SchemaViolationError(this, key, field.getValue());
                }
            }
        }
    }

    public static Page create(JsonObject fields) throws SchemaViolationError {
        String typeName = fields.getAsJsonPrimitive("__typename").getAsString();
        switch (typeName) {
            case "ComponentPage": {
                return new ComponentPage(fields);
            }

            case "IssueCommentPage": {
                return new IssueCommentPage(fields);
            }

            case "IssuePage": {
                return new IssuePage(fields);
            }

            case "IssueTimelineItemPage": {
                return new IssueTimelineItemPage(fields);
            }

            case "ProjectPage": {
                return new ProjectPage(fields);
            }

            case "UserPage": {
                return new UserPage(fields);
            }

            default: {
                return new UnknownPage(fields);
            }
        }
    }

    public String getGraphQlTypeName() {
        return (String) get("__typename");
    }

    public PageInfo getPageInfo() {
        return (PageInfo) get("pageInfo");
    }

    public UnknownPage setPageInfo(PageInfo arg) {
        optimisticData.put(getKey("pageInfo"), arg);
        return this;
    }

    public Integer getTotalCount() {
        return (Integer) get("totalCount");
    }

    public UnknownPage setTotalCount(Integer arg) {
        optimisticData.put(getKey("totalCount"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "pageInfo": return true;

            case "totalCount": return false;

            default: return false;
        }
    }
}

