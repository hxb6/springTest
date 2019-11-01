package test.service;

import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 15:56
 * @Description:
 **/
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class BaseTest {
    @Autowired
    public SqlSessionFactory sqlSessionFactory;

}
