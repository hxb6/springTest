package test.mapper;

import java.util.List;
import test.pojo.User1;

public interface User1Mapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User1 record);

    User1 selectByPrimaryKey(Integer id);

    List<User1> selectAll();

    int updateByPrimaryKey(User1 record);
}