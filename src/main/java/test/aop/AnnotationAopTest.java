package test.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Package: test.aop
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 10:47
 * @Description:
 **/
@Aspect
@Component
@Order(1)//切面先后顺序 值越小切面越先执行
public class AnnotationAopTest {

    @Pointcut("execution(* test.HelloTest.sayAnnotationHello())")
    public void pointCut(){}

    @Before("pointCut()")
    public void before(){
        System.out.println("注解----------before");
    }

    @After("pointCut()")
    public void after(){
        System.out.println("注解----------after");
    }

    @Around("pointCut()")
    public void around(ProceedingJoinPoint point) throws Throwable{
        System.out.println("注解----------环绕通知前");
        point.proceed();
        System.out.println("注解----------环绕通知后");
    }

    @AfterReturning("pointCut()")
    public void afterReturning(){
        System.out.println("注解-------afterReturning");
    }

    @AfterThrowing("pointCut()")
    public void afterThrowing(){
        System.out.println("注解-------afterThrowing");
    }
}
