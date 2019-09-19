package faks;

public class Student extends Covek {
	private int brojInd;
	private int godStudija;
	private double trenutniProsek;

	public Student(String ime, String prezime, int godinaRodj, int brojInd, int godStudija,
			double trenutniProsek) {
		super(ime, prezime, godinaRodj);
		this.brojInd=brojInd;
		this.godStudija=godStudija;
		this.trenutniProsek=trenutniProsek;
	}
	public int getBrojInd() {
		return brojInd;
	}
	public int getGodStudija() {
		return godStudija;
	}
	public double getTrenutniProsek() {
		return trenutniProsek;
	}
	public String ispis() {
		String s="";
		s+=super.ispis()+"je student "+godStudija+".godine studija sa prosekom "+trenutniProsek;
		return s;
	}
}
