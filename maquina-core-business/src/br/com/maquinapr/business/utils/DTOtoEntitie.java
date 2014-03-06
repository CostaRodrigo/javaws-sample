package br.com.maquinapr.business.utils;

import javax.xml.datatype.DatatypeConfigurationException;

import br.com.maquinapr.dataaccess.complextypes.AgendamentoDisparo;
import br.com.maquinapr.dataaccess.complextypes.ContatoGrupo;
import br.com.maquinapr.dataaccess.complextypes.HistoricoEnvio;
import br.com.maquinapr.dataaccess.complextypes.LogDisparo;
import br.com.maquinapr.dataaccess.complextypes.LogoAssinatura;
import br.com.maquinapr.dataaccess.complextypes.LogoCliente;
import br.com.maquinapr.dataaccess.complextypes.LogoMaquina;
import br.com.maquinapr.dataaccess.complextypes.LogoProduto;
import br.com.maquinapr.dataaccess.complextypes.LogoTemplate;
import br.com.maquinapr.dataaccess.complextypes.ModeloTitulo;
import br.com.maquinapr.dataaccess.complextypes.Noticia;
import br.com.maquinapr.dataaccess.complextypes.NoticiaClipping;
import br.com.maquinapr.dataaccess.complextypes.Produto;
import br.com.maquinapr.dataaccess.complextypes.Sender;
import br.com.maquinapr.entities.Agendamentodisparo;
import br.com.maquinapr.entities.Contato;
import br.com.maquinapr.entities.Contatogrupo;
import br.com.maquinapr.entities.Historicoenvio;
import br.com.maquinapr.entities.Logdisparo;
import br.com.maquinapr.entities.Logoassinatura;
import br.com.maquinapr.entities.Logocliente;
import br.com.maquinapr.entities.Logomaquina;
import br.com.maquinapr.entities.Logoproduto;
import br.com.maquinapr.entities.Logotemplate;
import br.com.maquinapr.entities.Modelo;
import br.com.maquinapr.entities.Modelotitulo;
import br.com.maquinapr.entities.Noticiaclipping;

public class DTOtoEntitie {
	
	public Contatogrupo ContatogrupoEntitie(ContatoGrupo dto){
		
		Contatogrupo retorno = new Contatogrupo();
		
		retorno.setAtivo((int) dto.getAtivo());
		retorno.setId(dto.getId());
		retorno.setNome(dto.getNome());
		retorno.setStatus(dto.getStatus());
		
		return retorno;
		
	}
	
	public ContatoGrupo ContatogrupoDTO(Contatogrupo en){
		
		ContatoGrupo retorno = new ContatoGrupo();
		
		retorno.setAtivo(en.getAtivo());
		retorno.setId(en.getId());
		retorno.setNome(en.getNome());
		retorno.setStatus(en.getStatus());
		
		return retorno;
		
	}
	
public Agendamentodisparo AgendamentoDisparoEntitie(AgendamentoDisparo dto){
		
		Agendamentodisparo retorno = new Agendamentodisparo();
		
		retorno.setId(dto.getId());	
		retorno.setDatahoraagendamento(DateUtils.XMLtoDate(dto.getDataHoraAgendamento()));
		retorno.setIdDisparo(dto.getIdDisparo());
		retorno.setStatus(dto.getStatus());
		
		
		return retorno;
		
	}
	
	public AgendamentoDisparo AgendamentoDisparoDTO(Agendamentodisparo en) throws DatatypeConfigurationException {
		
		AgendamentoDisparo retorno = new AgendamentoDisparo();
		
		retorno.setId(en.getId());
		retorno.setDataHoraAgendamento(DateUtils.DateToXML(en.getDatahoraagendamento()));
		retorno.setIdDisparo(en.getIdDisparo());
		retorno.setStatus(en.getStatus());
		
		
		return retorno;
		
	}
	

public Contato ContatoEntitie(br.com.maquinapr.dataaccess.complextypes.Contato dto){
		
		Contato retorno = new Contato();
		
		retorno.setId(dto.getId());	
		retorno.setAtivo((int) dto.getAtivo());
		retorno.setDataExpiracao(DateUtils.XMLtoDate(dto.getDataExpiracao()));
		retorno.setEmail(dto.getEmail());
		retorno.setIdContatoGrupo(dto.getContatoGrupo().getId());
		retorno.setLimiteDiario((int)dto.getLimiteDiario());
		retorno.setNome(dto.getNome());
		retorno.setTipo(dto.getTipo());
		
		
		return retorno;
		
	}
	
	public br.com.maquinapr.dataaccess.complextypes.Contato ContatoDTO(Contato en) throws DatatypeConfigurationException {
		
		br.com.maquinapr.dataaccess.complextypes.Contato retorno = new br.com.maquinapr.dataaccess.complextypes.Contato();
		
		retorno.setId(en.getId());
		retorno.setAtivo(en.getAtivo());
		retorno.getContatoGrupo().setId(en.getIdContatoGrupo());
		retorno.setDataExpiracao(DateUtils.DateToXML(en.getDataExpiracao()));
		retorno.setEmail(en.getEmail());
		retorno.setLimiteDiario(en.getLimiteDiario());
		retorno.setNome(en.getNome());
		retorno.setTipo(en.getTipo());
		
		
		
		return retorno;
		
	}
	
	
public Historicoenvio HistoricoenvioEntitie(HistoricoEnvio dto){
		
		Historicoenvio retorno = new Historicoenvio();
		
		retorno.setId(dto.getId());	
		retorno.setAcessos(dto.getAcessos());
		retorno.setAssunto(dto.getAssunto());
		retorno.setDataAgendamento(DateUtils.XMLtoDate(dto.getDataAgendamento()));
		retorno.setDataEnvio(DateUtils.XMLtoDate(dto.getDataEnvio()));
		retorno.setEmailContato(dto.getEmailContato());
		retorno.setEmailFrom(dto.getEmailFrom());
		retorno.setIdContato(dto.getContato().getId());
		retorno.setIdProduto(dto.getProduto().getId());
		retorno.setObservacoes(dto.getObservacoes());
		retorno.setSucesso((int)dto.getSucesso());
		
		
		
		return retorno;
		
	}
	
	public HistoricoEnvio HistoricoEnvioDTO(Historicoenvio en) throws DatatypeConfigurationException {
		
		HistoricoEnvio retorno = new HistoricoEnvio();
		
		br.com.maquinapr.dataaccess.complextypes.Produto LinhaProduto = new br.com.maquinapr.dataaccess.complextypes.Produto();
		LinhaProduto.setId(en.getIdProduto());
		
		br.com.maquinapr.dataaccess.complextypes.Contato LinhaContato = new br.com.maquinapr.dataaccess.complextypes.Contato();
		LinhaContato.setId(en.getIdContato());
				
		retorno.setId(en.getId());
		retorno.setAcessos(en.getAcessos());
		retorno.setAssunto(en.getAssunto());
		retorno.setDataAgendamento(DateUtils.DateToXML(en.getDataAgendamento()));
		retorno.setDataEnvio(DateUtils.DateToXML(en.getDataEnvio()));
		retorno.setEmailContato(en.getEmailContato());
		retorno.setEmailFrom(en.getEmailFrom());
		retorno.setProduto(LinhaProduto);
		retorno.setContato(LinhaContato);
		retorno.setObservacoes(en.getObservacoes());
		retorno.setSucesso((int)en.getSucesso());
		
		
		
		return retorno;
		
	}

public Logdisparo LogDisparoEntitie(LogDisparo dto){
		
		Logdisparo retorno = new Logdisparo();
		
		retorno.setId(dto.getId());	
		retorno.setDatahoraenvio(DateUtils.XMLtoDate(dto.getDataHoraEnvio()));
		retorno.setExcecao(dto.getExcecao());
		retorno.setIdDisparo(dto.getIdDisparo());
		retorno.setStatus(dto.getStatus());
		
		
		return retorno;
		
	}
	
	public LogDisparo LogDisparoDTO(Logdisparo en) throws DatatypeConfigurationException {
		
		LogDisparo retorno = new LogDisparo();
				
		retorno.setId(en.getId());
		retorno.setDataHoraEnvio(DateUtils.DateToXML(en.getDatahoraenvio()));
		retorno.setExcecao(en.getExcecao());
		retorno.setIdDisparo(en.getIdDisparo());
		retorno.setStatus(en.getStatus());
		
		
		return retorno;
		
	}
	
	public Logoassinatura LogoAssinaturaEntitie(LogoAssinatura dto){
		
		Logoassinatura retorno = new Logoassinatura();
		
		retorno.setId(dto.getId());	
		retorno.setArquivo(dto.getArquivo());
		retorno.setAtivo(dto.getAtivo());
		retorno.setNome(dto.getNome());
			
		
		return retorno;
		
	}
	
	public LogoAssinatura LogoAssinaturaDTO(Logoassinatura en)  {
		
		LogoAssinatura retorno = new LogoAssinatura();
		
		retorno.setId(en.getId());
		retorno.setArquivo(en.getArquivo());
		retorno.setAtivo(en.getAtivo());
		retorno.setNome(en.getNome());
				
				
		return retorno;
		
	}
	
public Logocliente LogoClienteEntitie(LogoCliente dto){
		
		Logocliente retorno = new Logocliente();
		
		retorno.setId(dto.getId());	
		retorno.setArquivo(dto.getArquivo());
		retorno.setAtivo(dto.getAtivo());
		retorno.setMailing(dto.getMailing());
			
		
		return retorno;
		
	}
	
	public LogoCliente LogoClienteDTO(Logocliente en)  {
		
		LogoCliente retorno = new LogoCliente();
		
		retorno.setArquivo(en.getArquivo());
		retorno.setAtivo(en.getAtivo());
		retorno.setId(en.getId());
		retorno.setMailing(en.getMailing());
		retorno.setNome(en.getNome());
		retorno.setProduto(en.getProduto());
		retorno.setTemplate(en.getTemplate());
				
				
		return retorno;
		
	}
	
public Logomaquina LogoMaquinaEntitie(LogoMaquina dto){
		
		Logomaquina retorno = new Logomaquina();
		
		retorno.setId(dto.getId());	
		retorno.setArquivo(dto.getArquivo());
		retorno.setAtivo(dto.getAtivo());
		retorno.setNome(dto.getNome());
			
		
		return retorno;
		
	}
	
	public LogoMaquina LogoMaquinaDTO(Logomaquina en)  {
		
		LogoMaquina retorno = new LogoMaquina();
		
		retorno.setArquivo(en.getArquivo());
		retorno.setAtivo(en.getAtivo());
		retorno.setId(en.getId());
		retorno.setNome(en.getNome());
			
				
		return retorno;
		
	}
	
public Logoproduto LogoProdutoEntitie(LogoProduto dto){
		
		Logoproduto retorno = new Logoproduto();
		
		retorno.setId(dto.getId());	
		retorno.setArquivo(dto.getArquivo());
		retorno.setAtivo(dto.getAtivo());
		retorno.setNome(dto.getNome());
		retorno.setModulo(dto.getModulo());
		retorno.setTexto(dto.getTexto());
			
		
		return retorno;
		
	}
	
	public LogoProduto LogoProdutoDTO(Logoproduto en)  {
		
		LogoProduto retorno = new LogoProduto();
		
		retorno.setArquivo(en.getArquivo());
		retorno.setAtivo(en.getAtivo());
		retorno.setId(en.getId());
		retorno.setNome(en.getNome());
		retorno.setModulo(en.getModulo());
		retorno.setTexto(en.getTexto());
			
				
		return retorno;
		
	}
		
	

public Logotemplate LogoTemplateEntitie(LogoTemplate dto){
		
		Logotemplate retorno = new Logotemplate();
		
		retorno.setId(dto.getId());	
		retorno.setArquivo(dto.getArquivo());
		retorno.setNome(dto.getNome());
		retorno.setAtivo(String.valueOf(dto.getAtivo()));
		retorno.setCorfundoRGB1(dto.getCorfundoRGB1());
		retorno.setCorfundoRGB2(dto.getCorfundoRGB2());
		retorno.setTopo(dto.getTopo());
			
		
		return retorno;
		
	}
	
	public LogoTemplate LogoTemplateDTO(Logotemplate en)  {
		
		LogoTemplate retorno = new LogoTemplate();
		
		retorno.setArquivo(en.getArquivo());
		retorno.setAtivo(Long.parseLong(en.getAtivo()));
		retorno.setId(en.getId());
		retorno.setNome(en.getNome());
		retorno.setCorfundoRGB1(en.getCorfundoRGB1());
		retorno.setCorfundoRGB2(en.getCorfundoRGB2());
		retorno.setTopo(en.getTipo());
			
				
		return retorno;
		
	}
		
	

public Modelo ModeloEntitie(br.com.maquinapr.dataaccess.complextypes.Modelo dto){
		
		Modelo retorno = new Modelo();
		
		retorno.setId(dto.getId());	
		retorno.setIdContatoGrupo(dto.getContatoGrupo().getId());
		retorno.setIdLogoAssinatura(dto.getLogoAssinatura().getId());
		retorno.setIdLogoCliente(dto.getLogoCliente().getId());
		retorno.setIdLogoMaquina(dto.getLogoMaquina().getId());
		retorno.setIdLogoProduto(dto.getLogoProduto().getId());
		retorno.setIdLogoTemplate(dto.getLogoTemplate().getId());
		retorno.setIdSender(dto.getSender().getId());
		retorno.setNome(dto.getNome());
		retorno.setTemplateExterno(dto.getTemplateExterno());
		retorno.setTituloEmail(dto.getTituloEmail());
			
		
		return retorno;
		
	}
	
	public br.com.maquinapr.dataaccess.complextypes.Modelo ModeloDTO(Modelo en)  {
		
		br.com.maquinapr.dataaccess.complextypes.Modelo retorno = new br.com.maquinapr.dataaccess.complextypes.Modelo();
		
		ContatoGrupo LinhaCG = new ContatoGrupo();
		LinhaCG.setId(en.getIdContatoGrupo());
		
		LogoAssinatura LinhaLogoAssinatura = new LogoAssinatura();
		LinhaLogoAssinatura.setId(en.getIdLogoAssinatura());
		
		LogoCliente LinhaLogoCliente = new LogoCliente();
		LinhaLogoCliente.setId(en.getIdLogoCliente());
		
		LogoMaquina LinhaLogoMaq = new LogoMaquina();
		LinhaLogoMaq.setId(en.getIdLogoMaquina());
		
		LogoProduto LinhaPrd = new LogoProduto();
		LinhaPrd.setId(en.getIdLogoProduto());
		
		LogoTemplate LinhaLogoT = new LogoTemplate();
		LinhaLogoT.setId(en.getIdLogoTemplate());
		
		Sender LinhaSender = new Sender();
		LinhaSender.setId(en.getIdSender());
		
		
		retorno.setId(en.getId());
		retorno.setNome(en.getNome());
		retorno.setContatoGrupo(LinhaCG);
		retorno.setLogoAssinatura(LinhaLogoAssinatura);
		retorno.setLogoCliente(LinhaLogoCliente);
		retorno.setLogoMaquina(LinhaLogoMaq);
		retorno.setLogoProduto(LinhaPrd);
		retorno.setLogoTemplate(LinhaLogoT);
		retorno.setSender(LinhaSender);
		retorno.setTemplateExterno(en.getTemplateExterno());
		retorno.setTituloEmail(en.getTituloEmail());
			
				
		return retorno;
		
	}


public Modelotitulo ModeloTitutloEntitie(ModeloTitulo dto){
		
		Modelotitulo retorno = new Modelotitulo();
		
		retorno.setId(dto.getId());	
		retorno.setConteudo(dto.getConteudo());
		retorno.setData((int)dto.getData());
		retorno.setIdModelo(dto.getModelo().getId());
		retorno.setOrdem((int)dto.getOrdem());
		retorno.setTitulo(dto.getTitulo());
			
		
		return retorno;
		
	}
	
	public ModeloTitulo ModeloTituloDTO(Modelotitulo en)  {
		
		ModeloTitulo retorno = new ModeloTitulo();
		
		br.com.maquinapr.dataaccess.complextypes.Modelo LinhaModelo = new br.com.maquinapr.dataaccess.complextypes.Modelo();
		LinhaModelo.setId(en.getIdModelo());
		
		
		retorno.setId(en.getId());
		retorno.setConteudo(en.getConteudo());
		retorno.setData(en.getData());
		retorno.setModelo(LinhaModelo);
		retorno.setOrdem(en.getOrdem());
		retorno.setTitulo(en.getTitulo());
			
				
		return retorno;
		
	}

	
public Noticiaclipping NoticiaClippingEntitie(NoticiaClipping dto){
		
		Noticiaclipping retorno = new Noticiaclipping();
		
		retorno.setId(dto.getId());	
		retorno.setIdNoticia(dto.getNoticia().getId());
		retorno.setMobileURL(dto.getMobileURL());
		retorno.setWebURL(dto.getWebURL());
			
		
		return retorno;
		
	}
	
	public NoticiaClipping NoticiaClippingDTO(Noticiaclipping en)  {
		
		NoticiaClipping retorno = new NoticiaClipping();
		
		Noticia Linha = new Noticia();
		Linha.setId(en.getIdNoticia());
		
		
		retorno.setId(en.getId());
		retorno.setMobileURL(en.getMobileURL());
		retorno.setNoticia(Linha);
		retorno.setWebURL(en.getWebURL());
				
		return retorno;
		
	}	

	
public br.com.maquinapr.entities.Noticia NoticiaEntitie(Noticia dto){
		
		br.com.maquinapr.entities.Noticia retorno = new br.com.maquinapr.entities.Noticia();
		
		retorno.setId(dto.getId());	
		retorno.setConteudo(dto.getConteudo());
		retorno.setDestaque(dto.getDestaque());
		retorno.setEditada((int)dto.getEditada());
		retorno.setIdProduto(dto.getProduto().getId());
		retorno.setOrdem((int)dto.getOrdem());
		retorno.setTitulo(dto.getTitulo());
			
		
		return retorno;
		
	}
	
	public Noticia NoticiaDTO(br.com.maquinapr.entities.Noticia en)  {
		
		Noticia retorno = new Noticia();
		
		Produto Linha = new Produto();
		Linha.setId(en.getIdProduto());
		
		
		retorno.setId(en.getId());
		retorno.setConteudo(en.getConteudo());
		retorno.setDestaque(en.getDestaque());
		retorno.setEditada(en.getEditada());
		retorno.setOrdem(en.getEditada());
		retorno.setProduto(Linha);
		retorno.setTitulo(en.getTitulo());
		
				
		return retorno;
		
	}	
	

public br.com.maquinapr.entities.Produto ProdutoEntitie(Produto dto){
		
		br.com.maquinapr.entities.Produto retorno = new br.com.maquinapr.entities.Produto();
		
		retorno.setId(dto.getId());	
		retorno.setAplicarlogo(dto.getAplicarlogo());
		retorno.setAtivo(dto.getAtivo());
		retorno.setData(DateUtils.XMLtoDate(dto.getData()));
		retorno.setIdModelo(dto.getModelo().getId());
		retorno.setObservacoes(dto.getObservacoes());
		retorno.setTemplateExterno(dto.getTemplateExterno());
		retorno.setTipo(dto.getTipo());
		retorno.setTituloEmail(dto.getTituloEmail());
		
			
		
		return retorno;
		
	}
	
	public Produto ProdutoDTO(br.com.maquinapr.entities.Produto en) throws DatatypeConfigurationException  {
		
		Produto retorno = new Produto();
		
		br.com.maquinapr.dataaccess.complextypes.Modelo Linha = new br.com.maquinapr.dataaccess.complextypes.Modelo();
		Linha.setId(en.getIdModelo());
		
		
		retorno.setId(en.getId());
		retorno.setAplicarlogo(en.getAplicarlogo());
		retorno.setData(DateUtils.DateToXML(en.getData()));
		retorno.setModelo(Linha);
		retorno.setObservacoes(en.getObservacoes());
		retorno.setTemplateExterno(en.getTemplateExterno());
		retorno.setTipo(en.getTipo());
		retorno.setTituloEmail(en.getTituloEmail());
				
		return retorno;
		
	}	
	

public br.com.maquinapr.entities.Sender SenderEntitie(Sender dto){
		
		br.com.maquinapr.entities.Sender retorno = new br.com.maquinapr.entities.Sender();
		
		retorno.setId(dto.getId());	
		retorno.setEmail(dto.getEmail());
		retorno.setNome(dto.getNome());
		retorno.setSenha(dto.getSenha());
		retorno.setSmtp(dto.getSmtp());
		retorno.setUsuario(dto.getUsuario());
		
		
		return retorno;
		
	}
	
	public Sender SenderDTO(br.com.maquinapr.entities.Sender en)   {
		
		Sender retorno = new Sender();
		
		retorno.setId(en.getId());
		retorno.setEmail(en.getEmail());
		retorno.setNome(en.getNome());
		retorno.setSenha(en.getSenha());
		retorno.setSmtp(en.getSmtp());
		retorno.setUsuario(en.getUsuario());
				
		return retorno;
		
	}	
	
	
}
