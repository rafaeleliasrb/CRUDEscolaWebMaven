package br.com.escola.model.domain;

public enum StatusIndicador {

	BOM("Bom"),
	REGULAR("Regular"),
	RUIM("Ruim");
	
	private String status;

	private StatusIndicador(String status) {
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
}
