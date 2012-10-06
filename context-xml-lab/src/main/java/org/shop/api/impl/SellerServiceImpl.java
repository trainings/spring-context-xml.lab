package org.shop.api.impl;

import java.util.List;

import org.shop.api.SellerService;
import org.shop.model.Seller;
import org.shop.repository.SellerRepository;

public class SellerServiceImpl implements SellerService {
	
	private SellerRepository repository;

	public void setRepository(SellerRepository repository) {
		this.repository = repository;
	}

	@Override
	public Long registerSeller(Seller seller) {
		return repository.createSeller(seller);
	}

	@Override
	public void updateSeller(Seller seller) {
		repository.updateSeller(seller);		
	}

	@Override
	public List<Seller> getSellers() {
		return repository.getSellers();
	}

	@Override
	public Seller getSellerById(Long sellerId) {
		return repository.getSellerById(sellerId);
	}
}
