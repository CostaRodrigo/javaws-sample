package br.com.maquinapr.dataaccess.dao.impl;

import java.util.List;

import br.com.maquinapr.dataaccess.managers.SimpleEntityManager;
import br.com.maquinapr.dataaccess.services.ContatoService;
import br.com.maquinapr.dataaccess.utils.Constantes;
import br.com.maquinapr.entities.Contato;


public class ContatoDAOImpl {
	
	String persistenceUnitName = Constantes.persistenceUnitName;
	SimpleEntityManager manager;
	ContatoService service;
	
	public ContatoDAOImpl(){
		manager = new SimpleEntityManager(persistenceUnitName);
		service = new ContatoService(manager);
	}
	
	public void Inserir(Contato item) throws Exception{
		
		Contato entidade = new Contato();
		
		
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setDataExpiracao(item.getDataExpiracao());
		entidade.setEmail(item.getEmail());
		entidade.setIdContatoGrupo(item.getIdContatoGrupo());
		entidade.setLimiteDiario(item.getLimiteDiario());
		entidade.setTipo(item.getTipo());
		
		service.insert(entidade);
		manager.close();
        
	}
	
	public void Atualizar(Contato item) throws Exception{
		
		Contato entidade = service.getRow(item.getId());
		
		entidade.setId(item.getId());
		entidade.setAtivo(item.getAtivo());
		entidade.setNome(item.getNome());
		entidade.setDataExpiracao(item.getDataExpiracao());
		entidade.setEmail(item.getEmail());
		entidade.setIdContatoGrupo(item.getIdContatoGrupo());
		entidade.setLimiteDiario(item.getLimiteDiario());
		entidade.setTipo(item.getTipo());
		
		service.update(entidade);
		manager.close();
        
	}
	
	public void Deletar(Contato item) throws Exception{
		
		Contato entidade = new Contato();
		
		entidade.setId(item.getId());
		
		service.delete(entidade);
		manager.close();
        
	}

	
	
	public List<Contato> ListarTodos(){
		
		List<Contato> retorno = service.findAll();
		manager.close();
		
		return retorno;
		
	}
	
	public List<Contato> ListarComFiltro(String[] Filtro){
		
		List<Contato> retorno = service.findByFilter(Filtro);
		manager.close();
		
		return retorno;
		
	}
	
	public Contato Linha(long ID){
		
		Contato entidade = service.getRow(ID);
			
			manager.close();
			
			return entidade;
	        
			
		}
		

	

}
