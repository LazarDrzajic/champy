package pakao;

import java.util.Scanner;

public class Zadatak_2c_08142019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite k:  ");
		int k = sc.nextInt();
		System.out.println("Unesite n:  ");
		int n = sc.nextInt();
		int suma = 0;
		while (n < k) {
			suma += n;
			n++;
		}
		System.out.println("Zbir svih brojeva izmedju n i k je:  " + suma);
	}

}
