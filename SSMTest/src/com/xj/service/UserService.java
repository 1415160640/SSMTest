package com.xj.service;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.xj.po.QueryVo;
import com.xj.po.User;
import com.xj.utils.Page;


//用户service接口
@Repository
public interface UserService {

	User findUser(String username, String password) ;

	int updateUser(User user);

	Page<User> selectPageByQueryVo(QueryVo vo);

	User selectCustomerById(Integer id);

	int updateCustomerById(User user);

	int insertUser(User user);

	int deleteUserById(Integer id);

	List<User> findListUser();

}
