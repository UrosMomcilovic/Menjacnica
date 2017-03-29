package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.menjacnicainterfejs;

public class Menjacnica implements menjacnicainterfejs {
	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();

	@Override
	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni) {
		
		valute.getFirst().getKursNaDan().add(new Kurs());

	}

	@Override
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan) {
		
		valute.getFirst().getKursNaDan().removeFirst();
		
	}

	@Override
	public void pronadjiKursNaDan(String naziv, GregorianCalendar dan) {
		
		System.out.println(valute.getFirst().getKursNaDan());

	}

}
