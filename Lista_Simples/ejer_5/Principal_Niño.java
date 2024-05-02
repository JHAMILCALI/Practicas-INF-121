package ejer_5;
public class Principal_Niño {
	public static void main(String[] args) {
		LS_CircularNiño A = new LS_CircularNiño();
		LS_CircularNiño pequeñines = new LS_CircularNiño();
		LS_CircularNiño niditos = new LS_CircularNiño();
		A.adiFinal("jose", 0.4);
		A.adiFinal("ana", 2);
		A.adiFinal("jhamil", 1);
		A.adiFinal("jimmy", 3);
		A.adiFinal("dani", 4);
		A.adiFinal("abril", 1);
		A.adiFinal("yon", 1);
		A.adiFinal("jenry", 3);
		A.mostrar();
		//a. Mostrar a los niños por secciones.
		System.out.println("\n\t*****INCISO A******");
		inciso_a(A);
		System.out.println("\n\t*****INCISO B******");
		inciso_b(A,pequeñines,niditos);
		System.out.println("\t----LISTA DE PEQUEÑINES----");
		pequeñines.mostrar();
		System.out.println("\t----LISTA DE NIDITOS----");
		niditos.mostrar();
		
	}


	private static void inciso_b(LS_CircularNiño a, LS_CircularNiño pequeñines, LS_CircularNiño niditos) {
		NodoNiño R = a.getP();
		NodoNiño S = a.getP();
		while (R.getSig()!=a.getP()) {
			if (R.x.getEdad()<=1) {
				pequeñines.adiFinal(R.x.getNombre(), R.x.getEdad());
			}
			R=R.getSig();
		}
		while (S.getSig()!=a.getP()) {
			if (S.x.getEdad()>1) {
				niditos.adiFinal(S.x.getNombre(), S.x.getEdad());
			}
			S=S.getSig();
		}
		niditos.adiFinal(S.x.getNombre(), S.x.getEdad());
		
	}


	private static void inciso_a(LS_CircularNiño a) {
		NodoNiño R = a.getP();
		NodoNiño S = a.getP();
		System.out.println("****SECCION DE PEQUEÑINES****");
		while (R.getSig()!= a.getP()) {
			if (R.x.getEdad()<=1) {
				System.out.println("Nombre["+R.x.getNombre()+"] edad ["+R.x.getEdad()+"]");
			}
			R=R.getSig();
		}
		System.out.println("****SECCION DE NIDITOS****");
		while (S.getSig()!= a.getP()) {
			//System.out.println(S.x.getEdad());
			if (S.x.getEdad()>1) {
				System.out.println("Nombre["+S.x.getNombre()+"] edad ["+S.x.getEdad()+"]");
			}
			S=S.getSig();
		}
		System.out.println("Nombre["+S.x.getNombre()+"] edad ["+S.x.getEdad()+"]");
	}

	
}
