package menjacnica.interfejs;

import java.util.GregorianCalendar;

import menjacnica.Kurs;

public interface menjacnicainterfejs {
	
	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni);
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan);
	public Kurs pronadjiKursNaDan(String naziv, GregorianCalendar dan);
	
}
