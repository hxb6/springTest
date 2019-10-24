package test.proxy.jdkProxyTest;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Package: test.proxy.jdkProxyTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 14:32
 * @Description:
 **/
public class MyInvocationHandler implements InvocationHandler {

    public Object object;

    public MyInvocationHandler(Object object){
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        String name = method.getName();
        System.out.println("jdk动态代理"+ name +"----------方法执行前");
        Object invoke = method.invoke(object, args);//方法的反射执行被代理类的方法
        System.out.println("jdk动态代理"+ name +"----------方法执行后");
        return invoke;
    }
}
