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
		IndicadorTurma indicadorTurma;
		if(turmaRegular.getTipo().equals(TipoTurma.REGULAR)) {
			indicadorTurma = new IndicadorTurmaRegular();
		}
		else {
			indicadorTurma = new IndicadorTurmaEspecial();
		}
		
		StatusIndicador statusIndicador = indicadorTurma.calcula(turmaRegular);
		
		assertEquals(StatusIndicador.BOM, statusIndicador);
	}
}
