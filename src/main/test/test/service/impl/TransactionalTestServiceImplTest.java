package test.service.impl;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import test.service.BaseTest;
import test.service.TransactionalTestService;

import static org.junit.Assert.*;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/25 16:40
 * @Description:
 **/
public class TransactionalTestServiceImplTest extends BaseTest {

    @Autowired
    private TransactionalTestService transactionalTestService;

    @Test
    public void transactional_propagation_test() {
        transactionalTestService.transactional_propagation_test();
    }
}