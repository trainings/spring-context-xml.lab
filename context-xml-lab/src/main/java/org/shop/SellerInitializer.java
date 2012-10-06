package org.shop;

import org.shop.api.SellerService;

import org.shop.common.Sellers;
import org.shop.data.Seller;

/**
 * The Seller Initializer util class.
 */
public class SellerInitializer {

	/** The seller service. */
	private SellerService sellerService;
	
	/**
	 * Instantiates a new seller initializer.
	 *
	 * @param sellerService the seller service
	 */
	public SellerInitializer(SellerService sellerService) {
		super();
		this.sellerService = sellerService;
	}

	/**
	 * Inits the sellers.
	 */
	public void initSellers() {
		Seller seller = null;
		
		//create amazon.com
		seller = new Seller();
		seller.setName(Sellers.AMAZON);
		
		sellerService.registerSeller(seller);
		
		//create
		seller = new Seller();
		seller.setName(Sellers.SAMSUNG);
		
		sellerService.registerSeller(seller);
	}
}
