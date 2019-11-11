package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.mapper.PersonMapper;
import test.pojo.Person;
import test.service.PersonService;

import java.util.List;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/11/4 10:50
 * @Description:
 **/
@Service
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonMapper personMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(Person record) {
        return 0;
    }

    @Override
    public Person selectByPrimaryKey(Integer id) {
        return personMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Person> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(Person record) {
        return 0;
    }
}
