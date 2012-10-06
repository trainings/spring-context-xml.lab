package org.shop;

/**
 * The main Data Initializer util class.
 */
public class DataInitializer {

    /** The seller initializer. */
    private SellerInitializer sellerInitializer;
    
    /** The product initializer. */
    private ProductInitializer productInitializer;
    
    /** The proposal initializer. */
    private ProposalInitializer proposalInitializer;
    
    /** The user initializer. */
    private UserInitializer userInitializer;

    /**
     * Inits the data.
     */
    public void initData() {
        sellerInitializer.initSellers();
        userInitializer.initUsers();
        productInitializer.initProducts();
        proposalInitializer.initProposals();
    }
    
    /**
     * Sets the seller initializer.
     *
     * @param sellerInitializer the new seller initializer
     */
    public void setSellerInitializer(SellerInitializer sellerInitializer) {
        this.sellerInitializer = sellerInitializer;
    }

    /**
     * Sets the product initializer.
     *
     * @param productInitializer the new product initializer
     */
    public void setProductInitializer(ProductInitializer productInitializer) {
        this.productInitializer = productInitializer;
    }

    /**
     * Sets the proposal initializer.
     *
     * @param proposalInitializer the new proposal initializer
     */
    public void setProposalInitializer(ProposalInitializer proposalInitializer) {
        this.proposalInitializer = proposalInitializer;
    }

    /**
     * Sets the user initializer.
     *
     * @param userInitializer the new user initializer
     */
    public void setUserInitializer(UserInitializer userInitializer) {
        this.userInitializer = userInitializer;
    }
}
