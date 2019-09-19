package pakao;

public class Zadatak_1_08142019 {

	public static void main(String[] args) {
		int a = 6, b = 4, c = 7, d = 1;
		a = b++ + ++c;
		// a= 4 + 8
		// a=12
		// Najpre zapisujemo trenutnu vrednost promenljive b, a zatim joj dodajemo 1
		// Promenljivoj c najpre dodjemo 1 na trenutnu vrednost, a zatim tu novu
		// vrednost ubacujemo u jednacinu
		// a=12, b=5, c=8, d=1;
		b = --a - ++d;
		// b=11 - 2
		// b=9
		// Promenljivoj a najpre oduzimamo 1 od trenutne vrednosti, a zatim je ubacujemo
		// u jednacinu
		// Promenljivoj d najpre dodajemo 1 na trenutnu vrednost, a zatim je ubacujemo u
		// jednacinu
		// a=11, b=9, c=8, d=2;
		c = b-- * d++;
		// c= 9 * 2
		// c =18
		// Promenljivu b najpre zapisujemo u jednacinu, pa joj zatim oduzimamo 1
		// Promenljivu d najpre zapisujemo u jednacinu, pa joj zatim dodajemo 1
		// a=11, b=8, c=18, d=3
		d = --c / a--;
		// d= 17 / 11
		// d=1
		// Promenljivoj c smo najpre umanjili trenutnu vrednost za 1, a onda je dodali u
		// jednacinu
		// Promenljivu a smo najpre dodali u jednacinu, a zatim joj umanjili vrednost za
		// 1
		// a=10, b=8, c=17, d=1;
		c /= ++d + --a;
		// c/= 2 + 9
		// c/= 11
		// c=17/11
		// c=1
		// Promenljivoj d smo najpre dodali 1 na trenutnu vrednost, pa smo je onda
		// ubacili u jednacinu
		// Promenljivoj a smo najpre umanjili trenutnu vrednost za 1, pa smo je onda
		// ubacili u jednacinu
		// A zatim smo dotadasnju vrednost promenljive c podelili sa dobijenim zbirom
		// promenljivih d i a
		// a=9, b=8, c=1, d=2;
		d *= b-- - c++;
		// d*= 8 - 1
		// d*= 7
		// d= 2*7
		// d=14
		// Promenljivu b smo najpre dodali u jednacinu, a zatim joj umanjili trenutnu
		// vrednost za 1
		// Promenljivu c smo najpre dodali u jednacinu a zatim joj povecali vrednost za
		// 1
		// A zatim smo dotadasnju vrednost promenljive d pomnozili sa ostatkom
		// oduzimanja vrednosti b i c
		// a=9, b=7, c=2, d=14;
		c += d++ / b++;
		// c+= 14 / 7
		// c+= 2
		// c= 2+2
		// c=4
		// Promeljivu d smo najpre dodali u jednacinu a zatim na njenu dotadasnju
		// vrednost dodali 1
		// Promenljivu b smo najpre dodali u jednacinu a zatim na njenu dotadasnju
		// vrednost dodali 1
		// A zatim smo podelili te vrednosti i na ostatak tog deljenja dodali dotadasnju
		// vrednost promenljive c
		// a=9, b= 8, c=4, d=15;
		d -= --a + ++c;
		// d-= 8 + 5
		// d-= 13
		// d= 15-13
		// d=2
		// Promenljivoj a smo najpre oduzeli 1 od trenutne vrednosti, a zatim smo je
		// dodali u jednacinu
		// Promenljivoj c smo najpre dodali 1 na trenutnu vrednost, a zatim smo je
		// dodali u jednacinu
		// A zatim smo od dotadasnje vrednosti promenljive d oduzeli zbir sabiranja
		// promenljivih a i c
	}

}
