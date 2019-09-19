package pakao;

import java.util.Scanner;

public class Zadatak_3_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n za duzinu niza:  ");
		int n = sc.nextInt();
		boolean a = true;
		int[] niz = new int[n];
		System.out.println("Unesite " + n + " elemenata u niz: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int i = 0; i < n - 1; i++) {
			if (niz[i] > niz[i + 1]) {
				a = false;
				break;
			}
		}
		if (a) {
			System.out.println("Niz je rastuci");
		} else {
			System.out.println("Niz nije rastuci");
		}
	}

}
