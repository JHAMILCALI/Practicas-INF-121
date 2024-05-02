package ejer_ejemplo;

import java.util.Scanner;

public class principal3 {
	public static void main(String[] args) {

		LS_NormalPersona A = new LS_NormalPersona();
		A.mostrar();

		Persona z1 = new Persona("Sofia", 15);
		Persona z2 = new Persona("Miriam", 22);
		Persona z3 = new Persona("Alan", 15);

		A.adiFinal(z1);
		A.adiFinal(z2);
		A.adiFinal(z3);
		System.out.println("Lista A:");
		A.mostrar();

		// agregar a Jhoseline despues de la persona con nombre x
		System.out.println("ingrese nombre x:");
		Scanner leer = new Scanner(System.in);
		String x = leer.nextLine();
		System.out.println("-----------Solucion----------");
		Solucion(x,A);
	}

	private static void Solucion(String x, LS_NormalPersona A) {
		NodoPersona R = A.getP();
		while (R != null) {
			Persona w = R.getQ();
			System.out.println(w.getNombre());
			if (w.getNombre().equals(x)) {
				System.out.println("\tEncontramos a x");
				System.out.println("\tdebemos agregar el nuevo nodo");
				NodoPersona nuevo = new NodoPersona();
				Persona z = new Persona("Jhoseline", 20);
				nuevo.setDato(z);
				nuevo.setSig(R.getSig());
				R.setSig(nuevo);
			}
			
			R = R.getSig();	
		}
		System.out.println("----Nueva Lista-----");
		A.mostrar();
		
	}

}
