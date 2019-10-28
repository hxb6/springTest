package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;
import test.mapper.CarInfoMapper;
import test.mapper.UserInfoMapper;
import test.pojo.CarInfo;
import test.pojo.UserInfo;
import test.service.CodeTransactionalTestService;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/28 16:22
 * @Description:
 **/
@Service
public class CodeTransactionalTestServiceImpl implements CodeTransactionalTestService {

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Autowired
    private UserInfoMapper userInfoMapper;

    /**
     * 注入事物模板
     */
    @Autowired
    private TransactionTemplate transactionTemplate;

    /**
     * 实现编程式事务
     * @param userInfo
     * @param carInfo
     */
    @Override
    public void transactionCodeTest(final UserInfo userInfo, final CarInfo carInfo) {
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                userInfoMapper.insert(userInfo);
                carInfoMapper.insert(carInfo);
            }
        });
    }

    /**
     * 声明式事务 通过XML配置
     * @param userInfo
     * @param carInfo
     */
    @Override
    public void transactionXMLTest(UserInfo userInfo, CarInfo carInfo) {
        userInfoMapper.insert(userInfo);
        carInfoMapper.insert(carInfo);
    }


}
