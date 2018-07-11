package com.walle.hightlight_spring4.ch2.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created by ljj on 2018/7/7.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
