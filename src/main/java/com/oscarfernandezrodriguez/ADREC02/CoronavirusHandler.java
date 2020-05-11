package com.oscarfernandezrodriguez.ADREC02;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class CoronavirusHandler extends DefaultHandler {

	private boolean dateRep;
	private boolean day;
	private boolean month;
	private boolean year;
	private boolean cases;
	private boolean deaths;
	private boolean countriesAndTerritories;
	private boolean geoId;
	private boolean countryTerritoryCode;
	private boolean popData2018;
	private boolean continentExp;

	private Record recordActual = new Record();
	private List<Record> records = new ArrayList<>();

	public List<Record> getRecords() {
		return records;
	}

	public CoronavirusHandler() {
		super();
	}

	@Override
	public void startDocument() throws SAXException {
	}

	@Override
	public void endDocument() throws SAXException {
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if (qName.equals("dateRep")) {
			dateRep = true;
		}
		if (qName.equals("day")) {
			day = true;
		}
		if (qName.equals("month")) {
			month = true;
		}
		if (qName.equals("year")) {
			year = true;
		}
		if (qName.equals("cases")) {
			cases = true;
		}
		if (qName.equals("deaths")) {
			deaths = true;
		}
		if (qName.equals("countriesAndTerritories")) {
			countriesAndTerritories = true;
		}
		if (qName.equals("geoId")) {
			geoId = true;
		}
		if (qName.equals("countryTerritoryCode")) {
			countryTerritoryCode = true;
		}
		if (qName.equals("popData2018")) {
			popData2018 = true;
		}
		if (qName.equals("continentExp")) {
			continentExp = true;
		}
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if (dateRep) {
			recordActual.setDateRep(new String(ch, start, length));
			dateRep = false;
		}
		if (day) {
			recordActual.setDay(Integer.parseInt(new String(ch, start, length)));
			day = false;
		}
		if (month) {
			recordActual.setMonth(Integer.parseInt(new String(ch, start, length)));
			month = false;
		}
		if (year) {
			recordActual.setYear(Integer.parseInt(new String(ch, start, length)));
			year = false;
		}
		if (cases) {
			recordActual.setCases(Integer.parseInt(new String(ch, start, length)));
			cases = false;
		}
		if (deaths) {
			recordActual.setDeaths(Integer.parseInt(new String(ch, start, length)));
			deaths = false;
		}
		if (countriesAndTerritories) {
			String country_=new String(ch, start, length);
			String country=country_.replace("_", " ");
			recordActual.setCountryAndTerritories(country);
			countriesAndTerritories = false;
		}
		if (geoId) {
			recordActual.setGeoId(new String(ch, start, length));
			geoId = false;
		}
		if (countryTerritoryCode) {
			recordActual.setCountryTerritoryCode(new String(ch, start, length));
			countryTerritoryCode = false;
		}
		if (popData2018) {
			recordActual.setPopData2018(new String(ch, start, length));
			popData2018 = false;
		}
		if (continentExp) {
			recordActual.setContinentExp(new String(ch, start, length));
			continentExp = false;
		}
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		if (qName.equals("record")) {
			records.add(recordActual);
			recordActual = new Record();
		}
	}

}
