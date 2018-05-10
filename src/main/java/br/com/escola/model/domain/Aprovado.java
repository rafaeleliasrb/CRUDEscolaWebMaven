package br.com.escola.model.domain;

import java.util.Optional;

public class Aprovado implements SituacaoDoAluno {

	@Override
	public double calculaMediaFinal(Aluno aluno, Disciplina disciplina) {
		double mediaNotasAnoLetivo = aluno.getBoletim().getMediaAnoLetivo(disciplina);
		Optional<Nota> notaRecuperacao = aluno.getBoletim().getNotaRecuperacao(disciplina);
		if(notaRecuperacao.isPresent()) {
			return (mediaNotasAnoLetivo + notaRecuperacao.get().getValor())/2;
		}
		else {
			return mediaNotasAnoLetivo;
		}
	}

	@Override
	public void aprova(Aluno aluno) {
		throw new RuntimeException("Aluno já esta aprovado");
	}

	@Override
	public void colocaEmRecuperacao(Aluno aluno) {
		throw new RuntimeException("Um aluno já aprovado não pode ir para recuperação");
	}

	@Override
	public void reprova(Aluno aluno) {
		throw new RuntimeException("Um aluno já aprovado não pode ser reprovado");
	}

}
