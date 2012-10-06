package org.shop;

import org.shop.api.SellerService;
import org.shop.model.Seller;

public class SellerInitializer {

	private SellerService sellerService;
	
	public SellerInitializer(SellerService sellerService) {
		super();
		this.sellerService = sellerService;
	}

	public void initSellers() {
		Seller seller = null;
		
		//create amazon.com
		seller = new Seller();
		seller.setName("Amazon");
		
		sellerService.registerSeller(seller);
		
		//create
		seller = new Seller();
		seller.setName("Samsung");
		
		sellerService.registerSeller(seller);
	}
}
