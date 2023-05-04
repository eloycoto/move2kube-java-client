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
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectOutputGraphsApi
 */
@Disabled
public class ProjectOutputGraphsApiTest {

    private final ProjectOutputGraphsApi api = new ProjectOutputGraphsApi();

    /**
     * Get the graph of the transformers used while creating the output with the given ID.
     *
     * Get the graph of the transformers used while creating the output with the given ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectOutputGraphTest() throws ApiException {
        String workspaceId = null;
        String projectId = null;
        String outputId = null;
        Object response = api.getProjectOutputGraph(workspaceId, projectId, outputId);
        // TODO: test validations
    }

}
