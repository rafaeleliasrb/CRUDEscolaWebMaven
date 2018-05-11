package br.com.escola.model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Turma {

	private List<Aluno> alunos;
	
	public Turma() {
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
}
