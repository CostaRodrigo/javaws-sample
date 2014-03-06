package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.NoticiaDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Noticia;
 

public class NoticiaService {
    private NoticiaDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public NoticiaService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new NoticiaDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Noticia contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Noticia contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Noticia item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Noticia contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Noticia item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Noticia> findAll(){
        return dao.findAll();
    }
    
    public List<Noticia> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Noticia getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

