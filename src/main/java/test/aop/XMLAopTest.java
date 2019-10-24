package test.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * @Package: test.aop
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 10:04
 * @Description:
 **/
public class XMLAopTest {

    public void before(){
        System.out.println("XML----------before");
    }

    public void after(){
        System.out.println("xml----------after");
    }

    public void around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("xml----------环绕通知前");
        point.proceed();
        System.out.println("xml----------环绕通知后");
    }

    public void afterReturning(){
        System.out.println("xml-------afterReturning");
    }

    public void afterThrowing(){
        System.out.println("xml-------afterThrowing");
    }
}
