package com.walle.hightlight_spring4.ch1.excercise;

import org.springframework.stereotype.Component;

/**
 * Created by ljj on 2018/7/7.
 */
@Component
public class DemoAnnotationBean {
    public String saySelf() {
        return "Annotation Bean";
    }
}
