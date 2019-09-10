package com.cjlu.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.cjlu.mapper.AirportMapper;
import com.cjlu.pojo.Airport;
import com.cjlu.pojo.AirportExample;
import com.cjlu.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService{
    @Resource
	private AirportMapper airportMapper;

	@Override
	public List<Airport> showTakeAndLandPort() {
			AirportExample example = new AirportExample();
			List<Airport> list = airportMapper.selectByExample(example);
			return list;
	}
	

	

}
