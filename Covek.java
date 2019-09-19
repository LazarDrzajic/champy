package faks;

public class Covek {
	protected String ime;
	protected String prezime;
	protected int godinaRodj;
	
	public Covek(String ime, String prezime, int godinaRodj) {
		this.ime = ime;
		this.prezime = prezime;
		this.godinaRodj = godinaRodj;
	}
	public String getIme() {
		return ime;
	}
	public void setIme(String ime) {
		this.ime = ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public void setPrezime(String prezime) {
		this.prezime = prezime;
	}
	public int getGodinaRodj() {
		return godinaRodj;
	}
	public String ispis() {
		String s = "";
		s+=this.ime + " " + this.prezime + " ["+this.godinaRodj+".] ";
		return s;
	}
}
