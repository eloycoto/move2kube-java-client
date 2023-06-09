# WorkspacesApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createWorkspace**](WorkspacesApi.md#createWorkspace) | **POST** /workspaces | Create a new workspace. The ID will be generated by the server. |
| [**deleteWorkspace**](WorkspacesApi.md#deleteWorkspace) | **DELETE** /workspaces/{workspace-id} | Delete an existing workspace. |
| [**getWorkspace**](WorkspacesApi.md#getWorkspace) | **GET** /workspaces/{workspace-id} | Get the workspace with the given ID. |
| [**getWorkspaces**](WorkspacesApi.md#getWorkspaces) | **GET** /workspaces | Get all the workspaces you have access to. |
| [**updateWorkspace**](WorkspacesApi.md#updateWorkspace) | **PUT** /workspaces/{workspace-id} | Update a workspace. The workspace will be created if it doesn&#39;t exist. |


<a name="createWorkspace"></a>
# **createWorkspace**
> CreateWorkspace201Response createWorkspace(body)

Create a new workspace. The ID will be generated by the server.

Create a new workspace. The ID will be generated by the server.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.WorkspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
    Workspace body = new Workspace(); // Workspace | The metadata of the workspace. Leave the ID blank, it will be generated. Leave the projects blank, projects are managed through a different set of endpoints. 
    try {
      CreateWorkspace201Response result = apiInstance.createWorkspace(body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspacesApi#createWorkspace");
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
| **body** | [**Workspace**](Workspace.md)| The metadata of the workspace. Leave the ID blank, it will be generated. Leave the projects blank, projects are managed through a different set of endpoints.  | |

### Return type

[**CreateWorkspace201Response**](CreateWorkspace201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created. |  -  |
| **400** | Invalid format or validation error. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to create a new workspace. |  -  |

<a name="deleteWorkspace"></a>
# **deleteWorkspace**
> deleteWorkspace(workspaceId)

Delete an existing workspace.

Delete an existing workspace.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.WorkspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
    String workspaceId = "work-1"; // String | ID of the workspace to delete.
    try {
      apiInstance.deleteWorkspace(workspaceId);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspacesApi#deleteWorkspace");
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
| **workspaceId** | **String**| ID of the workspace to delete. | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: Not defined

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Deleted. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to delete this workspace. |  -  |
| **404** | Workspace not found. |  -  |

<a name="getWorkspace"></a>
# **getWorkspace**
> Workspace getWorkspace(workspaceId)

Get the workspace with the given ID.

Get the workspace with the given ID.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.WorkspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace to get.
    try {
      Workspace result = apiInstance.getWorkspace(workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspacesApi#getWorkspace");
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
| **workspaceId** | **String**| ID of the workspace to get. | |

### Return type

[**Workspace**](Workspace.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to get this workspace. |  -  |
| **404** | Workspace not found. |  -  |

<a name="getWorkspaces"></a>
# **getWorkspaces**
> List&lt;Workspace&gt; getWorkspaces()

Get all the workspaces you have access to.

Get all the workspaces you have access to.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.WorkspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
    try {
      List<Workspace> result = apiInstance.getWorkspaces();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspacesApi#getWorkspaces");
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

[**List&lt;Workspace&gt;**](Workspace.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to get all the workspaces. |  -  |

<a name="updateWorkspace"></a>
# **updateWorkspace**
> updateWorkspace(workspaceId, body)

Update a workspace. The workspace will be created if it doesn&#39;t exist.

Update a workspace. The workspace will be created if it doesn&#39;t exist.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.WorkspacesApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    WorkspacesApi apiInstance = new WorkspacesApi(defaultClient);
    String workspaceId = "work-1"; // String | ID of the workspace to update.
    Workspace body = new Workspace(); // Workspace | The metadata of the workspace. Leave the ID blank, it will be generated. Leave the projects blank, projects are managed through a different set of endpoints. 
    try {
      apiInstance.updateWorkspace(workspaceId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling WorkspacesApi#updateWorkspace");
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
| **workspaceId** | **String**| ID of the workspace to update. | |
| **body** | [**Workspace**](Workspace.md)| The metadata of the workspace. Leave the ID blank, it will be generated. Leave the projects blank, projects are managed through a different set of endpoints.  | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created. |  -  |
| **204** | Updated. |  -  |
| **400** | Invalid format or validation error. |  -  |
| **401** | Authorization header is missing or invalid. |  * WWW_Authenticate -  <br>  |
| **403** | Don&#39;t have authorization to create/update this workspace. |  -  |
| **404** | Workspace not found. |  -  |

