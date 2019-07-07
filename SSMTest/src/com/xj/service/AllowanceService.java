package com.xj.service;

import com.xj.po.Spring;
import com.xj.po.Workday;
import com.xj.po.Worktime;

import java.util.List;

import com.xj.po.Allowance;
import com.xj.po.Money;
import com.xj.po.QueryVo;
import com.xj.po.Salary;
import com.xj.utils.Page;
//津贴管理业务层接口
public interface AllowanceService {

	Page<Allowance> selectPageByQueryVo(QueryVo vo);

	int insertAllowance(Allowance allowance);

	Allowance selectAllowanceById(Integer id);

	int deleteAllowanceById(Integer id);

	int updateAllowanceById(Allowance allowance);

	Page<Spring> selectPageByQueryVo1(QueryVo vo);

	List<Allowance> findListAllowance();

	int insertSpring(Spring spring);

	int deleteSpringById(Integer id);

	Page<Worktime> selectPageByQueryVo2(QueryVo vo);

	Worktime selectWorktimeById(Integer id);

	int updateWorktimeById(Worktime w);

	Page<Workday> selectPageByQueryVo3(QueryVo vo);

	Workday selectWorkdayById(int a);

	int updateWorkday(Workday w);

	Page<Money> selectPageByQueryVo4(QueryVo vo);

	int insertWorkday(Workday workday);

	int insertWorktime(Worktime worktime);

	int deleteWorkdayById(Integer id);

	int deleteWorktimeById(Integer id);

	Page<Salary> selectPageByQueryVo5(QueryVo vo);

	int deleteOldMoneyById(Integer id);

	int addOldMoneyByUserId(int a);


}
