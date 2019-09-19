package prvavezba;

import java.util.Scanner;

public class Zadatak_1_08152019 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Izaberite geometrijsko telo:  ");
		int izbor;
		double a, b, c, r, h;
		do {
			System.out.println("0 - Izlaz");
			System.out.println("1 - Kvadar");
			System.out.println("2 - Kocka");
			System.out.println("3 - Lopta");
			System.out.println("4 - Valjak");
			System.out.println("Unesite broj:  ");
			izbor = sc.nextInt();
			switch (izbor) {
			case 1:
				System.out.println("Unesite a, b i c :  ");
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				System.out.println("Povrsina kvadra je:  " + 2 * (a * b + a * c + b * c));
				break;
			case 2:
				System.out.println("Unesite a:  ");
				a = sc.nextDouble();
				System.out.println("Povrsina kocke je:  " + 6 * (a * a));
				break;
			case 3:
				System.out.println("Unesite r:  ");
				r = sc.nextDouble();
				System.out.println("Povrsina lopte je:  " + 4 * (r * r) * 3.14);
				break;
			case 4:
				System.out.println("Unesite r i h:  ");
				r = sc.nextDouble();
				h = sc.nextDouble();
				System.out.println("Povrsina valjka je:  " + 2 * (r * r) * 3.14 + 2 * r * 3.14 * h);
				break;
			}

		} while (izbor != 0); System.out.println("Kraj programa.");
	}

}
