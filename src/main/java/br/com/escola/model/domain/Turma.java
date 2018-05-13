package br.com.escola.model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

	private List<Aluno> alunos;
	private TipoTurma tipo;
	
	public Turma() {
		tipo = TipoTurma.REGULAR;
		alunos = new ArrayList<>();
	}
	
	public Turma(TipoTurma tipo) {
		this.tipo = tipo;
		alunos = new ArrayList<>();
	}
	
	public void adicionarAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public List<Aluno> getAlunos() {
		return Collections.unmodifiableList(alunos);
	}
	
	public double getMediaDaTurma() {
		return alunos.stream()
				.mapToDouble(Aluno::getMedia)
				.average()
				.getAsDouble();
	}

	public double getPorcentagemAlunosComNotaMaiorQue(double notaMinima) {
		return (alunos.stream()
				.mapToDouble(Aluno::getMedia)
				.filter(media -> media >= notaMinima)
				.count()/(double)alunos.size())*100.0;
	}
	
	public TipoTurma getTipo() {
		return tipo;
	}
}
