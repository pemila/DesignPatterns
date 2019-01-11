package com.pemila.behavioral.ChainOfResponsibility.servletFilter.Server;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;
import com.pemila.util.JSON;

/**
 * @author： 月在未央
 * @date： 2019/1/11 14:07
 */
public class Servlet {

    public static Response service(Request request, Response response){
        response = new Response();
        response.setAgreeOrNot(true);
        response.setInfos(JSON.toJson(request));
        return response;
    }
}
