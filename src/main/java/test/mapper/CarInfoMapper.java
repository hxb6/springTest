package test.mapper;

import java.util.List;
import test.pojo.CarInfo;

public interface CarInfoMapper {
    int deleteByPrimaryKey(String carId);

    int insert(CarInfo record);

    CarInfo selectByPrimaryKey(String carId);

    List<CarInfo> selectAll();

    int updateByPrimaryKey(CarInfo record);
}