package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.ProdutoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Produto;
 

public class ProdutoService {
    private ProdutoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public ProdutoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new ProdutoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Produto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Produto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Produto item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Produto contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Produto item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Produto> findAll(){
        return dao.findAll();
    }
    
    public List<Produto> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Produto getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

