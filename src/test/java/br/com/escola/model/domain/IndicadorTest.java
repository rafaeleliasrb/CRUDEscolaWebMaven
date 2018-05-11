package br.com.escola.model.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class IndicadorTest {

	@Test
	public void calculaIndicador() {
		Turma turmaRegular = new Turma();
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(7));
		turmaRegular.adicionarAluno(new Aluno(6));
		turmaRegular.adicionarAluno(new Aluno(6));
		turmaRegular.adicionarAluno(new Aluno(6));
		
		IndicadorTurma indicadorTurma = new IndicadorTurmaRegular();
		
		StatusIndicador statusIndicador = indicadorTurma.calcula(turmaRegular);
		
		assertEquals(StatusIndicador.BOM, statusIndicador);
	}
}
