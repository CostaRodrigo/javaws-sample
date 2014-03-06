package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.LogoprodutoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Logoproduto;
 

public class LogoProdutoService {
    private LogoprodutoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public LogoProdutoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new LogoprodutoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Logoproduto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Logoproduto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logoproduto item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Logoproduto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Logoproduto item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Logoproduto> findAll(){
        return dao.findAll();
    }
    
    public List<Logoproduto> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Logoproduto getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

