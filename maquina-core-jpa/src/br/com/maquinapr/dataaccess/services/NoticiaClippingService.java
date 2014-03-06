package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.NoticiaclippingDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Noticiaclipping;
 

public class NoticiaClippingService {
    private NoticiaclippingDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public NoticiaClippingService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new NoticiaclippingDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Noticiaclipping contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Noticiaclipping contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Noticiaclipping item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Noticiaclipping contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Noticiaclipping item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Noticiaclipping> findAll(){
        return dao.findAll();
    }
    
    public List<Noticiaclipping> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Noticiaclipping getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

