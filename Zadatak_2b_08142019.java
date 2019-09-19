package pakao;

import java.util.Scanner;

public class Zadatak_2b_08142019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n:  ");
		int n= sc.nextInt();
		int br=1;
		int suma=0;
		while (br<n) {
			suma+=br;
			br= br+1;
		}
		System.out.println("Zbir svih cifara je:  " +suma);
	}

}
