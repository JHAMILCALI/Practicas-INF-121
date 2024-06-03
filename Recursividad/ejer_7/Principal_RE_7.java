package ejer_7;

import java.util.Scanner;

public class Principal_RE_7 {
	public static void main(String[] args) {
//		En los juegos olímpicos sea una Lista de Medallistas <disciplina, nombre, medalla,
//		país>. Se pide recursivamente:
		LS_NormalMedallista A = new LS_NormalMedallista();
		A.adiFinal(new Medallista("Natacion","Jose","Oro","Brail"));
		A.adiFinal(new Medallista("Raquet","Ana","Plata","Bolivia"));
		A.adiFinal(new Medallista("Disparo","Jhamil","Oro","Bolivia"));
		A.adiFinal(new Medallista("Natacion","Maria","Bronce","Peru"));
		A.adiFinal(new Medallista("Ajedrez","Alex","Plata","Chile"));
		A.adiFinal(new Medallista("Ajedrez","Abril","Bronce","Bolivia"));
		A.adiFinal(new Medallista("Atletismo","Calixto","Oro","Bolivia"));
		A.adiFinal(new Medallista("Atletismo","Laura","Plata","Bolivia"));
		A.adiFinal(new Medallista("Natacion","Moises","Bronce","Argentina"));
		A.adiFinal(new Medallista("Arco","Sergio","Bronce","Brail"));
		A.adiFinal(new Medallista("Arco","Jhonatan","Plata","Argentina"));
		A.adiFinal(new Medallista("Arco","Fernando","Bronce","Chile"));
		
		A.mostrar();
//		a. Mostrar cuántas medallas de “Oro”, “Plata” y ”Bronce” obtuvo el país X.
		System.out.println("\t*****INCISO A*****");
		System.out.println("Intro nombre del PaisX => ");
		Scanner sc = new Scanner(System.in);
		String nomX=sc.next();
		//String nomX="Bolivia";
		System.out.println("\tEl pais "+nomX+" obtubo las sigunetes medallas");
		System.out.println("ORO = ["+contarMedalla(A.getP(),0,"Oro",nomX)+"]");
		System.out.println("BRONCE = ["+contarMedalla(A.getP(),0,"Bronce",nomX)+"]");
		System.out.println("PLATA = ["+contarMedalla(A.getP(),0,"Plata",nomX)+"]");
//		b. Mostrar a los ganadores de la disciplina Y.
		System.out.println("\t*****INCISO B*****");
		System.out.println("Intro disiplina Y =>");
		String disX=sc.next();
		System.out.println("\tGANADORES DE LA DISIPLINA "+disX);
		//String disX="Atletismo";
		mostrar_ganadores_DisiplinaY(A.getP(),disX);
	}

	private static Object mostrar_ganadores_DisiplinaY(NodoMedallista R, String disX) {
		if (R!=null) {
			Medallista me = R.getQ();
			if (me.getDisiplina().equals(disX)) {
				me.mostrar();
			}
			return mostrar_ganadores_DisiplinaY(R.getSig(), disX);
		} else {
			return false;
		}
	}

	private static int contarMedalla(NodoMedallista R,int cont,String medallaX, String nomPais) {
		if (R!=null) {
			Medallista me = R.getQ();
			if (me.getPais().equals(nomPais)) {
				if (me.getMedalla().equals(medallaX)) {
					cont++;
				}
			}
			return contarMedalla(R.getSig(), cont, medallaX, nomPais);
		} else {
			return cont;
		}
		
	}


}
