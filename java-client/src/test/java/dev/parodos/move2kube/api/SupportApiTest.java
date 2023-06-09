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
import dev.parodos.move2kube.client.model.GetSupportInfo200Response;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SupportApi
 */
@Disabled
public class SupportApiTest {

    private final SupportApi api = new SupportApi();

    /**
     * Returns some support information like CLI, API and UI version info.
     *
     * Returns some support information like CLI, API and UI version info.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getSupportInfoTest() throws ApiException {
        GetSupportInfo200Response response = api.getSupportInfo();
        // TODO: test validations
    }

}
