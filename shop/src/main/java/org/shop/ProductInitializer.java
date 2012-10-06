package org.shop;

import org.shop.api.ProductService;

import org.shop.common.Products;
import org.shop.data.Product;

/**
 * The Product Initializer util class.
 */
public final class ProductInitializer {
    
    /** The product service. */
    private ProductService productService;

    /**
     * Instantiates a new product initializer.
     *
     * @param productService the product service
     */
    public ProductInitializer(ProductService productService) {
        super();
        this.productService = productService;
    }
    
    /**
     * Inits the products.
     */
    public void initProducts() {
        Product product = null;
        
        //Samsung Galaxy Tab
        product = new Product();
        product.setName(Products.SAMSUNG_GALAXY_TAB);
        product.setDescription("10.1-Inch, 16GB, Wi-Fi");
        productService.createProduct(product);
        
        //Amazon Kindle Fire
        product = new Product();
        product.setName(Products.KINDLE_FIRE);
        product.setDescription("Wi-Fi, Full Color 7, Multi-Touch Display");
        productService.createProduct(product);
        
        //Amazon Kindle Touch
        product = new Product();
        product.setName(Products.KINDLE_TOUCH);
        product.setDescription("Wi-Fi, 6 E Ink Display");
        productService.createProduct(product);
        
        //Samsung Galaxy Ace
        product = new Product();
        product.setName(Products.SAMSUNG_GALAXY_ACE);
        product.setDescription("Samsung S5830L Galaxy Ace");
        productService.createProduct(product);
    }
}
