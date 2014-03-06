package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogoclienteDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logocliente;
 

public class LogoClienteService {
    private LogoclienteDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogoClienteService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogoclienteDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logocliente contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logocliente contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logocliente item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logocliente contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logocliente item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logocliente> findAll(){
        return dao.findAll();
    }
    
    public List<Logocliente> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logocliente getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

