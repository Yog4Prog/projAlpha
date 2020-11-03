package com.proj.alpha.empdetails.model;


import java.util.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.proj.alpha.shared.model.Address;

@Document(value="EmpDetails")
public class EmpDetails {
	
	@Id
	private String id;
	private String empFirstName;
	private String empLastName;
	private String empPhone;
	private String status;
	private Date doj;
	@Indexed(unique = true)
	private String loginId;
	private String password;
	private Address address;
	private String storeId;
	private String permissionLevel;

	public EmpDetails() {
		super();
	}

	public EmpDetails(String id, String empFirstName, String empLastName, String empPhone, String status, Date doj, String loginId, String password, Address address, String storeId, String permissionLevel) {
		this.id = id;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empPhone = empPhone;
		this.status = status;
		this.doj = doj;
		this.loginId = loginId;
		this.password = password;
		this.address = address;
		this.storeId = storeId;
		this.permissionLevel = permissionLevel;
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

	public Date getDoj() {
		return doj;
	}

	public void setDoj(Date doj) {
		this.doj = doj;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public String getStoreId() {
		return storeId;
	}

	public void setStoreId(String storeId) {
		this.storeId = storeId;
	}

	public String getPermissionLevel() {
		return permissionLevel;
	}

	public void setPermissionLevel(String permissionLevel) {
		this.permissionLevel = permissionLevel;
	}

	@Override
	public String toString() {
		return "EmpDetails{" +
				"id='" + id + '\'' +
				", empFirstName='" + empFirstName + '\'' +
				", empLastName='" + empLastName + '\'' +
				", empPhone='" + empPhone + '\'' +
				", status='" + status + '\'' +
				", doj=" + doj +
				", loginId='" + loginId + '\'' +
				", password='" + password + '\'' +
				", address=" + address +
				", storeId='" + storeId + '\'' +
				", permissionLevel='" + permissionLevel + '\'' +
				'}';
	}


}
