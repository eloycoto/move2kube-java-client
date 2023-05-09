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
 * GetSupportInfo200Response
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-05-09T14:50:27.497398Z[Etc/UTC]")
public class GetSupportInfo200Response {
  public static final String SERIALIZED_NAME_CLI_VERSION = "cli_version";
  @SerializedName(SERIALIZED_NAME_CLI_VERSION)
  private String cliVersion;

  public static final String SERIALIZED_NAME_API_VERSION = "api_version";
  @SerializedName(SERIALIZED_NAME_API_VERSION)
  private String apiVersion;

  public static final String SERIALIZED_NAME_UI_VERSION = "ui_version";
  @SerializedName(SERIALIZED_NAME_UI_VERSION)
  private String uiVersion;

  public static final String SERIALIZED_NAME_DOCKER = "docker";
  @SerializedName(SERIALIZED_NAME_DOCKER)
  private String docker;

  public GetSupportInfo200Response() {
  }

  public GetSupportInfo200Response cliVersion(String cliVersion) {
    
    this.cliVersion = cliVersion;
    return this;
  }

   /**
   * The version, commit hash, etc. of the Move2Kube CLI tool being used.
   * @return cliVersion
  **/
  @javax.annotation.Nullable

  public String getCliVersion() {
    return cliVersion;
  }


  public void setCliVersion(String cliVersion) {
    this.cliVersion = cliVersion;
  }


  public GetSupportInfo200Response apiVersion(String apiVersion) {
    
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * The version, commit hash, etc. of the Move2Kube API server being used.
   * @return apiVersion
  **/
  @javax.annotation.Nullable

  public String getApiVersion() {
    return apiVersion;
  }


  public void setApiVersion(String apiVersion) {
    this.apiVersion = apiVersion;
  }


  public GetSupportInfo200Response uiVersion(String uiVersion) {
    
    this.uiVersion = uiVersion;
    return this;
  }

   /**
   * The version, commit hash, etc. of the Move2Kube UI website being used.
   * @return uiVersion
  **/
  @javax.annotation.Nullable

  public String getUiVersion() {
    return uiVersion;
  }


  public void setUiVersion(String uiVersion) {
    this.uiVersion = uiVersion;
  }


  public GetSupportInfo200Response docker(String docker) {
    
    this.docker = docker;
    return this;
  }

   /**
   * Whether the docker socket &#39;/var/run/docker.sock&#39; is mounted when running as a container.
   * @return docker
  **/
  @javax.annotation.Nullable

  public String getDocker() {
    return docker;
  }


  public void setDocker(String docker) {
    this.docker = docker;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSupportInfo200Response getSupportInfo200Response = (GetSupportInfo200Response) o;
    return Objects.equals(this.cliVersion, getSupportInfo200Response.cliVersion) &&
        Objects.equals(this.apiVersion, getSupportInfo200Response.apiVersion) &&
        Objects.equals(this.uiVersion, getSupportInfo200Response.uiVersion) &&
        Objects.equals(this.docker, getSupportInfo200Response.docker);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cliVersion, apiVersion, uiVersion, docker);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSupportInfo200Response {\n");
    sb.append("    cliVersion: ").append(toIndentedString(cliVersion)).append("\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    uiVersion: ").append(toIndentedString(uiVersion)).append("\n");
    sb.append("    docker: ").append(toIndentedString(docker)).append("\n");
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
    openapiFields.add("cli_version");
    openapiFields.add("api_version");
    openapiFields.add("ui_version");
    openapiFields.add("docker");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetSupportInfo200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GetSupportInfo200Response.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetSupportInfo200Response is not found in the empty JSON string", GetSupportInfo200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetSupportInfo200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetSupportInfo200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("cli_version") != null && !jsonObj.get("cli_version").isJsonNull()) && !jsonObj.get("cli_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `cli_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("cli_version").toString()));
      }
      if ((jsonObj.get("api_version") != null && !jsonObj.get("api_version").isJsonNull()) && !jsonObj.get("api_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `api_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("api_version").toString()));
      }
      if ((jsonObj.get("ui_version") != null && !jsonObj.get("ui_version").isJsonNull()) && !jsonObj.get("ui_version").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ui_version` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ui_version").toString()));
      }
      if ((jsonObj.get("docker") != null && !jsonObj.get("docker").isJsonNull()) && !jsonObj.get("docker").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `docker` to be a primitive type in the JSON string but got `%s`", jsonObj.get("docker").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetSupportInfo200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetSupportInfo200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetSupportInfo200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetSupportInfo200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetSupportInfo200Response>() {
           @Override
           public void write(JsonWriter out, GetSupportInfo200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetSupportInfo200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetSupportInfo200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetSupportInfo200Response
  * @throws IOException if the JSON string is invalid with respect to GetSupportInfo200Response
  */
  public static GetSupportInfo200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetSupportInfo200Response.class);
  }

 /**
  * Convert an instance of GetSupportInfo200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

