package org.shop;

import org.shop.api.ProductService;
import org.shop.api.ProposalService;
import org.shop.api.SellerService;
import org.shop.data.Product;
import org.shop.data.Seller;

public class ProposalInitializer {
	
	private ProductService productService;
	
	private ProposalService proposalService;
	
	private SellerService sellerService;
	
	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	public void setProposalService(ProposalService proposalService) {
		this.proposalService = proposalService;
	}

	public void setSellerService(SellerService sellerService) {
		this.sellerService = sellerService;
	}

	public void initProposals() {
		Seller amazon = sellerService.getSellerById((long)0);
		Seller samsung = sellerService.getSellerById((long)1);
		
		Product galaxyTab = productService.getProductsByName("Samsung Galaxy Tab").get(0);
		Product kindleFire = productService.getProductsByName("Kindle Fire").get(0);
		Product kindleTouch = productService.getProductsByName("Kindle Touch").get(0);
		Product galaxyAce = productService.getProductsByName("Samsung S5830L Galaxy Ace").get(0);
		
		//Samsung
		proposalService.createProposal(samsung, galaxyAce, 250.0);
		proposalService.createProposal(samsung, galaxyTab, 500.0);
		
		//Amazon
		proposalService.createProposal(amazon, kindleFire, 199.0);
		proposalService.createProposal(amazon, kindleTouch, 99.0);
	}
}
