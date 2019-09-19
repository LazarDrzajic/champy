package pakao;

import java.util.Scanner;

public class Zadatak_2_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n za duzinu niza:  ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		System.out.println("Unesite " + n + " elemenata u niz: ");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();
		}
		for (int i = niz.length - 1; i >= 0; i--) {
			System.out.print(niz[i] + " ");
		}
	}
}
