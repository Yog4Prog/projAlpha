package com.proj.alpha.controller;

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

import com.proj.alpha.model.StoreDetails;
import com.proj.alpha.service.IStoreDetailsService;

@RestController
@RequestMapping("storedetails")
public class StoreDetailsController {

	@Autowired
	IStoreDetailsService storeDetailsService;
	
	@GetMapping("/fetch/all")
	List<StoreDetails> getAllStoreDetails()
	{
		return storeDetailsService.getAllStoreDetails();
	}
	
	@GetMapping("/fetch/{id}")
	Optional<StoreDetails> getEmpDetailsByID(@PathVariable String id)
	{
		return storeDetailsService.getStoreDetailsByID(id);
	}
	
	@PostMapping("/add")
	StoreDetails addNewEmpDetails(@RequestBody StoreDetails storeDetails )
	{
		return storeDetailsService.createStoreDetails(storeDetails);
	}
	
	@PutMapping("/update")
	StoreDetails updateEmpDetails(@RequestBody StoreDetails storeDetails)
	{
		return storeDetailsService.updateStoreDetails(storeDetails);	
	}
	
	@DeleteMapping("/delete/{id}")
	String deleteEmpDetails(@PathVariable String id)
	{
		return storeDetailsService.deleteStoreDetails(id);
	}
	
}
