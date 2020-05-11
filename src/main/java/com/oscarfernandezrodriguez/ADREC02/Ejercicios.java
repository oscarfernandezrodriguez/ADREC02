package com.oscarfernandezrodriguez.ADREC02;

import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

public class Ejercicios {

	public static void main(String[] args) throws ParserConfigurationException, IOException {
		
		
		///////////////////////////////////////////////////
		//////////			EJERCICIO 1           /////////
		///////////////////////////////////////////////////
		
		//Cargamos la config
		Configuracion config=Json.leerJson("config.json");
		
		//Rutas de ficheros
		String directorio_orixe=config.getDirectorio_orixe();
		String directorio_backup=config.getDirectorio_backup();
		
		//Medir tiempoInicial
		double tiempoInicial = System.currentTimeMillis();
		
		//Copiar ficheros
		Ficheros fichero = new Ficheros();
		int [] datos=fichero.copiarDirectorio(directorio_orixe,directorio_backup);
		
		//Medir tiempoFinal
		double tiempoFinal = System.currentTimeMillis();
		double tiempoUsado = (tiempoFinal - tiempoInicial)/ 1000;
		
		System.out.println("Se han copiado:");
		System.out.println("Numero de carpetas:"+datos[1]);
		System.out.println("Numero de archivos:"+datos[0]);
		
		//Metemos los datos en Json
		Informe informe =new Informe(datos[0],tiempoUsado);
		Json.escribirJson("informe.json",informe);
		
		///////////////////////////////////////////////////
		//////////			EJERCICIO 2           /////////
		///////////////////////////////////////////////////
		
		//Leemos y pasamos al objecto los datos
		List<Record> records=XML.leerXML("coronavirus.xml");
		XML.listarMuertes(records);
		
		///////////////////////////////////////////////////
		//////////			EJERCICIO 3           /////////
		///////////////////////////////////////////////////
		
		Mundo mundo=XML.convertirObjecto(records);
		Json.escribirJson("coronavirus.json",mundo);
		
		
		
	}
}
