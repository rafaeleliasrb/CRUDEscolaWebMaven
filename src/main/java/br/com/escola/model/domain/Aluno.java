package br.com.escola.model.domain;

import java.util.List;
import java.util.Optional;

/**
 * @author 13raf
 *
 */
/**
 * @author 13raf
 *
 */
/**
 * @author 13raf
 *
 */
public class Aluno extends Pessoa {

	private static final int MATRICULADO = 1;
	private static final int EM_RECUPERACAO = 2;
	private static final int REPROVADO = 3;
	private static final int APROVADO = 4;
	
	private String telefone;
	private String curso;
	private int idade;
	private float nota;
	private boolean isMatriculado;
	private Boletim boletim;
	private int statusAtual;

	public Aluno() {
		statusAtual = MATRICULADO;
		boletim = new Boletim();
	}
	
	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getNota() {
		return nota;
	}

	public void setNota(float nota) {
		this.nota = nota;
	}

	public boolean isMatriculado() {
		return isMatriculado;
	}

	public void setMatriculado(boolean isMatriculado) {
		this.isMatriculado = isMatriculado;
	}
	
	public Boletim getBoletim() {
		return boletim;
	}
	
	public double getMediaFinal(Disciplina disciplina) {
		double mediaNotasAnoLetivo = boletim.getMediaAnoLetivo(disciplina);
		Optional<Nota> notaRecuperacao = boletim.getNotaRecuperacao(disciplina);
		if(statusAtual == MATRICULADO) {
			return mediaNotasAnoLetivo;
		}
		else if(statusAtual == APROVADO) {
			if(mediaNotasAnoLetivo >= 7) {
				return mediaNotasAnoLetivo;
			}
			else {
				return (mediaNotasAnoLetivo + notaRecuperacao.get().getValor())/2;
			}
		}
		else if(statusAtual == EM_RECUPERACAO) {
			return mediaNotasAnoLetivo/2;
		}
		else {
			if(notaRecuperacao.isPresent()) {
				return (mediaNotasAnoLetivo + notaRecuperacao.get().getValor())/2;
			}
			else {
				return mediaNotasAnoLetivo/2;
			}
		}
	}
}
