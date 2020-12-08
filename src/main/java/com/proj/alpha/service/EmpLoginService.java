package com.proj.alpha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.proj.alpha.data.EmpDetailsRepository;
import com.proj.alpha.data.EmpLoginRepository;
import com.proj.alpha.model.EmpLogin;

@Service
public class EmpLoginService implements IEmpLoginService {

	@Autowired
	EmpLoginRepository empLoginRepo;
	@Autowired
	EmpDetailsRepository empDetailsRepo;
	
	@Override
	public List<EmpLogin> getAllEmpLogin() {
		return empLoginRepo.findAll();
	}

	@Override
	public Optional<EmpLogin> getEmpLoginByID(String id) {
		return empLoginRepo.findAllByEmpId(id);
	}

	@Override
	public EmpLogin createEmpLogin(EmpLogin empLogin) {
		return empLoginRepo.insert(empLogin);
		
	}

	@Override
	public Page<EmpLogin> getAllEmpLoginByPage(Pageable pageable) {
		return empLoginRepo.findAll(pageable);
	}


}
