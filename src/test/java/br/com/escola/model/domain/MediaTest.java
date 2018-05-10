package br.com.escola.model.domain;

import static org.junit.Assert.*;

import org.junit.Test;

public class MediaTest {

	@Test
	public void testarMediaMatematica() {
		//cenário
		Disciplina matematica = new Disciplina(1, "Matematica", "MAT");
		
		Aluno jose = new Aluno();
		jose.setNome("José");
		
		Nota notaSemestre1 = new Nota(matematica, Periodo.PRIMEIRO_SEMESTRE, 8);
		Nota notaSemestre2 = new Nota(matematica, Periodo.SEGUNDO_SEMESTRE, 5);
		Nota notaSemestre3 = new Nota(matematica, Periodo.TERCEIRO_SEMESTRE, 5);
		Nota notaSemestre4 = new Nota(matematica, Periodo.QUARTO_SEMESTRE, 6);
		
		jose.getBoletim().adicionarNota(notaSemestre1);
		jose.getBoletim().adicionarNota(notaSemestre2);
		jose.getBoletim().adicionarNota(notaSemestre3);
		jose.getBoletim().adicionarNota(notaSemestre4);
		
		jose.colocaEmRecuperacao();
		
		//chamada do método
		double mediaFinalMatematica = jose.getMediaFinal(matematica);
		
		//teste
		assertEquals(3, mediaFinalMatematica, 0.001);
	}
}
