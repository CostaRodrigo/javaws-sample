package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ModeloService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Modelo;


public class ModeloDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	ModeloService service;
	
	public ModeloDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new ModeloService(manager);
	}
	
	public void Inserir(Modelo item) throws Exception{
		
		Modelo entidade = new Modelo();
		
		entidade.setNome(item.getNome());
		entidade.setIdContatoGrupo(item.getIdContatoGrupo());
		entidade.setIdLogoAssinatura(item.getIdLogoAssinatura());
		entidade.setIdLogoCliente(item.getIdLogoCliente());
		entidade.setIdLogoMaquina(item.getIdLogoMaquina());
		entidade.setIdLogoProduto(item.getIdLogoProduto());
		entidade.setIdLogoTemplate(item.getIdLogoTemplate());
		entidade.setIdSender(item.getIdSender());
		entidade.setTemplateExterno(item.getTemplateExterno());
		entidade.setTituloEmail(item.getTituloEmail());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Modelo item) throws Exception{
		
		Modelo entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setNome(item.getNome());
		entidade.setIdContatoGrupo(item.getIdContatoGrupo());
		entidade.setIdLogoAssinatura(item.getIdLogoAssinatura());
		entidade.setIdLogoCliente(item.getIdLogoCliente());
		entidade.setIdLogoMaquina(item.getIdLogoMaquina());
		entidade.setIdLogoProduto(item.getIdLogoProduto());
		entidade.setIdLogoTemplate(item.getIdLogoTemplate());
		entidade.setIdSender(item.getIdSender());
		entidade.setTemplateExterno(item.getTemplateExterno());
		entidade.setTituloEmail(item.getTituloEmail());		
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Modelo item) throws Exception{
		
		Modelo entidade = new Modelo();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Modelo> ListarTodos(){
		
		List<Modelo> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Modelo> ListarComFiltro(String[] Filtro){
		
		List<Modelo> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Modelo Linha(long ID){
		
		Modelo entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
