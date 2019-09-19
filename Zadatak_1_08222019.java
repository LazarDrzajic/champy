package pakao;

import java.util.Scanner;

public class Zadatak_1_08222019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite realan broj N:  ");
		double n=sc.nextDouble();
		System.out.println("Unesite realan broj M:  ");
		double m= sc.nextDouble();
		System.out.println("Unesite realan broj K:  ");
		double k= sc.nextDouble();
		System.out.println("Proizvod brojeva: " +n+" "+m+" "+k+ " je: " + proizvodbrojeva(n, m, k));
		System.out.println();
		System.out.println("Najmanji broj je:  " + najmanjibroj(n, m, k));
	}
	public static double proizvodbrojeva( double n, double m, double k) {
		double proiz;
		proiz= n * m * k;
		return proiz;
	}
	public static double najmanjibroj(double n, double m, double k) {
		double minim=0;
		if(n<m && n<k) {
			minim=n;
		}
		else if(m<n && m<k) {
			minim=m;
		}
		else if(k<n && k<m) {
			minim=k;
		}
		return minim;
			}
	}

