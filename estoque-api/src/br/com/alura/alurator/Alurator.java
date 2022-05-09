package br.com.alura.alurator;

public class Alurator {
	
	public Object executa(String url) {
		
		String[] partesUrl = url.replaceFirst("/", "").split("/");
		
		String nomeControle = partesUrl[0] + "Controller";
		
		return null;
	}

}
