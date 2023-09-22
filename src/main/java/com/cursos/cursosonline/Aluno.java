package com.cursos.cursosonline;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int moedas;
	private List<Curso> cursos = new ArrayList<>();
	
	public Aluno(String nome, int moedas) {
		this.nome = nome;
		this.moedas = moedas;
	}
	
	public Boolean addCurso(Curso curso) {
		if (cursos.size() < 3) {
			if(!gastarMoedas(curso.getPreco()))
				return false;
			this.cursos.add(curso);
			return true;
		}
		return false;
	}
	
	private Boolean gastarMoedas(int preco) {
		if (this.moedas < preco)
			return false;
		
		this.moedas -= preco;
		return true;
	}
}
