package com.cjlu.pojo;

public class Airport {
    private Integer id;

    private String portname;

    private String cityname;
    

    @Override
	public String toString() {
		return "Airport [id=" + id + ", portname=" + portname + ", cityname=" + cityname + "]";
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPortname() {
        return portname;
    }

    public void setPortname(String portname) {
        this.portname = portname == null ? null : portname.trim();
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname == null ? null : cityname.trim();
    }
}