package ucionica;

public class Ucionica_GP {

	public static void main(String[] args) {
			Polaznik p1= new Polaznik("Lazar Drzajic");
			Laptop l1= new Laptop("DELL Inspiron",p1);			
			System.out.println(l1.ispis()+" "+p1.ispis());
		}

	}


