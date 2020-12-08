package com.proj.alpha.data;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.model.EmpLogin;

public interface EmpLoginRepository extends MongoRepository<EmpLogin, String>{

	Optional<EmpLogin> findAllByEmpId(String id);

	
}
