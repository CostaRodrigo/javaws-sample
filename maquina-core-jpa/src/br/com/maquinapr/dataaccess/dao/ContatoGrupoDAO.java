package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Contatogrupo;
 
 
public class ContatoGrupoDAO extends GenericDAO<Long, Contatogrupo> {
    public ContatoGrupoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}