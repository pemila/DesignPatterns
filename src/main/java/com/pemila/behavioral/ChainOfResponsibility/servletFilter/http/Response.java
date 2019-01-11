package com.pemila.behavioral.ChainOfResponsibility.servletFilter.http;

import lombok.Data;

/**
 * 模拟响应对象
 * @author： 月在未央
 * @date： 2019/1/11 11:43
 */
@Data
public class Response {
    public boolean agreeOrNot;
    public String infos;
    public Response(){}
    public Response(boolean agreeOrNot,String infos){
        this.agreeOrNot = agreeOrNot;
        this.infos = infos;
    }
}
