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
import org.openapitools.client.model.DatumOnvolledig;
import org.openapitools.client.model.Naam;

/**
 * Partnerschap is een groep gegevens over de huwelijkse- of partnerschapstatus van een persoon.
 */
@ApiModel(description = "Partnerschap is een groep gegevens over de huwelijkse- of partnerschapstatus van een persoon.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2020-07-08T15:06:35.604+02:00[Europe/Amsterdam]")
public class HeeftPartnerschap {
  public static final String SERIALIZED_NAME_DATUM_ONTBINDING = "datumOntbinding";
  @SerializedName(SERIALIZED_NAME_DATUM_ONTBINDING)
  private DatumOnvolledig datumOntbinding;

  public static final String SERIALIZED_NAME_DATUM_SLUITING = "datumSluiting";
  @SerializedName(SERIALIZED_NAME_DATUM_SLUITING)
  private DatumOnvolledig datumSluiting;

  public static final String SERIALIZED_NAME_NAAM = "naam";
  @SerializedName(SERIALIZED_NAME_NAAM)
  private Naam naam;


  public HeeftPartnerschap datumOntbinding(DatumOnvolledig datumOntbinding) {
    
    this.datumOntbinding = datumOntbinding;
    return this;
  }

   /**
   * Get datumOntbinding
   * @return datumOntbinding
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumOntbinding() {
    return datumOntbinding;
  }


  public void setDatumOntbinding(DatumOnvolledig datumOntbinding) {
    this.datumOntbinding = datumOntbinding;
  }


  public HeeftPartnerschap datumSluiting(DatumOnvolledig datumSluiting) {
    
    this.datumSluiting = datumSluiting;
    return this;
  }

   /**
   * Get datumSluiting
   * @return datumSluiting
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DatumOnvolledig getDatumSluiting() {
    return datumSluiting;
  }


  public void setDatumSluiting(DatumOnvolledig datumSluiting) {
    this.datumSluiting = datumSluiting;
  }


  public HeeftPartnerschap naam(Naam naam) {
    
    this.naam = naam;
    return this;
  }

   /**
   * Get naam
   * @return naam
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Naam getNaam() {
    return naam;
  }


  public void setNaam(Naam naam) {
    this.naam = naam;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    HeeftPartnerschap heeftPartnerschap = (HeeftPartnerschap) o;
    return Objects.equals(this.datumOntbinding, heeftPartnerschap.datumOntbinding) &&
        Objects.equals(this.datumSluiting, heeftPartnerschap.datumSluiting) &&
        Objects.equals(this.naam, heeftPartnerschap.naam);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datumOntbinding, datumSluiting, naam);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class HeeftPartnerschap {\n");
    sb.append("    datumOntbinding: ").append(toIndentedString(datumOntbinding)).append("\n");
    sb.append("    datumSluiting: ").append(toIndentedString(datumSluiting)).append("\n");
    sb.append("    naam: ").append(toIndentedString(naam)).append("\n");
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
