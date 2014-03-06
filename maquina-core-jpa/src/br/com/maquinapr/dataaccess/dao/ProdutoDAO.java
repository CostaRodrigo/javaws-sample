package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Produto;
 
 
public class ProdutoDAO extends GenericDAO<Long, Produto> {
    public ProdutoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}