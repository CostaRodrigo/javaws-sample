package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.NoticiaClippingService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Noticiaclipping;


public class NoticiaClippingDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	NoticiaClippingService service;
	
	public NoticiaClippingDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new NoticiaClippingService(manager);
	}
	
	public void Inserir(Noticiaclipping item) throws Exception{
		
		Noticiaclipping entidade = new Noticiaclipping();
		
		entidade.setIdNoticia(item.getIdNoticia());
		entidade.setMobileURL(item.getMobileURL());
		entidade.setWebURL(item.getWebURL());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Noticiaclipping item) throws Exception{
		
		Noticiaclipping entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setIdNoticia(item.getIdNoticia());
		entidade.setMobileURL(item.getMobileURL());
		entidade.setWebURL(item.getWebURL());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Noticiaclipping item) throws Exception{
		
		Noticiaclipping entidade = new Noticiaclipping();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Noticiaclipping> ListarTodos(){
		
		List<Noticiaclipping> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Noticiaclipping> ListarComFiltro(String[] Filtro){
		
		List<Noticiaclipping> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Noticiaclipping Linha(long ID){
		
		Noticiaclipping entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
