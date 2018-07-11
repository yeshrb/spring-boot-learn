package com.walle.hightlight_spring4.ch1.aop;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(AopConfig.class);

        DemoAnnotationService annotationService = ctx.getBean(DemoAnnotationService.class);
        DemoMethodService methodService = ctx.getBean(DemoMethodService.class);

        annotationService.add();
        methodService.add();

        ctx.close();
    }
}
