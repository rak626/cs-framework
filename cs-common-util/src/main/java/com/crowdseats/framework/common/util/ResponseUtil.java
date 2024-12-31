package com.crowdseats.framework.common.util;

import com.crowdseats.framework.common.Response;

public class ResponseUtil {
    public static <T> Response<T> prepareResponse(T data) {
        Response<T> response = new Response<>();
        response.setStatus(Response.Status.SUCCESS);
        response.setResult(data);
        return response;
    }
}
