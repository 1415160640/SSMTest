package com.xj.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.xj.dao.UserMapper;
import com.xj.po.User;
import com.xj.po.UserExample;
import com.xj.service.UserService;
import com.xj.utils.Page;
import com.xj.po.AllowanceExample;
import com.xj.po.QueryVo;
//用户service实现
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserMapper userMapper;
	@Override
	public User findUser(String username, String password) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		User user1 = userMapper.findUser(user);
		return user1;
	}
	@Override
	public int updateUser(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	@Override
	public Page<User> selectPageByQueryVo(QueryVo vo) {
		Page<User> page = new Page<User>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewcate() ){
				vo.setNewcate(vo.getNewcate());
			}
			if(null != vo.getNewname() && !"".equals(vo.getNewname().trim())){
				vo.setNewname(vo.getNewname().trim());
			}
			//总条数
			page.setTotal(userMapper.customerCountByQueryVo(vo));
			page.setRows(userMapper.selectCustomerListByQueryVo(vo));
		}
		return page;
	}
	@Override
	public User selectCustomerById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}
	@Override
	public int updateCustomerById(User user) {
		return userMapper.updateByPrimaryKey(user);
	}
	@Override
	public int insertUser(User user) {
		return userMapper.insertSelective(user);
	}
	@Override
	public int deleteUserById(Integer id) {
		return userMapper.deleteByPrimaryKey(id);
	}
	@Override
	public List<User> findListUser() {
		UserExample cc = new UserExample();
		return userMapper.selectByExample(cc);
	}

}
