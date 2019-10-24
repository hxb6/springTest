package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import test.mapper.CarInfoMapper;
import test.mapper.UserInfoMapper;
import test.pojo.CarInfo;
import test.pojo.UserInfo;
import test.service.TransactionalServiceXML;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 16:28
 * @Description:
 **/
@Service
@Transactional(propagation = Propagation.REQUIRED,rollbackFor = Exception.class)
public class TransactionServiceXMLImpl implements TransactionalServiceXML {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Override
    public void transactionTest(UserInfo userInfo, CarInfo carInfo) {
        userInfoMapper.insert(userInfo);
        carInfoMapper.insert(carInfo);
    }
}
