package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import test.pojo.User1;
import test.pojo.User2;
import test.service.TransactionalTestService;
import test.service.User1Service;
import test.service.User2Service;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:34
 * @Description: 事务传播行为测试
 **/
@Service
public class TransactionalTestServiceImpl implements TransactionalTestService {

    @Autowired
    private User1Service user1Service;

    @Autowired
    private User2Service user2Service;

    /**
     * 验证事务传播行为
     */
    @Transactional(propagation = Propagation.REQUIRED)
    public void transactional_propagation_test(){
        User1 user1 = new User1();
        user1.setName("张三");
        user1Service.insertOnNested(user1);

        User2 user2 = new User2();
        user2.setName("李四");
        try {
            user2Service.insertOnNestedAndException(user2);
        } catch (Exception e){
            System.out.println("try-catch测试");
        }
    }

}
