package menjacnica;

import java.util.GregorianCalendar;
import java.util.LinkedList;

import menjacnica.interfejs.menjacnicainterfejs;

public class Menjacnica implements menjacnicainterfejs {
	
	LinkedList<Valuta> valute = new LinkedList<Valuta>();


	@Override
	public void dodajKursNaDan(String naziv, GregorianCalendar dan, double srednji, double kupovni, double prodajni) {
		
		Kurs k = new Kurs(dan, srednji, kupovni, prodajni);
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				valute.get(i).getKursNaDan().add(k);
				break;
			}
		}
	}

	@Override
	public void obrisiKursNaDan(String naziv, GregorianCalendar dan) {
		
		Valuta trazena = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				trazena = valute.get(i);
				break;
			}
		}
		for (int i = 0; i < trazena.getKursNaDan().size(); i++) {
			if(trazena.getKursNaDan().get(i).getDatum().equals(dan)){
				trazena.getKursNaDan().remove(i);
				break;
			}
		}

	}

	@Override
	public Kurs pronadjiKursNaDan(String naziv, GregorianCalendar dan) {
		
		Valuta trazena = new Valuta();
		
		for (int i = 0; i < valute.size(); i++) {
			if(valute.get(i).getNaziv().equals(naziv)){
				trazena = valute.get(i);
				break;
			}
		}
		for (int i = 0; i < trazena.getKursNaDan().size(); i++) {
			if(trazena.getKursNaDan().get(i).getDatum().equals(dan)){
				return trazena.getKursNaDan().get(i);
			}
		}
		throw new RuntimeException("Nije pronadjen trazeni kurs");
	}

}
