package test.service;

import test.pojo.User2;

import java.util.List;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:00
 * @Description:
 **/
public interface User2Service {

    int insertOnRequired(User2 record);

    int insertOnRequiredAndException(User2 record);
}
