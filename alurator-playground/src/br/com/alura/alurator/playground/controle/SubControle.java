package br.com.alura.alurator.playground.controle;

public class SubControle extends Controle{
	
	private SubControle() {}
	
	private SubControle(String s) {}
	
	
	public void metodoSubControle1() {
		System.out.println("Execuntado m?todo SubControle.metodoSubControle1()");
	}
	
	private String metodoSubControle2() {
		System.out.println("Executando m?todo SubControle.metodoSubControle2()");
		return "retorno do m?todo SubControle.metodoSubControle2()";
	}

}
