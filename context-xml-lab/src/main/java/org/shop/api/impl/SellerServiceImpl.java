package org.shop.api.impl;

import java.util.List;

import org.shop.api.SellerService;
import org.shop.data.Seller;
import org.shop.repository.SellerRepository;

public class SellerServiceImpl implements SellerService {
	
	private SellerRepository repository;

	public void setRepository(SellerRepository repository) {
		this.repository = repository;
	}

	/* (non-Javadoc)
	 * @see org.shop.api.SellerService#registerSeller(org.shop.data.Seller)
	 */
	@Override
	public Long registerSeller(Seller seller) {
		return repository.createSeller(seller);
	}

	/* (non-Javadoc)
	 * @see org.shop.api.SellerService#updateSeller(org.shop.data.Seller)
	 */
	@Override
	public void updateSeller(Seller seller) {
		repository.updateSeller(seller);		
	}

	/* (non-Javadoc)
	 * @see org.shop.api.SellerService#getSellers()
	 */
	@Override
	public List<Seller> getSellers() {
		return repository.getSellers();
	}

	/* (non-Javadoc)
	 * @see org.shop.api.SellerService#getSellerById(java.lang.Long)
	 */
	@Override
	public Seller getSellerById(Long sellerId) {
		return repository.getSellerById(sellerId);
	}
}
