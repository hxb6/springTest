package test.service;

import test.pojo.User2;


/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:00
 * @Description:
 **/
public interface User2Service {

    int insertOnRequired(User2 record);

    int insertOnRequiredAndException(User2 record);

    int insertOnRequires_New(User2 record);

    int insertOnRequires_NewAndException(User2 record);

    int insertOnNested(User2 record);

    int insertOnNestedAndException(User2 record);
}
