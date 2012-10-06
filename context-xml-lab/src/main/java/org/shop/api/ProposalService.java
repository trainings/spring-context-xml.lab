package org.shop.api;

import java.util.List;

import org.shop.model.Product;
import org.shop.model.Proposal;
import org.shop.model.Seller;

public interface ProposalService {
	
	Long createProposal(Seller seller, Product product, Double price);
	
	void deactivateProposal(Long proposalId);
	
	void activateProposal(Long proposalId);
	
	List<Proposal> getProposalsByProduct(Product product);
	
	List<Proposal> getProposalsByProductId(Long productId);
	
	List<Proposal> getProposalsBySeller(Seller seller);
	
	List<Proposal> getProposalsBySellerId(Long sellerId);
}
