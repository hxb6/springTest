package test.proxy.cglibProxyTest;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @Package: test.proxy.cglibProxyTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 15:12
 * @Description:
 **/
public class CglibProxy implements MethodInterceptor {

    private Object object;
    public CglibProxy(Object object){
        this.object = object;
    }

    public Object createCglibProxyTarget(){

        //创建增强器
        Enhancer enhancer = new Enhancer();
        //设置其父类为被代理类(设置被代理对象)
        enhancer.setSuperclass(object.getClass());
        //设置回调
        enhancer.setCallback(this);

        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("穿上鞋子");
        method.invoke(object, objects);
        System.out.println("还很快");
        return null;
    }
}
