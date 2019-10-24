package test.service;

import test.pojo.CarInfo;

import java.util.List;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 11:36
 * @Description:
 **/
public interface CarInfoService {
    int deleteByPrimaryKey(String carId);

    int insert(CarInfo record);

    CarInfo selectByPrimaryKey(String carId);

    List<CarInfo> selectAll();

    int updateByPrimaryKey(CarInfo record);
}
