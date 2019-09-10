package com.cjlu.controller;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjlu.pojo.Airplane;
import com.cjlu.pojo.Users;
import com.cjlu.service.AirplaneService;
import com.cjlu.unti.StringtoDate;

@Controller 
public class AirplaneController {
	@Resource
    private AirplaneService airplaneServiceImpl;
    @RequestMapping("show")
	public String showAirplane(HttpServletRequest req){
    	int takeid1 = 0;
		String takeidStr = req.getParameter("takeid");
		if (takeidStr != null && takeidStr != "") {
			takeid1 = Integer.parseInt(takeidStr);
		}
		int landid1 = 0;
		String landidStr = req.getParameter("landid");
		if (landidStr != null && landidStr != "") {
			landid1 = Integer.parseInt(landidStr);
		}
		Date date1 = new Date();
		Date flytime1 = date1;
		String flytime = req.getParameter("flytime");
		if (flytime != null && flytime != "") {
			String flytime2 = StringtoDate.change(flytime);
			System.out.println(flytime2);
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 try {
				flytime1 = sdf.parse(flytime2);
				System.out.println(flytime1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	List<Airplane> planes = airplaneServiceImpl.sel(takeid1, landid1,flytime1);
    
    	req.setAttribute("planes", planes);
		return "user/sell.jsp";
	}
    @RequestMapping("showAll")
    public String showAll(HttpServletRequest req){
    	List<Airplane> showall = airplaneServiceImpl.selall();
		req.setAttribute("allplanes",showall);
    	return "user/sell.jsp";
    	
    }
    @RequestMapping("sellTicket")
    public String sell(int id,HttpServletRequest req){
    	HttpSession session = req.getSession();
    	Users user = (Users) session.getAttribute("buyuser");
    	System.out.println(user);
    	int airplane = airplaneServiceImpl.updsellTicket(id, user.getId());
    	if(airplane==1){
    		return "user/success.jsp";
    	}
		return "port";
		
    }
    @RequestMapping("selByuser")
    public String selByuser(HttpServletRequest req){
    	List<Airplane> selByuser = airplaneServiceImpl.selByuser();
    	req.setAttribute("selByuser", selByuser);
		return "user/showBuyer.jsp";
    	
    }
    @RequestMapping("RB")
    public String rollback(int id,HttpServletRequest req){
    	int updRollBack = airplaneServiceImpl.updRollBack(id);
    	if(updRollBack==1){
    		return "selByuser";
    	}
		return "selByuser";
    	
    }
   
}
