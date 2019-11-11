package test.service;

import test.pojo.Person;

import java.util.List;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/11/4 10:49
 * @Description:
 **/
public interface PersonService {

    int deleteByPrimaryKey(Integer id);

    int insert(Person record);

    Person selectByPrimaryKey(Integer id);

    List<Person> selectAll();

    int updateByPrimaryKey(Person record);
}
