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

public class Component extends AbstractResponse<Component> implements IssueLocation, Node {
    public Component() {
    }

    public Component(JsonObject fields) throws SchemaViolationError {
        for (Map.Entry<String, JsonElement> field : fields.entrySet()) {
            String key = field.getKey();
            String fieldName = getFieldName(key);
            switch (fieldName) {
                case "id": {
                    responseData.put(key, new ID(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "name": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

                    break;
                }

                case "owner": {
                    User optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new User(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "description": {
                    String optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = jsonAsString(field.getValue(), key);
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "issues": {
                    IssuePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new IssuePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "projects": {
                    ProjectPage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ProjectPage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "interfaces": {
                    ComponentInterfacePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentInterfacePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "consumedInterfaces": {
                    ComponentInterfacePage optional1 = null;
                    if (!field.getValue().isJsonNull()) {
                        optional1 = new ComponentInterfacePage(jsonAsObject(field.getValue(), key));
                    }

                    responseData.put(key, optional1);

                    break;
                }

                case "imsType": {
                    responseData.put(key, IMSType.fromGraphQl(jsonAsString(field.getValue(), key)));

                    break;
                }

                case "imsData": {
                    responseData.put(key, jsonAsString(field.getValue(), key));

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

    public Component(ID id) {
        this();
        optimisticData.put("id", id);
    }

    public String getGraphQlTypeName() {
        return "Component";
    }

    public ID getId() {
        return (ID) get("id");
    }

    public String getName() {
        return (String) get("name");
    }

    public Component setName(String arg) {
        optimisticData.put(getKey("name"), arg);
        return this;
    }

    public User getOwner() {
        return (User) get("owner");
    }

    public Component setOwner(User arg) {
        optimisticData.put(getKey("owner"), arg);
        return this;
    }

    public String getDescription() {
        return (String) get("description");
    }

    public Component setDescription(String arg) {
        optimisticData.put(getKey("description"), arg);
        return this;
    }

    public IssuePage getIssues() {
        return (IssuePage) get("issues");
    }

    public Component setIssues(IssuePage arg) {
        optimisticData.put(getKey("issues"), arg);
        return this;
    }

    public ProjectPage getProjects() {
        return (ProjectPage) get("projects");
    }

    public Component setProjects(ProjectPage arg) {
        optimisticData.put(getKey("projects"), arg);
        return this;
    }

    public ComponentInterfacePage getInterfaces() {
        return (ComponentInterfacePage) get("interfaces");
    }

    public Component setInterfaces(ComponentInterfacePage arg) {
        optimisticData.put(getKey("interfaces"), arg);
        return this;
    }

    public ComponentInterfacePage getConsumedInterfaces() {
        return (ComponentInterfacePage) get("consumedInterfaces");
    }

    public Component setConsumedInterfaces(ComponentInterfacePage arg) {
        optimisticData.put(getKey("consumedInterfaces"), arg);
        return this;
    }

    public IMSType getImsType() {
        return (IMSType) get("imsType");
    }

    public Component setImsType(IMSType arg) {
        optimisticData.put(getKey("imsType"), arg);
        return this;
    }

    public String getImsData() {
        return (String) get("imsData");
    }

    public Component setImsData(String arg) {
        optimisticData.put(getKey("imsData"), arg);
        return this;
    }

    public boolean unwrapsToObject(String key) {
        switch (getFieldName(key)) {
            case "id": return false;

            case "name": return false;

            case "owner": return true;

            case "description": return false;

            case "issues": return true;

            case "projects": return true;

            case "interfaces": return true;

            case "consumedInterfaces": return true;

            case "imsType": return false;

            case "imsData": return false;

            default: return false;
        }
    }
}

