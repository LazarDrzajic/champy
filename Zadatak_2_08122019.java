package prvavezba;

import java.util.Scanner;

public class Zadatak_2_12082019 {

	public static void main(String[] args) {
		System.out.println("Unesite n:  ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int br=0;
		int suma = 0;
		int proiz= 1;
		while (br<=n) {
			br+=1;
			if(br%2==0) {
				suma += br;
				
				System.out.println("Suma parnih brojeva je:  " +suma);
			} else {
				proiz*=br;
				
				System.out.println("Proizvod neparnih brojeva je:  " +proiz);
			}
			
		}
	}

}
