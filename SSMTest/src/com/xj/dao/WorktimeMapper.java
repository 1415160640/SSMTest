package com.xj.dao;

import com.xj.po.QueryVo;
import com.xj.po.Worktime;
import com.xj.po.WorktimeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorktimeMapper {
    int countByExample(WorktimeExample example);

    int deleteByExample(WorktimeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Worktime record);

    int insertSelective(Worktime record);

    List<Worktime> selectByExample(WorktimeExample example);

    Worktime selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByExample(@Param("record") Worktime record, @Param("example") WorktimeExample example);

    int updateByPrimaryKeySelective(Worktime record);

    int updateByPrimaryKey(Worktime record);

	int WorktimeCountByQueryVo(QueryVo vo);

	List<Worktime> selectWorktimeListByQueryVo(QueryVo vo);
}