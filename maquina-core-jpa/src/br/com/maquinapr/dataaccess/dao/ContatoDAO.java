package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Contato;
 
 
public class ContatoDAO extends GenericDAO<Long, Contato> {
    public ContatoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}