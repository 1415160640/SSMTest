package com.xj.service;

import java.util.List;

import com.xj.po.Cate;
import com.xj.po.QueryVo;
import com.xj.po.User;
import com.xj.utils.Page;

//岗位类别接口
public interface CateService {

	List<Cate> findAllCate();

	Page<Cate> selectPageByQueryVo(QueryVo vo);

	int insertCate(Cate cate);

	int deleteCateById(Integer id);

	Cate selectCateById(Integer id);

	int updateCateById(Cate cate);

}
