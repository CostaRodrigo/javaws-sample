package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogDisparoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logdisparo;


public class LogDisparoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogDisparoService service;
	
	public LogDisparoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogDisparoService(manager);
	}
	
	public void Inserir(Logdisparo item) throws Exception{
		
		Logdisparo entidade = new Logdisparo();
		
		
		entidade.setDatahoraenvio(item.getDatahoraenvio());
		entidade.setExcecao(item.getExcecao());
		entidade.setIdDisparo(item.getIdDisparo());
		entidade.setStatus(item.getStatus());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logdisparo item) throws Exception{
		
		Logdisparo entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setDatahoraenvio(item.getDatahoraenvio());
		entidade.setExcecao(item.getExcecao());
		entidade.setIdDisparo(item.getIdDisparo());
		entidade.setStatus(item.getStatus());
		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logdisparo item) throws Exception{
		
		Logdisparo entidade = new Logdisparo();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logdisparo> ListarTodos(){
		
		List<Logdisparo> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logdisparo> ListarComFiltro(String[] Filtro){
		
		List<Logdisparo> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logdisparo Linha(long ID){
		
		Logdisparo entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
