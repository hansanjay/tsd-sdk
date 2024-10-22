package org.tsd.sdk.response;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class JsonSuccessResponse<T> implements ResponseObject {

    public boolean success;
    public String message;
    @JsonProperty("success_code")
    public int successCode;
    public T data;

    public static <T> JsonSuccessResponse ok(T data) {
        JsonSuccessResponse response = new JsonSuccessResponse();
        response.success = true;
        response.message = "";
        response.successCode = 200;
        response.data = data;
        return response;
    }

    public static <T> JsonSuccessResponse ok(String message, int successCode, T data) {
        JsonSuccessResponse response = new JsonSuccessResponse();
        response.success = true;
        response.message = message;
        response.successCode = successCode;
        response.data = data;
        return response;
    }

    public static <T> JsonSuccessResponse ok(int successCode, T data) {
        JsonSuccessResponse response = new JsonSuccessResponse();
        response.success = true;
        response.message = "";
        response.successCode = successCode;
        response.data = data;
        return response;
    }
    
    public static <T> JsonSuccessResponse fail(String message, int successCode, T data) {
        JsonSuccessResponse response = new JsonSuccessResponse();
        response.success = false;
        response.message = message;
        response.successCode = successCode;
        response.data = null;
        return response;
    }
}
