package com.dio.bootcamp.dominio.atividades;

import java.time.LocalDate;

public class Mentoria extends Atividades{
	private LocalDate data;

	public Mentoria(String titulo, String descricao, LocalDate data) {
		super.titulo = titulo;
		super.descricao = descricao;
		this.data = data;
	}
	
	@Override
	public double calcularXP() {
		return Atividades.XP_PADRAO + 50;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	
}
