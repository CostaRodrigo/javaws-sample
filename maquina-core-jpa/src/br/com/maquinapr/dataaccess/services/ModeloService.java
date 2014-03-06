package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.ModeloDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Modelo;
 

public class ModeloService {
    private ModeloDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public ModeloService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ModeloDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Modelo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Modelo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Modelo item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Modelo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Modelo item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Modelo> findAll(){
        return dao.findAll();
    }
    
    public List<Modelo> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Modelo getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

