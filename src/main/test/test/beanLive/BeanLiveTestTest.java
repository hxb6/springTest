package test.beanLive;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * @Package: test.beanLive
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/17 14:26
 * @Description:
 **/
public class BeanLiveTestTest {

    @Test
    public void beanLiveTest() throws InterruptedException {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        Thread.sleep(5000l);
        BeanLiveTest beanLiveTest = (BeanLiveTest) context.getBean("beanLiveTest");
        System.out.println(beanLiveTest.getName());

        ((ClassPathXmlApplicationContext) context).destroy();

    }
}