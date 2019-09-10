package com.cjlu.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

import com.cjlu.pojo.Airport;
import com.cjlu.service.AirportService;

@Controller
public class AirportController {
	 @Resource
     private AirportService airportServiceimpl;
	 @RequestMapping("port")
	 public String ShowTakeLand(HttpServletRequest req){
		 List<Airport> ports = airportServiceimpl.showTakeAndLandPort();
		 HttpSession session = req.getSession();
		 session.setAttribute("ports", ports);
		 return "/show";
	 }
	 @RequestMapping("port1")
	 public String ShowTakeLand1(HttpServletRequest req){
		 List<Airport> ports = airportServiceimpl.showTakeAndLandPort();
		 HttpSession session = req.getSession();
		 session.setAttribute("ports", ports);
		 return "/showFlytime";
	 }
}
