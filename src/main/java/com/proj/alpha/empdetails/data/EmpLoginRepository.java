package com.proj.alpha.empdetails.data;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.empdetails.model.EmpLogin;

public interface EmpLoginRepository extends MongoRepository<EmpLogin, String>{

	Optional<EmpLogin> findAllByEmpId(String id);

	
}
