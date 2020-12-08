package com.proj.alpha.model;

import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="EmpLogin")
public class EmpLogin {
 
	@Id
	public String Id;
	public String empId;
	public String loginType;
	public Date loginTime;
	public String coordinates;
	
	public EmpLogin(String id, String empID, String loginType, Date loginTime, String coordinates) {
		super();
		Id = id;
		this.empId = empID;
		this.loginType = loginType;
		this.loginTime = loginTime;
		this.coordinates = coordinates;
	}
	
	
	
	public EmpLogin() {
		super();
		// TODO Auto-generated constructor stub
	}



	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getEmpID() {
		return empId;
	}
	public void setEmpID(String empID) {
		this.empId = empID;
	}
	public String getLoginType() {
		return loginType;
	}
	public void setLoginType(String loginType) {
		this.loginType = loginType;
	}
	public Date getLoginTime() {
		return loginTime;
	}
	public void setLoginTime(Date loginTime) {
		this.loginTime = loginTime;
	}
	public String getCoordinates() {
		return coordinates;
	}
	public void setCoordinates(String coordinates) {
		this.coordinates = coordinates;
	}


	@Override
	public String toString() {
		return "EmpLogin [Id=" + Id + ", empID=" + empId + ", loginType=" + loginType + ", loginTime=" + loginTime
				+ ", coordinates=" + coordinates + "]";
	}

	
	
	
}
