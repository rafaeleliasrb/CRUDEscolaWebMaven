package br.com.escola.model.domain;

public class IndicadorTurmaEspecial implements IndicadorTurma {

	public StatusIndicador calcula(Turma turma) {
		if(turma.getMediaDaTurma() >= 8) {
			return StatusIndicador.BOM;
		}
		else if(turma.getMediaDaTurma() < 8 && turma.getMediaDaTurma() >=7) {
			return StatusIndicador.REGULAR;
		}
		else {
			return StatusIndicador.RUIM;
		}
	}
}
