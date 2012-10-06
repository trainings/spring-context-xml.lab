package org.shop.repository;

import java.util.List;

import org.shop.data.Seller;

public interface SellerRepository {
	
	Long createSeller(Seller seller);
	
	void updateSeller(Seller seller);
	
	List<Seller> getSellers();
	
	Seller getSellerById(Long sellerId);
}
