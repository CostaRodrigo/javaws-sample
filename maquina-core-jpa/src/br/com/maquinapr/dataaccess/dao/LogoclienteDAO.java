package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logocliente;
 
 
public class LogoclienteDAO extends GenericDAO<Long, Logocliente> {
    public LogoclienteDAO(EntityManager entityManager) {
		super(entityManager);
	}

}