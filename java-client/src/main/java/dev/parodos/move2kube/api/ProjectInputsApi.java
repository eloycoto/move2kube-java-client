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


package dev.parodos.move2kube.api;

import dev.parodos.move2kube.ApiCallback;
import dev.parodos.move2kube.ApiClient;
import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.ApiResponse;
import dev.parodos.move2kube.Configuration;
import dev.parodos.move2kube.Pair;
import dev.parodos.move2kube.ProgressRequestBody;
import dev.parodos.move2kube.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import dev.parodos.move2kube.client.model.CreateProjectInput201Response;
import dev.parodos.move2kube.client.model.Error;
import java.io.File;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectInputsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectInputsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectInputsApi(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    /**
     * Build call for createProjectInput
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project to create the input in. (required)
     * @param type The type of the input. (optional)
     * @param id If the input is of type &#39;reference&#39;, then this field indicates the id of the workspace input that it is referencing. (optional)
     * @param description A description for the input. (optional)
     * @param _file The actual content of the input file. (optional)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to create an input for this project. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProjectInputCall(String workspaceId, String projectId, String type, String id, String description, File _file, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspace-id}/projects/{project-id}/inputs"
            .replace("{" + "workspace-id" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "project-id" + "}", localVarApiClient.escapeString(projectId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (type != null) {
            localVarFormParams.put("type", type);
        }

        if (id != null) {
            localVarFormParams.put("id", id);
        }

        if (description != null) {
            localVarFormParams.put("description", description);
        }

        if (_file != null) {
            localVarFormParams.put("file", _file);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call createProjectInputValidateBeforeCall(String workspaceId, String projectId, String type, String id, String description, File _file, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling createProjectInput(Async)");
        }

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling createProjectInput(Async)");
        }

        return createProjectInputCall(workspaceId, projectId, type, id, description, _file, _callback);

    }

    /**
     * Create a new input for this project. The ID will be generated by the server.
     * Create a new input for this project. The ID will be generated by the server.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project to create the input in. (required)
     * @param type The type of the input. (optional)
     * @param id If the input is of type &#39;reference&#39;, then this field indicates the id of the workspace input that it is referencing. (optional)
     * @param description A description for the input. (optional)
     * @param _file The actual content of the input file. (optional)
     * @return CreateProjectInput201Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to create an input for this project. </td><td>  -  </td></tr>
     </table>
     */
    public CreateProjectInput201Response createProjectInput(String workspaceId, String projectId, String type, String id, String description, File _file) throws ApiException {
        ApiResponse<CreateProjectInput201Response> localVarResp = createProjectInputWithHttpInfo(workspaceId, projectId, type, id, description, _file);
        return localVarResp.getData();
    }

    /**
     * Create a new input for this project. The ID will be generated by the server.
     * Create a new input for this project. The ID will be generated by the server.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project to create the input in. (required)
     * @param type The type of the input. (optional)
     * @param id If the input is of type &#39;reference&#39;, then this field indicates the id of the workspace input that it is referencing. (optional)
     * @param description A description for the input. (optional)
     * @param _file The actual content of the input file. (optional)
     * @return ApiResponse&lt;CreateProjectInput201Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to create an input for this project. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<CreateProjectInput201Response> createProjectInputWithHttpInfo(String workspaceId, String projectId, String type, String id, String description, File _file) throws ApiException {
        okhttp3.Call localVarCall = createProjectInputValidateBeforeCall(workspaceId, projectId, type, id, description, _file, null);
        Type localVarReturnType = new TypeToken<CreateProjectInput201Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Create a new input for this project. The ID will be generated by the server. (asynchronously)
     * Create a new input for this project. The ID will be generated by the server.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project to create the input in. (required)
     * @param type The type of the input. (optional)
     * @param id If the input is of type &#39;reference&#39;, then this field indicates the id of the workspace input that it is referencing. (optional)
     * @param description A description for the input. (optional)
     * @param _file The actual content of the input file. (optional)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 201 </td><td> Created. </td><td>  -  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to create an input for this project. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call createProjectInputAsync(String workspaceId, String projectId, String type, String id, String description, File _file, final ApiCallback<CreateProjectInput201Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = createProjectInputValidateBeforeCall(workspaceId, projectId, type, id, description, _file, _callback);
        Type localVarReturnType = new TypeToken<CreateProjectInput201Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
    /**
     * Build call for deleteProjectInput
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to delete. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleted. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to delete this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProjectInputCall(String workspaceId, String projectId, String inputId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspace-id}/projects/{project-id}/inputs/{input-id}"
            .replace("{" + "workspace-id" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "project-id" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "input-id" + "}", localVarApiClient.escapeString(inputId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "DELETE", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call deleteProjectInputValidateBeforeCall(String workspaceId, String projectId, String inputId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling deleteProjectInput(Async)");
        }

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling deleteProjectInput(Async)");
        }

        // verify the required parameter 'inputId' is set
        if (inputId == null) {
            throw new ApiException("Missing the required parameter 'inputId' when calling deleteProjectInput(Async)");
        }

        return deleteProjectInputCall(workspaceId, projectId, inputId, _callback);

    }

    /**
     * Delete the input of the project.
     * Delete the input of the project.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to delete. (required)
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleted. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to delete this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public void deleteProjectInput(String workspaceId, String projectId, String inputId) throws ApiException {
        deleteProjectInputWithHttpInfo(workspaceId, projectId, inputId);
    }

    /**
     * Delete the input of the project.
     * Delete the input of the project.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to delete. (required)
     * @return ApiResponse&lt;Void&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleted. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to delete this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Void> deleteProjectInputWithHttpInfo(String workspaceId, String projectId, String inputId) throws ApiException {
        okhttp3.Call localVarCall = deleteProjectInputValidateBeforeCall(workspaceId, projectId, inputId, null);
        return localVarApiClient.execute(localVarCall);
    }

    /**
     * Delete the input of the project. (asynchronously)
     * Delete the input of the project.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to delete. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 204 </td><td> Deleted. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to delete this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call deleteProjectInputAsync(String workspaceId, String projectId, String inputId, final ApiCallback<Void> _callback) throws ApiException {

        okhttp3.Call localVarCall = deleteProjectInputValidateBeforeCall(workspaceId, projectId, inputId, _callback);
        localVarApiClient.executeAsync(localVarCall, _callback);
        return localVarCall;
    }
    /**
     * Build call for getProjectInput
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to get. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectInputCall(String workspaceId, String projectId, String inputId, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/workspaces/{workspace-id}/projects/{project-id}/inputs/{input-id}"
            .replace("{" + "workspace-id" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "project-id" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "input-id" + "}", localVarApiClient.escapeString(inputId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/octet-stream"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "bearerAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getProjectInputValidateBeforeCall(String workspaceId, String projectId, String inputId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling getProjectInput(Async)");
        }

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getProjectInput(Async)");
        }

        // verify the required parameter 'inputId' is set
        if (inputId == null) {
            throw new ApiException("Missing the required parameter 'inputId' when calling getProjectInput(Async)");
        }

        return getProjectInputCall(workspaceId, projectId, inputId, _callback);

    }

    /**
     * Get the input of the project with the given ID.
     * Get the input of the project with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to get. (required)
     * @return File
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public File getProjectInput(String workspaceId, String projectId, String inputId) throws ApiException {
        ApiResponse<File> localVarResp = getProjectInputWithHttpInfo(workspaceId, projectId, inputId);
        return localVarResp.getData();
    }

    /**
     * Get the input of the project with the given ID.
     * Get the input of the project with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to get. (required)
     * @return ApiResponse&lt;File&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<File> getProjectInputWithHttpInfo(String workspaceId, String projectId, String inputId) throws ApiException {
        okhttp3.Call localVarCall = getProjectInputValidateBeforeCall(workspaceId, projectId, inputId, null);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the input of the project with the given ID. (asynchronously)
     * Get the input of the project with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the input is in. (required)
     * @param inputId ID of the input to get. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project input. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or input not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectInputAsync(String workspaceId, String projectId, String inputId, final ApiCallback<File> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectInputValidateBeforeCall(workspaceId, projectId, inputId, _callback);
        Type localVarReturnType = new TypeToken<File>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
