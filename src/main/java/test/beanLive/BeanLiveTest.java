package test.beanLive;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @Package: test.beanLive
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/17 10:45
 * @Description:
 **/
public class BeanLiveTest implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, BeanPostProcessor, InitializingBean, DisposableBean {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setBeanName(String name) {
        this.name = name;
        System.out.println("BeanNameAware-----setBeanName");
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware-----setBeanFactory");
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("ApplicationContextAware-----setApplicationContext");
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(bean instanceof BeanLiveTest){
            System.out.println("BeanPostProcessor-----postProcessBeforeInitialization");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLiveTest) {
            System.out.println("BeanPostProcessor-----postProcessAfterInitialization");
        }
        return bean;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean-----afterPropertiesSet");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean-----destroy");
    }

    public void myInitMethod(){
        System.out.println("自定义的初始化方法");
    }

    public void myDestroy(){
        System.out.println("自定义的销毁方法");
    }
}
