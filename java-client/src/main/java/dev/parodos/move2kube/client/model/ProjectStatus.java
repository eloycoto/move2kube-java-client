/*
 * Move2Kube API
 * This is a documentation of the Move2Kube REST API. All API calls expect the `Authorization: Bearer <access-token>` HTTP header unless specified otherwise. The access token can be obtained in the same way as OAuth 2.0 using the token endpoint in the admin section. 
 *
 * The version of the OpenAPI document: v1.0.0
 * Contact: move2kube-dev@googlegroups.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package dev.parodos.move2kube.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import dev.parodos.move2kube.JSON;

/**
 * ProjectStatus
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-20T19:18:41.877870Z[Etc/UTC]")
public class ProjectStatus {
  public static final String SERIALIZED_NAME_PLAN = "plan";
  @SerializedName(SERIALIZED_NAME_PLAN)
  private Boolean plan;

  public static final String SERIALIZED_NAME_PLAN_ERROR = "plan_error";
  @SerializedName(SERIALIZED_NAME_PLAN_ERROR)
  private Boolean planError;

  public static final String SERIALIZED_NAME_PLANNING = "planning";
  @SerializedName(SERIALIZED_NAME_PLANNING)
  private Boolean planning;

  public static final String SERIALIZED_NAME_REFERENCE = "reference";
  @SerializedName(SERIALIZED_NAME_REFERENCE)
  private Boolean reference;

  public static final String SERIALIZED_NAME_STALE_PLAN = "stale_plan";
  @SerializedName(SERIALIZED_NAME_STALE_PLAN)
  private Boolean stalePlan;

  public ProjectStatus() {
  }

  public ProjectStatus plan(Boolean plan) {
    
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  @javax.annotation.Nullable

  public Boolean getPlan() {
    return plan;
  }


  public void setPlan(Boolean plan) {
    this.plan = plan;
  }


  public ProjectStatus planError(Boolean planError) {
    
    this.planError = planError;
    return this;
  }

   /**
   * Get planError
   * @return planError
  **/
  @javax.annotation.Nullable

  public Boolean getPlanError() {
    return planError;
  }


  public void setPlanError(Boolean planError) {
    this.planError = planError;
  }


  public ProjectStatus planning(Boolean planning) {
    
    this.planning = planning;
    return this;
  }

   /**
   * Get planning
   * @return planning
  **/
  @javax.annotation.Nullable

  public Boolean getPlanning() {
    return planning;
  }


  public void setPlanning(Boolean planning) {
    this.planning = planning;
  }


  public ProjectStatus reference(Boolean reference) {
    
    this.reference = reference;
    return this;
  }

   /**
   * Get reference
   * @return reference
  **/
  @javax.annotation.Nullable

  public Boolean getReference() {
    return reference;
  }


  public void setReference(Boolean reference) {
    this.reference = reference;
  }


  public ProjectStatus stalePlan(Boolean stalePlan) {
    
    this.stalePlan = stalePlan;
    return this;
  }

   /**
   * Get stalePlan
   * @return stalePlan
  **/
  @javax.annotation.Nullable

  public Boolean getStalePlan() {
    return stalePlan;
  }


  public void setStalePlan(Boolean stalePlan) {
    this.stalePlan = stalePlan;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProjectStatus projectStatus = (ProjectStatus) o;
    return Objects.equals(this.plan, projectStatus.plan) &&
        Objects.equals(this.planError, projectStatus.planError) &&
        Objects.equals(this.planning, projectStatus.planning) &&
        Objects.equals(this.reference, projectStatus.reference) &&
        Objects.equals(this.stalePlan, projectStatus.stalePlan);
  }

  @Override
  public int hashCode() {
    return Objects.hash(plan, planError, planning, reference, stalePlan);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProjectStatus {\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    planError: ").append(toIndentedString(planError)).append("\n");
    sb.append("    planning: ").append(toIndentedString(planning)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    stalePlan: ").append(toIndentedString(stalePlan)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("plan");
    openapiFields.add("plan_error");
    openapiFields.add("planning");
    openapiFields.add("reference");
    openapiFields.add("stale_plan");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ProjectStatus
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!ProjectStatus.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in ProjectStatus is not found in the empty JSON string", ProjectStatus.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ProjectStatus.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ProjectStatus` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ProjectStatus.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ProjectStatus' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ProjectStatus> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ProjectStatus.class));

       return (TypeAdapter<T>) new TypeAdapter<ProjectStatus>() {
           @Override
           public void write(JsonWriter out, ProjectStatus value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ProjectStatus read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ProjectStatus given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ProjectStatus
  * @throws IOException if the JSON string is invalid with respect to ProjectStatus
  */
  public static ProjectStatus fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ProjectStatus.class);
  }

 /**
  * Convert an instance of ProjectStatus to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

