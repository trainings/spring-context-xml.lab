package org.shop.repository;

import java.util.List;

import org.shop.data.Proposal;

// TODO: Auto-generated Javadoc
/**
 * Provides repository for manipulating proposals.
 * 
 * @author Dzmitry_Naskou
 */
public interface ProposalRepository {
    
    /**
     * Gets the proposal.
     *
     * @param id the id
     * @return the proposal
     */
    Proposal getProposal(Long id);
    
    /**
     * Creates the proposal.
     *
     * @param proposal the proposal
     * @return the proposal id
     */
    Long createProposal(Proposal proposal);
    
    /**
     * Update proposal.
     *
     * @param proposal the proposal
     */
    void updateProposal(Proposal proposal);
    
    /**
     * Gets the proposals by product id.
     *
     * @param productId the product id
     * @return the proposals by product id
     */
    List<Proposal> getProposalsByProductId(Long productId);
    
    /**
     * Gets the proposals by seller id.
     *
     * @param sellerId the seller id
     * @return the proposals by seller id
     */
    List<Proposal> getProposalsBySellerId(Long sellerId);
}
