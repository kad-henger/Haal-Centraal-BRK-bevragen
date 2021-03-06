# openapi-java-client

Kadaster - BRK-Bevragen API
- API version: 1.1.0
  - Build date: 2020-07-16T15:31:15.936+02:00[Europe/Amsterdam]

D.m.v. deze toepassing worden meerdere, korte bevragingen op de Basis Registratie Kadaster beschikbaar gesteld. Deze toepassing betreft het verstrekken van Kadastrale Onroerende Zaak informatie.

  For more information, please visit [https://github.com/VNG-Realisatie/Haal-Centraal-BRK-Bevragen](https://github.com/VNG-Realisatie/Haal-Centraal-BRK-Bevragen)

*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*


## Requirements

Building the API client library requires:
1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>1.1.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
compile "org.openapitools:openapi-java-client:1.1.0"
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

* `target/openapi-java-client-1.1.0.jar`
* `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.KadasterNietNatuurlijkPersonenApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.brk.kadaster.nl/esd/bevragen/v1");
    
    // Configure API key authorization: apiKeyAuth
    ApiKeyAuth apiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("apiKeyAuth");
    apiKeyAuth.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //apiKeyAuth.setApiKeyPrefix("Token");

    KadasterNietNatuurlijkPersonenApi apiInstance = new KadasterNietNatuurlijkPersonenApi(defaultClient);
    String q = "q_example"; // String | Free query parameter. Dit endpoint evolueert naar free query zoeken. In deze versie kan alleen een combinatie van (het begin van de) de statutaire naam en zetel (vestigingsplaats) worden opgegeven. Let op! Een niet natuurlijk persoon kan meerdere keren, en op meer dan één manier voorkomen in de BRK.
    String fields = "fields_example"; // String | Hiermee kun je de inhoud van de resource naar behoefte aanpassen door een door komma's gescheiden lijst van property namen op te geven. Bij opgave van niet-bestaande properties wordt een 400 Bad Request teruggegeven. Wanneer de fields parameter niet is opgegeven, worden alle properties met een waarde teruggegeven. Zie [functionele specificaties](https://github.com/VNG-Realisatie/Haal-Centraal-common/blob/v1.0.0/features/fields.feature)
    try {
      KadasterNietNatuurlijkPersoonHalCollectie result = apiInstance.getKadasterNietNatuurlijkPersonen(q, fields);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KadasterNietNatuurlijkPersonenApi#getKadasterNietNatuurlijkPersonen");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api.brk.kadaster.nl/esd/bevragen/v1*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*KadasterNietNatuurlijkPersonenApi* | [**getKadasterNietNatuurlijkPersonen**](docs/KadasterNietNatuurlijkPersonenApi.md#getKadasterNietNatuurlijkPersonen) | **GET** /kadasternietnatuurlijkpersonen | 
*KadasterNietNatuurlijkPersonenApi* | [**getKadasterNietNatuurlijkPersoon**](docs/KadasterNietNatuurlijkPersonenApi.md#getKadasterNietNatuurlijkPersoon) | **GET** /kadasternietnatuurlijkpersonen/{kadasternietnatuurlijkpersoonidentificatie} | 
*KadasterNietNatuurlijkPersonenApi* | [**getKadasterPersonen**](docs/KadasterNietNatuurlijkPersonenApi.md#getKadasterPersonen) | **GET** /kadasternatuurlijkpersonen | 
*KadasterNietNatuurlijkPersonenApi* | [**getKadasterPersoon**](docs/KadasterNietNatuurlijkPersonenApi.md#getKadasterPersoon) | **GET** /kadasternatuurlijkpersonen/{kadasternatuurlijkpersoonidentificatie} | 
*KadastraalOnroerendeZakenApi* | [**getKadastraalOnroerendeZaak**](docs/KadastraalOnroerendeZakenApi.md#getKadastraalOnroerendeZaak) | **GET** /kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie} | 
*KadastraalOnroerendeZakenApi* | [**getKadastraalOnroerendeZaken**](docs/KadastraalOnroerendeZakenApi.md#getKadastraalOnroerendeZaken) | **GET** /kadastraalonroerendezaken | 
*ZakelijkeGerechtigdenApi* | [**getZakelijkGerechtigde**](docs/ZakelijkeGerechtigdenApi.md#getZakelijkGerechtigde) | **GET** /kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden/{zakelijkgerechtigdeidentificatie} | 
*ZakelijkeGerechtigdenApi* | [**getZakelijkGerechtigden**](docs/ZakelijkeGerechtigdenApi.md#getZakelijkGerechtigden) | **GET** /kadastraalonroerendezaken/{kadastraalonroerendezaakidentificatie}/zakelijkgerechtigden | 


## Documentation for Models

 - [Aantekening](docs/Aantekening.md)
 - [Adres](docs/Adres.md)
 - [BadRequestFoutbericht](docs/BadRequestFoutbericht.md)
 - [BadRequestFoutberichtAllOf](docs/BadRequestFoutberichtAllOf.md)
 - [Bedrag](docs/Bedrag.md)
 - [DatumOnvolledig](docs/DatumOnvolledig.md)
 - [ErfpachtCanon](docs/ErfpachtCanon.md)
 - [Foutbericht](docs/Foutbericht.md)
 - [Geboorte](docs/Geboorte.md)
 - [GeslachtEnum](docs/GeslachtEnum.md)
 - [HalCollectionLinks](docs/HalCollectionLinks.md)
 - [HalLink](docs/HalLink.md)
 - [HeeftPartnerschap](docs/HeeftPartnerschap.md)
 - [InvalidParams](docs/InvalidParams.md)
 - [KadasterNatuurlijkPersoon](docs/KadasterNatuurlijkPersoon.md)
 - [KadasterNatuurlijkPersoonAllOf](docs/KadasterNatuurlijkPersoonAllOf.md)
 - [KadasterNatuurlijkPersoonHal](docs/KadasterNatuurlijkPersoonHal.md)
 - [KadasterNatuurlijkPersoonHalAllOf](docs/KadasterNatuurlijkPersoonHalAllOf.md)
 - [KadasterNatuurlijkPersoonHalCollectie](docs/KadasterNatuurlijkPersoonHalCollectie.md)
 - [KadasterNatuurlijkPersoonHalCollectieEmbedded](docs/KadasterNatuurlijkPersoonHalCollectieEmbedded.md)
 - [KadasterNietNatuurlijkPersoon](docs/KadasterNietNatuurlijkPersoon.md)
 - [KadasterNietNatuurlijkPersoonAllOf](docs/KadasterNietNatuurlijkPersoonAllOf.md)
 - [KadasterNietNatuurlijkPersoonHal](docs/KadasterNietNatuurlijkPersoonHal.md)
 - [KadasterNietNatuurlijkPersoonHalCollectie](docs/KadasterNietNatuurlijkPersoonHalCollectie.md)
 - [KadasterNietNatuurlijkPersoonHalCollectieEmbedded](docs/KadasterNietNatuurlijkPersoonHalCollectieEmbedded.md)
 - [KadasterPersoon](docs/KadasterPersoon.md)
 - [KadasterPersoonAllOf](docs/KadasterPersoonAllOf.md)
 - [KadasterPersoonLinks](docs/KadasterPersoonLinks.md)
 - [KadastraalOnroerendeZaak](docs/KadastraalOnroerendeZaak.md)
 - [KadastraalOnroerendeZaakEmbedded](docs/KadastraalOnroerendeZaakEmbedded.md)
 - [KadastraalOnroerendeZaakHal](docs/KadastraalOnroerendeZaakHal.md)
 - [KadastraalOnroerendeZaakHalAllOf](docs/KadastraalOnroerendeZaakHalAllOf.md)
 - [KadastraalOnroerendeZaakHalCollectie](docs/KadastraalOnroerendeZaakHalCollectie.md)
 - [KadastraalOnroerendeZaakHalCollectieEmbedded](docs/KadastraalOnroerendeZaakHalCollectieEmbedded.md)
 - [KadastraalOnroerendeZaakLinks](docs/KadastraalOnroerendeZaakLinks.md)
 - [LocatieKadastraalObject](docs/LocatieKadastraalObject.md)
 - [Naam](docs/Naam.md)
 - [NatuurlijkPersoonBeperkt](docs/NatuurlijkPersoonBeperkt.md)
 - [NatuurlijkPersoonBeperktAllOf](docs/NatuurlijkPersoonBeperktAllOf.md)
 - [NatuurlijkPersoonTypeEnum](docs/NatuurlijkPersoonTypeEnum.md)
 - [NietNatuurlijkPersoonBeperkt](docs/NietNatuurlijkPersoonBeperkt.md)
 - [NietNatuurlijkPersoonBeperktAllOf](docs/NietNatuurlijkPersoonBeperktAllOf.md)
 - [NietNatuurlijkPersoonTypeEnum](docs/NietNatuurlijkPersoonTypeEnum.md)
 - [Overlijden](docs/Overlijden.md)
 - [PersoonBasis](docs/PersoonBasis.md)
 - [PersoonBeperkt](docs/PersoonBeperkt.md)
 - [PersoonBeperktAllOf](docs/PersoonBeperktAllOf.md)
 - [PersoonTypeEnum](docs/PersoonTypeEnum.md)
 - [PointGeoJSON](docs/PointGeoJSON.md)
 - [PolygonGeoJSON](docs/PolygonGeoJSON.md)
 - [Postadres](docs/Postadres.md)
 - [PostadresAllOf](docs/PostadresAllOf.md)
 - [Tenaamstelling](docs/Tenaamstelling.md)
 - [TypeBreuk](docs/TypeBreuk.md)
 - [TypeGerechtigdeEnum](docs/TypeGerechtigdeEnum.md)
 - [TypeKadastraalOnroerendeZaakEnum](docs/TypeKadastraalOnroerendeZaakEnum.md)
 - [TypeKoopsom](docs/TypeKoopsom.md)
 - [TypeOppervlak](docs/TypeOppervlak.md)
 - [TypePerceelnummerVerschuiving](docs/TypePerceelnummerVerschuiving.md)
 - [Waardelijst](docs/Waardelijst.md)
 - [ZakelijkGerechtigde](docs/ZakelijkGerechtigde.md)
 - [ZakelijkGerechtigdeHal](docs/ZakelijkGerechtigdeHal.md)
 - [ZakelijkGerechtigdeHalAllOf](docs/ZakelijkGerechtigdeHalAllOf.md)
 - [ZakelijkGerechtigdeHalCollectie](docs/ZakelijkGerechtigdeHalCollectie.md)
 - [ZakelijkGerechtigdeHalCollectieEmbedded](docs/ZakelijkGerechtigdeHalCollectieEmbedded.md)
 - [ZakelijkGerechtigdeLinks](docs/ZakelijkGerechtigdeLinks.md)


## Documentation for Authorization

Authentication schemes defined for the API:
### apiKeyAuth

- **Type**: API key
- **API key parameter name**: X-Api-Key
- **Location**: HTTP header


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



