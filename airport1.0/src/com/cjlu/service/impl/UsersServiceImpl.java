package com.cjlu.service.impl;




import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cjlu.date.DateStringToInt;
import com.cjlu.date.LocalDate;
import com.cjlu.mapper.UsersMapper;
import com.cjlu.pojo.Users;
import com.cjlu.pojo.UsersExample;
import com.cjlu.service.UsersService;

@Service
public class UsersServiceImpl implements UsersService{
	@Resource
    private UsersMapper usersMapper;
	@Override
	public Users login(Users users) {
		LocalDate date1 = new LocalDate();
		LocalDate date2 = new LocalDate();
		DateStringToInt dsti = new DateStringToInt();
		
		UsersExample example = new UsersExample();
		String username = users.getUsername();
		String password = users.getPassword();
		example.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
		String shoutime1 = date1.shoutime();
		
		List<Users> list = usersMapper.selectByExample(example);
		String shoutime2 = date2.shoutime();
		
		long dsti2 = dsti.DSTI(shoutime1, shoutime2);
		System.out.println("登入时间性能时间为："+dsti2+"毫秒");
		Users user = new Users();
		for (Users users2 : list) {
			user=users2;
		}
		return user;
	}

}
