package menjacnica.interfejs;

import java.util.GregorianCalendar;

public interface menjacnicainterfejs {
	
	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni);
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan);
	public void pronadjiKursNaDan(String naziv, GregorianCalendar dan);
	
}
