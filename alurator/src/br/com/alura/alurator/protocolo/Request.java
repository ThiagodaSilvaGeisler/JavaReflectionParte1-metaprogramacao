package br.com.alura.alurator.protocolo;

public class Request {
	
	private String nomeControle;

	public Request(String url) {
		
		// processa a requisicao executando o m�todo da classe em quest�p
		
				// produto lista
				
				String[] partesUrl = url.replaceFirst("/", "").split("/");
				
				nomeControle = Character.toUpperCase(partesUrl[0].charAt(0)) + partesUrl[0].substring(1) + "Controller";
		
		
	}

	public String getNomeControle() {
		return nomeControle;
	}
}
