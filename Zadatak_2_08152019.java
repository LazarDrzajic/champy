package prvavezba;

import java.util.Scanner;

public class Zadatak_2_08152019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:  ");
		int n=sc.nextInt();
		int a=0;
		int b=0;
		int c=1;
		System.out.println("Fibonacijev niz do broja: " + n);
		for (int i=1; i<n; i++) {
			a=b;
			b=c;
			c=a+b;
			System.out.print(a + " ");
		}
	}

}
