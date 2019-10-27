package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import test.mapper.User2Mapper;
import test.pojo.User2;
import test.service.User2Service;


/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:02
 * @Description:
 **/
@Service
public class User2ServiceImpl implements User2Service {

    @Autowired
    private User2Mapper user2Mapper;

    /**
     * 事务传播行为为REQUIRED
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertOnRequired(User2 record) {
        return user2Mapper.insert(record);
    }

    /**
     * 事务传播行为为REQUIRED,且抛出异常
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertOnRequiredAndException(User2 record) {
        user2Mapper.insert(record);
        throw new RuntimeException();
    }

    /**
     * 事务传播行为REQUIRES_NEW
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int insertOnRequires_New(User2 record) {
        return user2Mapper.insert(record);
    }
    /**
     * 事务传播行为REQUIRES_NEW且抛出异常
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int insertOnRequires_NewAndException(User2 record) {
        user2Mapper.insert(record);
        throw new RuntimeException();
    }

    /**
     * 事务传播行为NESTED
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public int insertOnNested(User2 record) {
        return user2Mapper.insert(record);
    }

    /**
     * 事务传播行为NESTED且抛出异常
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public int insertOnNestedAndException(User2 record) {
        user2Mapper.insert(record);
        throw new RuntimeException();
    }


}
