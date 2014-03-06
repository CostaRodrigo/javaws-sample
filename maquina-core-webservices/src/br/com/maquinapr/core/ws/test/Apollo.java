package br.com.maquinapr.core.ws.test;

import br.com.maquinapr.business.disparo.DisparoBO;
import br.com.maquinapr.dataaccess.complextypes.ContatoGrupo;


public class Apollo {
	
public static void main(String[] args){
		
		DisparoBO obj = new DisparoBO();
		
		//String[] query = {"nome like '%Grupo%'","status=1"};
		
		//for(ContatoGrupo c : obj.ListarComFiltro(query).getContatoGrupo()){
		for(ContatoGrupo c : obj.ListarContatoGrupo(null).getContatoGrupo()){
			System.out.print(c.getNome());
		}
		
	}


}
