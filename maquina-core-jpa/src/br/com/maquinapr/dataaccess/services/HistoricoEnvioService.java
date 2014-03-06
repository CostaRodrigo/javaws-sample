package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.HistoricoenvioDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Historicoenvio;
 

public class HistoricoEnvioService {
    private HistoricoenvioDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public HistoricoEnvioService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new HistoricoenvioDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Historicoenvio contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Historicoenvio contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Historicoenvio item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Historicoenvio contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Historicoenvio item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Historicoenvio> findAll(){
        return dao.findAll();
    }
    
    public List<Historicoenvio> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Historicoenvio getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

