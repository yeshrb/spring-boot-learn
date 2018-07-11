package com.walle.hightlight_spring4.ch1.aop;

import org.springframework.stereotype.Service;

/**
 * Created by ljj on 2018/7/7.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("method rule  add");
    }
}
