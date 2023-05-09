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
 * PostAnswerToQuestionRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T11:43:40.367106Z[Etc/UTC]")
public class PostAnswerToQuestionRequest {
  public static final String SERIALIZED_NAME_SOLUTION = "solution";
  @SerializedName(SERIALIZED_NAME_SOLUTION)
  private String solution;

  public PostAnswerToQuestionRequest() {
  }

  public PostAnswerToQuestionRequest solution(String solution) {
    
    this.solution = solution;
    return this;
  }

   /**
   * A JSON encoded string containing the answer object.
   * @return solution
  **/
  @javax.annotation.Nullable

  public String getSolution() {
    return solution;
  }


  public void setSolution(String solution) {
    this.solution = solution;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PostAnswerToQuestionRequest postAnswerToQuestionRequest = (PostAnswerToQuestionRequest) o;
    return Objects.equals(this.solution, postAnswerToQuestionRequest.solution);
  }

  @Override
  public int hashCode() {
    return Objects.hash(solution);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PostAnswerToQuestionRequest {\n");
    sb.append("    solution: ").append(toIndentedString(solution)).append("\n");
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
    openapiFields.add("solution");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to PostAnswerToQuestionRequest
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!PostAnswerToQuestionRequest.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PostAnswerToQuestionRequest is not found in the empty JSON string", PostAnswerToQuestionRequest.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!PostAnswerToQuestionRequest.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `PostAnswerToQuestionRequest` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("solution") != null && !jsonObj.get("solution").isJsonNull()) && !jsonObj.get("solution").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `solution` to be a primitive type in the JSON string but got `%s`", jsonObj.get("solution").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PostAnswerToQuestionRequest.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PostAnswerToQuestionRequest' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PostAnswerToQuestionRequest> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PostAnswerToQuestionRequest.class));

       return (TypeAdapter<T>) new TypeAdapter<PostAnswerToQuestionRequest>() {
           @Override
           public void write(JsonWriter out, PostAnswerToQuestionRequest value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public PostAnswerToQuestionRequest read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of PostAnswerToQuestionRequest given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PostAnswerToQuestionRequest
  * @throws IOException if the JSON string is invalid with respect to PostAnswerToQuestionRequest
  */
  public static PostAnswerToQuestionRequest fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PostAnswerToQuestionRequest.class);
  }

 /**
  * Convert an instance of PostAnswerToQuestionRequest to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

