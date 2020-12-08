package com.proj.alpha.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.proj.alpha.model.EmpLogin;
import com.proj.alpha.service.IEmpLoginService;

@RestController
@RequestMapping("emplogin")
public class EmpLoginController {

	@Autowired
	IEmpLoginService empLoginService;
	
	@GetMapping("/fetch/all/{page}/{size}")
	Page<EmpLogin> getAllEmpLogin(@PathVariable int page, @PathVariable int size)
	{
		Pageable requestedPage = PageRequest.of(page,size);
		return empLoginService.getAllEmpLoginByPage(requestedPage);
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
