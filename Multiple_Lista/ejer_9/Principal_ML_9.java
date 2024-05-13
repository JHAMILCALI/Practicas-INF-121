package ejer_9;

import java.util.Scanner;

public class Principal_ML_9 {
	public static void main(String[] args) {
		LS_NormalDeporte A = new LS_NormalDeporte();
		A.adiFinal(new Deporte("Futbol","Masculino","Meter gol a una de los 2 arcos"));
		A.adiFinal(new Deporte("Atletismo","Masculino","Correr los 500mt al rededor de "
				+ "la pista y llegar a la meta en menor tiempo"));
		A.adiFinal(new Deporte("Golf","Damas","Meter una peloto pequeña en un ollo en un campo amplio"));

		
		LD_NormalParticipante B1 = new LD_NormalParticipante();
		B1.adiFinal(new Participante("jose","Bolvia",21));
		B1.adiFinal(new Participante("jorge","Chile",24));
		B1.adiFinal(new Participante("jhamil","Argentina",18));
		
		LD_NormalParticipante B2 = new LD_NormalParticipante();
		B2.adiFinal(new Participante("jose","Bolvia",31));
		B2.adiFinal(new Participante("carlos","Bolvia",24));
		B2.adiFinal(new Participante("roberto","Argentina",25));
		B2.adiFinal(new Participante("messi","Argentina",35));
		B2.adiFinal(new Participante("divala","Argentina",24));
		B2.adiFinal(new Participante("lautaro","Bolvia",22));
		B2.adiFinal(new Participante("chema","Bolvia",28));
		B2.adiFinal(new Participante("dimaria","Argentina",32));
		
		LD_NormalParticipante B3 = new LD_NormalParticipante();
		B3.adiFinal(new Participante("ana","chile",22));
		B3.adiFinal(new Participante("abril","brasil",21));
		B3.adiFinal(new Participante("laura","Bolvia",20));
		B3.adiFinal(new Participante("diana","Peru",23));
		B3.adiFinal(new Participante("lili","Mexico",21));
		
		LS_NormalEvento C = new LS_NormalEvento();
		C.adiFinal(new Evento("Olimpiadas","Francia","12/02/2024","Atletismo",B1));
		C.adiFinal(new Evento("Sudamericanas","Brasil","14/10/2024","Futbol",B2));
		C.adiFinal(new Evento("Power ball","Bolvia","02/05/2024","Golf",B3));

		C.mostrar();
		A.mostrar();
		//a. Mostrar todos los eventos en los que participa un país específico.
		System.out.println("\t******INCISO A****");
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro pais a buscar eventos> ");
		//String nomPais=sc.next();
		String nomPais="Argentina";
		eventos_del_PaisX(C,nomPais);
		//b. Mostrar todos los participantes de un evento específico.
		System.out.println("\t******INCISO B****");
		System.out.println("Intro evento a mostrar> ");
		//String evento=sc.next();
		String evento="Power ball";
		mostrar_participantes_evento(C,evento);
		//c. Calcular la edad promedio de los participantes por deporte.
		promedio_edad_por_deporte(C,A);
		//d. Eliminar un participante específico de un evento
		System.out.println("\t******INCISO D****");
		System.out.println("Introduce el participante a eliminar> ");
		//String nomX=sc.next();
		String nomX="messi";
		System.out.println("Intro el evento>  ");
		//String nomEve=sc.next();
		String nomEve="Sudamericanas";
		eliminar_Participante(C,nomEve,nomX);
		C.mostrar();
		
	}

	

	private static void eliminar_Participante(LS_NormalEvento c, String nomEve, String nomX) {
	    NodoEvento R = c.getP();
	    boolean sw=false;
	    while (R != null) {
	        Evento eve = R.getEvento();
	        if (eve.getNombre().equals(nomEve)) {
	            NodoParticipante S = eve.getLDParticipante().getP();
	            int nronodos = eve.getLDParticipante().nroNodos();
	            for (int i = 0; i < nronodos; i++) {
	                Participante pa = S.getParticipante();
	                if (pa.getNombre().equals(nomX)) {
	                	sw=true;
	                	System.out.println("\n......SE ELIMINARA A "+nomX+".....");
	                    if (S == eve.getLDParticipante().getP()) {
	                        eve.getLDParticipante().setP(S.getSig());
	                        if (S.getSig() != null) {
	                            S.getSig().setAnt(null);
	                        }
	                        S.setSig(null);
	                        break;
	                    } else {
	                        NodoParticipante prev = S.getAnt();
	                        prev.setSig(S.getSig());
	                        if (S.getSig() != null) {
	                            S.getSig().setAnt(prev);
	                        }
	                        S.setSig(null);
	                        S.setAnt(null);
	                        break;
	                    }
	                } else {
	                    S = S.getSig();
	                }
	            }
	        }
	        R = R.getSig();
	    }
	    if (!sw) {
			System.out.println("No se pudo encontrar a "+nomX+" para eliminar!!!!");
		}
	}




	private static void promedio_edad_por_deporte(LS_NormalEvento c, LS_NormalDeporte a) {
		NodoDeporte R = a.getP();
		while (R!=null) {
			Deporte de = R.getDeporte();
			NodoEvento S = c.getP();
			double promedio_edad=0;
			while (S!=null) {
				Evento eve = S.getEvento();
				if (de.getNombre().equals(eve.getNombreDeporte())) {
					promedio_edad = promedioEdad(eve);
				}
				S=S.getSig();
			}
			System.out.println("La edad promedio del deporte "+de.getNombre()+" es "+promedio_edad);
			R=R.getSig();
		}
	}

	private static double promedioEdad(Evento eve) {
		NodoParticipante R = eve.getLDParticipante().getP();
		int nroNodos = eve.getLDParticipante().nroNodos();
		double sumEdad=0,cont=0;
		for (int i = 0; i < nroNodos; i++) {
			Participante pa = R.getParticipante();
			sumEdad+=pa.getEdad();
			R=R.getSig();
		}
		double total=sumEdad/nroNodos;
		return total;
	}

	private static void mostrar_participantes_evento(LS_NormalEvento c, String evento) {
		NodoEvento R = c.getP();
		System.out.println("\tLISTA DE PARTICIPANTES");
		while (R!=null) {
			Evento eve = R.getEvento();
			if (eve.getNombre().equals(evento)) {
				NodoParticipante S = eve.getLDParticipante().getP();
				eve.getLDParticipante().mostrar();
			}
			R=R.getSig();
		}
	}

	private static void eventos_del_PaisX(LS_NormalEvento c, String nomPais) {
		NodoEvento R = c.getP();
		System.out.println("\tEL PAIS DE "+nomPais+" PARTICIPO DE LOS EVENTOS ");
		while (R!=null) {
			Evento eve = R.getEvento();
			NodoParticipante S = eve.getLDParticipante().getP();
			int nroNodos = eve.getLDParticipante().nroNodos();
			for (int i = 0; i < nroNodos; i++) {
				Participante pa = S.getParticipante();
				if (pa.getPais().equals(nomPais)) {
					System.out.println("Evento: "+eve.getNombre());
					break;
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}
}
