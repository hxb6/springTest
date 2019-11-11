package test.mapper;

import java.util.List;
import test.pojo.Car;

public interface CarMapper {
    int deleteByPrimaryKey(String carId);

    int insert(Car record);

    Car selectByPrimaryKey(String carId);

    List<Car> selectAll();

    int updateByPrimaryKey(Car record);
}