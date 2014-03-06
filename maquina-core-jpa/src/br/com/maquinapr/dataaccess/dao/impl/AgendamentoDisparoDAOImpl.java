package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.AgendamentoDisparoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Agendamentodisparo;


public class AgendamentoDisparoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	AgendamentoDisparoService service;
	
	public AgendamentoDisparoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new AgendamentoDisparoService(manager);
	}
	
	public void Inserir(Agendamentodisparo item) throws Exception{
		
		Agendamentodisparo entidade = new Agendamentodisparo();
		
		
		entidade.setDatahoraagendamento(item.getDatahoraagendamento());
		entidade.setIdDisparo(item.getIdDisparo());
		entidade.setStatus(item.getStatus());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Agendamentodisparo item) throws Exception{
		
		Agendamentodisparo entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setDatahoraagendamento(item.getDatahoraagendamento());
		entidade.setIdDisparo(item.getIdDisparo());
		entidade.setStatus(item.getStatus());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Agendamentodisparo item) throws Exception{
		
		Agendamentodisparo entidade = new Agendamentodisparo();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Agendamentodisparo> ListarTodos(){
		
		List<Agendamentodisparo> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Agendamentodisparo> ListarComFiltro(String[] Filtro){
		
		List<Agendamentodisparo> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Agendamentodisparo Linha(long ID){
		
	Agendamentodisparo entidade = service.getRow(ID);
		
		manager.close();
		
		return entidade;
        
		
	}
	

}
