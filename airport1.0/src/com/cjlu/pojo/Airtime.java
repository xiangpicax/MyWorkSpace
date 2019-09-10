package com.cjlu.pojo;

import java.util.Date;

public class Airtime {
    private Integer id;

    private Integer takeid;

    private Integer landid;

    private Date flytime;
    
    private Airport takePort;
    
    private Airport landPort;
    
    

    @Override
	public String toString() {
		return "Airtime [id=" + id + ", takeid=" + takeid + ", landid=" + landid + ", flytime=" + flytime
				+ ", takePort=" + takePort + ", landPort=" + landPort + "]";
	}

	public Airport getTakePort() {
		return takePort;
	}

	public void setTakePort(Airport takePort) {
		this.takePort = takePort;
	}

	public Airport getLandPort() {
		return landPort;
	}

	public void setLandPort(Airport landPort) {
		this.landPort = landPort;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTakeid() {
        return takeid;
    }

    public void setTakeid(Integer takeid) {
        this.takeid = takeid;
    }

    public Integer getLandid() {
        return landid;
    }

    public void setLandid(Integer landid) {
        this.landid = landid;
    }

    public Date getFlytime() {
        return flytime;
    }

    public void setFlytime(Date flytime) {
        this.flytime = flytime;
    }
}