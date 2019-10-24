package test.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.pojo.UserInfo;
import test.service.BaseTest;
import test.service.UserInfoService;

import java.util.List;

import static org.junit.Assert.*;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 16:01
 * @Description:
 **/
public class UserInfoServiceImplTest extends BaseTest {

    @Autowired
    private UserInfoService userInfoService;

    @Test
    public void selectAll() {
        List<UserInfo> userInfos = userInfoService.selectAll();
        for (UserInfo userInfo : userInfos) {
            System.out.println(userInfo.toString());
        }
    }
}