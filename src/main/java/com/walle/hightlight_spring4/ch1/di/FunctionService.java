package com.walle.hightlight_spring4.ch1.di;
import org.springframework.stereotype.Service;
/**
 * Created by ljj on 2018/7/7.
 * 用来演示IoC和DI，此类作为提供服务的类
 */
@Service //注解声明当前类是Spring管理的一个Bean。
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word +" !";
    }
}
