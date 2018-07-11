package com.walle.hightlight_spring4.ch1.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created by ljj on 2018/7/7.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut("@annotation(com.walle.hightlight_spring4.ch1.aop.Action)")
    public void annotationPointCut(){}

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        Action action = method.getDeclaredAnnotation(Action.class);
        System.out.println("注解式拦截 "+action.name());
    }
    @Before("execution(* com.walle.hightlight_spring4.ch1.aop.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint){
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Method method = signature.getMethod();
        System.out.println("方法规则拦截 "+method.getName());
    }
}
