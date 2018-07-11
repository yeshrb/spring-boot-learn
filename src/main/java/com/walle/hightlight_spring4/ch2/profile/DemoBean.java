package com.walle.hightlight_spring4.ch2.profile;

/**
 * Created by ljj on 2018/7/7.
 */
public class DemoBean {
    private String content;

    public DemoBean(String content){
        super();
        this.content = content;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content = content;
    }
}
