package br.com.maquinapr.dataaccess.services;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.AgendamentodisparoDAO;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.entities.Agendamentodisparo;
 

public class AgendamentoDisparoService {
    private AgendamentodisparoDAO dao;
     
    private SimpleEntityManager simpleEntityManager;
     
    public AgendamentoDisparoService(SimpleEntityManager simpleEntityManager){
        this.simpleEntityManager = simpleEntityManager;
        dao = new AgendamentodisparoDAO(simpleEntityManager.getEntityManager());
    }
     
    public void insert(Agendamentodisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            dao.save(contato);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void update(Agendamentodisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Agendamentodisparo item = dao.getById(contato.getId());
            dao.update(item);
            simpleEntityManager.commit();
        }catch(Exception e){
        	simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
    
    public void delete(Agendamentodisparo contato) throws Exception{
        try{
            simpleEntityManager.beginTransaction();
            Agendamentodisparo item = dao.getById(contato.getId());
            dao.delete(item);
            simpleEntityManager.commit();
        }catch(Exception e){
            simpleEntityManager.rollBack();
            throw new Exception(e.getMessage());
        }
    }
     
    public List<Agendamentodisparo> findAll(){
        return dao.findAll();
    }
    
    public List<Agendamentodisparo> findByFilter(String[] filter){
        return dao.findByFilter(filter);
    }
    
    public Agendamentodisparo getRow(long id){
    
    	return dao.getById(id);
    	
    }
    
    
  }

    
    

