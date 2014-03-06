package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.SenderDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Sender;
 

public class SenderService {
    private SenderDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public SenderService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new SenderDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Sender contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Sender contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Sender item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Sender contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Sender item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Sender> findAll(){
        return dao.findAll();
    }
    
    public List<Sender> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Sender getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

