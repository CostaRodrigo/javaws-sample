package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.ContatoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Contato;
 

public class ContatoService {
    private ContatoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public ContatoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ContatoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Contato contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Contato contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Contato item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Contato contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Contato item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Contato> findAll(){
        return dao.findAll();
    }
    
    public List<Contato> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Contato getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

