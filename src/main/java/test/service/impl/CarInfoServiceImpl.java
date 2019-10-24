package test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.mapper.CarInfoMapper;
import test.pojo.CarInfo;
import test.service.CarInfoService;

import java.util.List;

/**
 * @Package: test.service.impl
 * @Author: HeXiaoBo
 * @CreateDate: 2019/10/24 11:37
 * @Description:
 **/
@Service
public class CarInfoServiceImpl implements CarInfoService {

    @Autowired
    private CarInfoMapper carInfoMapper;

    @Override
    public int deleteByPrimaryKey(String carId) {
        return carInfoMapper.deleteByPrimaryKey(carId);
    }

    @Override
    public int insert(CarInfo record) {
        return carInfoMapper.insert(record);
    }

    @Override
    public CarInfo selectByPrimaryKey(String carId) {
        return carInfoMapper.selectByPrimaryKey(carId);
    }

    @Override
    public List<CarInfo> selectAll() {
        return carInfoMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(CarInfo record) {
        return carInfoMapper.updateByPrimaryKey(record);
    }
}
