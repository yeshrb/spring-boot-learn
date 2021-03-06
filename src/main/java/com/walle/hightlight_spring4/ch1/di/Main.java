package com.walle.hightlight_spring4.ch1.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示IoC和DI，此类作为运行类
 */
public class Main {
    public static void main(String[] args) {
        //创建一个Spring的容器
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(DiConfig.class);

        //获得声明配置的Bean
        UseFunctionService useFunctionService = ctx.getBean(UseFunctionService.class);
        //使用Bean
        System.out.println(useFunctionService.sayHello("Di"));
        //关闭容器
        ctx.close();
    }
}
