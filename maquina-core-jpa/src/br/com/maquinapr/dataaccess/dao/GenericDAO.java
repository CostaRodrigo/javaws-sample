package br.com.maquinapr.dataaccess.dao;

import java.lang.reflect.ParameterizedType;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
 

@SuppressWarnings("unchecked")
public class GenericDAO<PK, T> {
    private EntityManager entityManager;
 
    public GenericDAO(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
 
    public T getById(PK pk) {
        return (T) entityManager.find(getTypeClass(), pk);
    }
 
    public void save(T entity) {
        entityManager.persist(entity);
    }
 
    public void update(T entity) {
        entityManager.merge(entity);
    }
 
    public void delete(T entity) {
        entityManager.remove(entity);
    }
 
    public List<T> findAll() {
    	
    	Query query = entityManager.createQuery("SELECT obj FROM " + getTypeClass().getSimpleName() + " obj");
        return query.getResultList();
    
    }
    
    public List<T> findByFilter(String[] filter) {
    	
    	String filtroquery="";
    	
    	for(int x=0;x<filter.length;x++){
    		if(x==0){
    			filtroquery+=" WHERE " +"obj."+filter[x];
    		}else{
    			filtroquery+=" AND " +"obj."+filter[x];
    		}
    	}
    	
    	Query query = entityManager.createQuery("SELECT obj FROM " + getTypeClass().getSimpleName() + " obj "
    			+ filtroquery);
    	
        return query.getResultList();
    
    }
    
    
 
    private Class<?> getTypeClass() {
        Class<?> clazz = (Class<?>) ((ParameterizedType) this.getClass()
                .getGenericSuperclass()).getActualTypeArguments()[1];
        return clazz;
    }
}