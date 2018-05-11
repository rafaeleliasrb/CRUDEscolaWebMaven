package br.com.escola.model.domain;

public class IndicadorTurmaEspecial extends TemplateIndicadorTurma {

	@Override
	protected boolean mediaBoaAtingida(Turma turma) {
		return turma.getMediaDaTurma() >= 8;
	}

	@Override
	protected boolean mediaRegularAtingida(Turma turma) {
		return turma.getMediaDaTurma() < 8 && turma.getMediaDaTurma() >=7;
	}
}
