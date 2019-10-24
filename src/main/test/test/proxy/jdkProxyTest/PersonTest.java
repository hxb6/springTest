package test.proxy.jdkProxyTest;


import org.junit.Test;

import java.lang.reflect.Proxy;

/**
 * @Package: test.proxy.jdkProxyTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 14:37
 * @Description:
 **/
public class PersonTest {

    @Test
    public void jdkProxyTest(){
        //创建被代理对象
        Person man = new Man();

        MyInvocationHandler myInvocationHandler = new MyInvocationHandler(man);
        //创建代理对象 对被代理对象执行方法前后进行自定义处理
        Person person = (Person) Proxy.newProxyInstance(man.getClass().getClassLoader(), new Class[]{Person.class}, myInvocationHandler);
        person.sayMySex();
    }

}