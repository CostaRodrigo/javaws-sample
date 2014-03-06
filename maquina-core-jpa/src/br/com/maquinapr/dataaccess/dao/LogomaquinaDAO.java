package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logomaquina;
 
 
public class LogomaquinaDAO extends GenericDAO<Long, Logomaquina> {
    public LogomaquinaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}