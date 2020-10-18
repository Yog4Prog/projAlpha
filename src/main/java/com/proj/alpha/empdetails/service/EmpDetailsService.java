package com.proj.alpha.empdetails.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.alpha.empdetails.data.EmpDetailsRepository;
import com.proj.alpha.empdetails.model.EmpDetails;

@Service
public class EmpDetailsService implements IEmpDetailsService {
	
	@Autowired
	EmpDetailsRepository empDetailsRepo;
	
	public List<EmpDetails> getAllEmpDetails()
	{
		return empDetailsRepo.findAll();
	}
	
	public Optional<EmpDetails> getEmpDetailsByID(String id)
	{
		return empDetailsRepo.findById(id);
	}
	
	public EmpDetails updateEmpDetails(EmpDetails empDetails)
	{
		
		return empDetailsRepo.save(empDetails);
	}
	
	public EmpDetails createEmpDetails(EmpDetails empDetails)
	{
		 return	empDetailsRepo.insert(empDetails);
	}
	
	public String deleteEmpDetails(String id)
	{
		Optional<EmpDetails> empDetails = empDetailsRepo.findById(id);
		if(empDetails.isPresent())
		{
			empDetailsRepo.delete(empDetails.get());
			return "Emp Details deleted";
		}
		return "Emp Details not found!";
	}
	
	
}
