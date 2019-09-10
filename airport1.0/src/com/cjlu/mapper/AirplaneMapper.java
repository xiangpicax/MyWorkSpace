package com.cjlu.mapper;

import com.cjlu.pojo.Airplane;
import com.cjlu.pojo.AirplaneExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AirplaneMapper {
    int countByExample(AirplaneExample example);

    int deleteByExample(AirplaneExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Airplane record);

    int insertSelective(Airplane record);

    List<Airplane> selectByExample(AirplaneExample example);

    Airplane selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByExample(@Param("record") Airplane record, @Param("example") AirplaneExample example);

    int updateByPrimaryKeySelective(Airplane record);

    int updateByPrimaryKey(Airplane record);
}