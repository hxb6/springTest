package test.service;

import test.pojo.CarInfo;
import test.pojo.UserInfo;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 16:28
 * @Description:
 **/
public interface TransactionalServiceXML {

    void transactionTest(UserInfo userInfo,CarInfo carInfo);
}
