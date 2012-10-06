package org.shop.api;

import java.util.List;

import org.shop.data.Product;
import org.shop.data.Proposal;
import org.shop.data.Seller;

public interface ProposalService {
	
	Long createProposal(Long sellerId, Long productId, Double price);
	
	void deactivateProposal(Long proposalId);
	
	void activateProposal(Long proposalId);
	
	List<Proposal> getProposalsByProduct(Product product);
	
	List<Proposal> getProposalsByProductId(Long productId);
	
	List<Proposal> getProposalsBySeller(Seller seller);
	
	List<Proposal> getProposalsBySellerId(Long sellerId);
}
