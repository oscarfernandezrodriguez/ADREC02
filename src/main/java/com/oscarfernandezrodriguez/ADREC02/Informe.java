package com.oscarfernandezrodriguez.ADREC02;

public class Informe {
	
	int numero_de_arquivos_copiados;
	double tempo_utilizado_en_segundos;
	
	public Informe(int numero_de_arquivos_copiados, double tempo_utilizado_en_segundos) {
		this.numero_de_arquivos_copiados = numero_de_arquivos_copiados;
		this.tempo_utilizado_en_segundos = tempo_utilizado_en_segundos;
	}
	public int getNumero_de_arquivos_copiados() {
		return numero_de_arquivos_copiados;
	}
	public void setNumero_de_arquivos_copiados(int numero_de_arquivos_copiados) {
		this.numero_de_arquivos_copiados = numero_de_arquivos_copiados;
	}
	public double getTempo_utilizado_en_segundos() {
		return tempo_utilizado_en_segundos;
	}
	public void setTempo_utilizado_en_segundos(long tempo_utilizado_en_segundos) {
		this.tempo_utilizado_en_segundos = tempo_utilizado_en_segundos;
	}
	

}
