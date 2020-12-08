package com.proj.alpha.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.alpha.data.StoreDetailsRepository;
import com.proj.alpha.model.StoreDetails;

@Service
public class StoreDetailsService implements IStoreDetailsService {

	@Autowired
	StoreDetailsRepository storeDetailsRepo;
	
	@Override
	public List<StoreDetails> getAllStoreDetails() {
		return storeDetailsRepo.findAll();
	}

	@Override
	public Optional<StoreDetails> getStoreDetailsByID(String id) {
		return storeDetailsRepo.findById(id);
	}

	@Override
	public StoreDetails updateStoreDetails(StoreDetails storeDetails) {
		return storeDetailsRepo.save(storeDetails);
	}

	@Override
	public StoreDetails createStoreDetails(StoreDetails storeDetails) {
		return storeDetailsRepo.insert(storeDetails);
	}

	@Override
	public String deleteStoreDetails(String id) {
		Optional<StoreDetails> storeDetails = storeDetailsRepo.findById(id);
		if(storeDetails.isPresent())
		{
			storeDetailsRepo.delete(storeDetails.get());
			return "Store Details deleted";
		}
		return "Store Details not found!";
	}

	
}
