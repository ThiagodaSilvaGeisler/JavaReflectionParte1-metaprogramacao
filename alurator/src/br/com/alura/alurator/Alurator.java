package br.com.alura.alurator;

import java.lang.reflect.InvocationTargetException;

import br.com.alura.alurator.protocolo.Request;
import br.com.alura.alurator.reflexao.Reflexao;

public class Alurator {
	
	
	private String pacoteBase;
	
	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}
	
	
	
	public Object executa(String url) {
		
		Request request = new Request(url);
		
		String nomeControle = request.getNomeControle();
		String nomeMetodo = request.getNomeMetodo();
		
					
//			Object instanciaControle = new Reflexao()
//										.refleteClasse(pacoteBase + nomeControle)
//										.getConstrutorPadrao()
//										.invoca();
			
			Object retorno = new Reflexao()
								.refleteClasse( pacoteBase + nomeControle)
								.criaInstancia()
								.getMetodo(nomeMetodo)
								.invoca();
		
			System.out.println(retorno);
			return retorno;
		
		
	}

}
