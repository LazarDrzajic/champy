package prvavezba;

import java.util.Scanner;

public class Zadatak_3_08162019 {
	//64.Napisati program za prebrojavanje neparnih brojeva od k do n.
	//Napravi program koji prebrojava neparne brojeve od k do n
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Izracunaj koliko neparnih brojeva ima izmedju dva broja");
		System.out.println("Unesite broj k:  ");
		int k= sc.nextInt();
		System.out.println("Unesite broj n:  ");
		int n= sc.nextInt();
		int zbir=0;
		for (int i=k; i<=n; i++) {
			if (i%2!=0) zbir++;
		}
		System.out.println("Ukupno neparnih brojeva ima:  " +zbir);
	}

}
