package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Noticia;
 
 
public class NoticiaDAO extends GenericDAO<Long, Noticia> {
    public NoticiaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}