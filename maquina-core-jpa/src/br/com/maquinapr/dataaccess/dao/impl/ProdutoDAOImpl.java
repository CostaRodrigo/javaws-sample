package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ProdutoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Produto;


public class ProdutoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	ProdutoService service;
	
	public ProdutoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new ProdutoService(manager);
	}
	
	public void Inserir(Produto item) throws Exception{
		
		Produto entidade = new Produto();
		
		entidade.setAplicarlogo(item.getAplicarlogo());
		entidade.setAtivo(item.getAtivo());
		entidade.setData(item.getData());
		entidade.setIdModelo(item.getIdModelo());
		entidade.setObservacoes(item.getObservacoes());
		entidade.setTemplateExterno(item.getTemplateExterno());
		entidade.setTipo(item.getAtivo());
		entidade.setTituloEmail(item.getTituloEmail());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Produto item) throws Exception{
		
		Produto entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setAplicarlogo(item.getAplicarlogo());
		entidade.setAtivo(item.getAtivo());
		entidade.setData(item.getData());
		entidade.setIdModelo(item.getIdModelo());
		entidade.setObservacoes(item.getObservacoes());
		entidade.setTemplateExterno(item.getTemplateExterno());
		entidade.setTipo(item.getAtivo());
		entidade.setTituloEmail(item.getTituloEmail());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Produto item) throws Exception{
		
		Produto entidade = new Produto();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Produto> ListarTodos(){
		
		List<Produto> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Produto> ListarComFiltro(String[] Filtro){
		
		List<Produto> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Produto Linha(long ID){
		
		Produto entidade = service.getRow(ID);
		
		manager.close();
		
		return entidade;
        
		
	}
	


	

}
