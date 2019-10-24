package test.service.impl;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import test.pojo.CarInfo;
import test.service.BaseTest;
import test.service.CarInfoService;

import java.util.List;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 13:39
 * @Description:
 **/
public class CarInfoServiceImplTest extends BaseTest {

    @Autowired
    private CarInfoService carInfoService;

    @Test
    public void selectAll(){
        List<CarInfo> carInfos = carInfoService.selectAll();
        for (CarInfo carInfo : carInfos) {
            System.out.println(carInfo.toString());
        }
    }
}