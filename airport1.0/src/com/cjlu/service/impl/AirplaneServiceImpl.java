package com.cjlu.service.impl;


import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;


import com.cjlu.mapper.AirplaneMapper;
import com.cjlu.mapper.AirportMapper;
import com.cjlu.mapper.UsersMapper;
import com.cjlu.pojo.Airplane;
import com.cjlu.pojo.AirplaneExample;
import com.cjlu.pojo.Airport;
import com.cjlu.pojo.Users;
import com.cjlu.service.AirplaneService;

@Service
public class AirplaneServiceImpl implements AirplaneService{
    @Resource
	private AirplaneMapper airplaneMapper;
    @Resource
    private AirportMapper airportMapper;
    @Resource
    private UsersMapper usersMapper;
	@Override
	public List<Airplane> sel(int takeid, int landid,Date flytime) {
		AirplaneExample example = new AirplaneExample();
		example.createCriteria().andTakeidEqualTo(takeid).andLandidEqualTo(landid).andFlytimeEqualTo(flytime);
		List<Airplane> list = airplaneMapper.selectByExample(example);
		
		for (Airplane airplane : list) {
			Integer id1 = airplane.getTakeid();
			Integer id2 = airplane.getLandid();
			Airport port1 = airportMapper.selectByPrimaryKey(id1);
			Airport port2 = airportMapper.selectByPrimaryKey(id2);
			airplane.setTakePort(port1);
			airplane.setLandPort(port2);
		}
		return list;
	}
	@Override
	public List<Airplane> selall() {
		AirplaneExample example = new AirplaneExample();
		List<Airplane> list = airplaneMapper.selectByExample(example);
		for (Airplane airplane : list) {
			Integer id1 = airplane.getTakeid();
			Integer id2 = airplane.getLandid();
			Airport port1 = airportMapper.selectByPrimaryKey(id1);
			Airport port2 = airportMapper.selectByPrimaryKey(id2);
			airplane.setTakePort(port1);
			airplane.setLandPort(port2);
		}
		return list;
	}
	@Override
	public int updsellTicket(int id,int uid) {
		Airplane  sell= airplaneMapper.selectByPrimaryKey(id);
		sell.setUid(uid);
		sell.setExist(0);
		AirplaneExample example = new AirplaneExample();
		example.createCriteria().andIdEqualTo(id);
		int updateByExample = airplaneMapper.updateByExample(sell, example);
		return updateByExample;
	}
	@Override
	public List<Airplane> selByuser() {
		AirplaneExample example = new AirplaneExample();
		example.createCriteria().andExistEqualTo(0);
		List<Airplane> list = airplaneMapper.selectByExample(example);
		for (Airplane airplane : list) {
			Integer uid = airplane.getUid();
			Integer id1 = airplane.getTakeid();
			Integer id2 = airplane.getLandid();
			Users user = usersMapper.selectByPrimaryKey(uid);
			Airport port1 = airportMapper.selectByPrimaryKey(id1);
			Airport port2 = airportMapper.selectByPrimaryKey(id2);
			airplane.setUser(user);
			airplane.setTakePort(port1);
			airplane.setLandPort(port2);
		}
		System.out.println(list);
		return list;
	}
	@Override
	public int updRollBack(int id) {
		Airplane  rollBack= airplaneMapper.selectByPrimaryKey(id);
		rollBack.setUid(null);
		rollBack.setExist(1);
		AirplaneExample example = new AirplaneExample();
		example.createCriteria().andIdEqualTo(id);
		int updRollBack = airplaneMapper.updateByExample(rollBack, example);
		return updRollBack;
	}
	
	
}
