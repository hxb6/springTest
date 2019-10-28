package test.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.pojo.CarInfo;
import test.pojo.UserInfo;
import test.service.BaseTest;
import test.service.CodeTransactionalTestService;

import java.util.Date;

import static org.junit.Assert.*;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/28 16:26
 * @Description:
 **/
public class CodeTransactionalTestServiceImplTest extends BaseTest {

    @Autowired
    private CodeTransactionalTestService codeTransactionalTestService;

    @Test
    public void transactionCodeTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("hxb");
        userInfo.setUpdateTime(new Date());
        userInfo.setPassword("aaaa");
        userInfo.setCreateTime(new Date());

        CarInfo carInfo = new CarInfo();
        carInfo.setCarName("BMW");
        carInfo.setCarColor("red");
        carInfo.setCarId("hxb-666");

        codeTransactionalTestService.transactionCodeTest(userInfo,carInfo);
    }

    @Test
    public void transactionXMLTest() {
        UserInfo userInfo = new UserInfo();
        userInfo.setUserName("hxb");
        userInfo.setUpdateTime(new Date());
        userInfo.setPassword("aaaa");
        userInfo.setCreateTime(new Date());

        CarInfo carInfo = new CarInfo();
        carInfo.setCarName("BMW");
        carInfo.setCarColor("red");
        carInfo.setCarId("hxb-666");

        codeTransactionalTestService.transactionXMLTest(userInfo,carInfo);
    }
}