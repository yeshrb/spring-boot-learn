package com.walle.hightlight_spring4.ch1.di;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示IoC和DI，此类作为配置类
 */
@Configuration //声明这是一个配置类
//自动扫描包名下所有使用@Service、@Component、@Repository和@Controller的类，并注册为Bean
@ComponentScan("com.walle.hightlight_spring4.ch1.di")
public class DiConfig {
}
