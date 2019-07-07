package com.xj.service.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xj.dao.AllowanceMapper;
import com.xj.dao.CateMapper;
import com.xj.dao.SalaryMapper;
import com.xj.dao.SpringMapper;
import com.xj.dao.UserMapper;
import com.xj.dao.WorkdayMapper;
import com.xj.dao.WorktimeMapper;
import com.xj.po.Allowance;
import com.xj.po.AllowanceExample;
import com.xj.po.Cate;
import com.xj.po.CateExample;
import com.xj.po.Money;
import com.xj.po.QueryVo;
import com.xj.po.Salary;
import com.xj.service.AllowanceService;
import com.xj.po.Spring;
import com.xj.po.SpringExample;
import com.xj.po.User;
import com.xj.po.Workday;
import com.xj.po.Worktime;
import com.xj.utils.Page;
//津贴管理业务层实现
@Service
public class AllowanceServiceImpl implements AllowanceService {
	@Autowired
	private AllowanceMapper allowanceMapper;
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private SpringMapper springMapper;
	@Autowired
	private WorkdayMapper workdayMapper;
	@Autowired
	private WorktimeMapper worktimeMapper;
	@Autowired
	private SalaryMapper salaryMapper;
	@Autowired
	private CateMapper cateMapper;

	@Override
	public Page<Allowance> selectPageByQueryVo(QueryVo vo) {
		Page<Allowance> page = new Page<Allowance>();
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
			page.setTotal(allowanceMapper.cateCountByQueryVo(vo));
			page.setRows(allowanceMapper.selectAllowanceListByQueryVo(vo));
		}
		return page;
	}

	@Override
	public int insertAllowance(Allowance allowance) {
		return allowanceMapper.insertSelective(allowance);
	}

	@Override
	public Allowance selectAllowanceById(Integer id) {
		return allowanceMapper.selectByPrimaryKey(id);
	}

	@Override
	public int deleteAllowanceById(Integer id) {
		return allowanceMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int updateAllowanceById(Allowance allowance) {
		return allowanceMapper.updateByPrimaryKey(allowance);
	}

	@Override
	public Page<Spring> selectPageByQueryVo1(QueryVo vo) {
		Page<Spring> page = new Page<Spring>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewuser() ){
				vo.setNewuser(vo.getNewuser());
			}
			if(null != vo.getNewallowance() ){
				vo.setNewallowance(vo.getNewallowance());
			}
			//总条数
			page.setTotal(springMapper.cateCountByQueryVo(vo));
			List<Spring> list=springMapper.selectSpringListByQueryVo(vo);
			for(Spring p:list) {
				p.setUser(userMapper.selectByPrimaryKey(p.getUid()));
				p.setAllowance(allowanceMapper.selectByPrimaryKey(p.getAid()));
			}
			page.setRows(list);
		}
		return page;
	}

	@Override
	public List<Allowance> findListAllowance() {
		AllowanceExample cc = new AllowanceExample();
		return allowanceMapper.selectByExample(cc);
	}

	@Override
	public int insertSpring(Spring spring) {
		return springMapper.insertSelective(spring);
	}

	@Override
	public int deleteSpringById(Integer id) {
		return springMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Page<Worktime> selectPageByQueryVo2(QueryVo vo) {
		Page<Worktime> page = new Page<Worktime>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewuser() ){
				vo.setNewuser(vo.getNewuser());
			}
			//总条数
			page.setTotal(worktimeMapper.WorktimeCountByQueryVo(vo));
			List<Worktime> list= worktimeMapper.selectWorktimeListByQueryVo(vo);
			for(Worktime p:list) {
				p.setUser(userMapper.selectByPrimaryKey(p.getAid()));
			}
			page.setRows(list);
		}
		return page;
	}

	@Override
	public Worktime selectWorktimeById(Integer id) {
		return worktimeMapper.selectByPrimaryKey(id);
	}

	@Override
	public int updateWorktimeById(Worktime w) {
		return worktimeMapper.updateByPrimaryKey(w);
	}

	
	
	@Override
	public Page<Workday> selectPageByQueryVo3(QueryVo vo) {
		Page<Workday> page = new Page<Workday>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewuser() ){
				vo.setNewuser(vo.getNewuser());
			}
			//总条数
			page.setTotal(workdayMapper.WorkdayCountByQueryVo(vo));
			List<Workday> list= workdayMapper.selectWorkdayListByQueryVo(vo);
			SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
			Date now = new Date(); 
			for(Workday p:list) {
				if(p.getToday()!= null) {
				    if(dateFormat.format(p.getToday()).equals(dateFormat.format(now))) {
					     p.setState(1);
				    }
				}
				p.setUser(userMapper.selectByPrimaryKey(p.getUid()));
			}
			page.setRows(list);
		}
		return page;
	}

	@Override
	public Workday selectWorkdayById(int a) {
		return workdayMapper.selectByPrimaryKey(a);
	}

	@Override
	public int updateWorkday(Workday w) {
		return workdayMapper.updateByPrimaryKey(w);
	}

	@Override
	public Page<Money> selectPageByQueryVo4(QueryVo vo) {
		Page<Money> page = new Page<Money>();
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
			List<Money> list= new ArrayList<Money>();
			page.setTotal(userMapper.customerCountByQueryVo(vo));
			List<User> list1= userMapper.selectCustomerListByQueryVo(vo);
			for(User p:list1) {                                                   
				Money m = new Money();
				m.setUser(p);
				Workday w = workdayMapper.selectByPrimaryKey(p.getId());
				m.setDay(w);
				Cate c =  cateMapper.selectByPrimaryKey(p.getState());
				m.setDaymoney(c.getSalary());
				Worktime ww = worktimeMapper.selectByPrimaryKey(p.getId());
				m.setWorktime(ww);
				m.setWorktimemoney(c.getWorktime());
				QueryVo v = new QueryVo();
				v.setNewuser(p.getId());                                    
				List<Spring> list2 = springMapper.selectSpringListByQueryVo(v);          
				double springmoney = 0;
				for(Spring k:list2){
					k.setAllowance(allowanceMapper.selectByPrimaryKey(k.getAid()));
					springmoney+=k.getAllowance().getMoney();
				}
				m.setSpring1(list2);
				m.setSpringmoney(springmoney);
				m.setYingfa(m.getDay().getTotal()*m.getDaymoney()+m.getWorktime().getTotal()*m.getWorktimemoney());
				if(m.getSpringmoney()>0) {
				    m.setShifa(m.getYingfa()+m.getSpringmoney());
				}else {
					m.setShifa(m.getYingfa()-m.getSpringmoney());
				}
				list.add(m);
			}
			page.setRows(list);
		}
		return page;
	}

	@Override
	public int insertWorkday(Workday workday) {
		return workdayMapper.insert(workday);
	}

	@Override
	public int insertWorktime(Worktime worktime) {
		return worktimeMapper.insert(worktime);
	}

	@Override
	public int deleteWorkdayById(Integer id) {
		return workdayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int deleteWorktimeById(Integer id) {
		return workdayMapper.deleteByPrimaryKey(id);
	}

	@Override
	public Page<Salary> selectPageByQueryVo5(QueryVo vo) {
		Page<Salary> page = new Page<Salary>();
		//每页数
		page.setSize(5);
		vo.setSize(5);
		if (null != vo) {
			// 判断当前页
			if (null != vo.getPage()) {
				page.setPage(vo.getPage());
				vo.setStartRow((vo.getPage() -1)*vo.getSize());
			}
			if(null != vo.getNewuser() ){
				vo.setNewuser(vo.getNewuser());
			}
			if(null != vo.getNewuser() ){
				vo.setNewyear(vo.getNewyear());
			}
			if(null != vo.getNewuser() ){
				vo.setNewmonth(vo.getNewmonth());
			}
			//总条数
			page.setTotal(salaryMapper.SalaryCountByQueryVo(vo));
			List<Salary> list= salaryMapper.selectSalaryListByQueryVo(vo);
			for(Salary p:list) {
				p.setUser(userMapper.selectByPrimaryKey(p.getUid()));
			}
			page.setRows(list);
		}
		return page;
	}

	@Override
	public int deleteOldMoneyById(Integer id) {
		return salaryMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int addOldMoneyByUserId(int a) {
		Salary salary = new Salary();
		User user = userMapper.selectByPrimaryKey(a);
		Workday w = workdayMapper.selectByPrimaryKey(user.getId());
		Cate c =  cateMapper.selectByPrimaryKey(user.getState());
		Worktime ww = worktimeMapper.selectByPrimaryKey(user.getId());
		QueryVo v = new QueryVo();
		v.setNewuser(user.getId());                                    
		List<Spring> list2 = springMapper.selectSpringListByQueryVo(v);          
		double springmoney = 0;
		for(Spring k:list2){
			k.setAllowance(allowanceMapper.selectByPrimaryKey(k.getAid()));
			springmoney+=k.getAllowance().getMoney();
		}
		
		salary.setUid(user.getId());
		salary.setDate(new Date());
		salary.setDay(w.getTotal());
		salary.setDaymoney(c.getSalary());
		salary.setWorktime(ww.getTotal());
		salary.setWorktimemoney(c.getWorktime());
		salary.setYingfa(salary.getDay()*salary.getDaymoney()+salary.getWorktime()*salary.getWorktimemoney());
		salary.setSpring(list2.size());
		salary.setSpringmoney(springmoney);
		if(salary.getSpringmoney()>0) {
			salary.setShifa(salary.getYingfa()+salary.getSpringmoney());
		}else {
			salary.setShifa(salary.getYingfa()-salary.getSpringmoney());
		}
		
		w.setTotal(0.0);
		workdayMapper.updateByPrimaryKeySelective(w);
		ww.setTotal(0.0);
		worktimeMapper.updateByPrimaryKeySelective(ww);
		SpringExample example = new SpringExample();
		example.createCriteria().andUidEqualTo(user.getId());
		springMapper.deleteByExample(example);
		
		
		
		return salaryMapper.insertSelective(salary);
	}
}
