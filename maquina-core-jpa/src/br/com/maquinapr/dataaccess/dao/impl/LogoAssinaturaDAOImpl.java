package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogoAssinaturaService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logoassinatura;


public class LogoAssinaturaDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogoAssinaturaService service;
	
	public LogoAssinaturaDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogoAssinaturaService(manager);
	}
	
	public void Inserir(Logoassinatura item) throws Exception{
		
		Logoassinatura entidade = new Logoassinatura();
		
		
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logoassinatura item) throws Exception{
		
		Logoassinatura entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logoassinatura item) throws Exception{
		
		Logoassinatura entidade = new Logoassinatura();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logoassinatura> ListarTodos(){
		
		List<Logoassinatura> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logoassinatura> ListarComFiltro(String[] Filtro){
		
		List<Logoassinatura> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logoassinatura Linha(long ID){
		
		Logoassinatura entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
