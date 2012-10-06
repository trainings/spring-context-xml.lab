package org.shop.api;

import java.util.List;

import org.shop.data.Seller;

/**
 * Provides API for manipulating selles.
 * 
 * @author Dzmitry_Naskou
 *
 */
public interface SellerService {
    
    /**
     * Register seller.
     *
     * @param seller the seller
     * @return the seller id
     */
    Long registerSeller(Seller seller);
    
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
