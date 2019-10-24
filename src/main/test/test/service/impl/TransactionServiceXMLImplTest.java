package test.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.pojo.CarInfo;
import test.pojo.UserInfo;
import test.service.BaseTest;
import test.service.TransactionalServiceXML;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 16:32
 * @Description:
 **/
public class TransactionServiceXMLImplTest extends BaseTest {

    @Autowired
    private TransactionalServiceXML transactionalServiceXML;

    @Test
    public void transactionTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setCreateTime(new Date());
        userInfo.setPassword("123456");
        userInfo.setUpdateTime(new Date());
        userInfo.setUserName("事物出错测试");

        CarInfo carInfo = new CarInfo();
        carInfo.setCarId("ddd");
        carInfo.setCarColor("red");
        carInfo.setCarName("奔驰");

        transactionalServiceXML.transactionTest(userInfo, carInfo);

    }
}