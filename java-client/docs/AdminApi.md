# AdminApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getTokens**](AdminApi.md#getTokens) | **POST** /token | Get an access token using client ID and client secret (for use with trusted clients). |


<a name="getTokens"></a>
# **getTokens**
> GetTokens200Response getTokens(grantType)

Get an access token using client ID and client secret (for use with trusted clients).

Get an access token using client ID and client secret (for use with trusted clients).

### Example
```java
// Import classes:
import com.konveyor.move.ApiClient;
import com.konveyor.move.ApiException;
import com.konveyor.move.Configuration;
import com.konveyor.move.auth.*;
import com.konveyor.move.models.*;
import com.konveyor.move.api.AdminApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP basic authorization: basicAuth
    HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
    basicAuth.setUsername("YOUR USERNAME");
    basicAuth.setPassword("YOUR PASSWORD");

    AdminApi apiInstance = new AdminApi(defaultClient);
    String grantType = "client_credentials"; // String | 
    try {
      GetTokens200Response result = apiInstance.getTokens(grantType);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AdminApi#getTokens");
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
| **grantType** | **String**|  | [enum: client_credentials] |

### Return type

[**GetTokens200Response**](GetTokens200Response.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

 - **Content-Type**: application/x-www-form-urlencoded
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The access token. |  * Cache-Control -  <br>  * Pragma -  <br>  |
| **400** | Invalid format or validation error. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to get the access token. |  -  |

