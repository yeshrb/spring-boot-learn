package com.walle.hightlight_spring4.ch2.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ljj on 2018/7/7.
 */
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx =
                new AnnotationConfigApplicationContext();
        ctx.getEnvironment().setActiveProfiles("prod");
        ctx.register(ProfileConfig.class);
        ctx.refresh();

        DemoBean demoBean = ctx.getBean(DemoBean.class);
        System.out.println(demoBean.getContent());

        ctx.close();
    }

}
