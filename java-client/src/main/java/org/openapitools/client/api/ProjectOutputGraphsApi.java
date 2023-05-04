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


package org.openapitools.client.api;

import org.openapitools.client.ApiCallback;
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.ApiResponse;
import org.openapitools.client.Configuration;
import org.openapitools.client.Pair;
import org.openapitools.client.ProgressRequestBody;
import org.openapitools.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;



import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ProjectOutputGraphsApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ProjectOutputGraphsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ProjectOutputGraphsApi(ApiClient apiClient) {
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
     * Build call for getProjectOutputGraph
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the output is in. (required)
     * @param outputId ID of the output whose graph we should get. (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> The transformation is still on-going. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project output. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or output not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectOutputGraphCall(String workspaceId, String projectId, String outputId, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/workspaces/{workspace-id}/projects/{project-id}/outputs/{output-id}/graph"
            .replace("{" + "workspace-id" + "}", localVarApiClient.escapeString(workspaceId.toString()))
            .replace("{" + "project-id" + "}", localVarApiClient.escapeString(projectId.toString()))
            .replace("{" + "output-id" + "}", localVarApiClient.escapeString(outputId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
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
    private okhttp3.Call getProjectOutputGraphValidateBeforeCall(String workspaceId, String projectId, String outputId, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'workspaceId' is set
        if (workspaceId == null) {
            throw new ApiException("Missing the required parameter 'workspaceId' when calling getProjectOutputGraph(Async)");
        }

        // verify the required parameter 'projectId' is set
        if (projectId == null) {
            throw new ApiException("Missing the required parameter 'projectId' when calling getProjectOutputGraph(Async)");
        }

        // verify the required parameter 'outputId' is set
        if (outputId == null) {
            throw new ApiException("Missing the required parameter 'outputId' when calling getProjectOutputGraph(Async)");
        }

        return getProjectOutputGraphCall(workspaceId, projectId, outputId, _callback);

    }

    /**
     * Get the graph of the transformers used while creating the output with the given ID.
     * Get the graph of the transformers used while creating the output with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the output is in. (required)
     * @param outputId ID of the output whose graph we should get. (required)
     * @return Object
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> The transformation is still on-going. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project output. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or output not found. </td><td>  -  </td></tr>
     </table>
     */
    public Object getProjectOutputGraph(String workspaceId, String projectId, String outputId) throws ApiException {
        ApiResponse<Object> localVarResp = getProjectOutputGraphWithHttpInfo(workspaceId, projectId, outputId);
        return localVarResp.getData();
    }

    /**
     * Get the graph of the transformers used while creating the output with the given ID.
     * Get the graph of the transformers used while creating the output with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the output is in. (required)
     * @param outputId ID of the output whose graph we should get. (required)
     * @return ApiResponse&lt;Object&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> The transformation is still on-going. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project output. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or output not found. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<Object> getProjectOutputGraphWithHttpInfo(String workspaceId, String projectId, String outputId) throws ApiException {
        okhttp3.Call localVarCall = getProjectOutputGraphValidateBeforeCall(workspaceId, projectId, outputId, null);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get the graph of the transformers used while creating the output with the given ID. (asynchronously)
     * Get the graph of the transformers used while creating the output with the given ID.
     * @param workspaceId ID of the workspace the project is in. (required)
     * @param projectId ID of the project the output is in. (required)
     * @param outputId ID of the output whose graph we should get. (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success. </td><td>  -  </td></tr>
        <tr><td> 204 </td><td> The transformation is still on-going. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get this project output. </td><td>  -  </td></tr>
        <tr><td> 404 </td><td> Workspace, project or output not found. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getProjectOutputGraphAsync(String workspaceId, String projectId, String outputId, final ApiCallback<Object> _callback) throws ApiException {

        okhttp3.Call localVarCall = getProjectOutputGraphValidateBeforeCall(workspaceId, projectId, outputId, _callback);
        Type localVarReturnType = new TypeToken<Object>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
