package org.shop.repository;

import java.util.List;

import org.shop.data.Seller;

/**
 * Provides repository for manipulating sellers.
 * 
 * @author Dzmitry_Naskou
 */
public interface SellerRepository {
	
	/**
	 * Creates the seller.
	 *
	 * @param seller the seller
	 * @return the seller id
	 */
	Long createSeller(Seller seller);
	
	/**
	 * Update seller.
	 *
	 * @param seller the seller
	 */
	void updateSeller(Seller seller);
	
	/**
	 * Gets the sellers.
	 *
	 * @return the sellers
	 */
	List<Seller> getSellers();
	
	/**
	 * Gets the seller by id.
	 *
	 * @param sellerId the seller id
	 * @return the seller by id
	 */
	Seller getSellerById(Long sellerId);
}
