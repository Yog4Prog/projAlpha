package com.proj.alpha.empdetails.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.empdetails.model.EmpDetails;

public interface EmpDetailsRepository extends MongoRepository<EmpDetails, String> {

}
