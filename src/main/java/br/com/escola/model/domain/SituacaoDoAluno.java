package br.com.escola.model.domain;

public interface SituacaoDoAluno {

	public double calculaMediaFinal(Aluno aluno, Disciplina disciplina);
	public void aprova(Aluno aluno);
	public void colocaEmRecuperacao(Aluno aluno);
	public void reprova(Aluno aluno);
}
