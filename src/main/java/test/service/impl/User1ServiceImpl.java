package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import test.mapper.User1Mapper;
import test.pojo.User1;
import test.service.User1Service;


/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:01
 * @Description:
 **/
@Service
public class User1ServiceImpl implements User1Service {

    @Autowired
    private User1Mapper user1Mapper;

    /**
     * 事务传播行为为REQUIRED
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public int insertOnRequired(User1 record) {
        return user1Mapper.insert(record);
    }

    /**
     * 事务传播行为REQUIRES_NEW
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public int insertOnRequires_New(User1 record) {
        return user1Mapper.insert(record);
    }

    /**
     * 事务传播行为NESTED
     * @param record
     * @return
     */
    @Override
    @Transactional(propagation = Propagation.NESTED)
    public int insertOnNested(User1 record) {
        return user1Mapper.insert(record);
    }

}
