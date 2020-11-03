package com.proj.alpha.empdetails.data;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.empdetails.model.EmpDetails;

public interface EmpDetailsRepository extends MongoRepository<EmpDetails, String> {

	List<EmpDetails> findAllByStoreId(String id);
	List<EmpDetails> findAllByLoginId(String loginId);

}
