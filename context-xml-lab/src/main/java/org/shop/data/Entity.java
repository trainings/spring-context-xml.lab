package org.shop.data;

import java.io.Serializable;

public interface Entity extends Serializable {
	
	Long getId();

	void setId(Long id);
}
