package org.shop.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class State extends ElementaryEntity {

	private static final long serialVersionUID = -4707978480914424319L;
	
	public static final State ACTIVE_PROPOSAL = new State((long)0);
	
	public static final State NOT_ACTIVE_PROPOSAL = new State((long)1);
	
	public static final State CANCELED_PROPOSAL = new State((long)3);

	private static final List<State> PROPOSAL_STATES;
	
	static {
		List<State> states = new ArrayList<State>(3);
		states.add(ACTIVE_PROPOSAL);
		states.add(NOT_ACTIVE_PROPOSAL);
		
		PROPOSAL_STATES = Collections.unmodifiableList(states);
	}
	
	private State(Long id) {
		super(id);
	}
	
	public static List<State> getProposalStates() {
		return PROPOSAL_STATES;
	}
}
