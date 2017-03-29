package menjacnica;

import java.util.LinkedList;

public class Valuta {
	
	private String naziv;
	private String skraceniNaziv;
	private LinkedList<Kurs> kursNaDan;
	
	public String getNaziv() {
		return naziv;
	}
	public void setNaziv(String naziv) {
		if(naziv == null || naziv.equals(""))
			throw new RuntimeException();
		this.naziv = naziv;
	}
	public String getSkraceniNaziv() {
		return skraceniNaziv;
	}
	public void setSkraceniNaziv(String skraceniNaziv) {
		if(skraceniNaziv == null || skraceniNaziv.equals(""))
			throw new RuntimeException();
		this.skraceniNaziv = skraceniNaziv;
	}
	public LinkedList<Kurs> getKursNaDan() {
		return kursNaDan;
	}
	public void setKursNaDan(LinkedList<Kurs> kursNaDan) {
		if(kursNaDan == null || kursNaDan.isEmpty())
			throw new RuntimeException();
		this.kursNaDan = kursNaDan;
	}
	
	@Override
	public String toString() {
		String s= "Valuta naziv=" + naziv + ", skraceniNaziv=" + skraceniNaziv + ", kursevi: ";
		
		for (int i = 0; i < kursNaDan.size(); i++) {
			s+=kursNaDan.get(i);
		}
		return s;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((kursNaDan == null) ? 0 : kursNaDan.hashCode());
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((skraceniNaziv == null) ? 0 : skraceniNaziv.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Valuta other = (Valuta) obj;
		if (kursNaDan == null) {
			if (other.kursNaDan != null)
				return false;
		} else if (!kursNaDan.equals(other.kursNaDan))
			return false;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (skraceniNaziv == null) {
			if (other.skraceniNaziv != null)
				return false;
		} else if (!skraceniNaziv.equals(other.skraceniNaziv))
			return false;
		return true;
	}
	
	
}
