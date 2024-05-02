package ejer_ejemplo;

import java.util.Scanner;

public class principal {
	public static void main(String[] args) {

		LS_NormalPersona A = new LS_NormalPersona();
		A.mostrar();

		Persona z1 = new Persona("Lupe", 15);
		Persona z2 = new Persona("Alan", 20);
		Persona z3 = new Persona("Luis", 22);
		Persona z4 = new Persona("Mario", 15);

		A.adiFinal(z1);
		A.adiFinal(z2);
		A.adiFinal(z3);
		A.adiFinal(z4);
		System.out.println("Lista A:");
		A.mostrar();

		Scanner leer = new Scanner(System.in);
		System.out.println("Intro i-esimo");
		int i = leer.nextInt();
		SolucionE(i, A);

	}

	private static void SolucionE(int i, LS_NormalPersona A) {
		int n = A.nroNodos();
		System.out.println("Nro de Nodos:  " + n);

		if (i <= n) {
			NodoPersona R = A.getP();
			int cont = 0;
			while (R != null) {
				Persona w = R.getQ();
				cont++;
				// System.out.println(cont);
				if (cont == i)
					w.mostrar();

				R = R.getSig();
			}
		} else {
			System.out.println("no existe!!!!");
		}

	}
}
