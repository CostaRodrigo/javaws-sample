package br.com.maquinapr.dataaccess.test;

import java.util.List;

import br.com.maquinapr.dataaccess.dao.impl.ContatoGrupoDAOImpl;
import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ContatoGrupoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Contatogrupo;


public class ContatoGrupoTeste {
	
	
	public static void main(String[] args) {
          
		String[]query = {"id=44;nome=a"};
		
		Listar(false,query);
		
		
    }
	
	static void Inserir() throws Exception{
	
		String persistenceUnitName = Constantes.persistenceUnitName;
		
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        ContatoGrupoService costumerService = new ContatoGrupoService(simpleEntityManager);
        
        Contatogrupo entidade = new Contatogrupo();
        
        entidade.setAtivo(1);
        entidade.setNome("Grupo ABC - Rodrigo - novo");
        entidade.setStatus(1);
     
               
        costumerService.insert(entidade);
        simpleEntityManager.close();
        
	}
	
	static void Atualizar(long id) throws Exception{
		
		ContatoGrupoDAOImpl obj = new ContatoGrupoDAOImpl();
		
		Contatogrupo entidade = new Contatogrupo();
        
		entidade.setId(id);
        entidade.setAtivo(0);
        entidade.setNome("Sarava alterado");
        entidade.setStatus(0);
     
        obj.Atualizar(entidade);
        
        
	}
	
	static void Deletar(long id) throws Exception{
		
		ContatoGrupoDAOImpl obj = new ContatoGrupoDAOImpl();
		Contatogrupo entidade = new Contatogrupo();
        
		entidade.setId(id);
		
		try {
			obj.Deletar(entidade);
		} catch (Exception e) {
			throw new Exception(e);	
		}
         
	}
	
	static List<Contatogrupo> Lista(){
		
		String persistenceUnitName = Constantes.persistenceUnitName;
		
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        ContatoGrupoService costumerService = new ContatoGrupoService(simpleEntityManager);
        
        return costumerService.findAll();
        
		
	}

	
	static void Listar(boolean todos,String[] filtro){
		
		String persistenceUnitName = Constantes.persistenceUnitName;
		
        SimpleEntityManager simpleEntityManager = new SimpleEntityManager(persistenceUnitName);
         
        ContatoGrupoService costumerService = new ContatoGrupoService(simpleEntityManager);
        
        if(todos==false){
		           for(Contatogrupo c : costumerService.findByFilter(filtro)){
		            System.out.println(c.getNome());
		           }
           }else{
	        	   for(Contatogrupo c : costumerService.findAll()){
	                   System.out.println(c.getNome());
	               }
	        }
         
        simpleEntityManager.close();
		
	}
	
	

}
