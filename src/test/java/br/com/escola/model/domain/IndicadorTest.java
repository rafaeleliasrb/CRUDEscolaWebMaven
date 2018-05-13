package br.com.escola.model.domain;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;

public class IndicadorTest {

	private static Turma turmaRegular;

	@BeforeClass
	public static void inicializaTurma() {
		turmaRegular = new Turma(TipoTurma.REGULAR);
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
	}
	
	@Test
	public void testarCalculoDoIndicador() {
		IndicadorTurma indicadorTurma = new IndicadorTurmaRegular();
		
		StatusIndicador statusIndicador = indicadorTurma.calcula(turmaRegular);
		
		assertEquals(StatusIndicador.BOM, statusIndicador);
	}
	
	@Test
	public void testarIndicadorCorretoPeloTipoDaTurma() {
		IndicadorTurma indicadorTurma = IndicadorFactory.getIndicador(turmaRegular);
		
		StatusIndicador statusIndicador = indicadorTurma.calcula(turmaRegular);
		
		assertEquals(StatusIndicador.BOM, statusIndicador);
	}
}
