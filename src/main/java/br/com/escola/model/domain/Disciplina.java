package br.com.escola.model.domain;

public class Disciplina {

	private int codigo;
	private String nome;
	private String sigla;
	public Disciplina(int codigo, String nome, String sigla) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sigla = sigla;
	}
	
	public String getNome() {
		return nome;
	}
	
	public String getSigla() {
		return sigla;
	}

	public int getCodigo() {
		return codigo;
	}

}
