package com.dio.bootcamp.dominio.atividades;

public abstract class Atividades {
	protected String titulo;
	protected String descricao;
	
	protected static double XP_PADRAO = 10d;
	
	public abstract double calcularXP();

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public static double getXP_PADRAO() {
		return XP_PADRAO;
	}

	public static void setXP_PADRAO(double xP_PADRAO) {
		XP_PADRAO = xP_PADRAO;
	}
	
	
}
