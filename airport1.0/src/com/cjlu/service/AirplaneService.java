package com.cjlu.service;


import java.util.Date;
import java.util.List;

import com.cjlu.pojo.Airplane;

public interface AirplaneService {
	List<Airplane> sel(int takeid, int landid,Date flytime);
	
	List<Airplane> selall();
	
	int updsellTicket(int id,int uid);
	
	List<Airplane> selByuser();
	
	int updRollBack(int id);
}
