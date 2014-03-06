package br.com.maquinapr.core.ws;

import javax.jws.WebMethod;
import javax.jws.WebService;

import br.com.maquinapr.business.disparo.DisparoBO;
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

@WebService(
		portName="DisparoPort",
		serviceName="DisparoService",
		targetNamespace="http://maquinapr.core/ws/disparo/wsdl",
		endpointInterface="br.com.maquinapr.core.ws.DisparoService"
		)
public class DisparoService implements DisparoServiceWS {

	DisparoBO obj=null;
	
	public DisparoService(){
		
		obj = new DisparoBO();
	}

	
	
	@WebMethod
	public String ContatoGrupo_Peristir(ContatoGrupo item, String operacao) {
	
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;

	}



	@WebMethod
	public ListaContatoGrupo ContatoGrupo_Listar(String[] Filtro) {
		ListaContatoGrupo retorno = null;
		
		try {
			retorno= obj.ListarContatoGrupo(Filtro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
		
	}



	@WebMethod
	public String AgendamentoDisparo_Peristir(AgendamentoDisparo item,
			String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaAgendamentoDisparo AgendamentoDisparo_Listar(String[] Filtro) {
		ListaAgendamentoDisparo retorno = null;
		
		try {
			retorno= obj.ListarAgendamentoDisparo(Filtro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
	}



	@WebMethod
	public String Contato_Peristir(Contato item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaContato Contato_Listar(String[] Filtro) {
		ListaContato retorno = null;
		
		try {
			retorno= obj.ListarContato(Filtro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
	}



	@WebMethod
	public String HistoricoEnvio_Peristir(HistoricoEnvio item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaHistoricoEnvio HistoricoEnvio_Listar(String[] Filtro) {
	
		ListaHistoricoEnvio retorno = null;
		
		try {
			retorno= obj.ListarHistoricoEnvio(Filtro);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;	
		
	}



	@WebMethod
	public String LogDisparo_Peristir(LogDisparo item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogDisparo LogDisparo_Listar(String[] Filtro) {
		
		ListaLogDisparo retorno = null;
		
		try {
			retorno= obj.ListarLogDisparo(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
		
	}



	@WebMethod
	public String LogoAssinatura_Peristir(LogoAssinatura item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogoAssinatura LogoAssinatura_Listar(String[] Filtro) {

		ListaLogoAssinatura retorno = null;
		
		try {
			retorno= obj.ListarLogoAssinatura(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;
		
		
	}



	@WebMethod
	public String LogoCliente_Peristir(LogoCliente item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogoCliente LogoCliente_Listar(String[] Filtro) {


		ListaLogoCliente retorno = null;
		
		try {
			retorno= obj.ListarLogoCliente(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String LogoMaquina_Peristir(LogoMaquina item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogoMaquina LogoMaquina_Listar(String[] Filtro) {


		ListaLogoMaquina retorno = null;
		
		try {
			retorno= obj.ListarLogoMaquina(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String LogoProduto_Peristir(LogoProduto item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogoProduto LogoProduto_Listar(String[] Filtro) {

		ListaLogoProduto retorno = null;
		
		try {
			retorno= obj.ListarLogoProduto(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String LogoTemplate_Peristir(LogoTemplate item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaLogoTemplate LogoTemplate_Listar(String[] Filtro) {

		ListaLogoTemplate retorno = null;
		
		try {
			retorno= obj.ListarLogoTemplate(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;

		
	}



	@WebMethod
	public String Modelo_Peristir(Modelo item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaModelo Modelo_Listar(String[] Filtro) {


		ListaModelo retorno = null;
		
		try {
			retorno= obj.ListarModelo(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String ModeloTitulo_Peristir(ModeloTitulo item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaModeloTitulo ModeloTitulo_Listar(String[] Filtro) {


		ListaModeloTitulo retorno = null;
		
		try {
			retorno= obj.ListarModeloTitulo(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;

	
	}



	@WebMethod
	public String Noticia_Peristir(Noticia item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaNoticia Noticia_Listar(String[] Filtro) {


		ListaNoticia retorno = null;
		
		try {
			retorno= obj.ListarNoticia(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String NoticiaClipping_Peristir(NoticiaClipping item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaNoticiaClipping NoticiaClipping_Listar(String[] Filtro) {


		ListaNoticiaClipping retorno = null;
		
		try {
			retorno= obj.ListarNoticiaClipping(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;

	
	}



	@WebMethod
	public String Produto_Peristir(Produto item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaProduto Produto_Listar(String[] Filtro) {


		ListaProduto retorno = null;
		
		try {
			retorno= obj.ListarProduto(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;


	}



	@WebMethod
	public String Sender_Peristir(Sender item, String operacao) {
		String retorno = null;

		try {
			obj.Persistir(item, operacao);
			retorno = "Sucesso";

		} catch (Exception e) {
			retorno = e.getMessage();
		}
		
		return retorno;
	}



	@WebMethod
	public ListaSender Sender_Listar(String[] Filtro) {


		ListaSender retorno = null;
		
		try {
			retorno= obj.ListarSender(Filtro);
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return retorno;

	
	}

			
	
	
}
