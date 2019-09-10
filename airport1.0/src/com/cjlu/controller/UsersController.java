package com.cjlu.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cjlu.pojo.Users;
import com.cjlu.service.UsersService;

@Controller
public class UsersController {
	@Resource
    private UsersService usersServiceImpl;
    @RequestMapping("login")
    @ResponseBody
	public String login(Users users,HttpServletRequest req){
    
        
    	Users user = usersServiceImpl.login(users);
    	
    	if(user.getId()!=null){
    		System.out.println(user+"登入成功");
    		HttpSession session = req.getSession();
    		session.setAttribute("buyuser",user);
    		return "1";
    	}else{
    		return "0";
    	}
	
		
	}


}
