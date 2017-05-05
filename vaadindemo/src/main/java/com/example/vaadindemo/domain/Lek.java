package com.example.vaadindemo.domain;

import java.util.UUID;

public class Lek {
	
	private UUID id;
	
	private String nazwa;
	
	private double cena;
	
	private String producent;
	
	private String sklad;
	
	private String przeciwwskazania;
	
	private String ostrzeżenia;
	
	private String interakcje;
	
	private String działania_niepożądane;
	
	public Lek(String nazwa, double cena, String producent, String sklad,
			String przeciwwskazania, String ostrzeżenia, String interakcje,
			String działania_niepożądane) {
		
		super();
		this.nazwa = nazwa;
		this.cena = cena;
		this.producent = producent;
		this.sklad = sklad;
		this.przeciwwskazania = przeciwwskazania;
		this.ostrzeżenia = ostrzeżenia;
		this.interakcje = interakcje;
		this.działania_niepożądane = działania_niepożądane;
	}

	public Lek() {
	}
	

	public String getPrzeciwwskazania() {
		return przeciwwskazania;
	}

	public void setPrzeciwwskazania(String przeciwwskazania) {
		this.przeciwwskazania = przeciwwskazania;
	}

	public String getOstrzeżenia() {
		return ostrzeżenia;
	}

	public void setOstrzeżenia(String ostrzeżenia) {
		this.ostrzeżenia = ostrzeżenia;
	}

	public String getInterakcje() {
		return interakcje;
	}

	public void setInterakcje(String interakcje) {
		this.interakcje = interakcje;
	}

	public String getDziałania_niepożądane() {
		return działania_niepożądane;
	}

	public void setDziałania_niepożądane(String działania_niepożądane) {
		this.działania_niepożądane = działania_niepożądane;
	}

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public double getCena() {
		return cena;
	}

	public void setCena(double cena) {
		this.cena = cena;
	}
	
	public String getProducent() {
		return producent;
	}

	public void setProducent(String producent) {
		this.producent = producent;
	}

	@Override
	public String toString() {
		return "Lek [nazwa=" + nazwa + ", cena=" + cena
				+ ", producent=" + producent + ", sklad=" + sklad + "]";
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getSklad() {
		return sklad;
	}

	public void setSklad(String sklad) {
		this.sklad = sklad;
	}
	
}
