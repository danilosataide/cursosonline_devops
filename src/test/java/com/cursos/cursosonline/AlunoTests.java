package com.cursos.cursosonline;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

class AlunoTests {
	
	@Test
	public void alunoNaoTemTresCursos() {
		Aluno aluno = new Aluno("Jorgi", 20);
		
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
		Aluno aluno = new Aluno("Jorgi", 3);
		
		Curso curso = new Curso("Fenomenos Eletricos", 5, true);
		
		assertEquals(false, aluno.addCurso(curso));
	}


}
