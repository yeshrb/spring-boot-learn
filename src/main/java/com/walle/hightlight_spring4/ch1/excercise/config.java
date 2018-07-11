package com.walle.hightlight_spring4.ch1.excercise;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ljj on 2018/7/7.
 */
@Configuration
@ComponentScan("com.walle.hightlight_spring4.ch1.excercise")
public class config {

    @Bean
    public DemoJavaConfigBean demoJavaConfigBean() {
        return new DemoJavaConfigBean();
    }
}
