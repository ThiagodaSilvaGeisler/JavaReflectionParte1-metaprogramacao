package br.com.alura.alurator.reflexao;

public class Reflexao {

	public ManipuladorClasse refleteClasse(String fqn) {
		try {
			Class<?> classe = Class.forName(fqn);
			
			return new ManipuladorClasse(classe);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			throw new RuntimeException(e);
		}
		
	}

}
