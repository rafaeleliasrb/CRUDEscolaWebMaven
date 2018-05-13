package br.com.escola.model.domain;

public class IndicadorFactory {

	private IndicadorFactory() {
		throw new IllegalStateException("Utility class");
	}
	
	public static IndicadorTurma getIndicador(Turma turma) {
		if(turma.getTipo().equals(TipoTurma.REGULAR)) {
			return new IndicadorTurmaRegular();
		}
		else {
			return new IndicadorTurmaEspecial();
		}
	}
}
