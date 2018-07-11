package com.walle.hightlight_spring4.ch1.aop;

import java.lang.annotation.*;

/**
 * Created by ljj on 2018/7/7.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
