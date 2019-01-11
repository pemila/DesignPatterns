package com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;

/**
 * 定义Filter链
 * @author： 月在未央
 * @date： 2019/1/11 10:49
 */
public interface FilterChain {

    Response doFilter(Request request, Response response);
}
