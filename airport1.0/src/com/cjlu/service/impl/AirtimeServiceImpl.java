package com.cjlu.service.impl;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cjlu.mapper.AirportMapper;
import com.cjlu.mapper.AirtimeMapper;

import com.cjlu.pojo.Airport;
import com.cjlu.pojo.Airtime;
import com.cjlu.pojo.AirtimeExample;
import com.cjlu.service.AirtimeService;

@Service
public class AirtimeServiceImpl implements AirtimeService{
	@Resource
    private AirtimeMapper airtimeMapper;
	@Resource
    private AirportMapper airportMapper;

	@Override
	public List<Airtime> selByTakeidAndLandidAndTime(int takeid, int landid, Date flytime) {
		AirtimeExample example = new AirtimeExample();
		example.createCriteria().andTakeidEqualTo(takeid).andLandidEqualTo(landid).andFlytimeEqualTo(flytime);
		List<Airtime> list = airtimeMapper.selectByExample(example);
		for (Airtime airtime : list) {
			Integer id1 = airtime.getTakeid();
			Integer id2 = airtime.getLandid();
			Airport port1 = airportMapper.selectByPrimaryKey(id1);
			Airport port2 = airportMapper.selectByPrimaryKey(id2);
			airtime.setTakePort(port1);
			airtime.setLandPort(port2);
		}
		return list;
	}
	
}
