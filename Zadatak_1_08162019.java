package prvavezba;

import java.util.Scanner;

public class Zadatak_1_08162019 {

	public static void main(String[] args) {
		// Napisi program koji nakon sto se preko konzole unesu 2 broja prvo ispisuje manji, pa zatim veci broj
				//7.2.. Učitati dva broja a zatim ispisati manji pa veći broj.
		Scanner sc= new Scanner(System.in);
		System.out.println("Unesite n i k:  ");
		int n=sc.nextInt();
		int k=sc.nextInt();
		if (n<k) {
			System.out.println(n + "  " + k);
		} else {
			System.out.println(k + "  " + n);
		}
	}

}
