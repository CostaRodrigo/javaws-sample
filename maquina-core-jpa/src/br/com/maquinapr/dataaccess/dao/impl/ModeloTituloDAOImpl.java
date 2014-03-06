package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ModeloTituloService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Modelotitulo;


public class ModeloTituloDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	ModeloTituloService service;
	
	public ModeloTituloDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new ModeloTituloService(manager);
	}
	
	public void Inserir(Modelotitulo item) throws Exception{
		
		Modelotitulo entidade = new Modelotitulo();
		
		entidade.setConteudo(item.getConteudo());
		entidade.setData(item.getData());
		entidade.setIdModelo(item.getIdModelo());
		entidade.setOrdem(item.getOrdem());
		entidade.setTitulo(item.getTitulo());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Modelotitulo item) throws Exception{
		
		Modelotitulo entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setConteudo(item.getConteudo());
		entidade.setData(item.getData());
		entidade.setIdModelo(item.getIdModelo());
		entidade.setOrdem(item.getOrdem());
		entidade.setTitulo(item.getTitulo());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Modelotitulo item) throws Exception{
		
		Modelotitulo entidade = new Modelotitulo();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Modelotitulo> ListarTodos(){
		
		List<Modelotitulo> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Modelotitulo> ListarComFiltro(String[] Filtro){
		
		List<Modelotitulo> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Modelotitulo Linha(long ID){
		
		Modelotitulo entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
