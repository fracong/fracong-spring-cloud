package com.fracong.shardingjdbc.test.dao;

import com.fracong.shardingjdbc.test.entity.TestFracong;
import com.fracong.shardingjdbc.test.entity.TestFracongExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TestFracongMapper {
    int countByExample(TestFracongExample example);

    int deleteByExample(TestFracongExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TestFracong record);

    int insertSelective(TestFracong record);

    List<TestFracong> selectByExample(TestFracongExample example);

    TestFracong selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TestFracong record, @Param("example") TestFracongExample example);

    int updateByExample(@Param("record") TestFracong record, @Param("example") TestFracongExample example);

    int updateByPrimaryKeySelective(TestFracong record);

    int updateByPrimaryKey(TestFracong record);
}