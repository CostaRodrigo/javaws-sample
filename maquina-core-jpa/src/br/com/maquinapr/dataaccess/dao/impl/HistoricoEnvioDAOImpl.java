package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.HistoricoEnvioService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Historicoenvio;


public class HistoricoEnvioDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	HistoricoEnvioService service;
	
	public HistoricoEnvioDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new HistoricoEnvioService(manager);
	}
	
	public void Inserir(Historicoenvio item) throws Exception{
		
		Historicoenvio entidade = new Historicoenvio();
		
		
		entidade.setAcessos(item.getAcessos());
		entidade.setAssunto(item.getAssunto());
		entidade.setDataAgendamento(item.getDataAgendamento());
		entidade.setDataEnvio(item.getDataEnvio());
		entidade.setEmailContato(item.getEmailContato());
		entidade.setEmailFrom(item.getEmailFrom());
		entidade.setIdContato(item.getIdContato());
		entidade.setIdProduto(item.getIdProduto());
		entidade.setObservacoes(item.getObservacoes());
		entidade.setSucesso(item.getSucesso());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Historicoenvio item) throws Exception{
		
		Historicoenvio entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setAcessos(item.getAcessos());
		entidade.setAssunto(item.getAssunto());
		entidade.setDataAgendamento(item.getDataAgendamento());
		entidade.setDataEnvio(item.getDataEnvio());
		entidade.setEmailContato(item.getEmailContato());
		entidade.setEmailFrom(item.getEmailFrom());
		entidade.setIdContato(item.getIdContato());
		entidade.setIdProduto(item.getIdProduto());
		entidade.setObservacoes(item.getObservacoes());
		entidade.setSucesso(item.getSucesso());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Historicoenvio item) throws Exception{
		
		Historicoenvio entidade = new Historicoenvio();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Historicoenvio> ListarTodos(){
		
		List<Historicoenvio> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Historicoenvio> ListarComFiltro(String[] Filtro){
		
		List<Historicoenvio> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Historicoenvio Linha(long ID){
		
		Historicoenvio entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
