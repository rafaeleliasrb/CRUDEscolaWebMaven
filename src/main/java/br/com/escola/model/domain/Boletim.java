package br.com.escola.model.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Boletim {

	private List<Nota> notas = new ArrayList<>();
	
	public List<Nota> getNotas() {
		return Collections.unmodifiableList(notas);
	}
	
	public void adicionarNota(Nota nota) {
		notas.add(nota);
	}
	
	public List<Nota> getNotasAnoLetivoPorDisciplina(Disciplina disciplina) {
		return notas.stream()
				.filter(nota -> nota.getDisciplina().getCodigo() == disciplina.getCodigo())
				.filter(nota -> !nota.getPeriodo().equals(Periodo.RECUPERACAO))
				.collect(Collectors.toList());
	}
	
	public Optional<Nota> getNotaRecuperacao(Disciplina disciplina) {
		return notas.stream()
				.filter(nota -> nota.getDisciplina().getCodigo() == disciplina.getCodigo())
				.filter(nota -> nota.getPeriodo().equals(Periodo.RECUPERACAO))
				.findFirst();
	}
	
	public double getMediaAnoLetivo(Disciplina disciplina) {
		return getNotasAnoLetivoPorDisciplina(disciplina).stream()
			.mapToDouble(Nota::getValor)
			.average()
			.getAsDouble();
	}
}
