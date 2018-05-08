package br.com.escola.model.domain;

public class Nota {

	private Disciplina disciplina;
	private Periodo periodo;
	private double valor;
	public Nota(Disciplina disciplina, Periodo periodo, double valor) {
		super();
		this.disciplina = disciplina;
		this.periodo = periodo;
		this.valor = valor;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}
	
	public Periodo getPeriodo() {
		return periodo;
	}
	
	public double getValor() {
		return valor;
	}
}
