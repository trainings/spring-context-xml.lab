package org.shop.repository.map;

import java.util.ArrayList;
import java.util.List;

import org.shop.data.Seller;
import org.shop.repository.SellerRepository;

public class SellerMapRepository extends AbstractMapRepository<Seller> implements SellerRepository {

	/* (non-Javadoc)
	 * @see org.shop.repository.SellerRepository#createSeller(org.shop.data.Seller)
	 */
	@Override
	public Long createSeller(Seller seller) {
		return create(seller);
	}

	/* (non-Javadoc)
	 * @see org.shop.repository.SellerRepository#updateSeller(org.shop.data.Seller)
	 */
	@Override
	public void updateSeller(Seller seller) {
		update(seller);
	}

	/* (non-Javadoc)
	 * @see org.shop.repository.SellerRepository#getSellers()
	 */
	@Override
	public List<Seller> getSellers() {
		return new ArrayList<Seller>(register.values());
	}

	/* (non-Javadoc)
	 * @see org.shop.repository.SellerRepository#getSellerById(java.lang.Long)
	 */
	@Override
	public Seller getSellerById(Long sellerId) {
		return get(sellerId);
	}
}
