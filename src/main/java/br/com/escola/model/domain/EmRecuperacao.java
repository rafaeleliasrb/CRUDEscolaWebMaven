package br.com.escola.model.domain;

public class EmRecuperacao implements SituacaoDoAluno {

	@Override
	public double calculaMediaFinal(Aluno aluno, Disciplina disciplina) {
		return aluno.getBoletim().getMediaAnoLetivo(disciplina)/2;
	}

	@Override
	public void aprova(Aluno aluno) {
		aluno.situacao = new Aprovado();
	}

	@Override
	public void colocaEmRecuperacao(Aluno aluno) {
		throw new RuntimeException("Aluno já esta em recuperacao");
	}

	@Override
	public void reprova(Aluno aluno) {
		aluno.situacao = new Reprovado();
	}
}
