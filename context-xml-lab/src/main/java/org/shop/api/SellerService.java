package org.shop.api;

import java.util.List;

import org.shop.data.Seller;

public interface SellerService {
	
	Long registerSeller(Seller seller);
	
	void updateSeller(Seller seller);
	
	List<Seller> getSellers();
	
	Seller getSellerById(Long sellerId);
}
