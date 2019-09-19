package faks;

public class Faks_Glavni {

	public static void main(String[] args) {
			Student s = new Student("Jovan", "Petrovic", 1994, 0027, 2, 6.94);
			Student s1 = new Student("Milovan", "Jokovic", 1997, 2213, 1, 8.73);
			Student s2 = new Student("Marija", "Silobad", 1995, 3234, 3, 7.91);
			Profesor p = new Profesor("Stevan", "Filopovski", 1957, "Profesor");
			Profesor p1 = new Profesor("Dunja", "Strahinjic", 1989, "Asistent");
			p.dodajPredmet("Pejzazna arhitektura");
			p.dodajPredmet("Zidno slikarstvo");
			p1.dodajPredmet("Rimsko pravo");
			p1.dodajPredmet("Etika");
			System.out.println(s.ispis());
			System.out.println(s1.ispis());
			System.out.println(s2.ispis());
			System.out.println(p.ispisi());
			System.out.println(p1.ispisi());
		}

	}


