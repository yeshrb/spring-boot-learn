package com.walle.hightlight_spring4.ch1.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by ljj on 2018/7/7.
 * 用来演示IoC和DI，此类作为提供client类调用服务类
 */
@Service
public class UseFunctionService {
    @Autowired //将FunctionService的实体Bean注入进来
    FunctionService functionService;

    public String sayHello(String word) {
        //使用functionService，没有经过new等实例化
        return functionService.sayHello(word);
    }
}
