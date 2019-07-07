package com.xj.dao;

import com.xj.po.Allowance;
import com.xj.po.AllowanceExample;
import com.xj.po.QueryVo;
import com.xj.po.Spring;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface AllowanceMapper {
    int countByExample(AllowanceExample example);

    int deleteByExample(AllowanceExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Allowance record);

    int insertSelective(Allowance record);

    List<Allowance> selectByExample(AllowanceExample example);

    Allowance selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Allowance record, @Param("example") AllowanceExample example);

    int updateByExample(@Param("record") Allowance record, @Param("example") AllowanceExample example);

    int updateByPrimaryKeySelective(Allowance record);

    int updateByPrimaryKey(Allowance record);

	int cateCountByQueryVo(QueryVo vo);

	List<Allowance> selectAllowanceListByQueryVo(QueryVo vo);

	List<Allowance> findListAllowance();
}