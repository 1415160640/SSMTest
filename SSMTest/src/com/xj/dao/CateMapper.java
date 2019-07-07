package com.xj.dao;

import com.xj.po.Cate;
import com.xj.po.CateExample;
import com.xj.po.QueryVo;
import com.xj.po.User;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
@Repository
public interface CateMapper {
    int countByExample(CateExample example);

    int deleteByExample(CateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Cate record);

    int insertSelective(Cate record);

    List<Cate> selectByExample(CateExample example);

    Cate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByExample(@Param("record") Cate record, @Param("example") CateExample example);

    int updateByPrimaryKeySelective(Cate record);
    
    int updateByPrimaryKey(Cate record);

	int cateCountByQueryVo(QueryVo vo);

	List<Cate> selectCateListByQueryVo(QueryVo vo);

}