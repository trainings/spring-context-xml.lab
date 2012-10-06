package org.shop;

public class DataInitializer {

	private SellerInitializer sellerInitializer;
	
	private ProductInitializer productInitializer;
	
	private ProposalInitializer proposalInitializer;
	
	private UserInitializer userInitializer;

	public void initData() {
		sellerInitializer.initSellers();
		userInitializer.initUsers();
		productInitializer.initProducts();
		proposalInitializer.initProposals();
	}
	
	public void setSellerInitializer(SellerInitializer sellerInitializer) {
		this.sellerInitializer = sellerInitializer;
	}

	public void setProductInitializer(ProductInitializer productInitializer) {
		this.productInitializer = productInitializer;
	}

	public void setProposalInitializer(ProposalInitializer proposalInitializer) {
		this.proposalInitializer = proposalInitializer;
	}

	public void setUserInitializer(UserInitializer userInitializer) {
		this.userInitializer = userInitializer;
	}
}
