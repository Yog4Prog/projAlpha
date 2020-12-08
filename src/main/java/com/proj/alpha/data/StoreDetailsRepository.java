package com.proj.alpha.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.model.StoreDetails;

public interface StoreDetailsRepository extends MongoRepository<StoreDetails, String> {

}
