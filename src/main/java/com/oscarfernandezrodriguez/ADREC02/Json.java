package com.oscarfernandezrodriguez.ADREC02;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Json {

	public static Configuracion leerJson(String rutaConfig) {
		Configuracion config = null;
		try {
			FileReader configJson = new FileReader(rutaConfig);
			Gson gson = new Gson();
			config = gson.fromJson(configJson, Configuracion.class);
			System.out.println("Archivo de configuración leido!");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return config;
	}

	public static void escribirJson(String rutaInforme, Object objecto) {
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String cadenaJson = gson.toJson(objecto);
		FileWriter fichero = null;
		PrintWriter pw = null;
		try {
			fichero = new FileWriter(rutaInforme);
			pw = new PrintWriter(fichero);
			pw.println(cadenaJson);
			System.out.println("Datos escritos correctamente en Json!");
		} catch (IOException e) {
		} finally {
			try {
				if (null != fichero) {
					fichero.close();
				}
			} catch (IOException e2) {
			}
		}
	}

}
