package com.vathsa.spcd.beans;

//import java.util.List;
import java.util.Map;
//import java.util.Set;

public class Country 
{
    private String countryName;
    private String currencyName;
    private Map<String,String> states;
    public Country() {}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public String getCurrencyName() {
		return currencyName;
	}
	public void setCurrencyName(String currencyName) {
		this.currencyName = currencyName;
	}
	public Map<String,String> getStates() {
		return states;
	}
	public void setStates(Map<String,String> states) {
		this.states = states;
	}
    
}
