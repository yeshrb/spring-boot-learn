package com.walle.hightlight_spring4.ch2.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(ElConfig.class);

        ElConfig resourceService = ctx.getBean(ElConfig.class);
         resourceService.outputResource();

        ctx.close();
    }
}
