package com.pemila.behavioral.ChainOfResponsibility.servletFilter.Server;

import com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter.FilterConfig;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Request;
import com.pemila.behavioral.ChainOfResponsibility.servletFilter.http.Response;

import java.util.ArrayList;
import java.util.List;

/**
 * 模拟web容器
 * @author： 月在未央
 * @date： 2019/1/11 14:19
 */
public class WebContainerServer {

    public static Response DealRequest(Request request, Response response){
        //初始化过滤器链
        ApplicationFilterChain chain = InitFilterChain();
        return chain.doFilter(request,response);
    }

    //初始化
    private static ApplicationFilterChain InitFilterChain() {
        //加载预定义的过滤器
        //此步骤在servlet内部为读取web.xml中配置的过滤器
        List<FilterConfig> configs =new ArrayList<>();
        configs.add(new FilterConfig("com.pemila.behavioral.ChainOfResponsibility.servletFilter.customFilter.OneFilter"));
        configs.add(new FilterConfig("com.pemila.behavioral.ChainOfResponsibility.servletFilter.customFilter.TwoFilter"));
        FilterConfig[] fcs = new FilterConfig[configs.size()];
        ApplicationFilterChain chain = new ApplicationFilterChain(configs.toArray(fcs));
        return chain;
    }


}
