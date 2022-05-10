package br.com.alura.alurator;

public class Alurator {
	
	
	private String pacoteBase;
	
	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}
	
	
	
	public Object executa(String url) {
		// processa a requisicao executando o método da classe em questãp
		
		// produto lista
		
		String[] partesUrl = url.replaceFirst("/", "").split("/");
		
		String nomeControle = Character.toUpperCase(partesUrl[0].charAt(0)) + partesUrl[0].substring(1) + "Controller";
		
		try {
			Class <?> classeControle = Class.forName(pacoteBase + nomeControle);
			Object instanciaControle = classeControle.newInstance();
			System.out.println(instanciaControle);
			return null;
		} catch (ClassNotFoundException| InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		
	}

}
