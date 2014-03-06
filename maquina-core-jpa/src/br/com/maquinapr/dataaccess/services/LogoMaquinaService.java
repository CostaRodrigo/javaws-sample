package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogomaquinaDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logomaquina;
 

public class LogoMaquinaService {
    private LogomaquinaDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogoMaquinaService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogomaquinaDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logomaquina contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logomaquina contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logomaquina item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logomaquina contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logomaquina item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logomaquina> findAll(){
        return dao.findAll();
    }
    
    public List<Logomaquina> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logomaquina getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

