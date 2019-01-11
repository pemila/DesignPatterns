package com.pemila.behavioral.ChainOfResponsibility.servletFilter;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.Server.WebContainerServer;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;
import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/11 14:40
 */
public class RequestClient {

    public static void main(String[] args) {
        //构建请求
        Request request =new Request
                .Builder()
                .setName("Ocean")
                .setDays(12)
                .setReason("world is so beautiful!")
                .build();
        //模拟发送http请求
        Response response = WebContainerServer.DealRequest(request,null);
        Logs.info(response.toString());
    }
}
