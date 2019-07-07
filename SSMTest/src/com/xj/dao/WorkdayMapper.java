package com.xj.dao;

import com.xj.po.QueryVo;
import com.xj.po.Workday;
import com.xj.po.WorkdayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface WorkdayMapper {
    int countByExample(WorkdayExample example);

    int deleteByExample(WorkdayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Workday record);

    int insertSelective(Workday record);

    List<Workday> selectByExample(WorkdayExample example);

    Workday selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Workday record, @Param("example") WorkdayExample example);

    int updateByExample(@Param("record") Workday record, @Param("example") WorkdayExample example);

    int updateByPrimaryKeySelective(Workday record);

    int updateByPrimaryKey(Workday record);

	int WorkdayCountByQueryVo(QueryVo vo);

	List<Workday> selectWorkdayListByQueryVo(QueryVo vo);
}