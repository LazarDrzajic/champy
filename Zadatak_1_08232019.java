package pakao;

import java.util.Scanner;

public class Zadatak_1_08232019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite neki broj sa 2 ili vise cifre: ");
		int n = sc.nextInt();
		ispisbroja(inverzanbroj(n));
	}

	public static int inverzanbroj(int n) {
		int priv = 0;
		int obrnut = 0;
		while (n != 0) {
			priv = n % 10;
			obrnut *= 10;
			obrnut += priv;
			n /= 10;

		}
		return obrnut;		
	}

	public static void ispisbroja(int n) {
		System.out.println();
		System.out.println(n);
	}
}
