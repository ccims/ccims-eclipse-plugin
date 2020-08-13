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

public class ReactionGroupFilter implements Serializable {
    private Input<List<String>> reaction = Input.undefined();

    private Input<List<ID>> users = Input.undefined();

    public List<String> getReaction() {
        return reaction.getValue();
    }

    public Input<List<String>> getReactionInput() {
        return reaction;
    }

    public ReactionGroupFilter setReaction(List<String> reaction) {
        this.reaction = Input.optional(reaction);
        return this;
    }

    public ReactionGroupFilter setReactionInput(Input<List<String>> reaction) {
        if (reaction == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.reaction = reaction;
        return this;
    }

    public List<ID> getUsers() {
        return users.getValue();
    }

    public Input<List<ID>> getUsersInput() {
        return users;
    }

    public ReactionGroupFilter setUsers(List<ID> users) {
        this.users = Input.optional(users);
        return this;
    }

    public ReactionGroupFilter setUsersInput(Input<List<ID>> users) {
        if (users == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.users = users;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.reaction.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("reaction:");
            if (reaction.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : reaction.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        if (this.users.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("users:");
            if (users.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : users.getValue()) {
                        _queryBuilder.append(listSeperator1);
                        listSeperator1 = ",";
                        Query.appendQuotedString(_queryBuilder, item1.toString());
                    }
                }
                _queryBuilder.append(']');
            } else {
                _queryBuilder.append("null");
            }
        }

        _queryBuilder.append('}');
    }
}
