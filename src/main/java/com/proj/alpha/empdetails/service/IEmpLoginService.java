package com.proj.alpha.empdetails.service;

import java.util.List;
import java.util.Optional;

import com.proj.alpha.empdetails.model.EmpLogin;

public interface IEmpLoginService {

	List<EmpLogin> getAllEmpLogin();
	Optional<EmpLogin> getEmpLoginByID(String id);
	EmpLogin createEmpLogin(EmpLogin empLogin);

}

