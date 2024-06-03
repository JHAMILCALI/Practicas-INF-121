package ejer_7;

public class Principal_ML_7 {
	public static void main(String[] args) {
		LS_NormalPrograma B1 = new LS_NormalPrograma();
		B1.adiFinal(new Programa("La batidora","cocina","10:00","Lunes a Viernes",2));
		B1.adiFinal(new Programa("Unitel not","noticias","12:00","Lunes a Viernes",2));
		B1.adiFinal(new Programa("Chicos teysion","infantil","16:00","Lunes a Viernes",1));
		B1.adiFinal(new Programa("Cine Mundo","pelicula","22:00","Domingo",1.3));
		B1.adiFinal(new Programa("Cine Animado","pelicula","10:00","Sabado",1.56));

		LS_NormalPrograma B2 = new LS_NormalPrograma();
		B2.adiFinal(new Programa("Cineteca","pelicula","20:00","Sabado",2));
		B2.adiFinal(new Programa("Notivision","noticias","20:00","Lunes a Viernes",2));
		B2.adiFinal(new Programa("Bigote","entretenimiento","17:00","Lunes a Viernes",2));

		LS_NormalPrograma B3 = new LS_NormalPrograma();
		B3.adiFinal(new Programa("Cinemania","pelicula","17:00","Sabado",1.45));
		B3.adiFinal(new Programa("Dragon Ball","anime","17:00","Lunes a Viernes",1.55));
		
		
		LS_NormalCanal A = new LS_NormalCanal();
		A.adiFinal(new Canal(2,"UNITEL","La Paz",B1));
		A.adiFinal(new Canal(11,"RED UNO","La Paz",B2));
		A.adiFinal(new Canal(4,"RTP","Cochabamba",B3));
		A.mostrar();
		//a. Mostrar el NroCanal, NombreCanal y los programas de tipo película que se
		//emitirán el fin de semana en los mismos.
		System.out.println("\t*****INCISO A*****");
		String tipoPrograma="pelicula";
		inciso_a(A,tipoPrograma);
		//b. Mostrar el Nrocanal, el dia y el tipo donde se emite el programa X.
		System.out.println("\t*****INCISO B*****");
		System.out.println("Intro programa X a buscar> ");
		String progX="Notivision";
		inciso_b(A,progX);
		//c. Ordenar ascendentemente los canales de televisión según el número de
		//programas.
		System.out.println("\t*****INCISO C*****");
		inciso_c(A);
		System.out.println("\t INVERTIR EN ORDEN ASCENDENTE DE LISTA DE CANALES");
		A.mostrar();
		
	}

	private static void inciso_c(LS_NormalCanal a) {
		
		LS_NormalCanal aux1 = new LS_NormalCanal();
		NodoCanal R = a.getP();
		NodoCanal S = R;
		while (R!=null) {
			int catMaxima = MayorCantProg(a);
			Canal ca = R.getCanal();
			NodoPrograma P = ca.getLprogramas().getP();
			int cont=0;
			while (P!=null) {
				Programa pro = P.getPrograma();
				cont++;
				P=P.getSig();
			}
			if (catMaxima==cont) {
				aux1.adiPrincipio(ca);
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
		//aux1.mostrar();
		NodoCanal aux = aux1.getP();
		while (aux!=null) {
			Canal ca = aux.getCanal();
			a.adiFinal(ca);;
			aux=aux.getSig();
		}	
	}

	private static int MayorCantProg(LS_NormalCanal a) {
		NodoCanal R = a.getP();
		int mayorcant=0;
		while (R!=null) {
			Canal ca = R.getCanal();
			NodoPrograma S = ca.getLprogramas().getP();
			int cont=0;
			while (S!=null) {
				Programa pro = S.getPrograma();
				cont++;
				S=S.getSig();
			}
			R=R.getSig();
			if (cont>mayorcant) {
				mayorcant=cont;
			}
		}
		return mayorcant;
	}

	private static void inciso_b(LS_NormalCanal a, String progX) {
		NodoCanal R = a.getP();
		boolean sw=false;
		while (R!=null) {
			Canal ca = R.getCanal();
			NodoPrograma S = ca.getLprogramas().getP();
			while (S!=null) {
				Programa pr = S.getPrograma();
				if (pr.getNomPrograma().equals(progX)) {
					System.out.println("\tEL PROGRAMA DE "+progX+" EXISISTE");
					System.out.println("El nro Canal es ["+ca.getNroCanal()+"]");
					System.out.println("Se transmite el Dia : "+pr.getDia());
					System.out.println("Es de tipo : "+pr.getTipo());
					System.out.println("Se emite en el canal: "+ca.getNomCanal());
					sw=true;
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
		if (!sw) {
			System.out.println("No se pudo encontrar el Programa "+progX+" !!!!!");
		}
	}

	private static void inciso_a(LS_NormalCanal a, String tipoPrograma) {
		NodoCanal R = a.getP();
		while (R!=null) {
			Canal ca = R.getCanal();
			System.out.println("\tNumero de Canal: "+ca.getNroCanal());
			System.out.println("\tNombre del Canal: "+ca.getNomCanal());
			NodoPrograma S = ca.getLprogramas().getP();
			while (S!=null) {
				
				Programa pro = S.getPrograma();
				if (pro.getTipo().equals(tipoPrograma)) {
					if (pro.getDia().equals("Sabado") || pro.getDia().equals("Domingo")) {
						pro.mostrar();
					}
					System.out.println();
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}
}
