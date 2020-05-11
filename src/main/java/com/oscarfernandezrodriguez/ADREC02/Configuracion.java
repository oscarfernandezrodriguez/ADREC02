package com.oscarfernandezrodriguez.ADREC02;

public class Configuracion{
	String directorio_orixe;
	String directorio_backup;
	
	public Configuracion(String directorio_orixe, String directorio_backup) {
		this.directorio_orixe = directorio_orixe;
		this.directorio_backup = directorio_backup;
	}
	public String getDirectorio_orixe() {
		return directorio_orixe;
	}
	public void setDirectorio_orixe(String directorio_orixe) {
		this.directorio_orixe = directorio_orixe;
	}
	public String getDirectorio_backup() {
		return directorio_backup;
	}
	public void setDirectorio_backup(String directorio_backup) {
		this.directorio_backup = directorio_backup;
	}
	
}
