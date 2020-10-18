package com.proj.alpha.empdetails.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="EmpDetails")
public class EmpDetails {
	
	@Id
	public String id;
	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String empFirstName;
	public String empLastName;
	public String empPhone;
	public String status;
	public Date doj;
	public Address address;
	
	

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public EmpDetails() {
		super();
	}
	
	
	public EmpDetails(String id, String empFirstName, String empLastName, String empPhone, String status,
			Address address) {
		super();
		this.id = id;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empPhone = empPhone;
		this.status = status;
		this.address = address;
		this.doj = new Date();
	}

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public String getEmpPhone() {
		return empPhone;
	}
	public void setEmpPhone(String empPhone) {
		this.empPhone = empPhone;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "EmpDetails [id=" + id + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", empPhone="
				+ empPhone + ", status=" + status + ", doj=" + doj + ", address=" + address + "]";
	}
	
	

}
