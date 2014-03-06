package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logoproduto;
 
 
public class LogoprodutoDAO extends GenericDAO<Long, Logoproduto> {
    public LogoprodutoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}