package org.shop.repository.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.shop.model.ElementaryEntity;

public class AbstractMapRepository<T extends ElementaryEntity> {
	private long sequence = 0;
    
    protected final Map<Long, T> register = new HashMap<Long, T>();
    
    protected final Long nextPk() {
        return ++sequence;
    }
    
    protected T get(Long id) {
    	return register.get(id);
    }
    
    protected Long create(T entity) {
    	Long id = nextPk();
    	
    	entity.setId(id);
    	
    	register.put(id, entity);
    	
    	return id;
    }
    
    protected void update(T entity) {
    	if (entity.getId() != null) {
    		register.put(entity.getId(), entity);
    	}
    }
    
    protected void delete(Long id) {
    	register.remove(id);
    }
    
    @SuppressWarnings("unchecked")
    protected List<T> select(Predicate predicate) {
        return (List<T>)CollectionUtils.select(register.values(), predicate);
    }
}
