package com.proj.alpha.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(value="StoreDetails")
public class StoreDetails {

	@Id
	public String id;
	public String storeName;
	public String storePhone;
	public String status;
	public Address address;
	
	public StoreDetails(String id, String storeName, String storePhone, String status, Address address) {
		super();
		this.id = id;
		this.storeName = storeName;
		this.storePhone = storePhone;
		this.status = status;
		this.address = address;
	}

	public StoreDetails() {
		super();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStoreName() {
		return storeName;
	}

	public void setStoreName(String storeName) {
		this.storeName = storeName;
	}

	public String getStorePhone() {
		return storePhone;
	}

	public void setStorePhone(String storePhone) {
		this.storePhone = storePhone;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "StoreDetails [id=" + id + ", storeName=" + storeName + ", storePhone=" + storePhone + ", status="
				+ status + ", address=" + address + "]";
	}
	
	
}
