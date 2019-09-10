package com.cjlu.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cjlu.pojo.Airtime;
import com.cjlu.service.AirtimeService;
import com.cjlu.unti.StringtoDate;

@Controller
public class AirtimeController {
	@Resource
    private AirtimeService airtimeServiceImpl;
    @RequestMapping("showFlytime")
	public String showFlytime(HttpServletRequest req){
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
        System.out.println(date1);
		Date fiytime1 = date1;
		String flytime = req.getParameter("flytime");
		System.out.println(flytime);
		
		if (flytime != null && flytime != "") {
			String flytime2 = StringtoDate.change(flytime);
			System.out.println(flytime2);
			 SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			 try {
				fiytime1 = sdf.parse(flytime2);
				System.out.println(fiytime1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	List<Airtime> selByTakeidAndLandidAndTime = airtimeServiceImpl.selByTakeidAndLandidAndTime(takeid1, landid1, fiytime1);
    
    	req.setAttribute("planeflytime", selByTakeidAndLandidAndTime);
		return "user/flytime.jsp";
		
	}
}
