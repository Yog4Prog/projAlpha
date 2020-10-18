package com.proj.alpha.empdetails;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.proj.alpha.empdetails.data.EmpDetailsRepository;
import com.proj.alpha.empdetails.model.Address;
import com.proj.alpha.empdetails.model.EmpDetails;


@SpringBootApplication
public class EmpDetailsApplication  {

	@Autowired
	EmpDetailsRepository empLoginRepo;
	
	public static void main(String[] args) {
		SpringApplication.run(EmpDetailsApplication.class, args);
	}


}
