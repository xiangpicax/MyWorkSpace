package com.cjlu.service;

import java.util.Date;
import java.util.List;

import com.cjlu.pojo.Airtime;

public interface AirtimeService {
    List<Airtime> selByTakeidAndLandidAndTime(int takeid,int landid,Date flytime);
}
