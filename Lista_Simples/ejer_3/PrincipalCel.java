package ejer_3;

import java.util.Scanner;

public class PrincipalCel {
	public static void main(String[] args) {
		LS_NormalCelular A = new LS_NormalCelular();
		A.adiFinal(new Celular(7765342,"Trabajo","12/04/2023","16:00","solicitud de permiso de enferemedad"));
		A.adiFinal(new Celular(7735485,"ninguno","06/11/2023","12:20","ninguna solicitud"));
		A.adiFinal(new Celular(7947596,"Deporte","11/12/2023","09:00","solicitud de lecion en el pie"));
		A.adiFinal(new Celular(7745627,"ninguno","11/12/2023","17:00","ninguna solicitud"));
		
		A.mostrar();
		//a. Mostrar los mensajes recibidos con asunto “ninguno”
		System.out.println("\n\t*****INCISO A******");
		inciso_a(A,"ninguno");
		System.out.println("\n\t*****INCISO B******");
		//b. Llevar todos los mensajes recibidos en la fecha X, al principio de la lista
		System.out.println("Introduce la Fecha X :");
		Scanner sc = new Scanner(System.in);	
		String fechaX=sc.next();
		//String fechaX="10/12/2023";
		inciso_b(A,fechaX);
		System.out.println("-----LISTA MODIFICADA FECHA AL INICIO-----");
		A.mostrar();
		//c. Eliminar los mensajes recibidos desde el celular con número X.
		System.out.println("\n\t*****INCISO C******");
		System.out.println("Introduce el nuemero X a eliminar:");
		int numeroX=sc.nextInt();
		inciso_c(A,numeroX);
		System.out.println("-----LISTA MODIFICADA NUMERO X ELIMINADO----");
		A.mostrar();
	}

	private static void inciso_c(LS_NormalCelular a, int numeroX) {
		NodoCelular R = a.getP();
		NodoCelular S = R;
		while (R!=null) {
			Celular ele = R.getQ();
			if (ele.getNumeroCel()==(numeroX)) {
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

	private static void inciso_b(LS_NormalCelular a, String fechaX) {
	    NodoCelular R = a.getP();
	    NodoCelular S = R;
	    while (R!=null) {
			Celular ele = R.getQ();
			if (ele.getFecha().equals(fechaX)) {
				if (R==a.getP()) {
					R=R.getSig();
					S=R;
				}else {
					S.setSig(R.getSig());
					R = R.getSig();
					a.adiPrincipio(ele);
				}
			}else {
				S=R;
				R=R.getSig();
			}
		}
	}


	private static void inciso_a(LS_NormalCelular a,String asuntoX) {
		NodoCelular R = a.getP();
		while (R!=null) {
			Celular ele = R.getQ();
			if (ele.getAsunto().equals(asuntoX)) {
				System.out.println();
				ele.mostrar();
			}
			R=R.getSig();
		}
		
	}
}
