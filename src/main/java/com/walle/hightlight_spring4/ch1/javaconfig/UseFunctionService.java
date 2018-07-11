package com.walle.hightlight_spring4.ch1.javaconfig;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示javaconfig,作为客户类
 */

//没有注解
public class UseFunctionService {

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String sayHello(String word) {
        return functionService.sayHello(word);
    }
}
