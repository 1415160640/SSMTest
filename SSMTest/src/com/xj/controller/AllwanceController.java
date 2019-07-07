package com.xj.controller;

import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.xj.po.Allowance;
import com.xj.po.Cate;
import com.xj.po.Money;
import com.xj.po.User;
import com.xj.po.Workday;
import com.xj.po.Worktime;
import com.xj.po.QueryVo;
import com.xj.po.Salary;
import com.xj.service.AllowanceService;
import com.xj.service.UserService;
import com.xj.utils.Page;
import com.xj.po.Spring;

//津贴控制类
@Controller
public class AllwanceController {
	@Autowired
	private AllowanceService allowanceService;
	@Autowired
	private UserService userService;
	 //分页查询
	 @RequestMapping(value="findAllowance")
	 public String findAllowance(QueryVo vo,Model model) throws Exception {
		Page<Allowance> page = allowanceService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		//条件回显
		model.addAttribute("NewName",vo.getNewname());
		return "admin/allowance_list";	
	}
	//添加
	@RequestMapping(value = "addAllowanceUI")
	public String addAllowanceUI(Model model){
			return "admin/allowance_add";	
	}
	//添加保存
	@RequestMapping(value = "addAllowance")
	public @ResponseBody String addCate(Allowance allowance){
		int row = allowanceService.insertAllowance(allowance);
		if(row != 0) {
			 return "OK";
		}
		return null;
	}
	//删除
	@RequestMapping(value = "deleteAllowance")
	public @ResponseBody String deleteCate(Integer id){
		//删除
		int row = allowanceService.deleteAllowanceById(id);
		if(row != 0) {
				return "OK";
		}
		return null;
	 }
	//编辑
	@RequestMapping(value = "editAllowanceUI")
	public String edit(Integer id,Model model){
		    Allowance allowance= allowanceService.selectAllowanceById(id);
			model.addAttribute(allowance);
			return "admin/allowance_edit";	
	}
	//修改保存
	@RequestMapping(value = "updateAllowance")
	public @ResponseBody  String update(Allowance allowance){
				int row = allowanceService.updateAllowanceById(allowance);
				if(row != 0) {
					return "OK";
				}
				return null;
	}
	
	//分页查询
    @RequestMapping(value="findSpring")
	public String findSpring(QueryVo vo,Model model) throws Exception {
    	    List<User> list1 = userService.findListUser();
    	    List<Allowance> list2 = allowanceService.findListAllowance();
    	    model.addAttribute("Users", list1);
    	    model.addAttribute("Allowances", list2);
			Page<Spring> page = allowanceService.selectPageByQueryVo1(vo);
			model.addAttribute("page", page);
			//条件回显
			model.addAttribute("NewUser",vo.getNewuser());
			model.addAttribute("NewAllowance",vo.getNewallowance());
			return "admin/spring_list";	
	}
   //添加
  	@RequestMapping(value = "addSpringUI")
  	public String addSpringUI(Model model){
  		   List<User> list1 = userService.findListUser();
 	       List<Allowance> list2 = allowanceService.findListAllowance();
 	       model.addAttribute("Users", list1);
 	       model.addAttribute("Allowances", list2);
  		   return "admin/spring_add";	
  	}
  	//添加保存
  	@RequestMapping(value = "addSpring")
  	public @ResponseBody String addSpring(Spring spring){
  		int row = allowanceService.insertSpring(spring);
  		if(row != 0) {
  			 return "OK";
  		}
  		return null;
  	}
    //删除
  	@RequestMapping(value = "deleteSpring")
  	public @ResponseBody String deleteSpring(Integer id){
  		//删除
  		int row = allowanceService.deleteSpringById(id);
  		if(row != 0) {
  				return "OK";
  		}
  		return null;
  	 }
  	
    //分页查询
    @RequestMapping(value="findWorktime")
	public String findWorktime(QueryVo vo,Model model) throws Exception {
    	    List<User> list1 = userService.findListUser();
    	    model.addAttribute("Users", list1);
			Page<Worktime> page = allowanceService.selectPageByQueryVo2(vo);
			model.addAttribute("page", page);
			//条件回显
			model.addAttribute("NewUser",vo.getNewuser());
			return "admin/worktime_list";	
	}
    //添加
  	@RequestMapping(value = "addWorktime")
  	public @ResponseBody String addWorktime(String id,String num){
     	if(null != num && !"".equals(num.trim())){
	    	num = num.trim();
	    }
  	    int a = Integer.parseInt(id);
 	    double b = Double.valueOf(num);
  		Worktime w = allowanceService.selectWorktimeById(a);
  		w.setTotal(w.getTotal()+b);
  		int row = allowanceService.updateWorktimeById(w);
  		if(row != 0) {
  				return "OK";
  		}
  		return null;
  	 }
  	
    //分页查询
    @RequestMapping(value="findWorkday")
	public String findWorkday(QueryVo vo,Model model) throws Exception {
    	    List<User> list1 = userService.findListUser();
    	    model.addAttribute("Users", list1);
			Page<Workday> page = allowanceService.selectPageByQueryVo3(vo);
			model.addAttribute("page", page);
			//条件回显
			model.addAttribute("NewUser",vo.getNewuser());
			return "admin/workday_list";	
	}
    //添加
  	@RequestMapping(value = "addWorkday")
  	public @ResponseBody String addWorkday(String id){
  	    int a = Integer.parseInt(id);
  		Workday w = allowanceService.selectWorkdayById(a);
  		w.setTotal(w.getTotal()+1);
  		w.setToday(new Date());
  		int row = allowanceService.updateWorkday(w);
  		if(row != 0) {
  				return "OK";
  		}
  		return null;
  	 }
  	
    //分页查询
    @RequestMapping(value="findMoney")
	public String findMoney(QueryVo vo,Model model) throws Exception {
    	    List<User> list1 = userService.findListUser();
    	    model.addAttribute("Users", list1);
			Page<Money> page = allowanceService.selectPageByQueryVo4(vo);
			model.addAttribute("page", page);
			//条件回显
			model.addAttribute("NewName",vo.getNewname());
			return "admin/money_list";	
	}
    //添加
  	@RequestMapping(value = "addOldMoney")
  	public String addOldMoney(String id){
  	    int a = Integer.parseInt(id);
  		int w = allowanceService.addOldMoneyByUserId(a);
  		if(w != 0) {
  				return "OK";
  		}
  		return null;
  	 }
    //分页查询
    @RequestMapping(value="findOldMoney")
	public String findOldMoney(QueryVo vo,Model model) throws Exception {
    	    List<User> list1 = userService.findListUser();
    	    model.addAttribute("Users", list1);
			Page<Salary> page = allowanceService.selectPageByQueryVo5(vo);
			model.addAttribute("page", page);
			//条件回显
			model.addAttribute("NewUser",vo.getNewuser());
			model.addAttribute("NewYear",vo.getNewyear());
			model.addAttribute("NewMonth",vo.getNewmonth());
			return "admin/oldmoney_list";	
	}
    //删除
  	@RequestMapping(value = "deleteOldMoney")
  	public @ResponseBody String deleteOldMoney(Integer id){
  		//删除
  		int row = allowanceService.deleteOldMoneyById(id);
  		if(row != 0) {
  				return "OK";
  		}
  		return null;
  	 }


}
