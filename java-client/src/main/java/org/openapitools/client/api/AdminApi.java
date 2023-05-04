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


import org.openapitools.client.model.Error;
import org.openapitools.client.model.GetTokens200Response;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class AdminApi {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public AdminApi() {
        this(Configuration.getDefaultApiClient());
    }

    public AdminApi(ApiClient apiClient) {
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
     * Build call for getTokens
     * @param grantType  (required)
     * @param _callback Callback for upload/download progress
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access token. </td><td>  * Cache-Control -  <br>  * Pragma -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get the access token. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokensCall(String grantType, final ApiCallback _callback) throws ApiException {
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
        String localVarPath = "/token";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (grantType != null) {
            localVarFormParams.put("grant_type", grantType);
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
            "application/x-www-form-urlencoded"
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] { "basicAuth" };
        return localVarApiClient.buildCall(basePath, localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getTokensValidateBeforeCall(String grantType, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'grantType' is set
        if (grantType == null) {
            throw new ApiException("Missing the required parameter 'grantType' when calling getTokens(Async)");
        }

        return getTokensCall(grantType, _callback);

    }

    /**
     * Get an access token using client ID and client secret (for use with trusted clients).
     * Get an access token using client ID and client secret (for use with trusted clients).
     * @param grantType  (required)
     * @return GetTokens200Response
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access token. </td><td>  * Cache-Control -  <br>  * Pragma -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get the access token. </td><td>  -  </td></tr>
     </table>
     */
    public GetTokens200Response getTokens(String grantType) throws ApiException {
        ApiResponse<GetTokens200Response> localVarResp = getTokensWithHttpInfo(grantType);
        return localVarResp.getData();
    }

    /**
     * Get an access token using client ID and client secret (for use with trusted clients).
     * Get an access token using client ID and client secret (for use with trusted clients).
     * @param grantType  (required)
     * @return ApiResponse&lt;GetTokens200Response&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access token. </td><td>  * Cache-Control -  <br>  * Pragma -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get the access token. </td><td>  -  </td></tr>
     </table>
     */
    public ApiResponse<GetTokens200Response> getTokensWithHttpInfo(String grantType) throws ApiException {
        okhttp3.Call localVarCall = getTokensValidateBeforeCall(grantType, null);
        Type localVarReturnType = new TypeToken<GetTokens200Response>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    /**
     * Get an access token using client ID and client secret (for use with trusted clients). (asynchronously)
     * Get an access token using client ID and client secret (for use with trusted clients).
     * @param grantType  (required)
     * @param _callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> The access token. </td><td>  * Cache-Control -  <br>  * Pragma -  <br>  </td></tr>
        <tr><td> 400 </td><td> Invalid format or validation error. </td><td>  -  </td></tr>
        <tr><td> 401 </td><td> Authorization header is missing or invalid. </td><td>  * WWW_Authenticate -  <br>  </td></tr>
        <tr><td> 403 </td><td> Don&#39;t have authorization to get the access token. </td><td>  -  </td></tr>
     </table>
     */
    public okhttp3.Call getTokensAsync(String grantType, final ApiCallback<GetTokens200Response> _callback) throws ApiException {

        okhttp3.Call localVarCall = getTokensValidateBeforeCall(grantType, _callback);
        Type localVarReturnType = new TypeToken<GetTokens200Response>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }
}
