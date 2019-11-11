package test.mapper;

import java.util.List;
import test.pojo.PersonSon;

public interface PersonSonMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(PersonSon record);

    PersonSon selectByPrimaryKey(Integer id);

    List<PersonSon> selectAll();

    int updateByPrimaryKey(PersonSon record);
}