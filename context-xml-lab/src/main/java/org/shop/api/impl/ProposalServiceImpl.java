package org.shop.api.impl;

import java.util.List;

import org.shop.api.ProposalService;
import org.shop.data.Product;
import org.shop.data.Proposal;
import org.shop.data.Seller;
import org.shop.data.State;
import org.shop.repository.ProposalRepository;

public class ProposalServiceImpl implements ProposalService {

	private ProposalRepository repository;
	
	public void setRepository(ProposalRepository repository) {
		this.repository = repository;
	}

	@Override
	public Long createProposal(Seller seller, Product product, Double price) {
		Proposal proposal = new Proposal();
		proposal.setPrice(price);
		proposal.setProduct(product);
		proposal.setSeller(seller);
		proposal.setState(State.NOT_ACTIVE_PROPOSAL);
		
		return repository.createProposal(proposal);
	}

	@Override
	public void deactivateProposal(Long proposalId) {
		Proposal proposal = repository.getProposal(proposalId);
		proposal.setState(State.NOT_ACTIVE_PROPOSAL);
		
		repository.updateProposal(proposal);
	}

	@Override
	public void activateProposal(Long proposalId) {
		Proposal proposal = repository.getProposal(proposalId);
		proposal.setState(State.ACTIVE_PROPOSAL);
		
		repository.updateProposal(proposal);
	}

	@Override
	public final List<Proposal> getProposalsByProduct(Product product) {
		return getProposalsByProductId(product.getId());
	}

	@Override
	public List<Proposal> getProposalsByProductId(Long productId) {
		return repository.getProposalsByProductId(productId);
	}

	@Override
	public final List<Proposal> getProposalsBySeller(Seller seller) {
		return getProposalsBySellerId(seller.getId());
	}

	@Override
	public List<Proposal> getProposalsBySellerId(Long sellerId) {
		return repository.getProposalsBySellerId(sellerId);
	}
}
