package br.com.maquinapr.business.disparo;

import javax.xml.datatype.DatatypeConfigurationException;

import br.com.maquinapr.business.utils.DTOtoEntitie;
import br.com.maquinapr.dataaccess.complextypes.AgendamentoDisparo;
import br.com.maquinapr.dataaccess.complextypes.Contato;
import br.com.maquinapr.dataaccess.complextypes.ContatoGrupo;
import br.com.maquinapr.dataaccess.complextypes.HistoricoEnvio;
import br.com.maquinapr.dataaccess.complextypes.ListaAgendamentoDisparo;
import br.com.maquinapr.dataaccess.complextypes.ListaContato;
import br.com.maquinapr.dataaccess.complextypes.ListaContatoGrupo;
import br.com.maquinapr.dataaccess.complextypes.ListaHistoricoEnvio;
import br.com.maquinapr.dataaccess.complextypes.ListaLogDisparo;
import br.com.maquinapr.dataaccess.complextypes.ListaLogoAssinatura;
import br.com.maquinapr.dataaccess.complextypes.ListaLogoCliente;
import br.com.maquinapr.dataaccess.complextypes.ListaLogoMaquina;
import br.com.maquinapr.dataaccess.complextypes.ListaLogoProduto;
import br.com.maquinapr.dataaccess.complextypes.ListaLogoTemplate;
import br.com.maquinapr.dataaccess.complextypes.ListaModelo;
import br.com.maquinapr.dataaccess.complextypes.ListaModeloTitulo;
import br.com.maquinapr.dataaccess.complextypes.ListaNoticia;
import br.com.maquinapr.dataaccess.complextypes.ListaNoticiaClipping;
import br.com.maquinapr.dataaccess.complextypes.ListaProduto;
import br.com.maquinapr.dataaccess.complextypes.ListaSender;
import br.com.maquinapr.dataaccess.complextypes.LogDisparo;
import br.com.maquinapr.dataaccess.complextypes.LogoAssinatura;
import br.com.maquinapr.dataaccess.complextypes.LogoCliente;
import br.com.maquinapr.dataaccess.complextypes.LogoMaquina;
import br.com.maquinapr.dataaccess.complextypes.LogoProduto;
import br.com.maquinapr.dataaccess.complextypes.LogoTemplate;
import br.com.maquinapr.dataaccess.complextypes.Modelo;
import br.com.maquinapr.dataaccess.complextypes.ModeloTitulo;
import br.com.maquinapr.dataaccess.complextypes.Noticia;
import br.com.maquinapr.dataaccess.complextypes.NoticiaClipping;
import br.com.maquinapr.dataaccess.complextypes.Produto;
import br.com.maquinapr.dataaccess.complextypes.Sender;
import br.com.maquinapr.dataaccess.dao.impl.AgendamentoDisparoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.ContatoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.ContatoGrupoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.HistoricoEnvioDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogDisparoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogoAssinaturaDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogoClienteDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogoMaquinaDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogoProdutoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.LogoTemplateDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.ModeloDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.ModeloTituloDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.NoticiaClippingDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.NoticiaDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.ProdutoDAOImpl;
import br.com.maquinapr.dataaccess.dao.impl.SenderDAOImpl;
import br.com.maquinapr.entities.Agendamentodisparo;
import br.com.maquinapr.entities.Contatogrupo;
import br.com.maquinapr.entities.Historicoenvio;
import br.com.maquinapr.entities.Logdisparo;
import br.com.maquinapr.entities.Logoassinatura;
import br.com.maquinapr.entities.Logocliente;
import br.com.maquinapr.entities.Logomaquina;
import br.com.maquinapr.entities.Logoproduto;
import br.com.maquinapr.entities.Logotemplate;

public class DisparoBO {
	
	public void Persistir(AgendamentoDisparo item,String operacao) throws Exception{
		
		try{
			
			AgendamentoDisparoDAOImpl dao = new AgendamentoDisparoDAOImpl();
						
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().AgendamentoDisparoEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().AgendamentoDisparoEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().AgendamentoDisparoEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	
	public void Persistir(Contato item,String operacao) throws Exception{
		
		try{
			
			ContatoDAOImpl dao = new ContatoDAOImpl();
						
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().ContatoEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().ContatoEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().ContatoEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}


	
	public void Persistir(ContatoGrupo item,String operacao) throws Exception{
	
		try{
			ContatoGrupoDAOImpl dao = new ContatoGrupoDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().ContatogrupoEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().ContatogrupoEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().ContatogrupoEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	
	
	public void Persistir(HistoricoEnvio item,String operacao) throws Exception{
		
		try{
			HistoricoEnvioDAOImpl dao = new HistoricoEnvioDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().HistoricoenvioEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().HistoricoenvioEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().HistoricoenvioEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	


	public void Persistir(LogDisparo item,String operacao) throws Exception{
		
		try{
			LogDisparoDAOImpl dao = new LogDisparoDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogDisparoEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogDisparoEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogDisparoEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	

	public void Persistir(LogoAssinatura item,String operacao) throws Exception{
		
		try{
			LogoAssinaturaDAOImpl dao = new LogoAssinaturaDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogoAssinaturaEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogoAssinaturaEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogoAssinaturaEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	
	
	public void Persistir(LogoCliente item,String operacao) throws Exception{
		
		try{
			LogoClienteDAOImpl dao = new LogoClienteDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogoClienteEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogoClienteEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogoClienteEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}	
	

	public void Persistir(LogoMaquina item,String operacao) throws Exception{
		
		try{
			LogoMaquinaDAOImpl dao = new LogoMaquinaDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogoMaquinaEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogoMaquinaEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogoMaquinaEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	


	public void Persistir(LogoProduto item,String operacao) throws Exception{
		
		try{
			LogoProdutoDAOImpl dao = new LogoProdutoDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogoProdutoEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogoProdutoEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogoProdutoEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}


	public void Persistir(LogoTemplate item,String operacao) throws Exception{
		
		try{
			LogoTemplateDAOImpl dao = new LogoTemplateDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().LogoTemplateEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().LogoTemplateEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().LogoTemplateEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	

public void Persistir(Modelo item,String operacao) throws Exception{
		
		try{
			ModeloDAOImpl dao = new ModeloDAOImpl();
			switch (operacao) {
			case "I":
				dao.Inserir(new DTOtoEntitie().ModeloEntitie(item));	
				break;
			case "A":
				dao.Atualizar(new DTOtoEntitie().ModeloEntitie(item));	
				break;
			case "D":
				dao.Deletar(new DTOtoEntitie().ModeloEntitie(item));	
				break;

			default:
				throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
			}
			
			
		} catch (Exception e) {
			throw new Exception(e.getMessage());
		}
	
		
	}
	

public void Persistir(ModeloTitulo item,String operacao) throws Exception{
	
	try{
		ModeloTituloDAOImpl dao = new ModeloTituloDAOImpl();
		switch (operacao) {
		case "I":
			dao.Inserir(new DTOtoEntitie().ModeloTitutloEntitie(item));	
			break;
		case "A":
			dao.Atualizar(new DTOtoEntitie().ModeloTitutloEntitie(item));	
			break;
		case "D":
			dao.Deletar(new DTOtoEntitie().ModeloTitutloEntitie(item));	
			break;

		default:
			throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
		}
		
		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

	
}

	
	
public void Persistir(Noticia item,String operacao) throws Exception{
	
	try{
		NoticiaDAOImpl dao = new NoticiaDAOImpl();
		switch (operacao) {
		case "I":
			dao.Inserir(new DTOtoEntitie().NoticiaEntitie(item));	
			break;
		case "A":
			dao.Atualizar(new DTOtoEntitie().NoticiaEntitie(item));	
			break;
		case "D":
			dao.Deletar(new DTOtoEntitie().NoticiaEntitie(item));	
			break;

		default:
			throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
		}
		
		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

	
}
	
	
public void Persistir(NoticiaClipping item,String operacao) throws Exception{
	
	try{
		NoticiaClippingDAOImpl dao = new NoticiaClippingDAOImpl();
		switch (operacao) {
		case "I":
			dao.Inserir(new DTOtoEntitie().NoticiaClippingEntitie(item));	
			break;
		case "A":
			dao.Atualizar(new DTOtoEntitie().NoticiaClippingEntitie(item));	
			break;
		case "D":
			dao.Deletar(new DTOtoEntitie().NoticiaClippingEntitie(item));	
			break;

		default:
			throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
		}
		
		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

	
}
	
public void Persistir(Produto item,String operacao) throws Exception{
	
	try{
		ProdutoDAOImpl dao = new ProdutoDAOImpl();
		switch (operacao) {
		case "I":
			dao.Inserir(new DTOtoEntitie().ProdutoEntitie(item));	
			break;
		case "A":
			dao.Atualizar(new DTOtoEntitie().ProdutoEntitie(item));	
			break;
		case "D":
			dao.Deletar(new DTOtoEntitie().ProdutoEntitie(item));	
			break;

		default:
			throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
		}
		
		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

	
}

public void Persistir(Sender item,String operacao) throws Exception{
	
	try{
		SenderDAOImpl dao = new SenderDAOImpl();
		switch (operacao) {
		case "I":
			dao.Inserir(new DTOtoEntitie().SenderEntitie(item));	
			break;
		case "A":
			dao.Atualizar(new DTOtoEntitie().SenderEntitie(item));	
			break;
		case "D":
			dao.Deletar(new DTOtoEntitie().SenderEntitie(item));	
			break;

		default:
			throw new Exception("Informe a operacao (I, A ou D) - Inserir, Alterar, Deletar");
		}
		
		
	} catch (Exception e) {
		throw new Exception(e.getMessage());
	}

	
}

//Listagens
	
public ListaAgendamentoDisparo ListarAgendamentoDisparo(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaAgendamentoDisparo retorno= new ListaAgendamentoDisparo();
	AgendamentoDisparoDAOImpl dao = new AgendamentoDisparoDAOImpl();
	
	if (Filtro.length>0){
	
		for(Agendamentodisparo cg : dao.ListarComFiltro(Filtro)){
			retorno.getAgendamentoDisparo().add(new DTOtoEntitie().AgendamentoDisparoDTO((cg)));
		}
		
	}else{
	
		for(Agendamentodisparo cg : dao.ListarTodos()){
			retorno.getAgendamentoDisparo().add(new DTOtoEntitie().AgendamentoDisparoDTO((cg)));
		}
	}
	
	return retorno;
	
}

public ListaContato ListarContato(String[] Filtro) throws DatatypeConfigurationException  {
	
	ListaContato retorno= new ListaContato();
	ContatoDAOImpl dao = new ContatoDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Contato cg : dao.ListarComFiltro(Filtro)){
			retorno.getContato().add(new DTOtoEntitie().ContatoDTO((cg)));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Contato cg : dao.ListarTodos()){
			retorno.getContato().add(new DTOtoEntitie().ContatoDTO((cg)));
		}
	}
	
	return retorno;
	
}


public ListaContatoGrupo ListarContatoGrupo(String[] Filtro) {
		
		ListaContatoGrupo retorno= new ListaContatoGrupo();
		ContatoGrupoDAOImpl dao = new ContatoGrupoDAOImpl();
		
		if (Filtro.length>0){
		
			for(Contatogrupo cg : dao.ListarComFiltro(Filtro)){
				retorno.getContatoGrupo().add(new DTOtoEntitie().ContatogrupoDTO(cg));
			}
			
		}else{
		
			for(Contatogrupo cg : dao.ListarTodos()){
				retorno.getContatoGrupo().add(new DTOtoEntitie().ContatogrupoDTO(cg));
			}
		}
		
		return retorno;
		
}
	

public ListaHistoricoEnvio ListarHistoricoEnvio(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaHistoricoEnvio retorno= new ListaHistoricoEnvio();
	HistoricoEnvioDAOImpl dao = new HistoricoEnvioDAOImpl();
	
	if (Filtro.length>0){
	
		for(Historicoenvio cg : dao.ListarComFiltro(Filtro)){
			retorno.getHistoricoEnvio().add(new DTOtoEntitie().HistoricoEnvioDTO(cg));
		}
		
	}else{
	
		for(Historicoenvio cg : dao.ListarTodos()){
			retorno.getHistoricoEnvio().add(new DTOtoEntitie().HistoricoEnvioDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaLogDisparo ListarLogDisparo(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogDisparo retorno= new ListaLogDisparo();
	LogDisparoDAOImpl dao = new LogDisparoDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logdisparo cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogDisparo().add(new DTOtoEntitie().LogDisparoDTO(cg));
		}
		
	}else{
	
		for(Logdisparo cg : dao.ListarTodos()){
			retorno.getLogDisparo().add(new DTOtoEntitie().LogDisparoDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaLogoAssinatura ListarLogoAssinatura(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogoAssinatura retorno= new ListaLogoAssinatura();
	LogoAssinaturaDAOImpl dao = new LogoAssinaturaDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logoassinatura cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogoAssinatura().add(new DTOtoEntitie().LogoAssinaturaDTO(cg));
		}
		
	}else{
	
		for(Logoassinatura cg : dao.ListarTodos()){
			retorno.getLogoAssinatura().add(new DTOtoEntitie().LogoAssinaturaDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaLogoCliente ListarLogoCliente(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogoCliente retorno= new ListaLogoCliente();
	LogoClienteDAOImpl dao = new LogoClienteDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logocliente cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogoCliente().add(new DTOtoEntitie().LogoClienteDTO(cg));
		}
		
	}else{
	
		for(Logocliente cg : dao.ListarTodos()){
			retorno.getLogoCliente().add(new DTOtoEntitie().LogoClienteDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaLogoMaquina ListarLogoMaquina(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogoMaquina retorno= new ListaLogoMaquina();
	LogoMaquinaDAOImpl dao = new LogoMaquinaDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logomaquina cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogoMaquina().add(new DTOtoEntitie().LogoMaquinaDTO(cg));
		}
		
	}else{
	
		for(Logomaquina cg : dao.ListarTodos()){
			retorno.getLogoMaquina().add(new DTOtoEntitie().LogoMaquinaDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaLogoProduto ListarLogoProduto(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogoProduto retorno= new ListaLogoProduto();
	LogoProdutoDAOImpl dao = new LogoProdutoDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logoproduto cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogoProduto().add(new DTOtoEntitie().LogoProdutoDTO(cg));
		}
		
	}else{
	
		for(Logoproduto cg : dao.ListarTodos()){
			retorno.getLogoProduto().add(new DTOtoEntitie().LogoProdutoDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaLogoTemplate ListarLogoTemplate(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaLogoTemplate retorno= new ListaLogoTemplate();
	LogoTemplateDAOImpl dao = new LogoTemplateDAOImpl();
	
	if (Filtro.length>0){
	
		for(Logotemplate cg : dao.ListarComFiltro(Filtro)){
			retorno.getLogoTemplate().add(new DTOtoEntitie().LogoTemplateDTO(cg));
		}
		
	}else{
	
		for(Logotemplate cg : dao.ListarTodos()){
			retorno.getLogoTemplate().add(new DTOtoEntitie().LogoTemplateDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaModelo ListarModelo(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaModelo retorno= new ListaModelo();
	ModeloDAOImpl dao = new ModeloDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Modelo cg : dao.ListarComFiltro(Filtro)){
			retorno.getModelo().add(new DTOtoEntitie().ModeloDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Modelo cg : dao.ListarTodos()){
			retorno.getModelo().add(new DTOtoEntitie().ModeloDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaModeloTitulo ListarModeloTitulo(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaModeloTitulo retorno= new ListaModeloTitulo();
	ModeloTituloDAOImpl dao = new ModeloTituloDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Modelotitulo cg : dao.ListarComFiltro(Filtro)){
			retorno.getModeloTitulo().add(new DTOtoEntitie().ModeloTituloDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Modelotitulo cg : dao.ListarTodos()){
			retorno.getModeloTitulo().add(new DTOtoEntitie().ModeloTituloDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaNoticia ListarNoticia(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaNoticia retorno= new ListaNoticia();
	NoticiaDAOImpl dao = new NoticiaDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Noticia cg : dao.ListarComFiltro(Filtro)){
			retorno.getNoticia().add(new DTOtoEntitie().NoticiaDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Noticia cg : dao.ListarTodos()){
			retorno.getNoticia().add(new DTOtoEntitie().NoticiaDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaNoticiaClipping ListarNoticiaClipping(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaNoticiaClipping retorno= new ListaNoticiaClipping();
	NoticiaClippingDAOImpl dao = new NoticiaClippingDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Noticiaclipping cg : dao.ListarComFiltro(Filtro)){
			retorno.getNoticiaClipping().add(new DTOtoEntitie().NoticiaClippingDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Noticiaclipping cg : dao.ListarTodos()){
			retorno.getNoticiaClipping().add(new DTOtoEntitie().NoticiaClippingDTO(cg));
		}
	}
	
	return retorno;
	
}


public ListaProduto ListarProduto(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaProduto retorno= new ListaProduto();
	ProdutoDAOImpl dao = new ProdutoDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Produto cg : dao.ListarComFiltro(Filtro)){
			retorno.getProduto().add(new DTOtoEntitie().ProdutoDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Produto cg : dao.ListarTodos()){
			retorno.getProduto().add(new DTOtoEntitie().ProdutoDTO(cg));
		}
	}
	
	return retorno;
	
}

public ListaSender ListarSender(String[] Filtro) throws DatatypeConfigurationException {
	
	ListaSender retorno= new ListaSender();
	SenderDAOImpl dao = new SenderDAOImpl();
	
	if (Filtro.length>0){
	
		for(br.com.maquinapr.entities.Sender cg : dao.ListarComFiltro(Filtro)){
			retorno.getSender().add(new DTOtoEntitie().SenderDTO(cg));
		}
		
	}else{
	
		for(br.com.maquinapr.entities.Sender cg : dao.ListarTodos()){
			retorno.getSender().add(new DTOtoEntitie().SenderDTO(cg));
		}
	}
	
	return retorno;
	
}
	
//end of BO
}
