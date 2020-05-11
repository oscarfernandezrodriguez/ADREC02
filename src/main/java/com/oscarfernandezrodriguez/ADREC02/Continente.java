package com.oscarfernandezrodriguez.ADREC02;

public class Continente {
	String nome;
	int numero_casos;
	int numero_falecementos;
	
	public Continente(String nombre, int casos, int muertes) {
		this.nome = nombre;
		this.numero_casos = casos;
		this.numero_falecementos = muertes;
	}

	public String getNombre() {
		return nome;
	}

	public void setNombre(String nombre) {
		this.nome = nombre;
	}

	public int getCasos() {
		return numero_casos;
	}

	public void setCasos(int casos) {
		this.numero_casos = casos;
	}

	public int getMuertes() {
		return numero_falecementos;
	}

	public void setMuertes(int muertes) {
		this.numero_falecementos = muertes;
	}
	
}
