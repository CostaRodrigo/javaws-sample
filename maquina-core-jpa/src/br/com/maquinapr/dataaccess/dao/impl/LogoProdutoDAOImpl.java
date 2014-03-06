package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogoProdutoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logoproduto;


public class LogoProdutoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogoProdutoService service;
	
	public LogoProdutoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogoProdutoService(manager);
	}
	
	public void Inserir(Logoproduto item) throws Exception{
		
		Logoproduto entidade = new Logoproduto();
		
		
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setModulo(item.getModulo());
		entidade.setTexto(item.getTexto());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logoproduto item) throws Exception{
		
		Logoproduto entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setModulo(item.getModulo());
		entidade.setTexto(item.getTexto());
		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logoproduto item) throws Exception{
		
		Logoproduto entidade = new Logoproduto();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logoproduto> ListarTodos(){
		
		List<Logoproduto> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logoproduto> ListarComFiltro(String[] Filtro){
		
		List<Logoproduto> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logoproduto Linha(long ID){
		
		Logoproduto entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
