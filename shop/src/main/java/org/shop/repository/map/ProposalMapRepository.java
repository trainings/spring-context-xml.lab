package org.shop.repository.map;

import java.util.List;

import org.apache.commons.collections.Predicate;
import org.shop.data.Proposal;
import org.shop.repository.ProposalRepository;

public class ProposalMapRepository extends AbstractMapRepository<Proposal> implements ProposalRepository {

    /* (non-Javadoc)
     * @see org.shop.repository.ProposalRepository#getProposal(java.lang.Long)
     */
    @Override
    public Proposal getProposal(Long id) {
        return get(id);
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ProposalRepository#createProposal(org.shop.data.Proposal)
     */
    @Override
    public Long createProposal(Proposal proposal) {
        return create(proposal);
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ProposalRepository#updateProposal(org.shop.data.Proposal)
     */
    @Override
    public void updateProposal(Proposal proposal) {
        update(proposal);    
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ProposalRepository#getProposalsByProductId(java.lang.Long)
     */
    @Override
    public List<Proposal> getProposalsByProductId(Long productId) {
        return select(new ProposalByProductPredicate(productId));
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ProposalRepository#getProposalsBySellerId(java.lang.Long)
     */
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
