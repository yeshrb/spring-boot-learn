package com.walle.hightlight_spring4.ch2.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        //创建一个Spring的容器
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ScopeConfig.class);

        DemoSingletonService s1 = ctx.getBean(DemoSingletonService.class);
        DemoSingletonService s2 = ctx.getBean(DemoSingletonService.class);

        DemoPrototypeService p1 = ctx.getBean(DemoPrototypeService.class);
        DemoPrototypeService p2 = ctx.getBean(DemoPrototypeService.class);
        //使用Bean
        System.out.println("s1和s2相等 " + s1.equals(s2));
        System.out.println("p1和p2相等 " + p1.equals(p2));
        System.out.println("");
        //关闭容器
        ctx.close();
    }
}
