package test.service;

import test.pojo.CarInfo;
import test.pojo.UserInfo;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/28 16:22
 * @Description:
 **/
public interface CodeTransactionalTestService {
    void transactionCodeTest(UserInfo userInfo, CarInfo carInfo);

    void transactionXMLTest(UserInfo userInfo, CarInfo carInfo);
}
