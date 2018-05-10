package br.com.escola.model.domain;

public class Aluno extends Pessoa {

	private String telefone;
	private String curso;
	private int idade;
	private float nota;
	private boolean isMatriculado;
	private Boletim boletim;
	protected SituacaoDoAluno situacao;

	public Aluno() {
		situacao = new Matriculado();
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
	
	public void aprova() {
		situacao.aprova(this);
	}
	
	public void colocaEmRecuperacao() {
		situacao.colocaEmRecuperacao(this);
	}
	
	public void reprova() {
		situacao.reprova(this);
	}
	
	public double getMediaFinal(Disciplina disciplina) {
		return situacao.calculaMediaFinal(this, disciplina);
	}
}
