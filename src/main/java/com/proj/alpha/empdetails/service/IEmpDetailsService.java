package com.proj.alpha.empdetails.service;

import java.util.List;
import java.util.Optional;

import com.proj.alpha.empdetails.model.EmpDetails;

public interface IEmpDetailsService {
	
	public List<EmpDetails> getAllEmpDetails();
	
	
	public Optional<EmpDetails> getEmpDetailsByID(String id);
	
	public EmpDetails updateEmpDetails(EmpDetails empDetails);
	
	
	public EmpDetails createEmpDetails(EmpDetails empDetails);
	
	public String deleteEmpDetails(String id);
	

}
