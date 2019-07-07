package com.xj.dao;

import com.xj.po.QueryVo;
import com.xj.po.Spring;
import com.xj.po.SpringExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface SpringMapper {
    int countByExample(SpringExample example);

    int deleteByExample(SpringExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Spring record);

    int insertSelective(Spring record);

    List<Spring> selectByExample(SpringExample example);

    Spring selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Spring record, @Param("example") SpringExample example);

    int updateByExample(@Param("record") Spring record, @Param("example") SpringExample example);

    int updateByPrimaryKeySelective(Spring record);

    int updateByPrimaryKey(Spring record);

	int cateCountByQueryVo(QueryVo vo);

	List<Spring> selectSpringListByQueryVo(QueryVo vo);
}