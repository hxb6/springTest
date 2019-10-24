package test.service;

import test.pojo.UserInfo;

import java.util.List;

/**
 * @Package: test.service
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 15:58
 * @Description:
 **/
public interface UserInfoService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserInfo record);

    UserInfo selectByPrimaryKey(Integer id);

    List<UserInfo> selectAll();

    int updateByPrimaryKey(UserInfo record);
}
