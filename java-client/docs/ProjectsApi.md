# ProjectsApi

All URIs are relative to */api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createProject**](ProjectsApi.md#createProject) | **POST** /workspaces/{workspace-id}/projects | Create a new project in this workspace. The ID will be generated by the server. |
| [**deleteProject**](ProjectsApi.md#deleteProject) | **DELETE** /workspaces/{workspace-id}/projects/{project-id} | Delete an existing workspace. |
| [**getProject**](ProjectsApi.md#getProject) | **GET** /workspaces/{workspace-id}/projects/{project-id} | Get the project with the given ID. |
| [**getProjects**](ProjectsApi.md#getProjects) | **GET** /workspaces/{workspace-id}/projects | Get all the projects you have access to in this workspace. |
| [**updateProject**](ProjectsApi.md#updateProject) | **PUT** /workspaces/{workspace-id}/projects/{project-id} | Update a project. The project will be created if it doesn&#39;t exist. |


<a name="createProject"></a>
# **createProject**
> CreateProject201Response createProject(workspaceId, body)

Create a new project in this workspace. The ID will be generated by the server.

Create a new project in this workspace. The ID will be generated by the server.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace to create the project in.
    Project body = new Project(); // Project | The metadata of the project. Leave the ID blank, it will be generated. 
    try {
      CreateProject201Response result = apiInstance.createProject(workspaceId, body);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#createProject");
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
| **workspaceId** | **String**| ID of the workspace to create the project in. | |
| **body** | [**Project**](Project.md)| The metadata of the project. Leave the ID blank, it will be generated.  | |

### Return type

[**CreateProject201Response**](CreateProject201Response.md)

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
| **403** | Don&#39;t have authorization to create a new project in this workspace. |  -  |

<a name="deleteProject"></a>
# **deleteProject**
> deleteProject(workspaceId, projectId)

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
import dev.parodos.move2kube.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace the project is in.
    String projectId = "proj-1234"; // String | ID of the project to delete.
    try {
      apiInstance.deleteProject(workspaceId, projectId);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#deleteProject");
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
| **workspaceId** | **String**| ID of the workspace the project is in. | |
| **projectId** | **String**| ID of the project to delete. | |

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
| **403** | Don&#39;t have authorization to delete this project. |  -  |
| **404** | Workspace or project not found. |  -  |

<a name="getProject"></a>
# **getProject**
> Project getProject(workspaceId, projectId)

Get the project with the given ID.

Get the project with the given ID.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace the project is in.
    String projectId = "proj-1234"; // String | ID of the project to get.
    try {
      Project result = apiInstance.getProject(workspaceId, projectId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProject");
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
| **workspaceId** | **String**| ID of the workspace the project is in. | |
| **projectId** | **String**| ID of the project to get. | |

### Return type

[**Project**](Project.md)

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
| **403** | Don&#39;t have authorization to get this project. |  -  |
| **404** | Workspace or project not found. |  -  |

<a name="getProjects"></a>
# **getProjects**
> List&lt;Project&gt; getProjects(workspaceId)

Get all the projects you have access to in this workspace.

Get all the projects you have access to in this workspace.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace to get the projects from.
    try {
      List<Project> result = apiInstance.getProjects(workspaceId);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#getProjects");
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
| **workspaceId** | **String**| ID of the workspace to get the projects from. | |

### Return type

[**List&lt;Project&gt;**](Project.md)

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
| **403** | Don&#39;t have authorization to get all the projects in this workspace. |  -  |

<a name="updateProject"></a>
# **updateProject**
> updateProject(workspaceId, projectId, body)

Update a project. The project will be created if it doesn&#39;t exist.

Update a project. The project will be created if it doesn&#39;t exist.

### Example
```java
// Import classes:
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.auth.*;
import dev.parodos.move2kube.models.*;
import dev.parodos.move2kube.api.ProjectsApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("/api/v1");
    
    // Configure HTTP bearer authorization: bearerAuth
    HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
    bearerAuth.setBearerToken("BEARER TOKEN");

    ProjectsApi apiInstance = new ProjectsApi(defaultClient);
    String workspaceId = "work-1234"; // String | ID of the workspace the project is in.
    String projectId = "proj-1234"; // String | ID of the project to update.
    Project body = new Project(); // Project | The metadata of the project. Leave the ID blank. 
    try {
      apiInstance.updateProject(workspaceId, projectId, body);
    } catch (ApiException e) {
      System.err.println("Exception when calling ProjectsApi#updateProject");
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
| **workspaceId** | **String**| ID of the workspace the project is in. | |
| **projectId** | **String**| ID of the project to update. | |
| **body** | [**Project**](Project.md)| The metadata of the project. Leave the ID blank.  | |

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
| **403** | Don&#39;t have authorization to create/update this project. |  -  |
| **404** | Workspace or project not found. |  -  |

