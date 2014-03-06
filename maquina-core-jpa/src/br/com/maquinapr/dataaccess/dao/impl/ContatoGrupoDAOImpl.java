package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ContatoGrupoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Contatogrupo;


public class ContatoGrupoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	ContatoGrupoService service;
	
	public ContatoGrupoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new ContatoGrupoService(manager);
	}
	
	public void Inserir(Contatogrupo item) throws Exception{
		
		Contatogrupo entidade = new Contatogrupo();
		
		
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setStatus(item.getStatus());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Contatogrupo item) throws Exception{
		
		Contatogrupo entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setStatus(item.getStatus());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Contatogrupo item) throws Exception{
		
		Contatogrupo entidade = new Contatogrupo();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Contatogrupo> ListarTodos(){
		
		List<Contatogrupo> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Contatogrupo> ListarComFiltro(String[] Filtro){
		
		List<Contatogrupo> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Contatogrupo Linha(long ID){
		
		Contatogrupo entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
