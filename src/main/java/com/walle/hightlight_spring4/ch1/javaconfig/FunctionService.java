package com.walle.hightlight_spring4.ch1.javaconfig;
import org.springframework.stereotype.Service;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示javaconfig,作为服务类
 */
 //没有注解
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word +" !";
    }
}
