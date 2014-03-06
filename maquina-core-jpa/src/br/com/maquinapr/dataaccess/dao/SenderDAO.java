package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Sender;
 
 
public class SenderDAO extends GenericDAO<Long, Sender> {
    public SenderDAO(EntityManager entityManager) {
		super(entityManager);
	}

}