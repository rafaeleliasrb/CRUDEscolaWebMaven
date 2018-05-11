package br.com.escola.model.domain;

public abstract class TemplateIndicadorTurma implements IndicadorTurma {

	@Override
	public StatusIndicador calcula(Turma turma) {
		if(mediaBoaAtingida(turma)) {
			return StatusIndicador.BOM;
		}
		else if(mediaRegularAtingida(turma)) {
			return StatusIndicador.REGULAR;
		}
		else {
			return StatusIndicador.RUIM;
		}
	}

	protected abstract boolean mediaBoaAtingida(Turma turma);
	protected abstract boolean mediaRegularAtingida(Turma turma);
}
