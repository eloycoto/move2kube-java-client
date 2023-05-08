# SupportApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSupportInfo**](SupportApi.md#getSupportInfo) | **GET** /support | Returns some support information like CLI, API and UI version info. |


<a name="getSupportInfo"></a>
# **getSupportInfo**
> GetSupportInfo200Response getSupportInfo()

Returns some support information like CLI, API and UI version info.

Returns some support information like CLI, API and UI version info.

### Example
```java
// Import classes:
import com.konveyor.move.ApiClient;
import com.konveyor.move.ApiException;
import com.konveyor.move.Configuration;
import com.konveyor.move.auth.*;
import com.konveyor.move.models.*;
import com.konveyor.move.api.SupportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    SupportApi apiInstance = new SupportApi(defaultClient);
    try {
      GetSupportInfo200Response result = apiInstance.getSupportInfo();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling SupportApi#getSupportInfo");
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

[**GetSupportInfo200Response**](GetSupportInfo200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |

