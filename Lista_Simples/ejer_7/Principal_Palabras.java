package ejer_7;

import javax.print.attribute.standard.NumberOfDocuments;

public class Principal_Palabras {

	public static void main(String[] args) {
		LS_NormalPalabra A = new LS_NormalPalabra();
		A.adiFinal("jo");
		A.adiFinal("josge");
		A.adiFinal("hellow");
		A.adiFinal("uruguay");
		A.adiFinal("jhamilo");
		A.adiFinal("argentina");
		A.adiFinal("um");
		A.adiFinal("gooal");
		A.mostrar();
//		a. Eliminar las palabras que contengan menos
//		de tres caracteres.
		System.out.println("\n\t*****INCISO A******");
		inciso_a(A,3);
		System.out.println("\t---LISTA DE PALBRAS MODIFICADA---");
		A.mostrar();
//		b. Reemplazar cada palabra por su longitud 
//		(cantidad de caracteres).
		System.out.println("\n\t*****INCISO B******");
		inciso_b(A);
		A.mostrar();
//		c. Dividir la lista en dos, una con palabras que 
//		comienzan con vocal y otra con palabras que no.
		System.out.println("\n\t*****INCISO C******");
		LS_NormalPalabra B = new LS_NormalPalabra();
		inciso_c(A,B);
		System.out.println("\t---LISTA SIN VOCALES----");
		A.mostrar();
		System.out.println("\t---LISTA CON VOCALES----");
		B.mostrar();
	}

	private static void inciso_c(LS_NormalPalabra a, LS_NormalPalabra b) {
	    NodoPalabra R = a.getP();
	    NodoPalabra S = null; 
	    while (R != null) {
	        String e = R.getQ();
	        char car = Character.toLowerCase(e.charAt(0));
	        if (car == 'a' || car == 'e' || car == 'i' || car == 'o' || car == 'u') {
	            if (S == null) {
	                a.setP(R.getSig());
	                b.adiFinal(e);
	                R = a.getP();
	            } else {
	                S.setSig(R.getSig());
	                b.adiFinal(e);
	                R = R.getSig();
	            }
	        } else {
	            S = R;
	            R = R.getSig();
	        }
	    }
	}

	private static void inciso_b(LS_NormalPalabra a) {
		NodoPalabra R = a.getP();
		while (R!=null) {
			String e = R.getQ();
			String longitud = Integer.toString(e.length()) ;
			System.out.println("La longitud de [ "+e+"] es de ["+longitud+"]");
			R=R.getSig();
		}
		
	}

	private static void inciso_a(LS_NormalPalabra a, int cantCar) {
		NodoPalabra R = a.getP();
		NodoPalabra S = R;
		while (R!=null) {
			String e = R.getQ();
			int numCar=e.length();
			if (!(numCar>cantCar)) {
				if (R==a.getP()) {
					R=R.getSig();
					S=R;
					a.setP(R);
				}else {
					S.setSig(R.getSig());
					R=R.getSig();
				}
			}else {
				
				S=R;
				R=R.getSig();
			}
					
		}
		
	}

}
