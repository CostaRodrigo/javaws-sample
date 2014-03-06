package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.LogoTemplateService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Logotemplate;


public class LogoTemplateDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	LogoTemplateService service;
	
	public LogoTemplateDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new LogoTemplateService(manager);
	}
	
	public void Inserir(Logotemplate item) throws Exception{
		
		Logotemplate entidade = new Logotemplate();
		
		
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setCorfundoRGB1(item.getCorfundoRGB1());
		entidade.setCorfundoRGB2(item.getCorfundoRGB2());
		entidade.setTipo(item.getTipo());
		entidade.setTopo(item.getTopo());
		
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Logotemplate item) throws Exception{
		
		Logotemplate entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setArquivo(item.getArquivo());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setCorfundoRGB1(item.getCorfundoRGB1());
		entidade.setCorfundoRGB2(item.getCorfundoRGB2());
		entidade.setTipo(item.getTipo());
		entidade.setTopo(item.getTopo());
				
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Logotemplate item) throws Exception{
		
		Logotemplate entidade = new Logotemplate();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Logotemplate> ListarTodos(){
		
		List<Logotemplate> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Logotemplate> ListarComFiltro(String[] Filtro){
		
		List<Logotemplate> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Logotemplate Linha(long ID){
		
		Logotemplate entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
