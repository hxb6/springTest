package test.mapper;

import java.util.List;
import test.pojo.CardInfo;

public interface CardInfoMapper {
    int deleteByPrimaryKey(String cardId);

    int insert(CardInfo record);

    CardInfo selectByPrimaryKey(String cardId);

    List<CardInfo> selectAll();

    int updateByPrimaryKey(CardInfo record);
}