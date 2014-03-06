package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Modelotitulo;
 
 
public class ModelotituloDAO extends GenericDAO<Long, Modelotitulo> {
    public ModelotituloDAO(EntityManager entityManager) {
		super(entityManager);
	}

}