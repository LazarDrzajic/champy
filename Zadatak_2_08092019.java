package prvavezba;

import java.util.Scanner;

public class Zadatak_2_09082019 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Double a, b, r;
		System.out.println("Unesi naziv geometrijskog tela:  ");
		String s;
		s=sc.nextLine();
		switch(s) {
		case "kvadrat": System.out.println("Unesite duzinu stranice A:  "); 
		a=sc.nextDouble(); if(a>0);System.out.println("Povrsina kvadrata je:   " + a*a); break;
		case "pravougaonik" : System.out.println("Unesite duzine stranica A i B:  "); 
		a= sc.nextDouble(); b=sc.nextDouble(); 
		if(a>0 && b>0) System.out.println("Povrsina pravougaonika je:   "+ a* b);break;
		case "krug" : System.out.println("Unesite duzinu poluprecnika r:  ");
		r= sc.nextDouble(); if(r>0); System.out.println("Povrsina kruga je:  " +r*r*3.14); break;
		default : System.out.println("Greska!");
		
		}
	}

}
