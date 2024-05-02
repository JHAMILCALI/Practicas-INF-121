package ejer_9;

import java.util.Iterator;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Mp_ColaCirCadena A = new Mp_ColaCirCadena();
		
		A.adicionar(0, "GG");
		A.adicionar(0, "abCD");
		A.adicionar(0, "1203");
		A.adicionar(0, "Hola");
		
		A.adicionar(1, "+-+");
		A.adicionar(1, "131B");
		A.adicionar(1, "0123");
		A.adicionar(1, "ana");
		A.adicionar(1, "012210");
		
		A.adicionar(2, "aBc");
		A.adicionar(2, "ABC");
		A.adicionar(2, "10a");
		A.adicionar(2, "+-*F");
		
		A.setN(3);
		A.mostrar();
//		a. De todas las colas circulares mover a la primera cola circular todas las cadenas
//		que solo tengan caracteres entre el ‘0’ al ‘9’, mover a la segunda cola circular
//		todas las cadenas que solo tengan caracteres alfabéticos (tanto mayúsculas
//		como minúsculas) y en la cola circular 3 las cadenas que no cumplan las
//		anteriores condiciones.
		MoverCaracteres(A);
		System.out.println("\t-------INCISO A------");
		A.mostrar();
//		b. Eliminar todas las cadenas que sean palíndromos de la i-ésima cola.
		System.out.println("\t-------INCISO B------");
		System.out.println("Ingrese la I-esima cola: ");
		Scanner sc = new Scanner(System.in);
		int iesima=sc.nextInt();
		Eliminar_Palindromos(A,iesima);
		A.mostrar();

	}

	private static void Eliminar_Palindromos(Mp_ColaCirCadena a, int iesima) {
	    int n = a.getN();
	    String elem;
	    for (int i = 0; i < n; i++) {
	        if (i == iesima) {
	            int numC = a.nroElem(i);
	            for (int j = 0; j < numC; j++) {
	                elem = a.eliminar(i);
	                if (!esPalindromo(elem)) {
	                    a.adicionar(i, elem);
	                }
	            }
	        }
	    }
	}

	public static boolean esPalindromo(String cadena) {
	    char[] caracteres = cadena.toCharArray();
	    int izquierda = 0;
	    int derecha = caracteres.length - 1;

	    while (izquierda < derecha) {
	        if (caracteres[izquierda] != caracteres[derecha]) {
	            return false;
	        }
	        izquierda++;
	        derecha--;
	    }
	    System.out.println("SE elimino a: "+cadena);
	    return true;
	}


	private static void MoverCaracteres(Mp_ColaCirCadena a) {
		int n = a.getN();
		String elem;
		for (int i = 0; i < n; i++) {
			int numC = a.nroElem(i);
			for (int j = 0; j < numC; j++) {
				elem = a.eliminar(i);
				char[] c = elem.toCharArray();
				boolean swNum = false, swlet = false;
				for (char car : c) {
					if (Character.isDigit(car)) {
						swNum = true;
					}else {
						swNum =false;
					}
					if (Character.isAlphabetic(car)) {

					} else {
						swlet = true;
					}
				}
				if (swNum) {
					a.adicionar(0, elem);
				} else if (swlet) {
					a.adicionar(2, elem);
				} else if (!swlet && !swNum) {
					a.adicionar(1, elem);
				}
			}
		}
	}

}
