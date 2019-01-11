package com.pemila.behavioral.ChainOfResponsibility.servletFilter.http;

import lombok.Data;

/**
 * 模拟请求(使用建造者模式构建请求)
 * @author： 月在未央
 * @date： 2019/1/11 11:17
 */
@Data
public class Request {
    private String name;
    private String reason;
    private int days;
    public Request(Builder builder){
        this.name =builder.name;
        this.reason = builder.reason;
        this.days = builder.days;
    }
    /** 建造者*/
    public static class Builder{
        public String name;
        public String reason;
        public int days;
        public Builder setName(String name){
            this.name = name;
            return this;
        }
        public Builder setReason(String reason){
            this.reason = reason;
            return this;
        }
        public Builder setDays(int days) {
            this.days = days;
            return this;
        }
        public Request build(){
            return new Request(this);
        }
    }
}
