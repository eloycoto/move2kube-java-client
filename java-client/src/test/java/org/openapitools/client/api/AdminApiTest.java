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

import org.openapitools.client.ApiException;
import org.openapitools.client.model.Error;
import org.openapitools.client.model.GetTokens200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for AdminApi
 */
@Disabled
public class AdminApiTest {

    private final AdminApi api = new AdminApi();

    /**
     * Get an access token using client ID and client secret (for use with trusted clients).
     *
     * Get an access token using client ID and client secret (for use with trusted clients).
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTokensTest() throws ApiException {
        String grantType = null;
        GetTokens200Response response = api.getTokens(grantType);
        // TODO: test validations
    }

}
