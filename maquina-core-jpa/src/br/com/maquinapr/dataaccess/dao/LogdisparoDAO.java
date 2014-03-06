package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logdisparo;
 
 
public class LogdisparoDAO extends GenericDAO<Long, Logdisparo> {
    public LogdisparoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}