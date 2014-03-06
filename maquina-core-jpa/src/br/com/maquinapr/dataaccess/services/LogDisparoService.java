package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogdisparoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logdisparo;
 

public class LogDisparoService {
    private LogdisparoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogDisparoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogdisparoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logdisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logdisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logdisparo item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logdisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logdisparo item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logdisparo> findAll(){
        return dao.findAll();
    }
    
    public List<Logdisparo> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logdisparo getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

