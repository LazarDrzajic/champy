package pakao_na_steroidima;

public class Knjige_Main {

	public static void main(String[] args) {
		Knjige k=new Knjige ("Orlovi rano lete", "Branko Copic", "240");
		k.setGodinaIzdanja(1957);
		System.out.println("Naslov knjige" + "  Ime autora" + "  Broj strana" + "  Godina izdanja");
		System.out.println();
		System.out.println(  k.getNaslovKnjige() + ", " + k.getImeAutora() + ", " + k.getBrojStrana() + ", "+ k.getGodinaIzdanja() + ".");
		
		Knjige k1=new Knjige ("Hari Poter i kamen mudrosti", "Dzoan K. Rouling", "265");
		k1.setGodinaIzdanja(1997);
		System.out.println(  k1.getNaslovKnjige() + ", " + k1.getImeAutora() + ", " + k1.getBrojStrana() + ", "+ k1.getGodinaIzdanja() + ".");
		
		Knjige k2=new Knjige ("Atlantida", "Borislav Pekic", "571");
		k2.setGodinaIzdanja(1998);
		System.out.println(  k2.getNaslovKnjige() + ", " + k2.getImeAutora() + ", " + k2.getBrojStrana() + ", "+ k2.getGodinaIzdanja() + ".");	
	}

}
