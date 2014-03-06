package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.NoticiaService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Noticia;


public class NoticiaDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	NoticiaService service;
	
	public NoticiaDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new NoticiaService(manager);
	}
	
	public void Inserir(Noticia item) throws Exception{
		
		Noticia entidade = new Noticia();
		
		entidade.setConteudo(item.getConteudo());
		entidade.setDestaque(item.getDestaque());
		entidade.setEditada(item.getEditada());
		entidade.setIdProduto(item.getIdProduto());
		entidade.setOrdem(item.getOrdem());
		entidade.setTitulo(item.getTitulo());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Noticia item) throws Exception{
		
		Noticia entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setConteudo(item.getConteudo());
		entidade.setDestaque(item.getDestaque());
		entidade.setEditada(item.getEditada());
		entidade.setIdProduto(item.getIdProduto());
		entidade.setOrdem(item.getOrdem());
		entidade.setTitulo(item.getTitulo());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Noticia item) throws Exception{
		
		Noticia entidade = new Noticia();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Noticia> ListarTodos(){
		
		List<Noticia> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Noticia> ListarComFiltro(String[] Filtro){
		
		List<Noticia> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Noticia Linha(long ID){
		
		Noticia entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
