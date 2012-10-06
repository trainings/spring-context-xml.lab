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
     * Creates or update ther Seller.
     *
     * @param seller the seller
     */
    void createOrUpdateSeller(Seller seller);
    
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
