/*
 * lnbits
 * API for LNbits, the free and open source bitcoin wallet and accounts system with plugins.
 *
 * The version of the OpenAPI document: 0.10.9
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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

import org.openapitools.client.JSON;

/**
 * CreateExtension
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2023-07-01T17:53:25.667+02:00[Europe/Vienna]")
public class CreateExtension {
  public static final String SERIALIZED_NAME_EXT_ID = "ext_id";
  @SerializedName(SERIALIZED_NAME_EXT_ID)
  private String extId;

  public static final String SERIALIZED_NAME_ARCHIVE = "archive";
  @SerializedName(SERIALIZED_NAME_ARCHIVE)
  private String archive;

  public static final String SERIALIZED_NAME_SOURCE_REPO = "source_repo";
  @SerializedName(SERIALIZED_NAME_SOURCE_REPO)
  private String sourceRepo;

  public CreateExtension() {
  }

  public CreateExtension extId(String extId) {
    
    this.extId = extId;
    return this;
  }

   /**
   * Get extId
   * @return extId
  **/
  @javax.annotation.Nonnull
  public String getExtId() {
    return extId;
  }


  public void setExtId(String extId) {
    this.extId = extId;
  }


  public CreateExtension archive(String archive) {
    
    this.archive = archive;
    return this;
  }

   /**
   * Get archive
   * @return archive
  **/
  @javax.annotation.Nonnull
  public String getArchive() {
    return archive;
  }


  public void setArchive(String archive) {
    this.archive = archive;
  }


  public CreateExtension sourceRepo(String sourceRepo) {
    
    this.sourceRepo = sourceRepo;
    return this;
  }

   /**
   * Get sourceRepo
   * @return sourceRepo
  **/
  @javax.annotation.Nonnull
  public String getSourceRepo() {
    return sourceRepo;
  }


  public void setSourceRepo(String sourceRepo) {
    this.sourceRepo = sourceRepo;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateExtension createExtension = (CreateExtension) o;
    return Objects.equals(this.extId, createExtension.extId) &&
        Objects.equals(this.archive, createExtension.archive) &&
        Objects.equals(this.sourceRepo, createExtension.sourceRepo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(extId, archive, sourceRepo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateExtension {\n");
    sb.append("    extId: ").append(toIndentedString(extId)).append("\n");
    sb.append("    archive: ").append(toIndentedString(archive)).append("\n");
    sb.append("    sourceRepo: ").append(toIndentedString(sourceRepo)).append("\n");
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
    openapiFields.add("ext_id");
    openapiFields.add("archive");
    openapiFields.add("source_repo");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("ext_id");
    openapiRequiredFields.add("archive");
    openapiRequiredFields.add("source_repo");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CreateExtension
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!CreateExtension.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CreateExtension is not found in the empty JSON string", CreateExtension.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CreateExtension.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CreateExtension` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CreateExtension.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (!jsonObj.get("ext_id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ext_id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ext_id").toString()));
      }
      if (!jsonObj.get("archive").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `archive` to be a primitive type in the JSON string but got `%s`", jsonObj.get("archive").toString()));
      }
      if (!jsonObj.get("source_repo").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `source_repo` to be a primitive type in the JSON string but got `%s`", jsonObj.get("source_repo").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CreateExtension.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CreateExtension' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CreateExtension> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CreateExtension.class));

       return (TypeAdapter<T>) new TypeAdapter<CreateExtension>() {
           @Override
           public void write(JsonWriter out, CreateExtension value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CreateExtension read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CreateExtension given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CreateExtension
  * @throws IOException if the JSON string is invalid with respect to CreateExtension
  */
  public static CreateExtension fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CreateExtension.class);
  }

 /**
  * Convert an instance of CreateExtension to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}
