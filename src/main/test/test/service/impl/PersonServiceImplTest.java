package test.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.pojo.Person;
import test.pojo.PersonSon;
import test.service.BaseTest;
import test.service.PersonService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/11/4 10:53
 * @Description:
 **/
public class PersonServiceImplTest extends BaseTest {

    @Autowired
    private PersonService personService;

    @Test
    public void selectByPrimaryKey() {
        Person person = personService.selectByPrimaryKey(1);
        System.out.println(person);
    }
}