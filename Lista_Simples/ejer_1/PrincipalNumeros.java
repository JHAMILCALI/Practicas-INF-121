package ejer_1;

import java.util.Scanner;

public class PrincipalNumeros {

	public static void main(String[] args) {
		LS_NormalNumeros A = new LS_NormalNumeros();
		A.adiFinal(3);
		A.adiFinal(2);
		A.adiFinal(4);
		A.adiFinal(5);
		A.adiFinal(7);
		A.adiFinal(2);
		A.adiFinal(1);
		System.out.println("\t*****LISTA DE NUMEROS ENTEROS****");
		A.mostrar();
		//a. Eliminar los números pares
		System.out.println("\n\t*****INCISO A******");
		inciso_a(A);
		System.out.println("----Lista modificada sin numeros pares----");
		A.mostrar();
		//b. Insertar un nuevo número después de cada número impar
		System.out.println("\n\t*****INCISO B******");
		inciso_b(A);
		System.out.println("-----Lista modificada agregando numeros cada ves que sea impar----");
		A.mostrar();
		
		//c. Dividir en dos listas, una de números pares y otra de impares.
		//No crear nuevos nodos.
		System.out.println("\n\t*****INCISO C******");
		LS_NormalNumeros B = new LS_NormalNumeros();
		inciso_c(A,B);
		System.out.println("\t****LISTA CON NUMEROS PARES*****");
		A.mostrar();
		System.out.println("\n\t****LISTA CON NUMEROS IMPARES*****");
		B.mostrar();
	}

	private static void inciso_c(LS_NormalNumeros a, LS_NormalNumeros b) {
	    NodoNumeros R = a.getP();
	    NodoNumeros S = R;
	    while (R != null) {
	        int num = R.getQ();
	        if (num % 2 != 0) {
	            b.adiFinal(num);
	            if (R == a.getP()) {
	                a.setP(R.getSig());
	                R = R.getSig();
	                S = R;
	            } else {
	                S.setSig(R.getSig());
	                R = R.getSig();
	            }
	        } else {
	            S = R;
	            R = R.getSig();
	        }
	    }
	}


	private static void inciso_b(LS_NormalNumeros a) {
		NodoNumeros R = a.getP();
		Scanner sc = new Scanner(System.in);
		while (R!=null) {
			int elem = R.getQ();
			if (!(elem%2==0)) {
				System.out.println("Ingrese un numero a adicionar: ");
				NodoNumeros nuevo = new NodoNumeros();
				int n = sc.nextInt();
				nuevo.setDato(n);
				nuevo.setSig(R.getSig());
				R.setSig(nuevo);
			}
			R=R.getSig();
		}
		
	}

	private static void inciso_a(LS_NormalNumeros a) {
		NodoNumeros R = a.getP();
		NodoNumeros S = R;
		while (R!=null) {
			int elem = R.getQ();
			if (elem%2==0) {
				if (R==a.getP()) {
					R=R.getSig();
					S=R;
					a.setP(R);
				}else {
					S.setSig(R.getSig());
					R = R.getSig();
				}
			}else {
				S=R;
				R=R.getSig();
			}
		}
		
	}

}
