package pakao_na_steroidima;

public class Knjige {
	//Napisati klasu Knjige koja ima sledeca polja:  naziv knjige, autora, broj strana, godinu 
	//izdanja. Sva polja mogu da se dohvate, a godina izdanja moze i da se postavi.
	//Napisati glavni program koji kreira tri knjige i ispisuje sve njihove podatke.
	
	private String naslovknjige; //get
	private String imeautora; //get
	private String brojstrana;	//get
	private int godinaizdanja; //get i set
	
	public Knjige (String naslovknjige, String imeautora, String brojstrana) {
			this.naslovknjige=naslovknjige;
			this.imeautora=imeautora;
			this.brojstrana=brojstrana;
	}
	public String getNaslovKnjige () {
		return naslovknjige;
	}
	public String getImeAutora () {
		return imeautora;
	}
	public String getBrojStrana() {
		return brojstrana;
	}
	public int getGodinaIzdanja() {
		return godinaizdanja;
	}
	public void setGodinaIzdanja( int godinaizdanja) {
		this.godinaizdanja=godinaizdanja;
	}
}
