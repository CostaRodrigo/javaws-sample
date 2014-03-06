package br.com.maquinapr.dataaccess.dao;

import javax.persistence.EntityManager;

import br.com.maquinapr.entities.Logoassinatura;
 
 
public class LogoassinaturaDAO extends GenericDAO<Long, Logoassinatura> {
    public LogoassinaturaDAO(EntityManager entityManager) {
		super(entityManager);
	}

}