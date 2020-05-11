package com.oscarfernandezrodriguez.ADREC02;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;



public class XML {
	
	public static List<Record> leerXML(String fichero) throws ParserConfigurationException, IOException{
		List <Record> listaCoronavirus = new ArrayList<>();
		try {
			SAXParserFactory factory = SAXParserFactory.newInstance();
			CoronavirusHandler coronavirus = new CoronavirusHandler();
	        SAXParser saxParser = factory.newSAXParser();
	        saxParser.parse(fichero, coronavirus);  
	        listaCoronavirus=coronavirus.getRecords();
		} catch (SAXException e) {
			e.printStackTrace();
		}	
		return listaCoronavirus;
	}
	public static void listarMuertes(List<Record> listaCoronavirus){
		for (Record record : listaCoronavirus) {
		      if (record.getDateRep().equals("05/05/2020") ) {
		        System.out.println("-------------------------------------------");
		        System.out.println("País: " + record.getCountriesAndTerritories());
		        System.out.println("Número de casos: " + record.getCases());
		      }
		    }
	}
	
	public static Mundo convertirObjecto(List<Record> listaCoronavirus){
		Set <Continente> continentesO = new HashSet<Continente>();
		Set <String> continentes = new HashSet<String>();
		for (Record record : listaCoronavirus) {
			continentes.add(record.getContinentExp());
		}
		for(String continente: continentes) {
			int muertes=0;
			int casos=0;
			for (Record record : listaCoronavirus) {
				if(record.getDateRep().equals("05/05/2020") && record.getContinentExp().equals(continente)) {
					muertes+=record.getDeaths();
					casos+=record.getCases();
				}
			}
			Continente continenteActual= new Continente(continente,casos,muertes);
			continentesO.add(continenteActual);
		}		
		Mundo mundo= new Mundo(continentesO);
		return mundo;
	}
	
}
