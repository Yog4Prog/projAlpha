package com.proj.alpha.empdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.proj.alpha.empdetails.model.EmpLogin;
import com.proj.alpha.empdetails.service.IEmpLoginService;

@RestController
@RequestMapping("emplogin")
public class EmpLoginController {

	@Autowired
	IEmpLoginService empLoginService;
	
	@GetMapping("/fetch/all")
	List<EmpLogin> getAllEmpLogin()
	{
		return empLoginService.getAllEmpLogin();
	}
	
	@GetMapping("/fetch/{id}")
	Optional<EmpLogin> getEmpDetailsByID(@PathVariable String id)
	{
		return empLoginService.getEmpLoginByID(id);
	}
	
	@PostMapping("/add")
	EmpLogin addNewEmpDetails(@RequestBody EmpLogin empLogin )
	{
		
		return empLoginService.createEmpLogin(empLogin);
	}
	
}
