package pakao;

import java.util.Scanner;

public class Zadatak_2_08232019 {

	public static void main(String[] args) {
		int [] niz = new int [3];
		ucitavanjeniza(niz);
	}
	public static void ucitavanjeniza (int [] niz) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite 2 elementa niza i delilac:  ");
		for(int i=0; i<3; i++) {
		niz [i]=sc.nextInt();}
		System.out.println("Elementi niza deljivi sa deliocem su: ");
			if (niz[0] % niz[2]==0 && niz[1]%niz[2]==0 ) {
				System.out.println(niz[0] + " " + niz[1]);
			}
			else if (niz[0] % niz[2]==0 ) {
				System.out.println(niz[0] + " ");
			}
			else if (niz[1] % niz[2]==0 ) {
				System.out.println(niz[1] + " ");
			}
		}
	}
	

