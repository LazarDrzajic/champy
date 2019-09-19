package pakao;

import java.util.Scanner;

public class Zadatak_2a_08142019 {

	public static void main(String[] args) {
		System.out.println("Unesite n:  ");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int br=1;
		int suma=0;
		while (br<5) {
			suma+=br;
			br++;
		}
		System.out.println("Zbir svih brojeva je:   "+suma);
	}

}
