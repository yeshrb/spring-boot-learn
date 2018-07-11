package com.walle.hightlight_spring4.ch2.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by ljj on 2018/7/7.
 */
@Service
public class DemoService {
    @Value("Other class properties")
    private String another;

    public String getAnother(){
        return this.another;
    }
    public void setAnother(String s){
        this.another = s;
    }
}
