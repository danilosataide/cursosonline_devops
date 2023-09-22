package com.cursos.cursosonline;

public class Curso {
	private String nome;
	private int preco;
	private Boolean premium;
	
	public Curso(String nome, int preco, Boolean premium) {
		this.nome = nome;
		this.preco = preco;
		this.premium = premium;
	}
	
	public int getPreco() {
		return this.preco;
	}
}
