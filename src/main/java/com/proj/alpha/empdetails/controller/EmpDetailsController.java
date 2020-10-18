package com.proj.alpha.empdetails.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proj.alpha.empdetails.model.EmpDetails;
import com.proj.alpha.empdetails.service.IEmpDetailsService;

@RestController
@RequestMapping("empdetails")
public class EmpDetailsController {

	@Autowired
	IEmpDetailsService empDetailsService;
	
	@GetMapping("/fetch/all")
	List<EmpDetails> getAllEmpDetails()
	{
		return empDetailsService.getAllEmpDetails();
	}
	
	@GetMapping("/fetch/{id}")
	Optional<EmpDetails> getEmpDetailsByID(@PathVariable String id)
	{
		return empDetailsService.getEmpDetailsByID(id);
	}
	
	@PostMapping("/add")
	EmpDetails addNewEmpDetails(@RequestBody EmpDetails empDetails )
	{
		return empDetailsService.createEmpDetails(empDetails);
	}
	
	@PutMapping("/update")
	EmpDetails updateEmpDetails(@RequestBody EmpDetails empDetails)
	{
		return empDetailsService.updateEmpDetails(empDetails);	
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteEmpDetails(@PathVariable String id)
	{
		return empDetailsService.deleteEmpDetails(id);
	}
	
}
