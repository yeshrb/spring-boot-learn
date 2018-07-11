package com.walle.hightlight_spring4.ch2.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(PrePostConfig.class);

        BeanWayService beanWayService = ctx.getBean(BeanWayService.class);
        JSR250WayService jsr250WayService = ctx.getBean(JSR250WayService.class);

        ctx.close();
    }
}
