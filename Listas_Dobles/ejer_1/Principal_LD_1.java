package ejer_1;

import java.util.Scanner;

public class Principal_LD_1 {

	public static void main(String[] args) {
		LD_NormalHabitacion A = new LD_NormalHabitacion();
		A.adiFinal(new Habitacion("1", 4));
		A.adiFinal(new Habitacion("2", 1));
		A.adiFinal(new Habitacion("3", 3));
		A.adiFinal(new Habitacion("4", 5));
		A.adiFinal(new Habitacion("5", 1));

		A.mostrar();

		LS_CircularHuesped B = new LS_CircularHuesped();
		B.adiFinal(new Huesped("Mamani", 3, "3"));
		B.adiFinal(new Huesped("Condori", 3, "1"));
		B.adiFinal(new Huesped("Suarez", 6, "4"));
		B.adiFinal(new Huesped("Morales", 2, "2"));
		B.adiFinal(new Huesped("Mamani", 1, "5"));

		B.mostrar();
		// a. Verificar y mostrar si existe alguna habitación que
		// está excediendo su capacidad.
		System.out.println("\n\t*****INCISO A*****");
		inciso_a(A, B);
//		b. La habitación número X queda vacía, entonces se pide 
//		eliminar a los huéspedes de dicha habitación.
		System.out.println("\n\t*****INCISO B*****");
		System.out.println("Intro duce el num de habitacion que quedara vacia: ");
		String numhabX = "3";
		inciso_b(B, numhabX);
		System.out.println("\t----LISTA MODIFICADA----");
		B.mostrar();
//		c. Una familia de 3 miembros llegó al hotel y piden la 
//		habitación número X, verificar si esta habitación tiene 
//		una capacidad de 3 personas, si es así agregar a la
//		familia a la lista de huéspedes.
		System.out.println("\n\t*****INCISO C*****");
		Scanner sc = new Scanner(System.in);

		System.out.println("Cantidad de la familia: ");
		//int cantFamili=sc.nextInt();
		int cantFamili=5;
		System.out.println("Avitacion a la cual quiere añadirse: ");
		//String numHabi=sc.next();
		String numHabi="2";
		inciso_c(A,B,cantFamili,numHabi);
		System.out.println("\n\tAÑADIENDO A LA LISTA");
		B.mostrar();
	}

	private static void inciso_c(LD_NormalHabitacion a, LS_CircularHuesped b, int cantFamili, String numHabi) {
		Scanner sc = new Scanner(System.in);
		NodoHabitacion R = a.getP();
		boolean sw = false, sw2=false;
		while (R!=null) {
			Habitacion hab = R.getHabitacion();
			if (hab.getNuemeroHabitacion().equals(numHabi) && desocupado(a,b,numHabi)) {
				if (hab.getCapacidad()>=cantFamili) {
					Huesped nuevo = new Huesped();
					System.out.println("\t**Intro nombre de la familia**");
					String nfa=sc.next();
					nuevo.setNomFamilia(nfa);
					nuevo.setCantidad_de_mienbros(cantFamili);
					nuevo.setNroHabitacion(numHabi);
					b.adiFinal(nuevo);
					sw=true;
				}
				sw2=true;
			}
			R=R.getSig();
		}
		if (!sw2) {
			System.out.println("NO SE PUDO AÑADIR DEVIDO QUE YA ESTA OCUPADA !!!");
		}else {
			if (!sw) {
				System.out.println("NO SE PUDO AÑADIR A LA LISTA YA QUE EXEDE LA CAPACIDAD !!!!");
			}
		}

	}

	private static boolean desocupado(LD_NormalHabitacion a, LS_CircularHuesped b, String numHabi) {
		NodoHuesped S = b.getP();
		int n = b.nroNodos();
		for (int i = 0; i < n; i++) {
			Huesped hu = S.getHuesped();
			if (hu.getNroHabitacion().equals(numHabi)) {
				return false; 
				
			}
			S=S.getSig();
			break;
		}
		
		return true;
	}

	private static void inciso_b(LS_CircularHuesped b, String numhabX) {
		NodoHuesped R = b.getP();
		NodoHuesped S = R;
		int nroNodos = b.nroNodos();
		boolean swIn = false;
		
		for (int i = 0; i < nroNodos; i++) {
			Huesped hu = R.getHuesped();
			if (hu.getNroHabitacion().equals(numhabX)) {
				if (R == b.getP()) {
					b.setP(R.getSig());
					R = R.getSig();
					S = R;
					swIn = true;
				} else {
					if (R.getSig() != b.getP()) {
						S.setSig(R.getSig());
						R = R.getSig();
					}
					S.setSig(R.getSig());
					R = R.getSig();
				}
			} else {
				S = R;
				R = R.getSig();
			}
		}
		R = b.getP();
		if (swIn) {
			int cont = 1, nNod = nroNodos - 1;
			for (int i = 0; i < nroNodos; i++) {
				Huesped hu = R.getHuesped();
				if (cont == nNod) {
					R.setSig(b.getP());
				}
				cont++;
				R = R.getSig();
				S = R;
			}
		}
	}

	private static void inciso_a(LD_NormalHabitacion a, LS_CircularHuesped b) {
		NodoHabitacion R = a.getP();
		while (R != null) {
			Habitacion hab = R.getHabitacion();
			NodoHuesped S = b.getP();
			int nroNodos = b.nroNodos();
			for (int i = 0; i < nroNodos; i++) {
				Huesped hues = S.getHuesped();
				if (hab.getNuemeroHabitacion().equals(hues.getNroHabitacion())) {
					if (!(hab.getCapacidad() >= hues.getCantidad_de_mienbros())) {
						System.out.println("\n\tLa abitacion: " + hab.getNuemeroHabitacion()
								+ " exedio la capacidad de[" + hab.getCapacidad() + "]");
						System.out.println("De la familia " + hues.getNomFamilia() + " cantidad de miembros: "
								+ hues.getCantidad_de_mienbros());
					}
				}
				S = S.getSig();
			}
			R = R.getSig();
		}
	}

}
