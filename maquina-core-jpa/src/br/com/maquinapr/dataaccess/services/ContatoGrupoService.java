package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.ContatoGrupoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Contatogrupo;
 

public class ContatoGrupoService {
    private ContatoGrupoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public ContatoGrupoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ContatoGrupoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Contatogrupo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Contatogrupo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Contatogrupo item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Contatogrupo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Contatogrupo item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Contatogrupo> findAll(){
        return dao.findAll();
    }
    
    public List<Contatogrupo> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Contatogrupo getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

