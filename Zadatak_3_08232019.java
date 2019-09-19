package pakao;

import java.util.Scanner;

public class Zadatak_3_08232019 {

	public static void main(String[] args) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Unesite n za duzinu niza:  ");
		int n = sc.nextInt();
		int[] niz = new int[n];
		ucitavanjeniza(niz);
		int proiz = proizvodneparnih(niz);
		System.out.println("Proizvod elemenata na neparnim pozicijama niza je: " + proiz);
		int zbir= zbirparnih(niz);
		System.out.println("Zbir parnih elemenata niza je: " +zbir);
	}
	public static void ucitavanjeniza(int [] niz) {
		Scanner sc= new Scanner (System.in);
		System.out.println("Unesite " + niz.length + " elemenata niza:");
		for (int i = 0; i < niz.length; i++) {
			niz[i] = sc.nextInt();}
	}
	public static int proizvodneparnih(int [] niz) {
		int proiz=1;
		for(int i=0; i<niz.length; i++) {
			if(i%2!=0) {
				proiz*= niz[i];			
				}			
		} return proiz;
	}
	public static int zbirparnih(int [] niz) {
		int zbir=0;
		for(int i=0; i<niz.length; i++)
			if(niz[i]%2==0) {
				zbir+= niz[i];			
				}			
		 return zbir;
	}
}
