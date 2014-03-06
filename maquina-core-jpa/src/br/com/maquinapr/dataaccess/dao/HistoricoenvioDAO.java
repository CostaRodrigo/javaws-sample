package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Historicoenvio;
 
 
public class HistoricoenvioDAO extends GenericDAO<Long, Historicoenvio> {
    public HistoricoenvioDAO(EntityManager entityManager) {
		super(entityManager);
	}

}