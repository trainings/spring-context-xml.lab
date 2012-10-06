package org.shop.repository.map;

import java.util.List;

import org.apache.commons.collections.Predicate;
import org.shop.model.Proposal;
import org.shop.repository.ProposalRepository;

public class ProposalMapRepository extends AbstractMapRepository<Proposal> implements ProposalRepository {

	@Override
	public Proposal getProposal(Long id) {
		return get(id);
	}

	@Override
	public Long createProposal(Proposal proposal) {
		return create(proposal);
	}

	@Override
	public void updateProposal(Proposal proposal) {
		update(proposal);	
	}

	@Override
	public List<Proposal> getProposalsByProductId(Long productId) {
		return select(new ProposalByProductPredicate(productId));
	}

	@Override
	public List<Proposal> getProposalsBySellerId(Long sellerId) {
		return select(new ProposalBySellerPredicate(sellerId));
	}
	
	private class ProposalByProductPredicate implements Predicate {
		
		private Long productId;
		
		private ProposalByProductPredicate(Long productId) {
			super();
			this.productId = productId;
		}

		@Override
		public boolean evaluate(Object input) {
			if (input instanceof Proposal) {
				Proposal proposal = (Proposal)input;
				
				return productId.equals(proposal.getProduct().getId());
			}
			
			return false;
		}
	}
	
	private class ProposalBySellerPredicate implements Predicate {
		private Long sellerId;

		private ProposalBySellerPredicate(Long sellerId) {
			super();
			this.sellerId = sellerId;
		}

		@Override
		public boolean evaluate(Object input) {
			if (input instanceof Proposal) {
				Proposal proposal = (Proposal)input;
				
				return sellerId.equals(proposal.getSeller().getId());
			}
			
			return false;
		}
	}
}
