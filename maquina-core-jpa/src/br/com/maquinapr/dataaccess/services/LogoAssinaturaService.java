package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogoassinaturaDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logoassinatura;
 

public class LogoAssinaturaService {
    private LogoassinaturaDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogoAssinaturaService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogoassinaturaDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logoassinatura contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logoassinatura contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logoassinatura item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logoassinatura contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logoassinatura item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logoassinatura> findAll(){
        return dao.findAll();
    }
    
    public List<Logoassinatura> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logoassinatura getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

