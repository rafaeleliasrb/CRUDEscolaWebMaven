package br.com.escola.model.domain;

public class Matriculado implements SituacaoDoAluno {

	@Override
	public double calculaMediaFinal(Aluno aluno, Disciplina disciplina) {
		return aluno.getBoletim().getMediaAnoLetivo(disciplina)/4;
	}

	@Override
	public void aprova(Aluno aluno) {
		aluno.situacao = new Aprovado();
	}

	@Override
	public void colocaEmRecuperacao(Aluno aluno) {
		aluno.situacao = new EmRecuperacao();
	}

	@Override
	public void reprova(Aluno aluno) {
		aluno.situacao = new Reprovado();
	}
}
