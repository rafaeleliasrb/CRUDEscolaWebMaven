package br.com.escola.model.domain;

public class Disciplina {

	private String nome;
	private String sigla;
	public Disciplina(String nome, String sigla) {
		super();
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}
}
