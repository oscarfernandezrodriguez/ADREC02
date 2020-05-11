package com.oscarfernandezrodriguez.ADREC02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ficheros {
	
	private int numeroArchivos=0;
	private int numeroCarpetas=0;
	public int [] datos=new int[2] ;
	
	
	private void comprobarDirectorio(String ruta) {
	    File directorio = new File(ruta);
	    if (!directorio.exists()) {
	        directorio.mkdirs();
	    }
	}
	
	
	private void copiarArchivo(String rutaOrigen, String rutaDestino) {
	    try {
	        File origen = new File(rutaOrigen);
	        File destino = new File(rutaDestino);
	        InputStream in = new FileInputStream(origen);
	        OutputStream out = new FileOutputStream(destino);

	        byte[] buf = new byte[1024];
	        int len;

	        while ((len = in.read(buf)) > 0) {
	            out.write(buf, 0, len);
	        }
	        System.out.println("Copiado "+rutaDestino);
	        in.close();
	        out.close();

	    } catch (FileNotFoundException e) {
	        e.printStackTrace();
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
	}
	
	public int [] copiarDirectorio(String rutaOrigen, String rutaDestino) {
	    comprobarDirectorio(rutaDestino);
	    File directorio = new File(rutaOrigen);
	    File f;
	    if (directorio.isDirectory()) {
	        comprobarDirectorio(rutaDestino);
	        String [] files = directorio.list();
	        if (files.length > 0) {
	            for (String archivo : files) {
	                f = new File (rutaOrigen + File.separator + archivo);
	                if(f.isDirectory()) {
	                	this.numeroCarpetas++;
	                    comprobarDirectorio(rutaDestino+File.separator+archivo+File.separator);
	                    copiarDirectorio(rutaOrigen+File.separator+archivo+File.separator, rutaDestino+File.separator+archivo);
	                } else { 
	                	this.numeroArchivos++;
	                    copiarArchivo(rutaOrigen+File.separator+archivo, rutaDestino+File.separator+archivo+".backup");
	                }
	            }
	        }
	    }
	    this.datos[0]=numeroArchivos;
	    this.datos[1]=numeroCarpetas;
	    return this.datos;
	}

}
