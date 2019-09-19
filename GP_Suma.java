package suma;

public class GP_Suma {
		public static void main(String[] args) {
			Njiva n = new Njiva(450, 180);
			Njiva n1 = new Njiva(500, 300);
			Suma s = new Suma(480, 300, 200, 2);
			Suma s1 = new Suma(250, 100, 70, 3);
			Parcela [] niz2 = new Parcela [10];
			Parcela[]niz= {n, n1,s, s1};
			for (int i=0; i<niz.length; i++) {
				System.out.println(niz[i]);
			}
		}		
	}