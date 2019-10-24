package test;


import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Package: test
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/15 10:11
 * @Description:
 **/
public class HelloTestTest {

    @Test
    public void test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");

        HelloTest helloTest = (HelloTest) context.getBean("helloTest");

        HelloTest helloTest1 = (HelloTest) context.getBean("helloTest");

        System.out.println(helloTest.hashCode());
        System.out.println(helloTest1.hashCode());
        System.out.println(helloTest == helloTest1);

    }

    @Test
    public void xmlAopTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloTest helloTest = context.getBean(HelloTest.class);
        helloTest.sayHello();
    }

    @Test
    public void annotationAopTest(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-config.xml");
        HelloTest helloTest = context.getBean(HelloTest.class);
        helloTest.sayAnnotationHello();
    }
}