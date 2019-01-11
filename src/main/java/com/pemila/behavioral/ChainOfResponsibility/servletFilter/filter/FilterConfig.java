package com.pemila.behavioral.ChainOfResponsibility.servletFilter.filter;

/**
 * 从filterConfig中获取filter
 * @author： 月在未央
 * @date： 2019/1/11 12:12
 */
public class FilterConfig {
    private Filter filter;
    private String filterName;
    public FilterConfig(String filterName){
        this.filterName = filterName;
    }
    //获取filter
    public Filter getFilter(){
        try {
            this.filter = (Filter) Class.forName(this.filterName).newInstance();
        } catch (InstantiationException|IllegalAccessException|ClassNotFoundException e) {
            e.printStackTrace();
        }
        return this.filter;
    }
}
