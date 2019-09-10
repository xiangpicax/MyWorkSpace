package com.cjlu.pojo;

import java.util.Date;

public class Airplane {
    private Integer id;

    private String airno;

    private Integer time;

    private Double price;

    private Integer takeid;

    private Integer seat;

    private Date flytime;

    private Integer landid;

    private Integer exist;

    private Integer uid;
    
    private Airport takePort;
    
    private Airport landPort;
    
    private Users user;
    
    

    public Users getUser() {
		return user;
	}

	public void setUser(Users user) {
		this.user = user;
	}



	@Override
	public String toString() {
		return "Airplane [id=" + id + ", airno=" + airno + ", time=" + time + ", price=" + price + ", takeid=" + takeid
				+ ", seat=" + seat + ", flytime=" + flytime + ", landid=" + landid + ", exist=" + exist + ", uid=" + uid
				+ ", takePort=" + takePort + ", landPort=" + landPort + ", user=" + user + "]";
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

    public String getAirno() {
        return airno;
    }

    public void setAirno(String airno) {
        this.airno = airno == null ? null : airno.trim();
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getTakeid() {
        return takeid;
    }

    public void setTakeid(Integer takeid) {
        this.takeid = takeid;
    }

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Date getFlytime() {
        return flytime;
    }

    public void setFlytime(Date flytime) {
        this.flytime = flytime;
    }

    public Integer getLandid() {
        return landid;
    }

    public void setLandid(Integer landid) {
        this.landid = landid;
    }

    public Integer getExist() {
        return exist;
    }

    public void setExist(Integer exist) {
        this.exist = exist;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}