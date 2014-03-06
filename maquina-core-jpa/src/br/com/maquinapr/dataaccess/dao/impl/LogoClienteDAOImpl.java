package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogoClienteService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logocliente;


public class LogoClienteDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogoClienteService service;
	
	public LogoClienteDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogoClienteService(manager);
	}
	
	public void Inserir(Logocliente item) throws Exception{
		
		Logocliente entidade = new Logocliente();
		
		
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setMailing(item.getMailing());
		entidade.setProduto(item.getProduto());
		entidade.setTemplate(item.getTemplate());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logocliente item) throws Exception{
		
		Logocliente entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setMailing(item.getMailing());
		entidade.setProduto(item.getProduto());
		entidade.setTemplate(item.getTemplate());
		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logocliente item) throws Exception{
		
		Logocliente entidade = new Logocliente();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logocliente> ListarTodos(){
		
		List<Logocliente> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logocliente> ListarComFiltro(String[] Filtro){
		
		List<Logocliente> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logocliente Linha(long ID){
		
		Logocliente entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
