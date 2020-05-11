package com.oscarfernandezrodriguez.ADREC02;

public class Record {
	
	String dateRep;
	int day;
	int month;
	int year;
	int cases;
	int deaths;
	String countriesAndTerritories;
	String geoId;
	String countryTerritoryCode;
	String popData2018;
	String continentExp;
	
	public Record() {}

	public Record(String dateRep, int day, int month, int year, int cases, int deaths,
			String countriesAndTerritories, String geoId, String countryTerritoryCode, String popData2018,
			String continentExp) {
		this.dateRep = dateRep;
		this.day = day;
		this.month = month;
		this.year = year;
		this.cases = cases;
		this.deaths = deaths;
		this.countriesAndTerritories = countriesAndTerritories;
		this.geoId = geoId;
		this.countryTerritoryCode = countryTerritoryCode;
		this.popData2018 = popData2018;
		this.continentExp = continentExp;
	}
	
	public String getDateRep() {
		return dateRep;
	}
	public void setDateRep(String dateRep) {
		this.dateRep = dateRep;
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		this.day = day;
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		this.month = month;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public int getCases() {
		return cases;
	}
	public void setCases(int cases) {
		this.cases = cases;
	}
	public int getDeaths() {
		return deaths;
	}
	public void setDeaths(int deaths) {
		this.deaths = deaths;
	}
	public String getCountriesAndTerritories() {
		return countriesAndTerritories;
	}
	public void setCountryAndTerritories(String countriesAndTerritories) {
		this.countriesAndTerritories = countriesAndTerritories;
	}
	public String getGeoId() {
		return geoId;
	}
	public void setGeoId(String geoId) {
		this.geoId = geoId;
	}
	public String getCountryTerritoryCode() {
		return countryTerritoryCode;
	}
	public void setCountryTerritoryCode(String countryTerritoryCode) {
		this.countryTerritoryCode = countryTerritoryCode;
	}
	public String getPopData2018() {
		return popData2018;
	}
	public void setPopData2018(String popData2018) {
		this.popData2018 = popData2018;
	}
	public String getContinentExp() {
		return continentExp;
	}
	public void setContinentExp(String continentExp) {
		this.continentExp = continentExp;
	}
	

}
