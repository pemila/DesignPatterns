package com.pemila.behavioral.ChainOfResponsibility.servletFilter.customFilter;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.Filter;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.FilterChain;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.FilterConfig;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;
import com.pemila.util.Logs;

/**
 * @author： 月在未央
 * @date： 2019/1/11 15:01
 */
public class TwoFilter implements Filter {
    @Override
    public void init(FilterConfig config) {}

    @Override
    public Response doFilter(Request request, Response response, FilterChain filterChain) {
        Logs.info("2号过滤器");
        return filterChain.doFilter(request, response);
    }
    @Override
    public void destroy() {}
}
