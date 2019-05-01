package com.boot.model;

import java.io.Serializable;

public class EmpAddress implements Serializable {
	
	private String city;
	private String state;
	private String presentAddress;
	private String adharNO;
	private String mobileNo;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPresentAddress() {
		return presentAddress;
	}
	public void setPresentAddress(String presentAddress) {
		this.presentAddress = presentAddress;
	}
	public String getAdharNO() {
		return adharNO;
	}
	public void setAdharNO(String adharNO) {
		this.adharNO = adharNO;
	}
	public String getMobileNo() {
		return mobileNo;
	}
	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	@Override
	public String toString() {
		return "EmpAddress [city=" + city + ", state=" + state + ", presentAddress=" + presentAddress + ", adharNO="
				+ adharNO + ", mobileNo=" + mobileNo + "]";
	}
	
	

}
