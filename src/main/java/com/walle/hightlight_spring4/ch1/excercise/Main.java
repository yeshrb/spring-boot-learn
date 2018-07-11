package com.walle.hightlight_spring4.ch1.excercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext(config.class);

        DemoAnnotationBean annotationBean = ctx.getBean(DemoAnnotationBean.class);
        System.out.println(annotationBean.saySelf());

        DemoJavaConfigBean configBean = ctx.getBean(DemoJavaConfigBean.class);
        System.out.println(configBean.saySelf());

        ctx.close();


    }
}
