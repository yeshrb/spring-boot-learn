package com.walle.hightlight_spring4.ch1.aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by ljj on 2018/7/7.
 */
@Configuration
@ComponentScan("com.walle.hightlight_spring4.ch1.aop")
@EnableAspectJAutoProxy
public class AopConfig {
}
