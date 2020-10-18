package com.proj.alpha.storedetails.data;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.proj.alpha.storedetails.model.StoreDetails;

public interface StoreDetailsRepository extends MongoRepository<StoreDetails, String> {

}
