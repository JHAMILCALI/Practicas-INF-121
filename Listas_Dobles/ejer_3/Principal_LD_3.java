package ejer_3;

import java.util.Iterator;

public class Principal_LD_3 {

	public static void main(String[] args) {
		LD_NormalArea A = new LD_NormalArea();
		A.adiFinal(new Area("Infantil",10));
		A.adiFinal(new Area("Matematicas",4));
		A.adiFinal(new Area("Ciencias",16));
		A.adiFinal(new Area("políticas",3));
		
		LD_CircularLibro B = new LD_CircularLibro();
		B.adiFinal(new Libro("Mi primer algoritmo","Ciencias"));
		B.adiFinal(new Libro("El sistema digestivo","Ciencias"));
		B.adiFinal(new Libro("Armando rojo","Matematicas"));
		B.adiFinal(new Libro("Serways","Matematicas"));
		B.adiFinal(new Libro("Coquito","Infantil"));
		B.adiFinal(new Libro("Fabulas de esopo","Infantil"));
		B.adiFinal(new Libro("100 leyes de bolivia","políticas"));
		B.adiFinal(new Libro("ley del maltrato animal","políticas"));
		B.adiFinal(new Libro("Abecedario Infantil","Infantil"));
		System.out.println("\t Lista de Areas de la biblioteca");
		A.mostrar();
		System.out.println("\t Lista de Libros");
		B.mostrar();
		//a. Mostrar cada área y toda la información de sus libros.
		System.out.println("\t*****INSISO A*****");
		inciso_a(A,B);
		//b. Agregar R libros al área X.
		System.out.println("\t*****INSISO B*****");
		System.out.println("Intro el area X :");
		String areaX="Ciencias";
		System.out.println("Intro la cantidad de libros: ");
		int canX=2;
		inciso_b(A,B,areaX,canX);
		System.out.println("\t Lista de Libros");
		B.mostrar();
	}

	private static void inciso_b(LD_NormalArea a, LD_CircularLibro b, String areaX, int canX) {
		NodoArea R = a.getP();
		while (R!=null) {
			Area ar = R.getArea();
			if (ar.getArea().equals(areaX)) {
				for (int i = 1; i <= canX; i++) {
					Libro li = new Libro();
					System.out.println("Intro libro ["+i+"]");
					li.leer();
					b.adiFinal(li);
				}
			}
			R=R.getSig();
		}
		
	}

	private static void inciso_a(LD_NormalArea a, LD_CircularLibro b) {
		NodoArea R = a.getP();
		while (R!=null) {
			Area ar = R.getArea();
			NodoLibro S = b.getP();
			int nroNodos = b.nroNodos();
			System.out.println("\n\tLibros de "+ar.getArea());
			for (int j = 0; j < nroNodos; j++) {
				Libro li = S.getLibro();
				
				if (li.getArea().equals(ar.getArea())) {
					li.mostrar();
					System.out.println("--------------------------");
				}
				S=S.getSig();
			}
			R=R.getSig();
		}	
	}

}
