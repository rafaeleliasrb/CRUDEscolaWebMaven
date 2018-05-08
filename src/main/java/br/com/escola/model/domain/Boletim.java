package br.com.escola.model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Boletim {

	private List<Nota> notas = new ArrayList<>();
	
	public List<Nota> getNotas() {
		Collections.unmodifiableList(notas);
		return notas;
	}
	
	public void adicionarNota(Nota nota) {
		notas.add(nota);
	}
}
