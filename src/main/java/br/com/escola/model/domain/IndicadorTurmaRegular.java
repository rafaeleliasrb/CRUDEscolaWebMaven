package br.com.escola.model.domain;

public class IndicadorTurmaRegular extends TemplateIndicadorTurma {

	@Override
	protected boolean mediaBoaAtingida(Turma turma) {
		boolean seNumeroDeAlunosComNotaMaiorQueSeteEhMaiorIgualASetentaPorcento = 
				turma.getPorcentagemAlunosComNotaMaiorQue(7) >= 70;
		return turma.getMediaDaTurma() >= 7 || seNumeroDeAlunosComNotaMaiorQueSeteEhMaiorIgualASetentaPorcento;
	}

	@Override
	protected boolean mediaRegularAtingida(Turma turma) {
		return turma.getMediaDaTurma() < 7 && turma.getMediaDaTurma() >= 5;
	}
}
