package prvavezba;

import java.util.Scanner;

public class Zadatak_2_08162019 {
	//41.Naći sumu brojeva u intervalu od a do b djeljivih sa 5
	// Napisi program koji ce, nakon unosenja vrednosti n i k putem  konzole, sabirati brojeve deljive sa 5 i izbaciti sumu na kraju

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Izracunaj sumu brojeva izmedju n i k koji su deljivi sa 5");
		int n, k, i, suma =0;
		System.out.println("Unesite broj n:  ");
		n= sc.nextInt();
		System.out.println("Unesite broj k:  ");
		k=sc.nextInt();
		i=n;
		while (i<=k) {
			if (i%5==0) 
				suma=suma+i;
				i++;						
		}
		System.out.println("Suma brojeva izmedju n i k koji su deljivi sa 5 je:  " +suma );
	}

}
