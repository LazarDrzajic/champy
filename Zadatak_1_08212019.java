package pakao;

import java.util.Scanner;

public class Zadatak_1_08212019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite n za duzinu niza:  ");
		int n=sc.nextInt();
		System.out.println("Unesite k: ");
		int k= sc.nextInt();
		int a = 0;
		int [] niz= new int[n];
		System.out.println("Unesite "  + n + " elemenata u niz: " );
		for (int i = 0; i < niz.length; i++)  {			
			niz [i]=sc.nextInt();
			if (niz[i]%k==0) {
				a=niz[i];
				System.out.println("Element niza deljiv sa brojem " +k+ " je: " + a);
			} 
				} 	
	}

}
