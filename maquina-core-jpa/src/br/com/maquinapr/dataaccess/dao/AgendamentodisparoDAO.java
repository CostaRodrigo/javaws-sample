package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Agendamentodisparo;
 
 
public class AgendamentodisparoDAO extends GenericDAO<Long, Agendamentodisparo> {
    public AgendamentodisparoDAO(EntityManager entityManager) {
		super(entityManager);
	}

}