package com.domain.entity;

import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Hotel {
	@Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    private String hotelname;
    private String location;
    private int charge;
	public Hotel() {

	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getHotelname() {
		return hotelname;
	}
	public void setHotelname(String hotelname) {
		this.hotelname = hotelname;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getCharge() {
		return charge;
	}
	public void setCharge(int charge) {
		this.charge = charge;
	}
	@Override
	public String toString() {
		return "Hotel [id=" + id + ", hotelname=" + hotelname + ", location=" + location + ", charge=" + charge + "]";
	}
	public Hotel(Long id, String hotelname, String location, int charge) {
		super();
		this.id = id;
		this.hotelname = hotelname;
		this.location = location;
		this.charge = charge;
	}
	
}