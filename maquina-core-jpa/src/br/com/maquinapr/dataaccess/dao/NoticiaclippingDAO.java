package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Noticiaclipping;
 
 
public class NoticiaclippingDAO extends GenericDAO<Long, Noticiaclipping> {
    public NoticiaclippingDAO(EntityManager entityManager) {
		super(entityManager);
	}

}