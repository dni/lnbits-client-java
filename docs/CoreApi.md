# CoreApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**apiDeleteSettingsAdminApiV1SettingsDelete**](CoreApi.md#apiDeleteSettingsAdminApiV1SettingsDelete) | **DELETE** /admin/api/v1/settings/ | Api Delete Settings |
| [**apiDownloadBackupAdminApiV1BackupGet**](CoreApi.md#apiDownloadBackupAdminApiV1BackupGet) | **GET** /admin/api/v1/backup/ | Api Download Backup |
| [**apiFiatAsSatsApiV1ConversionPost**](CoreApi.md#apiFiatAsSatsApiV1ConversionPost) | **POST** /api/v1/conversion | Api Fiat As Sats |
| [**apiGetSettingsAdminApiV1SettingsGet**](CoreApi.md#apiGetSettingsAdminApiV1SettingsGet) | **GET** /admin/api/v1/settings/ | Api Get Settings |
| [**apiInstallExtensionApiV1ExtensionPost**](CoreApi.md#apiInstallExtensionApiV1ExtensionPost) | **POST** /api/v1/extension | Api Install Extension |
| [**apiListCurrenciesAvailableApiV1CurrenciesGet**](CoreApi.md#apiListCurrenciesAvailableApiV1CurrenciesGet) | **GET** /api/v1/currencies | Api List Currencies Available |
| [**apiLnurlscanApiV1LnurlscanCodeGet**](CoreApi.md#apiLnurlscanApiV1LnurlscanCodeGet) | **GET** /api/v1/lnurlscan/{code} | Api Lnurlscan |
| [**apiPaymentApiV1PaymentsPaymentHashGet**](CoreApi.md#apiPaymentApiV1PaymentsPaymentHashGet) | **GET** /api/v1/payments/{payment_hash} | Api Payment |
| [**apiPaymentsCreateApiV1PaymentsPost**](CoreApi.md#apiPaymentsCreateApiV1PaymentsPost) | **POST** /api/v1/payments | Api Payments Create |
| [**apiPaymentsDecodeApiV1PaymentsDecodePost**](CoreApi.md#apiPaymentsDecodeApiV1PaymentsDecodePost) | **POST** /api/v1/payments/decode | Api Payments Decode |
| [**apiPaymentsPayLnurlApiV1PaymentsLnurlPost**](CoreApi.md#apiPaymentsPayLnurlApiV1PaymentsLnurlPost) | **POST** /api/v1/payments/lnurl | Api Payments Pay Lnurl |
| [**apiPaymentsSseApiV1PaymentsSseGet**](CoreApi.md#apiPaymentsSseApiV1PaymentsSseGet) | **GET** /api/v1/payments/sse | Api Payments Sse |
| [**apiPerformLnurlauthApiV1LnurlauthPost**](CoreApi.md#apiPerformLnurlauthApiV1LnurlauthPost) | **POST** /api/v1/lnurlauth | Api Perform Lnurlauth |
| [**apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet**](CoreApi.md#apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet) | **GET** /public/v1/payment/{payment_hash} | Api Public Payment Longpolling |
| [**apiRestartServerAdminApiV1RestartGet**](CoreApi.md#apiRestartServerAdminApiV1RestartGet) | **GET** /admin/api/v1/restart/ | Api Restart Server |
| [**apiUninstallExtensionApiV1ExtensionExtIdDelete**](CoreApi.md#apiUninstallExtensionApiV1ExtensionExtIdDelete) | **DELETE** /api/v1/extension/{ext_id} | Api Uninstall Extension |
| [**apiUpdateSettingsAdminApiV1SettingsPut**](CoreApi.md#apiUpdateSettingsAdminApiV1SettingsPut) | **PUT** /admin/api/v1/settings/ | Api Update Settings |
| [**apiUpdateWalletApiV1WalletNewNamePut**](CoreApi.md#apiUpdateWalletApiV1WalletNewNamePut) | **PUT** /api/v1/wallet/{new_name} | Api Update Wallet |
| [**apiWalletApiV1WalletGet**](CoreApi.md#apiWalletApiV1WalletGet) | **GET** /api/v1/wallet | Api Wallet |
| [**auditAdminApiV1AuditGet**](CoreApi.md#auditAdminApiV1AuditGet) | **GET** /admin/api/v1/audit | Audit |
| [**deleteExtensionDbApiV1ExtensionExtIdDbDelete**](CoreApi.md#deleteExtensionDbApiV1ExtensionExtIdDbDelete) | **DELETE** /api/v1/extension/{ext_id}/db | Delete Extension Db |
| [**getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet**](CoreApi.md#getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet) | **GET** /api/v1/extension/release/{org}/{repo}/{tag_name} | Get Extension Release |
| [**getExtensionReleasesApiV1ExtensionExtIdReleasesGet**](CoreApi.md#getExtensionReleasesApiV1ExtensionExtIdReleasesGet) | **GET** /api/v1/extension/{ext_id}/releases | Get Extension Releases |
| [**healthApiV1HealthGet**](CoreApi.md#healthApiV1HealthGet) | **GET** /api/v1/health | Health |
| [**imgApiV1QrcodeDataGet**](CoreApi.md#imgApiV1QrcodeDataGet) | **GET** /api/v1/qrcode/{data} | Img |
| [**paymentListApiV1PaymentsGet**](CoreApi.md#paymentListApiV1PaymentsGet) | **GET** /api/v1/payments | get list of payments |
| [**paymentListApiV1PaymentsPaginatedGet**](CoreApi.md#paymentListApiV1PaymentsPaginatedGet) | **GET** /api/v1/payments/paginated | get paginated list of payments |
| [**tinyurlApiV1TinyurlPost**](CoreApi.md#tinyurlApiV1TinyurlPost) | **POST** /api/v1/tinyurl | Tinyurl |
| [**tinyurlApiV1TinyurlTinyurlIdDelete**](CoreApi.md#tinyurlApiV1TinyurlTinyurlIdDelete) | **DELETE** /api/v1/tinyurl/{tinyurl_id} | Tinyurl |
| [**tinyurlApiV1TinyurlTinyurlIdGet**](CoreApi.md#tinyurlApiV1TinyurlTinyurlIdGet) | **GET** /api/v1/tinyurl/{tinyurl_id} | Tinyurl |
| [**tinyurlTTinyurlIdGet**](CoreApi.md#tinyurlTTinyurlIdGet) | **GET** /t/{tinyurl_id} | Tinyurl |
| [**topupAdminApiV1TopupPut**](CoreApi.md#topupAdminApiV1TopupPut) | **PUT** /admin/api/v1/topup/ | Topup |
| [**websocketUpdateGetApiV1WsItemIdDataGet**](CoreApi.md#websocketUpdateGetApiV1WsItemIdDataGet) | **GET** /api/v1/ws/{item_id}/{data} | Websocket Update Get |
| [**websocketUpdatePostApiV1WsItemIdPost**](CoreApi.md#websocketUpdatePostApiV1WsItemIdPost) | **POST** /api/v1/ws/{item_id} | Websocket Update Post |


<a id="apiDeleteSettingsAdminApiV1SettingsDelete"></a>
# **apiDeleteSettingsAdminApiV1SettingsDelete**
> Object apiDeleteSettingsAdminApiV1SettingsDelete(usr)

Api Delete Settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.apiDeleteSettingsAdminApiV1SettingsDelete(usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiDeleteSettingsAdminApiV1SettingsDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiDownloadBackupAdminApiV1BackupGet"></a>
# **apiDownloadBackupAdminApiV1BackupGet**
> apiDownloadBackupAdminApiV1BackupGet(usr)

Api Download Backup

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    try {
      apiInstance.apiDownloadBackupAdminApiV1BackupGet(usr);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiDownloadBackupAdminApiV1BackupGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiFiatAsSatsApiV1ConversionPost"></a>
# **apiFiatAsSatsApiV1ConversionPost**
> Object apiFiatAsSatsApiV1ConversionPost(conversionData)

Api Fiat As Sats

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    ConversionData conversionData = new ConversionData(); // ConversionData | 
    try {
      Object result = apiInstance.apiFiatAsSatsApiV1ConversionPost(conversionData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiFiatAsSatsApiV1ConversionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **conversionData** | [**ConversionData**](ConversionData.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiGetSettingsAdminApiV1SettingsGet"></a>
# **apiGetSettingsAdminApiV1SettingsGet**
> Object apiGetSettingsAdminApiV1SettingsGet(usr)

Api Get Settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.apiGetSettingsAdminApiV1SettingsGet(usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiGetSettingsAdminApiV1SettingsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiInstallExtensionApiV1ExtensionPost"></a>
# **apiInstallExtensionApiV1ExtensionPost**
> Object apiInstallExtensionApiV1ExtensionPost(usr, createExtension)

Api Install Extension

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    CreateExtension createExtension = new CreateExtension(); // CreateExtension | 
    try {
      Object result = apiInstance.apiInstallExtensionApiV1ExtensionPost(usr, createExtension);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiInstallExtensionApiV1ExtensionPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |
| **createExtension** | [**CreateExtension**](CreateExtension.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiListCurrenciesAvailableApiV1CurrenciesGet"></a>
# **apiListCurrenciesAvailableApiV1CurrenciesGet**
> Object apiListCurrenciesAvailableApiV1CurrenciesGet()

Api List Currencies Available

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      Object result = apiInstance.apiListCurrenciesAvailableApiV1CurrenciesGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiListCurrenciesAvailableApiV1CurrenciesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="apiLnurlscanApiV1LnurlscanCodeGet"></a>
# **apiLnurlscanApiV1LnurlscanCodeGet**
> Object apiLnurlscanApiV1LnurlscanCodeGet(code)

Api Lnurlscan

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String code = "code_example"; // String | 
    try {
      Object result = apiInstance.apiLnurlscanApiV1LnurlscanCodeGet(code);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiLnurlscanApiV1LnurlscanCodeGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **code** | **String**|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPaymentApiV1PaymentsPaymentHashGet"></a>
# **apiPaymentApiV1PaymentsPaymentHashGet**
> Object apiPaymentApiV1PaymentsPaymentHashGet(paymentHash, xApiKey)

Api Payment

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Object paymentHash = null; // Object | 
    String xApiKey = "xApiKey_example"; // String | 
    try {
      Object result = apiInstance.apiPaymentApiV1PaymentsPaymentHashGet(paymentHash, xApiKey);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPaymentApiV1PaymentsPaymentHashGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentHash** | [**Object**](.md)|  | |
| **xApiKey** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPaymentsCreateApiV1PaymentsPost"></a>
# **apiPaymentsCreateApiV1PaymentsPost**
> Object apiPaymentsCreateApiV1PaymentsPost(createInvoiceData)

Api Payments Create

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    CreateInvoiceData createInvoiceData = new CreateInvoiceData(); // CreateInvoiceData | 
    try {
      Object result = apiInstance.apiPaymentsCreateApiV1PaymentsPost(createInvoiceData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPaymentsCreateApiV1PaymentsPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createInvoiceData** | [**CreateInvoiceData**](CreateInvoiceData.md)|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPaymentsDecodeApiV1PaymentsDecodePost"></a>
# **apiPaymentsDecodeApiV1PaymentsDecodePost**
> Object apiPaymentsDecodeApiV1PaymentsDecodePost(decodePayment)

Api Payments Decode

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    DecodePayment decodePayment = new DecodePayment(); // DecodePayment | 
    try {
      Object result = apiInstance.apiPaymentsDecodeApiV1PaymentsDecodePost(decodePayment);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPaymentsDecodeApiV1PaymentsDecodePost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **decodePayment** | [**DecodePayment**](DecodePayment.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPaymentsPayLnurlApiV1PaymentsLnurlPost"></a>
# **apiPaymentsPayLnurlApiV1PaymentsLnurlPost**
> Object apiPaymentsPayLnurlApiV1PaymentsLnurlPost(createLNURLData)

Api Payments Pay Lnurl

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    CreateLNURLData createLNURLData = new CreateLNURLData(); // CreateLNURLData | 
    try {
      Object result = apiInstance.apiPaymentsPayLnurlApiV1PaymentsLnurlPost(createLNURLData);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPaymentsPayLnurlApiV1PaymentsLnurlPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createLNURLData** | [**CreateLNURLData**](CreateLNURLData.md)|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPaymentsSseApiV1PaymentsSseGet"></a>
# **apiPaymentsSseApiV1PaymentsSseGet**
> Object apiPaymentsSseApiV1PaymentsSseGet()

Api Payments Sse

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      Object result = apiInstance.apiPaymentsSseApiV1PaymentsSseGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPaymentsSseApiV1PaymentsSseGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="apiPerformLnurlauthApiV1LnurlauthPost"></a>
# **apiPerformLnurlauthApiV1LnurlauthPost**
> Object apiPerformLnurlauthApiV1LnurlauthPost(createLnurlAuth)

Api Perform Lnurlauth

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    CreateLnurlAuth createLnurlAuth = new CreateLnurlAuth(); // CreateLnurlAuth | 
    try {
      Object result = apiInstance.apiPerformLnurlauthApiV1LnurlauthPost(createLnurlAuth);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPerformLnurlauthApiV1LnurlauthPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **createLnurlAuth** | [**CreateLnurlAuth**](CreateLnurlAuth.md)|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet"></a>
# **apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet**
> Object apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet(paymentHash)

Api Public Payment Longpolling

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Object paymentHash = null; // Object | 
    try {
      Object result = apiInstance.apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet(paymentHash);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiPublicPaymentLongpollingPublicV1PaymentPaymentHashGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **paymentHash** | [**Object**](.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiRestartServerAdminApiV1RestartGet"></a>
# **apiRestartServerAdminApiV1RestartGet**
> Object apiRestartServerAdminApiV1RestartGet(usr)

Api Restart Server

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.apiRestartServerAdminApiV1RestartGet(usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiRestartServerAdminApiV1RestartGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiUninstallExtensionApiV1ExtensionExtIdDelete"></a>
# **apiUninstallExtensionApiV1ExtensionExtIdDelete**
> Object apiUninstallExtensionApiV1ExtensionExtIdDelete(extId, usr)

Api Uninstall Extension

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String extId = "extId_example"; // String | 
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.apiUninstallExtensionApiV1ExtensionExtIdDelete(extId, usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiUninstallExtensionApiV1ExtensionExtIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extId** | **String**|  | |
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiUpdateSettingsAdminApiV1SettingsPut"></a>
# **apiUpdateSettingsAdminApiV1SettingsPut**
> Object apiUpdateSettingsAdminApiV1SettingsPut(usr, editableSettings)

Api Update Settings

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    EditableSettings editableSettings = new EditableSettings(); // EditableSettings | 
    try {
      Object result = apiInstance.apiUpdateSettingsAdminApiV1SettingsPut(usr, editableSettings);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiUpdateSettingsAdminApiV1SettingsPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |
| **editableSettings** | [**EditableSettings**](EditableSettings.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiUpdateWalletApiV1WalletNewNamePut"></a>
# **apiUpdateWalletApiV1WalletNewNamePut**
> Object apiUpdateWalletApiV1WalletNewNamePut(newName)

Api Update Wallet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String newName = "newName_example"; // String | 
    try {
      Object result = apiInstance.apiUpdateWalletApiV1WalletNewNamePut(newName);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiUpdateWalletApiV1WalletNewNamePut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **newName** | **String**|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="apiWalletApiV1WalletGet"></a>
# **apiWalletApiV1WalletGet**
> Object apiWalletApiV1WalletGet()

Api Wallet

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      Object result = apiInstance.apiWalletApiV1WalletGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#apiWalletApiV1WalletGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="auditAdminApiV1AuditGet"></a>
# **auditAdminApiV1AuditGet**
> Object auditAdminApiV1AuditGet(usr)

Audit

show the current balance of the node and the LNbits database

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.auditAdminApiV1AuditGet(usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#auditAdminApiV1AuditGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="deleteExtensionDbApiV1ExtensionExtIdDbDelete"></a>
# **deleteExtensionDbApiV1ExtensionExtIdDbDelete**
> Object deleteExtensionDbApiV1ExtensionExtIdDbDelete(extId, usr)

Delete Extension Db

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String extId = "extId_example"; // String | 
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.deleteExtensionDbApiV1ExtensionExtIdDbDelete(extId, usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#deleteExtensionDbApiV1ExtensionExtIdDbDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extId** | **String**|  | |
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet"></a>
# **getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet**
> Object getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet(org, repo, tagName, usr)

Get Extension Release

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String org = "org_example"; // String | 
    String repo = "repo_example"; // String | 
    String tagName = "tagName_example"; // String | 
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet(org, repo, tagName, usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#getExtensionReleaseApiV1ExtensionReleaseOrgRepoTagNameGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **org** | **String**|  | |
| **repo** | **String**|  | |
| **tagName** | **String**|  | |
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="getExtensionReleasesApiV1ExtensionExtIdReleasesGet"></a>
# **getExtensionReleasesApiV1ExtensionExtIdReleasesGet**
> Object getExtensionReleasesApiV1ExtensionExtIdReleasesGet(extId, usr)

Get Extension Releases

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String extId = "extId_example"; // String | 
    String usr = "usr_example"; // String | 
    try {
      Object result = apiInstance.getExtensionReleasesApiV1ExtensionExtIdReleasesGet(extId, usr);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#getExtensionReleasesApiV1ExtensionExtIdReleasesGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **extId** | **String**|  | |
| **usr** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="healthApiV1HealthGet"></a>
# **healthApiV1HealthGet**
> Object healthApiV1HealthGet()

Health

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    try {
      Object result = apiInstance.healthApiV1HealthGet();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#healthApiV1HealthGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |

<a id="imgApiV1QrcodeDataGet"></a>
# **imgApiV1QrcodeDataGet**
> imgApiV1QrcodeDataGet(data)

Img

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Object data = null; // Object | 
    try {
      apiInstance.imgApiV1QrcodeDataGet(data);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#imgApiV1QrcodeDataGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **data** | [**Object**](.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="paymentListApiV1PaymentsGet"></a>
# **paymentListApiV1PaymentsGet**
> List&lt;Payment&gt; paymentListApiV1PaymentsGet(limit, offset, sortby, direction, search, checkingId, amount, fee, memo, time, bolt11, preimage, paymentHash, expiry, extra, walletId, webhook, webhookStatus)

get list of payments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String sortby = "sortby_example"; // String | 
    String direction = "asc"; // String | 
    String search = "search_example"; // String | Text based search
    String checkingId = "checkingId_example"; // String | Supports Filtering
    Integer amount = 56; // Integer | Supports Filtering. Supports Search
    Integer fee = 56; // Integer | Supports Filtering
    String memo = "memo_example"; // String | Supports Filtering. Supports Search
    OffsetDateTime time = OffsetDateTime.now(); // OffsetDateTime | Supports Filtering
    String bolt11 = "bolt11_example"; // String | Supports Filtering
    String preimage = "preimage_example"; // String | Supports Filtering
    String paymentHash = "paymentHash_example"; // String | Supports Filtering
    OffsetDateTime expiry = OffsetDateTime.now(); // OffsetDateTime | Supports Filtering
    Object extra = new HashMap(); // Object | Supports Filtering. Nested attributes can be filtered too, e.g. `extra.[additional].[attributes]`
    String walletId = "walletId_example"; // String | Supports Filtering
    String webhook = "webhook_example"; // String | Supports Filtering
    Integer webhookStatus = 56; // Integer | Supports Filtering
    try {
      List<Payment> result = apiInstance.paymentListApiV1PaymentsGet(limit, offset, sortby, direction, search, checkingId, amount, fee, memo, time, bolt11, preimage, paymentHash, expiry, extra, walletId, webhook, webhookStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#paymentListApiV1PaymentsGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **sortby** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **search** | **String**| Text based search | [optional] |
| **checkingId** | **String**| Supports Filtering | [optional] |
| **amount** | **Integer**| Supports Filtering. Supports Search | [optional] |
| **fee** | **Integer**| Supports Filtering | [optional] |
| **memo** | **String**| Supports Filtering. Supports Search | [optional] |
| **time** | **OffsetDateTime**| Supports Filtering | [optional] |
| **bolt11** | **String**| Supports Filtering | [optional] |
| **preimage** | **String**| Supports Filtering | [optional] |
| **paymentHash** | **String**| Supports Filtering | [optional] |
| **expiry** | **OffsetDateTime**| Supports Filtering | [optional] |
| **extra** | [**Object**](.md)| Supports Filtering. Nested attributes can be filtered too, e.g. &#x60;extra.[additional].[attributes]&#x60; | [optional] [default to {}] |
| **walletId** | **String**| Supports Filtering | [optional] |
| **webhook** | **String**| Supports Filtering | [optional] |
| **webhookStatus** | **Integer**| Supports Filtering | [optional] |

### Return type

[**List&lt;Payment&gt;**](Payment.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of payments |  -  |
| **422** | Validation Error |  -  |

<a id="paymentListApiV1PaymentsPaginatedGet"></a>
# **paymentListApiV1PaymentsPaginatedGet**
> Page paymentListApiV1PaymentsPaginatedGet(limit, offset, sortby, direction, search, checkingId, amount, fee, memo, time, bolt11, preimage, paymentHash, expiry, extra, walletId, webhook, webhookStatus)

get paginated list of payments

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    Integer limit = 56; // Integer | 
    Integer offset = 56; // Integer | 
    String sortby = "sortby_example"; // String | 
    String direction = "asc"; // String | 
    String search = "search_example"; // String | Text based search
    String checkingId = "checkingId_example"; // String | Supports Filtering
    Integer amount = 56; // Integer | Supports Filtering. Supports Search
    Integer fee = 56; // Integer | Supports Filtering
    String memo = "memo_example"; // String | Supports Filtering. Supports Search
    OffsetDateTime time = OffsetDateTime.now(); // OffsetDateTime | Supports Filtering
    String bolt11 = "bolt11_example"; // String | Supports Filtering
    String preimage = "preimage_example"; // String | Supports Filtering
    String paymentHash = "paymentHash_example"; // String | Supports Filtering
    OffsetDateTime expiry = OffsetDateTime.now(); // OffsetDateTime | Supports Filtering
    Object extra = new HashMap(); // Object | Supports Filtering. Nested attributes can be filtered too, e.g. `extra.[additional].[attributes]`
    String walletId = "walletId_example"; // String | Supports Filtering
    String webhook = "webhook_example"; // String | Supports Filtering
    Integer webhookStatus = 56; // Integer | Supports Filtering
    try {
      Page result = apiInstance.paymentListApiV1PaymentsPaginatedGet(limit, offset, sortby, direction, search, checkingId, amount, fee, memo, time, bolt11, preimage, paymentHash, expiry, extra, walletId, webhook, webhookStatus);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#paymentListApiV1PaymentsPaginatedGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **limit** | **Integer**|  | [optional] |
| **offset** | **Integer**|  | [optional] |
| **sortby** | **String**|  | [optional] |
| **direction** | **String**|  | [optional] [enum: asc, desc] |
| **search** | **String**| Text based search | [optional] |
| **checkingId** | **String**| Supports Filtering | [optional] |
| **amount** | **Integer**| Supports Filtering. Supports Search | [optional] |
| **fee** | **Integer**| Supports Filtering | [optional] |
| **memo** | **String**| Supports Filtering. Supports Search | [optional] |
| **time** | **OffsetDateTime**| Supports Filtering | [optional] |
| **bolt11** | **String**| Supports Filtering | [optional] |
| **preimage** | **String**| Supports Filtering | [optional] |
| **paymentHash** | **String**| Supports Filtering | [optional] |
| **expiry** | **OffsetDateTime**| Supports Filtering | [optional] |
| **extra** | [**Object**](.md)| Supports Filtering. Nested attributes can be filtered too, e.g. &#x60;extra.[additional].[attributes]&#x60; | [optional] [default to {}] |
| **walletId** | **String**| Supports Filtering | [optional] |
| **webhook** | **String**| Supports Filtering | [optional] |
| **webhookStatus** | **Integer**| Supports Filtering | [optional] |

### Return type

[**Page**](Page.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | list of payments |  -  |
| **422** | Validation Error |  -  |

<a id="tinyurlApiV1TinyurlPost"></a>
# **tinyurlApiV1TinyurlPost**
> Object tinyurlApiV1TinyurlPost(url, endless)

Tinyurl

creates a tinyurl

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String url = "url_example"; // String | 
    Boolean endless = false; // Boolean | 
    try {
      Object result = apiInstance.tinyurlApiV1TinyurlPost(url, endless);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#tinyurlApiV1TinyurlPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **url** | **String**|  | |
| **endless** | **Boolean**|  | [optional] [default to false] |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="tinyurlApiV1TinyurlTinyurlIdDelete"></a>
# **tinyurlApiV1TinyurlTinyurlIdDelete**
> Object tinyurlApiV1TinyurlTinyurlIdDelete(tinyurlId)

Tinyurl

delete a tinyurl by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String tinyurlId = "tinyurlId_example"; // String | 
    try {
      Object result = apiInstance.tinyurlApiV1TinyurlTinyurlIdDelete(tinyurlId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#tinyurlApiV1TinyurlTinyurlIdDelete");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tinyurlId** | **String**|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="tinyurlApiV1TinyurlTinyurlIdGet"></a>
# **tinyurlApiV1TinyurlTinyurlIdGet**
> Object tinyurlApiV1TinyurlTinyurlIdGet(tinyurlId)

Tinyurl

get a tinyurl by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");
    
    // Configure API key authorization: APIKeyHeader
    ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
    APIKeyHeader.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyHeader.setApiKeyPrefix("Token");

    // Configure API key authorization: APIKeyQuery
    ApiKeyAuth APIKeyQuery = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyQuery");
    APIKeyQuery.setApiKey("YOUR API KEY");
    // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
    //APIKeyQuery.setApiKeyPrefix("Token");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String tinyurlId = "tinyurlId_example"; // String | 
    try {
      Object result = apiInstance.tinyurlApiV1TinyurlTinyurlIdGet(tinyurlId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#tinyurlApiV1TinyurlTinyurlIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tinyurlId** | **String**|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader), [APIKeyQuery](../README.md#APIKeyQuery)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="tinyurlTTinyurlIdGet"></a>
# **tinyurlTTinyurlIdGet**
> Object tinyurlTTinyurlIdGet(tinyurlId)

Tinyurl

redirects a tinyurl by id

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String tinyurlId = "tinyurlId_example"; // String | 
    try {
      Object result = apiInstance.tinyurlTTinyurlIdGet(tinyurlId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#tinyurlTTinyurlIdGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **tinyurlId** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="topupAdminApiV1TopupPut"></a>
# **topupAdminApiV1TopupPut**
> Object topupAdminApiV1TopupPut(usr, createTopup)

Topup

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String usr = "usr_example"; // String | 
    CreateTopup createTopup = new CreateTopup(); // CreateTopup | 
    try {
      Object result = apiInstance.topupAdminApiV1TopupPut(usr, createTopup);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#topupAdminApiV1TopupPut");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **usr** | **String**|  | |
| **createTopup** | [**CreateTopup**](CreateTopup.md)|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="websocketUpdateGetApiV1WsItemIdDataGet"></a>
# **websocketUpdateGetApiV1WsItemIdDataGet**
> Object websocketUpdateGetApiV1WsItemIdDataGet(itemId, data)

Websocket Update Get

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String itemId = "itemId_example"; // String | 
    String data = "data_example"; // String | 
    try {
      Object result = apiInstance.websocketUpdateGetApiV1WsItemIdDataGet(itemId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#websocketUpdateGetApiV1WsItemIdDataGet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemId** | **String**|  | |
| **data** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

<a id="websocketUpdatePostApiV1WsItemIdPost"></a>
# **websocketUpdatePostApiV1WsItemIdPost**
> Object websocketUpdatePostApiV1WsItemIdPost(itemId, data)

Websocket Update Post

### Example
```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoreApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost");

    CoreApi apiInstance = new CoreApi(defaultClient);
    String itemId = "itemId_example"; // String | 
    String data = "data_example"; // String | 
    try {
      Object result = apiInstance.websocketUpdatePostApiV1WsItemIdPost(itemId, data);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling CoreApi#websocketUpdatePostApiV1WsItemIdPost");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **itemId** | **String**|  | |
| **data** | **String**|  | |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

