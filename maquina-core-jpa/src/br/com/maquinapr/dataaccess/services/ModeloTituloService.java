package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.ModelotituloDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Modelotitulo;
 

public class ModeloTituloService {
    private ModelotituloDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public ModeloTituloService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ModelotituloDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Modelotitulo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Modelotitulo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Modelotitulo item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Modelotitulo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Modelotitulo item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Modelotitulo> findAll(){
        return dao.findAll();
    }
    
    public List<Modelotitulo> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Modelotitulo getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

