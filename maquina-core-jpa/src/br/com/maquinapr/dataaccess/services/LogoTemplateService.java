package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogotemplateDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logotemplate;
 

public class LogoTemplateService {
    private LogotemplateDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogoTemplateService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogotemplateDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logotemplate contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logotemplate contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logotemplate item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logotemplate contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logotemplate item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logotemplate> findAll(){
        return dao.findAll();
    }
    
    public List<Logotemplate> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logotemplate getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

