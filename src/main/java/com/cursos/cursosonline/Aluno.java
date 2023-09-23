package com.cursos.cursosonline;

import java.util.ArrayList;
import java.util.List;

public class Aluno {
	private String nome;
	private int moedas;
	private List<Curso> cursos = new ArrayList<>();
	private Boolean premium;
	
	public Aluno(String nome, int moedas, Boolean premium) {
		this.nome = nome;
		this.moedas = moedas;
		this.premium = premium;
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
	
	public Boolean verCursosETornarPremium() {
		if (this.cursos.size() >= 12) {
			this.premium = true;
			this.moedas += 3;
						
			return true;
		}
		return false;
	}

	public int getMoedas() {
		return this.moedas;
	}

	public void setCursos(List<Curso> cursos) {
		this.cursos = cursos;
	}

	
	
}
