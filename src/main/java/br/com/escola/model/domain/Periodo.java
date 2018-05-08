package br.com.escola.model.domain;

public enum Periodo {

	PRIMEIRO_SEMESTRE("1º Semestre"),
	SEGUNDO_SEMESTRE("2º Semestre"),
	TERCEIRO_SEMESTRE("3º Semestre"),
	QUARTO_SEMESTRE("4º Semestre"),
	RECUPERACAO("Recuperação");
	
	private String nome;

	private Periodo(String nome) {
		this.nome = nome;
	}
	
	public String getNome() {
		return nome;
	}
}
