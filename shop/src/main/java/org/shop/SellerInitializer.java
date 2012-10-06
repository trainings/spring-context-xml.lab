package org.shop;

import java.util.Collections;
import java.util.List;

import org.shop.api.SellerService;
import org.shop.data.Seller;

/**
 * The Seller Initializer util class.
 */
public class SellerInitializer {

    /** The seller service. */
    private SellerService sellerService;
    
    /** The seller names. */
    private List<String> sellerNames = Collections.emptyList();
    
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
     * Sets the seller names list.
     *
     * @param sellers the new seller names
     */
    public void setSellerNames(List<String> sellerNames) {
        this.sellerNames = sellerNames;
    }

    /**
     * Inits the sellers.
     */
    public void initSellers() {
        for (String sellerName : sellerNames) {
            Seller seller = new Seller();
            seller.setName(sellerName);
            
            sellerService.registerSeller(seller);
        }
    }
}
