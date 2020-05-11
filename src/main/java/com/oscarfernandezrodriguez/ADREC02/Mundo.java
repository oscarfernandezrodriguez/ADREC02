package com.oscarfernandezrodriguez.ADREC02;


import java.util.Set;

public class Mundo {
	private Set<Continente> continentes;

	public Mundo(Set<Continente> continentes) {
		this.continentes = continentes;
		
	}

	public Set<Continente> getContinentes() {
		return continentes;
	}

	public void setContinentes(Set<Continente> continentes) {
		this.continentes = continentes;
	}
	
	
}
