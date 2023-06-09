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

import dev.parodos.move2kube.ApiException;
import dev.parodos.move2kube.client.model.CreateProjectInput201Response;
import dev.parodos.move2kube.client.model.Error;
import java.io.File;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProjectInputsApi
 */
@Disabled
public class ProjectInputsApiTest {

    private final ProjectInputsApi api = new ProjectInputsApi();

    /**
     * Create a new input for this project. The ID will be generated by the server.
     *
     * Create a new input for this project. The ID will be generated by the server.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createProjectInputTest() throws ApiException {
        String workspaceId = null;
        String projectId = null;
        String type = null;
        String id = null;
        String description = null;
        File _file = null;
        CreateProjectInput201Response response = api.createProjectInput(workspaceId, projectId, type, id, description, _file);
        // TODO: test validations
    }

    /**
     * Delete the input of the project.
     *
     * Delete the input of the project.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void deleteProjectInputTest() throws ApiException {
        String workspaceId = null;
        String projectId = null;
        String inputId = null;
        api.deleteProjectInput(workspaceId, projectId, inputId);
        // TODO: test validations
    }

    /**
     * Get the input of the project with the given ID.
     *
     * Get the input of the project with the given ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getProjectInputTest() throws ApiException {
        String workspaceId = null;
        String projectId = null;
        String inputId = null;
        File response = api.getProjectInput(workspaceId, projectId, inputId);
        // TODO: test validations
    }

}
