package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logotemplate;
 
 
public class LogotemplateDAO extends GenericDAO<Long, Logotemplate> {
    public LogotemplateDAO(EntityManager entityManager) {
		super(entityManager);
	}

}