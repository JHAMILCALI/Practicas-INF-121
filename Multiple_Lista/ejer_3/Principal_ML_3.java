package ejer_3;

import java.util.Scanner;

public class Principal_ML_3 {
	public static void main(String[] args) {
		//*********ESTUDIANTES*************
		LS_NormalEstudiante A1 = new LS_NormalEstudiante();
		A1.adiFinal(new Estudiante("jose",13));
		A1.adiFinal(new Estudiante("ana",12));
		A1.adiFinal(new Estudiante("jhon",13));
		
		LS_NormalEstudiante A2 = new LS_NormalEstudiante();
		A2.adiFinal(new Estudiante("jose",13));
		A2.adiFinal(new Estudiante("ana",12));
		A2.adiFinal(new Estudiante("jhon",13));
		
		//*********CALIFICACIONES*************
		LS_NormalCalificacion B1 = new LS_NormalCalificacion();
		B1.adiFinal(new Calificacion("jose",15));
		B1.adiFinal(new Calificacion("jhon",3));
		B1.adiFinal(new Calificacion("ana",9));
		
		LS_NormalCalificacion B2 = new LS_NormalCalificacion();
		B2.adiFinal(new Calificacion("jose",23));
		B2.adiFinal(new Calificacion("jhon",30));
		B2.adiFinal(new Calificacion("ana",30));
		
		//*********MATERIAS*************
		LS_NormalMaterias C = new LS_NormalMaterias();
		C.adiFinal(new Materias("Matematicas"), A1, B1);
		C.adiFinal(new Materias("Literatura"), A2, B2);
		
		C.mostrar();
		
		//b. Mostrar los datos de los estudiantes que hayan 
		//reprobado, en la materia con nombre X
		System.out.println("\t*****INCISO B*****");
		System.out.println("Intro el nombre de la MateriaX> ");
		Scanner sc = new Scanner(System.in); 
		//String nomMatX =sc.next();
		String nomMatX ="Matematicas";
		double notaRepro=15;
		inciso_b(C,nomMatX,notaRepro);
		//c. Calcular el promedio de todos los estudiantes 
		//aprobados de cada materia
		System.out.println("\t*****INCISO C*****");
		inciso_c(C,15);
	}

	private static void inciso_c(LS_NormalMaterias c, double notaapro) {
		NodoMaterias R = c.getP();
		
		while (R!=null) {
			Materias ma = R.getQ();
			double sumNota=0;
			int cont=0;
			NodoCalificacion S = R.getlCalificacion().getP();
			while (S!=null) {
				Calificacion ca = S.getQ();
				if (ca.getNota()>=notaapro) {
					sumNota+=ca.getNota();
					cont++;
				}
				S=S.getSig();
			}
			if (cont!=0) {
				double promTotal=sumNota/cont;
				double numeroRedondeado = Math.round(promTotal * 100.0) / 100.0;
				System.out.println("El promedio de aprobacion es ["+numeroRedondeado+"]"+" Materia =>"+ma.getNomMateria());
			}else {
				System.out.println("No existe el promedio para la materia de "+ma.getNomMateria());
			}
			
			R=R.getSig();
		}
	}

	private static void inciso_b(LS_NormalMaterias c, String nomMatX, double notaRepro) {
		NodoMaterias R = c.getP();
		System.out.println("ESTUDIANTES QUE REPROBARON CON LA NOTA MENOR A "+notaRepro);
		while (R!=null) {
			Materias m = R.getQ();
			NodoCalificacion S = R.getlCalificacion().getP();
			while (S!=null) {
				Calificacion ca = S.getQ();
				if (ca.getNota()<notaRepro) {
					NodoEstudiante T = R.getLEstudiante().getP();
					while (T!=null) {
						Estudiante es = T.getQ();
						if (es.getNombre().equals(ca.getNombre())) {
							
							es.mostrar();
							System.err.println("Nota: "+ca.getNota());
							System.out.println("------------------");
						}
						T=T.getSig();
					}
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
		
	}
}
