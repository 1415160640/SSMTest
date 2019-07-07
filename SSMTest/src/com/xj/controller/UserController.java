package com.xj.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.xj.po.Cate;
import com.xj.po.QueryVo;
import com.xj.po.User;
import com.xj.po.Workday;
import com.xj.po.Worktime;
import com.xj.service.AllowanceService;
import com.xj.service.CateService;
import com.xj.service.UserService;
import com.xj.utils.Page;


@Controller
public class UserController {
	@Autowired
	private UserService userService;
	@Autowired
	private CateService cateService;
	@Autowired
	private AllowanceService allowanceService;
	//用户登入
	@RequestMapping(value="/teacherlogin", method=RequestMethod.POST)
	public String UserLogin(String username,String password,Model model, HttpSession session) throws Exception {
		User user = userService.findUser(username,password);
		if(user != null){
			session.setAttribute("Admin", user);
			return "redirect:/admin/index.jsp";
		}
		model.addAttribute("msg","登入失败请重新登入!");
		return "index";
	}
	//用户登入
	@RequestMapping(value="/adminOut")
	public String adminOut(String username,String password,Model model, HttpSession session) throws Exception{
		 //清除session
		  session.invalidate();
		  return "index";
	}
	//主页初始化
	@RequestMapping(value="/startHome")
	public String index(String username,String password,Model model, HttpSession session) throws Exception{
		  return "/admin/home";
	}
	//修改密码
	@RequestMapping(value="updatePass",method=RequestMethod.POST)
    public String updatePass(String password,Model model, HttpSession session) throws Exception {
		User user = (User) session.getAttribute("Admin");
		String url="/SSMTest/admin/index.jsp";
		if(user != null) {
			user.setPassword(password);
			int row = 0;
			row = userService.updateUser(user);
			if(row != 0) {
				session.invalidate();
			    return "redirect:/index.jsp";
			}else {
				model.addAttribute("msg", "修改密码失败。。。。。。。。<h3><a href='"+url+"'>返回主页</a></h3>");
				return "/admin/info";
			}
		}else {
			model.addAttribute("msg", "修改密码失败。。。。。。。。<h3><a href='"+url+"'>返回主页</a></h3>");
			return "/admin/info";
		}
	}
	 //分页查询职工
	 @RequestMapping(value="findUser")
  	 public String findUser(QueryVo vo,Model model) throws Exception {
		List<Cate> list = cateService.findAllCate();
		model.addAttribute("Cate", list);
		Page<User> page = userService.selectPageByQueryVo(vo);
		model.addAttribute("page", page);
		//条件回显
		model.addAttribute("NewCate",vo.getNewcate());
		model.addAttribute("NewName",vo.getNewname());
  		return "admin/user_list";	
  	}
	//编辑用户
	@RequestMapping(value = "editUser")
	public String edit(Integer id,Model model){
		List<Cate> list = cateService.findAllCate();
		model.addAttribute("Cate", list);
		User user=userService.selectCustomerById(id);
		model.addAttribute(user);
		return "admin/user_edit";	
	}
	//修改保存
	@RequestMapping(value = "updateUser")
	public @ResponseBody  String update(User user){
			int row = userService.updateCustomerById(user);
			if(row != 0) {
				return "OK";
			}
			return null;
	}
	//添加用户
	@RequestMapping(value = "addUserUI")
	public String addUserUI(Model model){
			List<Cate> list = cateService.findAllCate();
			model.addAttribute("Cate", list);
			return "admin/user_add";	
	}
	//添加保存
	@RequestMapping(value = "addUser")
	public @ResponseBody String addUser(User user){
				int row = userService.insertUser(user);
				User user2 = userService.findUser(user.getUsername(),user.getPassword());
				Workday workday = new Workday();
				workday.setId(user2.getId());
				workday.setUid(user2.getId());
				workday.setTotal(0.0);;
				int row1 = allowanceService.insertWorkday(workday);
				Worktime worktime = new Worktime();
				worktime.setId(user2.getId());
				worktime.setAid(user2.getId());
				worktime.setTotal(0.0);;
				int row2 = allowanceService.insertWorktime(worktime);
				if(row != 0 && row1 !=0 && row2 !=0 ) {
					return "OK";
				}
				return null;
	}
	//删除用户
	@RequestMapping(value = "deleteUser")
	public @ResponseBody String deleteUser(Integer id){
		//删除
		int row = userService.deleteUserById(id);
		int row1 = allowanceService.deleteWorkdayById(id);
		int row2 = allowanceService.deleteWorktimeById(id);
		if(row != 0 && row1 !=0 && row2 !=0 ) {
			return "OK";
		}
		return null;
   }
	//我的信息
	@RequestMapping(value = "myUser")
	public String MyUser(Integer id,Model model,HttpSession session){
		    User user = (User) session.getAttribute("Admin");
		    User user1=userService.selectCustomerById(user.getId());
			List<Cate> list = cateService.findAllCate();
			model.addAttribute("Cate", list);
			model.addAttribute(user1);
			return "admin/user_edit";	
	}
}
