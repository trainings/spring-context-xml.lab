package org.shop.repository.map;

import java.util.ArrayList;
import java.util.List;

import org.shop.model.Seller;
import org.shop.repository.SellerRepository;

public class SellerMapRepository extends AbstractMapRepository<Seller> implements SellerRepository {

	@Override
	public Long createSeller(Seller seller) {
		return create(seller);
	}

	@Override
	public void updateSeller(Seller seller) {
		update(seller);
	}

	@Override
	public List<Seller> getSellers() {
		return new ArrayList<Seller>(register.values());
	}

	@Override
	public Seller getSellerById(Long sellerId) {
		return get(sellerId);
	}
}
