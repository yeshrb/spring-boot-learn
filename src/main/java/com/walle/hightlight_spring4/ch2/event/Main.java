package com.walle.hightlight_spring4.ch2.event;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(EventConfig.class);

        DemoPublisher publisher = ctx.getBean(DemoPublisher.class);
        publisher.publish("This is application event");

        ctx.close();
    }
}
