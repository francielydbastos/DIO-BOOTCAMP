package com.dio.bootcamp.dominio.atividades;

public class Curso extends Atividades{
	private int cargaHoraria;

	public Curso(String titulo, String descricao, int cargaHoraria) {
		super.titulo = titulo;
		super.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
	}
	
	@Override
	public double calcularXP() {
		return Atividades.XP_PADRAO + 120;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	
}
