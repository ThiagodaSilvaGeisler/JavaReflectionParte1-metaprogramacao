package br.com.alura.alurator.reflexao;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ManipuladorConstrutor {

	private Constructor<?> construtor;

	public ManipuladorConstrutor(Constructor<?> construtor) {
		this.construtor = construtor;
		// TODO Auto-generated constructor stub
	}

	public Object invoca() {
		
		try {
			return construtor.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException e) {
			e.printStackTrace();
			return new RuntimeException(e);
		} catch(InvocationTargetException e) {
			e.printStackTrace();
			return new RuntimeException("erro no construtor!", e.getTargetException());
		}
	}

}
