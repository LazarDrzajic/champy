package ucionica;

public class Polaznik {
	private static int UID=0;
	private int id;
	private String naziv;
	public Polaznik (String naziv) {
		this.naziv=naziv;
		id=++UID;
	}
	public static int getUID() {
		return UID;
	}
	public String getNaziv() {
		return naziv;
	}
	public String ispis() {
		return naziv+"{"+id+"}";
	}
}
