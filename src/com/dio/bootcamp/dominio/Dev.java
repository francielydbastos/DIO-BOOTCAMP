package com.dio.bootcamp.dominio;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

import com.dio.bootcamp.dominio.atividades.Atividades;

public class Dev {
	private String nome;
	private Set<Atividades> atividadesInscritas = new LinkedHashSet<>();
	private Set<Atividades> atividadesConcluidas = new LinkedHashSet<>();
	
	public Dev(String nome) {
		this.nome = nome;
	}
	
	public void inscreverBootcamp(Bootcamp bootcamp) {
		this.atividadesInscritas.addAll(bootcamp.getAtividades());
		bootcamp.setDevs(this);
	}
	
	public void progredir() {
		Optional<Atividades> atividades = this.atividadesInscritas.stream().findFirst();
		
		if (atividades.isPresent()) {
			this.atividadesConcluidas.add(atividades.get());
			this.atividadesInscritas.remove(atividades.get());
		} else {
			System.err.println("Você não está matriculado em nenhuma atividade.");
		}
	}
	
	public double calcularTotalXP() {
		return this.atividadesConcluidas
				.stream()
				.mapToDouble(atividade -> atividade.calcularXP())
				.sum();
	}

	public String getNome() {
		return nome;
	}

	public Set<Atividades> getAtividadesInscritas() {
		return atividadesInscritas;
	}

	public Set<Atividades> getAtividadesConcluidas() {
		return atividadesConcluidas;
	}
	
	
}
