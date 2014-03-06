package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Modelo;
 
 
public class ModeloDAO extends GenericDAO<Long, Modelo> {
    public ModeloDAO(EntityManager entityManager) {
		super(entityManager);
	}

}