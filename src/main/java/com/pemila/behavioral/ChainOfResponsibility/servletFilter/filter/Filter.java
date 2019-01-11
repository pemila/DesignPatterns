package com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;

/**
 * @author： 月在未央
 * @date： 2019/1/11 11:58
 */
public interface Filter {

    void init(FilterConfig config);

    Response doFilter(Request request, Response response, FilterChain filterChain);

    void destroy();
}
