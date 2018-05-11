package br.com.escola.model.domain;

public class IndicadorTurmaRegular implements IndicadorTurma {

	public StatusIndicador calcula(Turma turma) {
		boolean seNumeroDeAlunosComNotaMaiorQueSeteEhMaiorIgualASetentaPorcento = 
				turma.getPorcentagemAlunosComNotaMaiorQue(7) >= 70;
		if(turma.getMediaDaTurma() >= 7 || seNumeroDeAlunosComNotaMaiorQueSeteEhMaiorIgualASetentaPorcento) {
			return StatusIndicador.BOM;
		}
		else if(turma.getMediaDaTurma() < 7 && turma.getMediaDaTurma() >= 5) {
			return StatusIndicador.REGULAR;
		}
		else {
			return StatusIndicador.RUIM;
		}
	}
}
