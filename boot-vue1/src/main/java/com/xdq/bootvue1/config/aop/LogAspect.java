package com.xdq.bootvue1.config.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Springboot 配置aop
 */
@Component
@Aspect //声明该类是个切面
public class LogAspect {

    @Pointcut("execution(* com.xdq.bootvue1.service.*.*(..))") //注解，这是 个切入点定义。
    public void pc1() {

    }

    @Before(value ="pc1()")
    public void before(JoinPoint jp){
        String name = jp.getSignature() .getName();
        System.out.println(name +"方法开始执行 ．．．" );
    }

    @After(value ="pc1()")
    public void after (JoinPoint jp) {
        String name = jp.getSignature () . getName ();
        System. out.println (name +"方法开始结束 ．．．" );
    }

    @AfterReturning(value ="pc1()", returning ="result")
    public void afterReturning(JoinPoint jp, Object result) {
        String name = jp .getSignature () . getName ();
        System. out . println(name +"方法返回值为："+ result);
    }
    @AfterThrowing(value = "pc1()", throwing = "e")
    public void afterThrowing(JoinPoint jp,Exception e) {
        String name = jp.getSignature() . getName();
        System.out.println(name +"方法抛异常了，异常是："+e.getMessage());
    }
    @Around ("pc1()")
    public Object around(ProceedingJoinPoint pjp) throws Throwable {
        return pjp . proceed();
    }
}
