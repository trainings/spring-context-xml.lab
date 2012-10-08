package org.shop.repository.map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.Predicate;
import org.shop.data.Entity;

/**
 * The Abstract Map Based Repository.
 *
 * @param <T> the generic type
 * @author Dzmitry_Naskou
 * 
 * @see Map
 */
public class AbstractMapRepository<T extends Entity> {
    
    /** The sequence. */
    private long sequence = 0;
    
    protected final Map<Long, T> register = new HashMap<Long, T>();
    
    /**
     * Instantiates a new map based repository.
     */
    public AbstractMapRepository() {
        this(0);
    }

    /**
     * Instantiates a new map based repository.
     *
     * @param initialSequence the initial sequence value
     */
    public AbstractMapRepository(long initialSequence) {
        super();
        this.sequence = initialSequence;
    }

    /**
     * Get next primary key.
     *
     * @return the long
     */
    protected final Long nextPk() {
        return ++sequence;
    }
    
    /**
     * Gets the object by id.
     *
     * @param id the id
     * @return the object
     */
    protected T get(Long id) {
        return register.get(id);
    }
    
    /**
     * Save object to datasource.
     *
     * @param entity the entity
     * @return the object id
     */
    protected Long create(T entity) {
        Long id = nextPk();
        
        entity.setId(id);
        
        register.put(id, entity);
        
        return id;
    }
    
    /**
     * Update the entity.
     *
     * @param entity the entity
     */
    protected void update(T entity) {
        if (entity.getId() != null) {
            register.put(entity.getId(), entity);
        }
    }
    
    /**
     * Delete the object by id.
     *
     * @param id the id
     */
    protected void delete(Long id) {
        register.remove(id);
    }
    
    /**
     * Select objects by predicate.
     *
     * @param predicate the predicate
     * @return the list
     * 
     * @see Predicate
     */
    @SuppressWarnings("unchecked")
    protected List<T> select(Predicate predicate) {
        return (List<T>)CollectionUtils.select(register.values(), predicate);
    }
}
