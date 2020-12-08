package com.proj.alpha.service;

import java.util.List;
import java.util.Optional;

import com.proj.alpha.model.EmpDetails;

public interface IEmpDetailsService {

	List<EmpDetails> getAllEmpDetails();

	Optional<EmpDetails> getEmpDetailsByID(String id);

	EmpDetails updateEmpDetails(EmpDetails empDetails);

	EmpDetails createEmpDetails(EmpDetails empDetails);

	String deleteEmpDetails(String id);

	List<EmpDetails> getAllEmpDetailsFromStore(String storeID);

	EmpDetails getEmpDetailsByLoginId(String loginId);


}
