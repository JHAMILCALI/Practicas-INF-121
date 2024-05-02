package ejer_3;

import java.util.Scanner;

public class Principal4 {

	public static void main(String[] args) {
		ColaCircularNum A = new ColaCircularNum();
		A.adi(2);
		A.adi(6);
		A.adi(8);
		A.adi(7);
		A.adi(2);
		A.adi(3);
		A.adi(5);
		A.adi(6);
		A.adi(3);
		A.adi(9);
		System.out.println("\t******COLA CIRCULAR A******");
		A.mostrar();
		ColaCircularNum B = new ColaCircularNum();
		B.adi(6);
		B.adi(9);
		B.adi(3);
		B.adi(5);
		B.adi(8);
		B.adi(1);
		B.adi(2);
		B.adi(6);
		B.adi(3);
		B.adi(0);
		System.out.println("\n\t******COLA CIRCULAR B******");
		B.mostrar();
//		Dada una cola circular de números A y otra cola circular de números B, intercambiar el
//		i-esimo elemento de A con el j-esimo de B sin usar estructuras auxiliares.
		System.out.println("\nIntro el nuemoro i a intercambiar: ");
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
		System.out.println("Intro el numeor j a intercambiar: ");
		int j = sc.nextInt();
		intercambio_de_numeros(A,B,i,j);
		System.out.println("\tINTERCAMBIADO LOS ELEMNTOS i y j DE LA COLA");
		System.out.println("\t******COLA CIRCULAR A******");
		A.mostrar();
		System.out.println("\n\t******COLA CIRCULAR B******");
		B.mostrar();

	}

	private static void intercambio_de_numeros(ColaCircularNum a, ColaCircularNum b, int i, int j) {
		int nroA = a.nroElem(),eleA=0;
		int nroB = b.nroElem(),eleB=0;
		for (int k = 1; k <= nroA; k++) {
			int elem = a.eli();
			if (k==i) {
				eleA=elem;
				System.out.println("este es el ["+k+"] elemento =>"+eleA);
			}
			a.adi(elem);
		}
		for (int k = 1; k <= nroB; k++) {
			int elem = b.eli();
			if (k==j) {
				eleB=elem;
				System.out.println("este es el ["+k+"] elemento =>"+eleB);
				elem=eleA;
			}
			b.adi(elem);
		}
		for (int k = 1; k <= nroA; k++) {
			int elem = a.eli();
			if (k==i) {
				elem=eleB;
			}
			a.adi(elem);
		}
		
		
	}

}
