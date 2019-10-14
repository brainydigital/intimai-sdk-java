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

package io.swagger.client.model;

import java.util.Objects;
import java.util.Arrays;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import io.swagger.client.JSON;
import io.swagger.v3.oas.annotations.media.Schema;
import java.io.IOException;

/**
 * ResponseDefault
 */

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.JavaClientCodegen", date = "2019-10-09T14:11:20.784Z[GMT]")
public class ResponseDefault extends Response {

    @SerializedName("data")
    private Data data = null;

    /**
     * Get data
     * 
     * @return data
     **/
    @Schema(description = "")
    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ResponseDefault ra = (ResponseDefault) o;
        return Objects.equals(this.data, ra.data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(data);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Response {\n");

        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String json = gson.toJson(data);

        sb.append("    data: ").append("\n");
        sb.append("    ").append(toIndentedString(json)).append("\n");
        sb.append("}");
        return sb.toString();
    }

}
