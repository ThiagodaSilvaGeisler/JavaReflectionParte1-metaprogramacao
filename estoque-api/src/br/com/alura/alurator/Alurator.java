package br.com.alura.alurator;

public class Alurator {
	
	
	private String pacoteBase;
	
	public Alurator(String pacoteBase) {
		this.pacoteBase = pacoteBase;
	}
	
	
	
	public Object executa(String url) {
		// processa a requisicao executando o método da classe em questãp
		
		String[] partesUrl = url.replaceFirst("/", "").split("/");
		
		String nomeControle = partesUrl[0] + "Controller";
		
		try {
			Class.forName(pacoteBase + nomeControle);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
		return null;
	}

}
