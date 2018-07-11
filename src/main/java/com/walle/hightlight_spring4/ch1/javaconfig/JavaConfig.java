package com.walle.hightlight_spring4.ch1.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.jws.soap.SOAPBinding;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示IoC和DI，此类作为配置类
 */
@Configuration //声明这是一个配置类

public class JavaConfig {
    @Bean
    public FunctionService functionService(){
        return new FunctionService();
    }

//    @Bean
//    public UseFunctionService useFunctionService(){
//        UseFunctionService useFunctionService = new UseFunctionService();
//        useFunctionService.setFunctionService(functionService());
//        return useFunctionService;
//    }

    @Bean
    public UseFunctionService useFunctionService(FunctionService functionService){
        UseFunctionService useFunctionService = new UseFunctionService();
        //在spring容器中只要存在某个bean，就可以在另一个Bean的声明中使用
        useFunctionService.setFunctionService(functionService);
        return useFunctionService;
    }
}
