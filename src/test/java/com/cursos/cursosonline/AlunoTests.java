package com.cursos.cursosonline;

import static org.junit.Assert.assertEquals;

import java.io.Serial;
import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class AlunoTests {
	
	@Test
	public void alunoNaoTemTresCursos() {
		Aluno aluno = new Aluno("Jorgi", 20, false);
		
		Curso curso1 = new Curso("Calculo I", 0, false);
		Curso curso2 = new Curso("Calculo II", 0, false);
		Curso curso3 = new Curso("Calculo III", 0, false);
		
		aluno.addCurso(curso1);
		aluno.addCurso(curso2);
		aluno.addCurso(curso3);
		
		Curso curso4 = new Curso("Fenomenos Eletricos", 0, false);
		
		assertEquals(false, aluno.addCurso(curso4));
	}
	
	@Test
	public void alunoNaoTemMoedasSuficientes() {
		Aluno aluno = new Aluno("Jorgi", 3, false);
		
		Curso curso = new Curso("Fenomenos Eletricos", 5, true);
		
		assertEquals(false, aluno.addCurso(curso));
	}
	
	@Test
	public void alunoRecebePremiumCom12Cursos() {
		Aluno aluno = new Aluno("Jonas", 15, false);
		List<Curso> cursos = new ArrayList<>();
		
		for (int i = 1; i <= 12; i++) {
			Curso curso = new Curso("Curso " + i, 50, false);
			cursos.add(curso);
		}
		aluno.setCursos(cursos);

		assertEquals(true, aluno.verCursosETornarPremium());
	}

	@Test
	public void alunoRecebe3MoedasCom12Cursos() {
		Aluno aluno = new Aluno("Joaquim", 0, false);
		List<Curso> cursos = new ArrayList<>();;
		
		int moedasBckp = aluno.getMoedas();

		for (int i = 0; i < 12; i++) {
			Curso curso = new Curso("Curso " + i, 50, false);
			cursos.add(curso);//addCursos
		}
		aluno.setCursos(cursos);//para teste a função setCursos
		aluno.verCursosETornarPremium();

		assertEquals(moedasBckp + 3, aluno.getMoedas());
	}


}
