package com.proj.alpha.empdetails.service;


import java.util.List;
import java.util.Optional;

import com.proj.alpha.empdetails.model.EmpLogin;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IEmpLoginService {

	List<EmpLogin> getAllEmpLogin();
	Optional<EmpLogin> getEmpLoginByID(String id);
	EmpLogin createEmpLogin(EmpLogin empLogin);
	Page<EmpLogin> getAllEmpLoginByPage(Pageable pageable);

}

