package ucionica;

public class Laptop {
	private Polaznik ucenik;
	private String marka;
	public Laptop (String marka, Polaznik ucenik) {
		this.marka=marka;
		this.ucenik=ucenik;	
	}
	public Polaznik getUcenik() {
		return ucenik;
	}
	public void setUcenik(Polaznik ucenik) {
		if (this.ucenik!=null)
		this.ucenik = ucenik;
	}
	public void resetUcenik() {
		ucenik=null;
	}
	public String getMarka() {
		return marka;
	}
	public String ispis() {
		String s;
		if (ucenik==null) {
			s="NEMA POLAZNIKA";
		}
		else {
			s=ucenik.ispis();
		}
		return marka+"{"+s+"}";
	}
}

