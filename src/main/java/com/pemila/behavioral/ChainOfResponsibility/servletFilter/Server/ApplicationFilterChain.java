package com.pemila.behavioral.ChainOfResponsibility.servletFilter.Server;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.Filter;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.FilterChain;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.FilterConfig;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;

/**
 * servlet filter的核心实现
 * @author： 月在未央
 * @date： 2019/1/11 14:06
 */
public class ApplicationFilterChain implements FilterChain {
    //当前执行的Filter
    private int pos = 0;
    //当前Filter的总数
    private int n;
    //Filter配置类数组
    private FilterConfig[] configs;
    private Servlet servlet;

    public ApplicationFilterChain(FilterConfig[] configs){
        this.configs = configs;
        this.n = configs.length;
    }

    @Override
    public Response doFilter(Request request, Response response) {
        if(pos < n){
            FilterConfig config = configs[pos++];
            Filter filter = config.getFilter();
            response = filter.doFilter(request,response,this);
        }else {
            //所有Filter执行完毕之后，执行servlet中的方法
            response = servlet.service(request,response);
        }
        return  response;
    }
}
