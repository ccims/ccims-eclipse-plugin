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

public class ProjectFilter implements Serializable {
    private Input<List<String>> name = Input.undefined();

    private Input<List<ID>> components = Input.undefined();

    private Input<List<ID>> users = Input.undefined();

    private Input<List<ID>> owner = Input.undefined();

    private Input<List<ID>> issues = Input.undefined();

    public List<String> getName() {
        return name.getValue();
    }

    public Input<List<String>> getNameInput() {
        return name;
    }

    public ProjectFilter setName(List<String> name) {
        this.name = Input.optional(name);
        return this;
    }

    public ProjectFilter setNameInput(Input<List<String>> name) {
        if (name == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.name = name;
        return this;
    }

    public List<ID> getComponents() {
        return components.getValue();
    }

    public Input<List<ID>> getComponentsInput() {
        return components;
    }

    public ProjectFilter setComponents(List<ID> components) {
        this.components = Input.optional(components);
        return this;
    }

    public ProjectFilter setComponentsInput(Input<List<ID>> components) {
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

    public ProjectFilter setUsers(List<ID> users) {
        this.users = Input.optional(users);
        return this;
    }

    public ProjectFilter setUsersInput(Input<List<ID>> users) {
        if (users == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.users = users;
        return this;
    }

    public List<ID> getOwner() {
        return owner.getValue();
    }

    public Input<List<ID>> getOwnerInput() {
        return owner;
    }

    public ProjectFilter setOwner(List<ID> owner) {
        this.owner = Input.optional(owner);
        return this;
    }

    public ProjectFilter setOwnerInput(Input<List<ID>> owner) {
        if (owner == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.owner = owner;
        return this;
    }

    public List<ID> getIssues() {
        return issues.getValue();
    }

    public Input<List<ID>> getIssuesInput() {
        return issues;
    }

    public ProjectFilter setIssues(List<ID> issues) {
        this.issues = Input.optional(issues);
        return this;
    }

    public ProjectFilter setIssuesInput(Input<List<ID>> issues) {
        if (issues == null) {
            throw new IllegalArgumentException("Input can not be null");
        }
        this.issues = issues;
        return this;
    }

    public void appendTo(StringBuilder _queryBuilder) {
        String separator = "";
        _queryBuilder.append('{');

        if (this.name.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("name:");
            if (name.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (String item1 : name.getValue()) {
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

        if (this.owner.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("owner:");
            if (owner.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : owner.getValue()) {
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

        if (this.issues.isDefined()) {
            _queryBuilder.append(separator);
            separator = ",";
            _queryBuilder.append("issues:");
            if (issues.getValue() != null) {
                _queryBuilder.append('[');
                {
                    String listSeperator1 = "";
                    for (ID item1 : issues.getValue()) {
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
