package test.service.impl;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.mapper.UserInfoMapper;
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
        SqlSession sqlSession = sqlSessionFactory.openSession();
        UserInfoMapper mapper = sqlSession.getMapper(UserInfoMapper.class);
        UserInfo userInfo1 = mapper.selectByPrimaryKey(22);

        UserInfo userInfo2 = mapper.selectByPrimaryKey(22);

        System.out.println(userInfo1 == userInfo2);
        sqlSession.close();
    }

    @Test
    public void select(){
        userInfoService.selectByPrimaryKey(22);
        userInfoService.selectByPrimaryKey(22);
    }
}