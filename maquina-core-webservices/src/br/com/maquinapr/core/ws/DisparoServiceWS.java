package br.com.maquinapr.core.ws;

import javax.jws.WebService;

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




@WebService(targetNamespace = "http://maquinapr.core/ws/disparo/wsdl")
public interface DisparoServiceWS {
	
	public String AgendamentoDisparo_Peristir(AgendamentoDisparo item,String operacao);
	public ListaAgendamentoDisparo AgendamentoDisparo_Listar(String[] Filtro);
	
	public String Contato_Peristir(Contato item,String operacao);
	public ListaContato Contato_Listar(String[] Filtro);
		
	public String ContatoGrupo_Peristir(ContatoGrupo item,String operacao);
	public ListaContatoGrupo ContatoGrupo_Listar(String[] Filtro);
	
	public String HistoricoEnvio_Peristir(HistoricoEnvio item,String operacao);
	public ListaHistoricoEnvio HistoricoEnvio_Listar(String[] Filtro);
	
	public String LogDisparo_Peristir(LogDisparo item,String operacao);
	public ListaLogDisparo LogDisparo_Listar(String[] Filtro);
	
	public String LogoAssinatura_Peristir(LogoAssinatura item,String operacao);
	public ListaLogoAssinatura LogoAssinatura_Listar(String[] Filtro);
	
	public String LogoCliente_Peristir(LogoCliente item,String operacao);
	public ListaLogoCliente LogoCliente_Listar(String[] Filtro);
	
	public String LogoMaquina_Peristir(LogoMaquina item,String operacao);
	public ListaLogoMaquina LogoMaquina_Listar(String[] Filtro);
	
	public String LogoProduto_Peristir(LogoProduto item,String operacao);
	public ListaLogoProduto LogoProduto_Listar(String[] Filtro);
	
	public String LogoTemplate_Peristir(LogoTemplate item,String operacao);
	public ListaLogoTemplate LogoTemplate_Listar(String[] Filtro);
	
	public String Modelo_Peristir(Modelo item,String operacao);
	public ListaModelo Modelo_Listar(String[] Filtro);
	
	public String ModeloTitulo_Peristir(ModeloTitulo item,String operacao);
	public ListaModeloTitulo ModeloTitulo_Listar(String[] Filtro);
	
	public String Noticia_Peristir(Noticia item,String operacao);
	public ListaNoticia Noticia_Listar(String[] Filtro);
	
	public String NoticiaClipping_Peristir(NoticiaClipping item,String operacao);
	public ListaNoticiaClipping NoticiaClipping_Listar(String[] Filtro);
	
	public String Produto_Peristir(Produto item,String operacao);
	public ListaProduto Produto_Listar(String[] Filtro);
	
	public String Sender_Peristir(Sender item,String operacao);
	public ListaSender Sender_Listar(String[] Filtro);
			
		
}
