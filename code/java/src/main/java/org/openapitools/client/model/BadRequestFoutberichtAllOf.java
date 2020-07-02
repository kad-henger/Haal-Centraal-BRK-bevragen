/*
 * Kadastraal onroerende zaken
 * D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.
 *
 * The version of the OpenAPI document: 1.0.0
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
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.InvalidParams;

/**
 * BadRequestFoutberichtAllOf
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-02T17:36:04.072+02:00[Europe/Amsterdam]")
public class BadRequestFoutberichtAllOf {
  public static final String SERIALIZED_NAME_INVALID_PARAMS = "invalidParams";
  @SerializedName(SERIALIZED_NAME_INVALID_PARAMS)
  private List<InvalidParams> invalidParams = null;


  public BadRequestFoutberichtAllOf invalidParams(List<InvalidParams> invalidParams) {
    
    this.invalidParams = invalidParams;
    return this;
  }

  public BadRequestFoutberichtAllOf addInvalidParamsItem(InvalidParams invalidParamsItem) {
    if (this.invalidParams == null) {
      this.invalidParams = new ArrayList<>();
    }
    this.invalidParams.add(invalidParamsItem);
    return this;
  }

   /**
   * Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.
   * @return invalidParams
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Foutmelding per fout in een parameter. Alle gevonden fouten worden één keer teruggemeld.")

  public List<InvalidParams> getInvalidParams() {
    return invalidParams;
  }


  public void setInvalidParams(List<InvalidParams> invalidParams) {
    this.invalidParams = invalidParams;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BadRequestFoutberichtAllOf badRequestFoutberichtAllOf = (BadRequestFoutberichtAllOf) o;
    return Objects.equals(this.invalidParams, badRequestFoutberichtAllOf.invalidParams);
  }

  @Override
  public int hashCode() {
    return Objects.hash(invalidParams);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BadRequestFoutberichtAllOf {\n");
    sb.append("    invalidParams: ").append(toIndentedString(invalidParams)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

