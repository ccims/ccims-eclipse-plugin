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
* A page (sometimes also called connection) of multiple elements. 
* A page has a content (the list of elements) of some type (depending on the type of page).
* It also has information about the page as well as a count of total elements of that type (not only
* the ones on this page)
*/
public class PageQuery extends Query<PageQuery> {
    PageQuery(StringBuilder _queryBuilder) {
        super(_queryBuilder);

        startField("__typename");
    }

    public PageQuery pageInfo(PageInfoQueryDefinition queryDef) {
        startField("pageInfo");

        _queryBuilder.append('{');
        queryDef.define(new PageInfoQuery(_queryBuilder));
        _queryBuilder.append('}');

        return this;
    }

    public PageQuery totalCount() {
        startField("totalCount");

        return this;
    }

    public PageQuery onComponentPage(ComponentPageQueryDefinition queryDef) {
        startInlineFragment("ComponentPage");
        queryDef.define(new ComponentPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssueCommentPage(IssueCommentPageQueryDefinition queryDef) {
        startInlineFragment("IssueCommentPage");
        queryDef.define(new IssueCommentPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssuePage(IssuePageQueryDefinition queryDef) {
        startInlineFragment("IssuePage");
        queryDef.define(new IssuePageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onIssueTimelineItemPage(IssueTimelineItemPageQueryDefinition queryDef) {
        startInlineFragment("IssueTimelineItemPage");
        queryDef.define(new IssueTimelineItemPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onProjectPage(ProjectPageQueryDefinition queryDef) {
        startInlineFragment("ProjectPage");
        queryDef.define(new ProjectPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }

    public PageQuery onUserPage(UserPageQueryDefinition queryDef) {
        startInlineFragment("UserPage");
        queryDef.define(new UserPageQuery(_queryBuilder));
        _queryBuilder.append('}');
        return this;
    }
}
