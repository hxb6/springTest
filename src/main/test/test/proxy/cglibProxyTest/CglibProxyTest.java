package test.proxy.cglibProxyTest;

import org.junit.Test;


/**
 * @Package: test.proxy.cglibProxyTest
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/16 15:16
 * @Description:
 **/
public class CglibProxyTest {

    @Test
    public void cglibProxyTest(){
        Man man = new Man();

        Man cglibProxyTarget = (Man) new CglibProxy(man).createCglibProxyTarget();

        cglibProxyTarget.run();

    }

}