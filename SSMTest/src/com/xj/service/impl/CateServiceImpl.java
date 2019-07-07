package com.xj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xj.dao.CateMapper;
import com.xj.po.Cate;
import com.xj.po.CateExample;
import com.xj.po.QueryVo;
import com.xj.po.User;
import com.xj.service.CateService;
import com.xj.utils.Page;
//岗位类别service层实现类
@Service
public class CateServiceImpl implements CateService {
	@Autowired
	private CateMapper cateMapper;
	@Override
	public List<Cate> findAllCate() {
		CateExample cc = new CateExample();
		return cateMapper.selectByExample(cc);
	}
	@Override
	public Page<Cate> selectPageByQueryVo(QueryVo vo) {
		Page<Cate> page = new Page<Cate>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewname() && !"".equals(vo.getNewname().trim())){
				vo.setNewname(vo.getNewname().trim());
			}
			//总条数
			page.setTotal(cateMapper.cateCountByQueryVo(vo));
			page.setRows(cateMapper.selectCateListByQueryVo(vo));
		}
		return page;
	}
	@Override
	public int insertCate(Cate cate) {
		return cateMapper.insertSelective(cate);
	}
	@Override
	public int deleteCateById(Integer id) {
		return cateMapper.deleteByPrimaryKey(id);
	}
	@Override
	public Cate selectCateById(Integer id) {
		return cateMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateCateById(Cate cate) {
		return cateMapper.updateByPrimaryKey(cate);
	}

}
