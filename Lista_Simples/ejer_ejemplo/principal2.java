package ejer_ejemplo;

import java.util.Scanner;

public class principal2 {
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

		LS_NormalPersona B = new LS_NormalPersona();
		Persona z5 = new Persona("Sofia", 21);
		Persona z6 = new Persona("Miriam", 21);
		Persona z7 = new Persona("Alan", 20);
		
		B.adiFinal(z5);
		B.adiFinal(z6);
		B.adiFinal(z7);
		
		System.out.println("\nLista B:");
		B.mostrar();
		// mostrar a las personas que se encuentran en ambas listas
		System.out.println("------------Solucion D-----------------");
		SolucionD(A,B);
		
		
		
		// recorridos
		
		// recorridos modificamos la lista
				// modificar los enlaces 
		
		
		
		
		
		

	}

	private static void SolucionD(LS_NormalPersona A, LS_NormalPersona B) {
		NodoPersona R = A.getP();
		while(R!= null) {
			Persona w = R.getQ();
//			System.out.println(w.getNombre());
			boolean existe = false;
			
			NodoPersona R2 = B.getP();
			while( R2!=null) {
				Persona z = R2.getQ();
//				System.out.println("----- "+z.getNombre());
				if(w.getNombre().equals(z.getNombre())) {
					if(w.getEdad() == z.getEdad()) {
						existe = true;
					}
				}
				R2 = R2.getSig();
			}
//			System.out.println(existe);
			if(existe == true) {
				w.mostrar();
			}
			R= R.getSig();
		}
		
	}

}
