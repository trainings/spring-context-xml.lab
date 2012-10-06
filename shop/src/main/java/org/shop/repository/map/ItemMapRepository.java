package org.shop.repository.map;

import java.util.List;

import org.apache.commons.collections.Predicate;
import org.shop.data.Item;
import org.shop.repository.ItemRepository;

public class ItemMapRepository extends AbstractMapRepository<Item> implements ItemRepository {

    /* (non-Javadoc)
     * @see org.shop.repository.ItemRepository#createItem(org.shop.data.Item)
     */
    @Override
    public Long createItem(Item item) {
        return create(item);
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ItemRepository#deleteItem(java.lang.Long)
     */
    @Override
    public void deleteItem(Long itemId) {
        deleteItem(itemId);
    }

    /* (non-Javadoc)
     * @see org.shop.repository.ItemRepository#getItemsByOrderId(java.lang.Long)
     */
    @Override
    public List<Item> getItemsByOrderId(Long orderId) {
        return select(new ItemByOrderPredicate(orderId));
    }
    
    private class ItemByOrderPredicate implements Predicate {
        
        private Long orderId;
        
        private ItemByOrderPredicate(Long orderId) {
            super();
            this.orderId = orderId;
        }

        @Override
        public boolean evaluate(Object input) {
            if (input instanceof Item) {
                Item item = (Item)input;
                
                return orderId.equals(item.getOrder().getId());
            }
            
            return false;
        }
    }
}
