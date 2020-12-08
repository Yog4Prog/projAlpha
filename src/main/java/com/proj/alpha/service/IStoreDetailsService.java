package com.proj.alpha.service;

import java.util.List;
import java.util.Optional;

import com.proj.alpha.model.StoreDetails;

public interface IStoreDetailsService {

  public List<StoreDetails> getAllStoreDetails();
	
	
	public Optional<StoreDetails> getStoreDetailsByID(String id);
	
	public StoreDetails updateStoreDetails(StoreDetails storeDetails);
	
	
	public StoreDetails createStoreDetails(StoreDetails storeDetails);
	
	public String deleteStoreDetails(String id);
	
}
