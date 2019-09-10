package com.cjlu.mapper;

import com.cjlu.pojo.Airtime;
import com.cjlu.pojo.AirtimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirtimeMapper {
    int countByExample(AirtimeExample example);

    int deleteByExample(AirtimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Airtime record);

    int insertSelective(Airtime record);

    List<Airtime> selectByExample(AirtimeExample example);

    Airtime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Airtime record, @Param("example") AirtimeExample example);

    int updateByExample(@Param("record") Airtime record, @Param("example") AirtimeExample example);

    int updateByPrimaryKeySelective(Airtime record);

    int updateByPrimaryKey(Airtime record);
}