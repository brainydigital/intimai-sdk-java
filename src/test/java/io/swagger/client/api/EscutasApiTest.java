/*
 * Intima.ai - API
 * Bem vindo a documentação da API do [Intima.ai](https://app.intima.ai). Está documentação cobre todas as ações disponíveis dentro do Intima.ai e as disponibilizam como `ENDPOINTS` que podem ser integrados e utilizados por outros serviços ou aplicações, bastando somente possuir o `Token de acesso da API`.
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EscutasApi
 */
@Ignore
public class EscutasApiTest {

    private final EscutasApi api = new EscutasApi();

    /**
     * Realiza uma nova escuta processual
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createProcessEscutaTest() throws ApiException {
        String processo = null;
        Integer pjeAuthId = null;
        api.createProcessEscuta(processo, pjeAuthId);

        // TODO: test validations
    }
}
