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

public class CreateProjectInput implements Serializable {
    private String name;

    private ID owner;

    private Input<List<ID>> components = Input.undefined();

    private Input<List<ID>> users = Input.undefined();

    public CreateProjectInput(String name, ID owner) {
        this.name = name;

        this.owner = owner;
    }

    public String getName() {
        return name;
    }

    public CreateProjectInput setName(String name) {
        this.name = name;
        return this;
    }

    public ID getOwner() {
        return owner;
    }

    public CreateProjectInput setOwner(ID owner) {
        this.owner = owner;
        return this;
    }

    public List<ID> getComponents() {
        return components.getValue();
    }

    public Input<List<ID>> getComponentsInput() {
        return components;
    }

    public CreateProjectInput setComponents(List<ID> components) {
        this.components = Input.optional(components);
        return this;
    }

    public CreateProjectInput setComponentsInput(Input<List<ID>> components) {
        if (components == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.components = components;
        return this;
    }

    public List<ID> getUsers() {
        return users.getValue();
    }

    public Input<List<ID>> getUsersInput() {
        return users;
    }

    public CreateProjectInput setUsers(List<ID> users) {
        this.users = Input.optional(users);
        return this;
    }

    public CreateProjectInput setUsersInput(Input<List<ID>> users) {
        if (users == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.users = users;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("name:");
        Query.appendQuotedString(_queryBuilder, name.toString());

        _queryBuilder.append(separator);
        separator = ",";
        _queryBuilder.append("owner:");
        Query.appendQuotedString(_queryBuilder, owner.toString());

        if (this.components.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("components:");
            if (components.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : components.getValue()) {
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
