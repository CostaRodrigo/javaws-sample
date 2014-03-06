package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.SenderService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Sender;


public class SenderDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	SenderService service;
	
	public SenderDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new SenderService(manager);
	}
	
	public void Inserir(Sender item) throws Exception{
		
		Sender entidade = new Sender();
		
		entidade.setEmail(item.getEmail());
		entidade.setNome(item.getNome());
		entidade.setSenha(item.getSenha());
		entidade.setSmtp(item.getSmtp());
		entidade.setUsuario(item.getUsuario());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Sender item) throws Exception{
		
		Sender entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setEmail(item.getEmail());
		entidade.setNome(item.getNome());
		entidade.setSenha(item.getSenha());
		entidade.setSmtp(item.getSmtp());
		entidade.setUsuario(item.getUsuario());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Sender item) throws Exception{
		
		Sender entidade = new Sender();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Sender> ListarTodos(){
		
		List<Sender> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Sender> ListarComFiltro(String[] Filtro){
		
		List<Sender> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Sender Linha(long ID){
		
		Sender entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		


}
