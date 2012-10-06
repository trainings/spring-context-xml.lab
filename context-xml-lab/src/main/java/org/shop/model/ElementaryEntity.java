package org.shop.model;

import java.io.Serializable;

public abstract class ElementaryEntity implements Serializable {

	private static final long serialVersionUID = -291574730022688192L;
	
	private Long id;

	public ElementaryEntity() {
		super();
	}
	
	protected ElementaryEntity(Long id) {
		this();
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
