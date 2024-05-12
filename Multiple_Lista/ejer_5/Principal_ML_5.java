package ejer_5;

import java.util.Scanner;

public class Principal_ML_5 {
	public static void main(String[] args) {
		LS_NormalEstudiante A1 = new LS_NormalEstudiante();
		A1.adiFinal(new Estudiante("jose","78745378",22));
		A1.adiFinal(new Estudiante("jhamil","89475878",24));
		A1.adiFinal(new Estudiante("ana","64648748",19));
		A1.adiFinal(new Estudiante("abril","974757398",30));
		
		LS_NormalEstudiante A2 = new LS_NormalEstudiante();
		A2.adiFinal(new Estudiante("jhoel","764678589",25));
		A2.adiFinal(new Estudiante("jazmin","84674633",34));
		A2.adiFinal(new Estudiante("viktor","78877890",18));
		A2.adiFinal(new Estudiante("anahi","7485737490",27));
		A2.adiFinal(new Estudiante("angela","908547494",18));
		
		LS_NormalEstudiante A3 = new LS_NormalEstudiante();
		A3.adiFinal(new Estudiante("maycol","8573839",23));
		A3.adiFinal(new Estudiante("benjamin","9475749",23));
		
		LS_NormalEstudiante A4 = new LS_NormalEstudiante();
		A4.adiFinal(new Estudiante("maycol","8573839",23));
		A4.adiFinal(new Estudiante("benjamin","9475749",23));
		
		LS_NormalMateria B1 = new LS_NormalMateria();
		B1.adiFinal(new Materia("INF-121"), A1);
		B1.adiFinal(new Materia("INF-111"), A2);
		
		LS_NormalMateria B2 = new LS_NormalMateria();
		B2.adiFinal(new Materia("INF-131"), A3);
		B2.adiFinal(new Materia("INF-221"), A4);
		
		LS_NormalResponsable C1 = new LS_NormalResponsable();
		C1.adiFinal(new Responsable("lucas","2453648"));
		C1.adiFinal(new Responsable("adrian","8976478"));
		
		LS_NormalResponsable C2 = new LS_NormalResponsable();
		C2.adiFinal(new Responsable("marcos","35473849"));
		C2.adiFinal(new Responsable("maria","89476238"));
		
		LS_NormalLaboratorio D = new LS_NormalLaboratorio();
		D.adiFinal(new Laboratorio("1A","P-2",C1,B1));
		D.adiFinal(new Laboratorio("1B","P-1",C2,B2));
		D.mostrar();
		
		//a. Mostrar el idLaboratorio donde se encuentra la 
		//materia con sigla “INF121”
		System.out.println("\t*****INCIISO A******");
		String materiaX="INF-121";
		inciso_a(D,materiaX);
		//b. Mostrar la ubicación(es) donde esta el 
		//responsable con ci X.
		Scanner sc = new Scanner(System.in);
		System.out.println("\t*****INCIISO B******");
		System.out.println("Intreo CI a busacar del encargado> ");
		//String CIX=sc.next();
		String CIX="8976478";
		inciso_b(D,CIX);
		//c. Mostrar los estudiantes que están en la materia Z.
		System.out.println("\t*****INCIISO C******");
		System.out.println("Intro la mataria Z> ");
		//String materiaZ=sc.next();
		String materiaZ="INF-111";
		incizo_c(D,materiaZ);
		//d. Mostrar la sigla de la materia donde 
		//se encuentra el estudiante Y.
		System.out.println("\t*****INCIISO D******");
		System.out.println("Intro el nombre del estudiante Y> ");
		//String estuY=sc.next();
		String estuY="maycol";
		inciso_d(D,estuY);
	}

	private static void inciso_d(LS_NormalLaboratorio d, String estuY) {
		NodoLaboratorio R = d.getP();
		while (R!=null) {
			Laboratorio la = R.getLaboratorio();
			NodoMateria S = la.getLMatarias().getP();
			while (S!=null) {
				Materia ma = S.getMateria();
				NodoEstudiante E = S.getLEstudiantes().getP();
				while (E!=null) {
					Estudiante es = E.getQ();
					if (es.getNombre().equals(estuY)) {
						System.out.println("El estudiante "+es.getNombre()+
								" esta en la materia de => "+ma.getSigla());
					break;
					}
					E=E.getSig();
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}

	private static void incizo_c(LS_NormalLaboratorio d, String materiaZ) {
		NodoLaboratorio R = d.getP();
		while (R!=null) {
			Laboratorio la = R.getLaboratorio();
			NodoMateria S = la.getLMatarias().getP();
			while (S!=null) {
				Materia ma = S.getMateria();
				if (ma.getSigla().equals(materiaZ)) {
					S.getLEstudiantes().mostrar();
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}

	private static void inciso_b(LS_NormalLaboratorio d, String cIX) {
		NodoLaboratorio R = d.getP();
		while (R!=null) {
			Laboratorio la = R.getLaboratorio();
			NodoResponsable S = la.getLResponsable().getP();
			while (S!=null) {
				Responsable re = S.getQ();
				if (re.getCi().equals(cIX)) {
					System.out.println("El responsable "+re.getNombre()+" se encutra en");
					System.out.println("Ubicacion del laboratorio => "+la.getUbicacion());
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}

	private static void inciso_a(LS_NormalLaboratorio d, String materiaX) {
		NodoLaboratorio R = d.getP();
		while (R!=null) {
			Laboratorio la = R.getLaboratorio();
			NodoMateria S = la.getLMatarias().getP();
			while (S!=null) {
				Materia ma = S.getMateria();
				if (ma.getSigla().equals(materiaX)) {
					System.out.println("La materia de ["+ma.getSigla()+"]"
							+ " su ID de laboratorio es: "+la.getIdLaboratorio());
				break;
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}
}
