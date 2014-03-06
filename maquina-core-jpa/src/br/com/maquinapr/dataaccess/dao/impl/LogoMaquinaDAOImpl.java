package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogoMaquinaService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logomaquina;


public class LogoMaquinaDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogoMaquinaService service;
	
	public LogoMaquinaDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogoMaquinaService(manager);
	}
	
	public void Inserir(Logomaquina item) throws Exception{
		
		Logomaquina entidade = new Logomaquina();
		
		
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logomaquina item) throws Exception{
		
		Logomaquina entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logomaquina item) throws Exception{
		
		Logomaquina entidade = new Logomaquina();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logomaquina> ListarTodos(){
		
		List<Logomaquina> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logomaquina> ListarComFiltro(String[] Filtro){
		
		List<Logomaquina> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logomaquina Linha(long ID){
		
		Logomaquina entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
