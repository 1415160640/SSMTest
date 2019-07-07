package com.xj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xj.po.Cate;
import com.xj.po.QueryVo;
import com.xj.po.User;
import com.xj.service.CateService;
import com.xj.utils.Page;

@Controller
public class CateController {
	@Autowired
	private CateService cateService;
	 //分页查询岗位
	 @RequestMapping(value="findCate")
 	 public String findCate(QueryVo vo,Model model) throws Exception {
		Page<Cate> page = cateService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		//条件回显
		model.addAttribute("NewName",vo.getNewname());
 		return "admin/cate_list";	
 	}
	//添加岗位
	@RequestMapping(value = "addCateUI")
	public String addCateUI(Model model){
			return "admin/cate_add";	
	}
	//修改添加
	@RequestMapping(value = "addCate")
	public @ResponseBody String addCate(Cate cate){
		int row = cateService.insertCate(cate);
		if(row != 0) {
			 return "OK";
		}
		return null;
	}
	//删除分类
	@RequestMapping(value = "deleteCate")
	public @ResponseBody String deleteCate(Integer id){
		//删除
		int row = cateService.deleteCateById(id);
		if(row != 0) {
				return "OK";
		}
		return null;
	 }
	//编辑用户
	@RequestMapping(value = "editCateUI")
	public String edit(Integer id,Model model){
			Cate cate=cateService.selectCateById(id);
			model.addAttribute(cate);
			return "admin/cate_edit";	
	}
	//修改保存
	@RequestMapping(value = "updateCate")
	public @ResponseBody  String update(Cate cate){
				int row = cateService.updateCateById(cate);
				if(row != 0) {
					return "OK";
				}
				return null;
	}

}
