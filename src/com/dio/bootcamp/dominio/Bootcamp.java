package com.dio.bootcamp.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import com.dio.bootcamp.dominio.atividades.Atividades;

public class Bootcamp {
	private String nome;
	private String descricao;
	private final LocalDate dataInicial = LocalDate.now();
	private final LocalDate dataFinal = dataInicial.plusDays(45);
	private Set<Atividades> atividades = new LinkedHashSet<Atividades>();
	private Set <Dev> devs = new HashSet<Dev>();
	
	public Bootcamp(String nome, String descricao, Set<Atividades> atividades) {
		this.nome = nome;
		this.descricao = descricao;
		this.atividades.addAll(atividades);
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	
	public Set<Atividades> getAtividades() {
		return atividades;
	}
	
	public Set<Dev> getDevs() {
		return devs;
	}
	public void setDevs(Dev devs) {
		this.devs.add(devs);
	}
	public LocalDate getDataInicial() {
		return dataInicial;
	}
	public LocalDate getDataFinal() {
		return dataFinal;
	}
	
}
