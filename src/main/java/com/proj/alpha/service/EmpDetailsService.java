package com.proj.alpha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.alpha.data.EmpDetailsRepository;
import com.proj.alpha.model.EmpDetails;
import com.proj.alpha.data.StoreDetailsRepository;
import com.proj.alpha.model.StoreDetails;

@Service
public class EmpDetailsService implements IEmpDetailsService {
	
	@Autowired
	EmpDetailsRepository empDetailsRepo;
	
	@Autowired
	StoreDetailsRepository storeDetailsRepo;
	
	public List<EmpDetails> getAllEmpDetails()
	{
		return empDetailsRepo.findAll();
	}
	
	public List<EmpDetails> getAllEmpDetailsFromStore(String storeID)
	{
		Optional<StoreDetails> storeDetail = storeDetailsRepo.findById(storeID);
		
		
		if(storeDetail.isPresent())
		{
			
			return empDetailsRepo.findAllByStoreId(storeDetail.get().getId());
		}
		return null;
	}

	@Override
	public EmpDetails getEmpDetailsByLoginId(String loginId) {
		List<EmpDetails> empDetails = empDetailsRepo.findAllByLoginId(loginId);
		// To DO:: Ideally 1 record should be fetch, if more than 1 record is fetched then throw error.
		return empDetails.get(0);
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
