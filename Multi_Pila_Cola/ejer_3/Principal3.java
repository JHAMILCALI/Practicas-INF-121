package ejer_3;

public class Principal3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaCircularParticipante W = new ColaCircularParticipante();
		W.adi("Jhamil");
		W.adi("Sergio");
		W.adi("Liz");

		ColaCircularParticipante X = new ColaCircularParticipante();
		X.adi("Anne");
		X.adi("Donny");
		X.adi("Nasiens");

		ColaCircularParticipante Y = new ColaCircularParticipante();
		Y.adi("Percival");
		Y.adi("Tristan");
		Y.adi("Lancelot");

		ColaCircularParticipante Z = new ColaCircularParticipante();
		Z.adi("Diana");
		Z.adi("Elaine");

		PilaProyecto A = new PilaProyecto();
		Proyecto p1 = new Proyecto("Ciberseguridad", W);
		Proyecto p2 = new Proyecto("Video Juegos", X);
		Proyecto p3 = new Proyecto("Inteligencia Artificial", Y);
		Proyecto p4 = new Proyecto("Desarrolo Web", Z);
		A.adi(p1);
		A.adi(p2);
		A.adi(p3);
		A.adi(p4);

		ColaCircularParticipante K = new ColaCircularParticipante();
		K.adi("Juan");
		K.adi("Ariana");
		K.adi("Milton");

		ColaCircularParticipante J = new ColaCircularParticipante();
		J.adi("Sheyla");
		J.adi("Cristian");
		J.adi("Stiven");
		J.adi("Marisol");

		PilaProyecto B = new PilaProyecto();
		Proyecto p5 = new Proyecto("Data Science", K);
		Proyecto p6 = new Proyecto("Virus Informatico", J);

		B.adi(p5);
		B.adi(p6);

		ColaCircularParticipante E = new ColaCircularParticipante();
		E.adi("Carlos");
		E.adi("Maryory");
		E.adi("Bianca");
		E.adi("Luis");
		E.adi("Gabriela");
		E.adi("Ariel");

		PilaProyecto C = new PilaProyecto();
		Proyecto p7 = new Proyecto("Machene Learning", E);

		C.adi(p7);

		ColaCircularParticipante L = new ColaCircularParticipante();
		L.adi("Isabel");
		L.adi("Kevin");

		ColaCircularParticipante P = new ColaCircularParticipante();
		P.adi("Frida");

		ColaCircularParticipante T = new ColaCircularParticipante();
		L.adi("Liliana");

		ColaCircularParticipante V = new ColaCircularParticipante();
		P.adi("Marcos");
		L.adi("Gerardo");

		PilaProyecto D = new PilaProyecto();
		Proyecto p8 = new Proyecto("Robotica", L);
		Proyecto p9 = new Proyecto("Hacking Etico", P);
		Proyecto p10 = new Proyecto("Sistemas Operativos", T);
		Proyecto p11 = new Proyecto("Realidad Virtual", V);

		D.adi(p8);
		D.adi(p9);
		D.adi(p10);
		D.adi(p11);

		Materia M1 = new Materia("INF-121", A);
		Materia M2 = new Materia("INF-133", B);
		Materia M3 = new Materia("INF-132", C);
		Materia M4 = new Materia("INF-246", D);
		ColaSimpleMateria CM = new ColaSimpleMateria();
		CM.adi(M1);
		CM.adi(M2);
		CM.adi(M3);
		CM.adi(M4);
		System.out.println("\n**** COLA SIMPLE DE MATERIAS **");
		System.out.println("");
		CM.mostrar();

		System.out.println("\n---- INCISO (A) -----");
		cantidadProyectoMateria(CM);
		System.out.println("\n---- INCISO (B) -----");
		mostrarMateriasIgual_3Participantes(CM);
		System.out.println("\n---- INCISO (c) -----");
		mostrarSiglaMateriasMenosParticipantes(CM);
	}
	//---------------------------------------------------- INCISO (A) ------------------------------
	static void cantidadProyectoMateria(ColaSimpleMateria Z) {
		ColaSimpleMateria auxC = new ColaSimpleMateria();
		PilaProyecto auxP = new PilaProyecto();
		while(!Z.esVacia()) {
			int c = 0;
			Materia mat = Z.eli();
			PilaProyecto A = mat.getListaProyecto();
			while(!A.esVacia()) {
				Proyecto proyX = A.eli();
				c++;
				auxP.adi(proyX);
			}
			System.out.println("La materia con sigla ["+mat.getSigla()+"] tiene "
					+ ""+c+" proyecto(s)");
			A.vaciar(auxP);
			auxC.adi(mat);
		}
		Z.vaciar(auxC);
		
	}
	
	//---------------------------------------------------- INCISO (B) ------------------------------
	static void mostrarMateriasIgual_3Participantes(ColaSimpleMateria Z) {
		ColaSimpleMateria auxC = new ColaSimpleMateria();
		PilaProyecto auxP = new PilaProyecto();
		boolean sw = false;
		while(!Z.esVacia()) {
			Materia mat = Z.eli();
			PilaProyecto B = mat.getListaProyecto();
			while(!B.esVacia()) {
				Proyecto proyX = B.eli();
				ColaCircularParticipante cp = proyX.getListaParticipante();
				int nroPart = cp.nroElem();
				if(nroPart == 3) {
					System.out.println("Materia [Sigla= "+mat.getSigla()+", "
							+ "TituloProyecto= "+proyX.getTituloProy()+"]");
				    sw  = true;
				}
				auxP.adi(proyX);
			}
			B.vaciar(auxP);
			auxC.adi(mat);
		}
		if(sw==false) {
			System.out.println("No hay pryectos con solo 3 participantes");
		}
		Z.vaciar(auxC);
	}
	
	//---------------------------------------------------- INCISO (C) ------------------------------
	static void mostrarSiglaMateriasMenosParticipantes(ColaSimpleMateria Z) {
		int n = Z.nroElem();
		PilaProyecto aux = new PilaProyecto();
		int menor = buscarMenorParticipante(Z);
		System.out.println("Siglas de las materias con menos participantes: ");
		if(menor != -1) {
			for (int i = 0; i < n; i++) {
				int contP = 0;
				Materia mat = Z.eli();
				PilaProyecto C = mat.getListaProyecto();
				while(!C.esVacia()) {
					Proyecto proyX = C.eli();
					ColaCircularParticipante cp = proyX.getListaParticipante();
					int nroPart = cp.nroElem();
					contP = contP + nroPart;
					aux.adi(proyX);
				}
				C.vaciar(aux);
				if(contP == menor) {
					System.out.println(mat.getSigla());
				}
				Z.adi(mat);
			}
		}
		else {
			System.out.println("Las materias tienen la misma cantidad de participantes.");
		}	
	}
	
	static int buscarMenorParticipante(ColaSimpleMateria Z) {
		int n = Z.nroElem();
		int k = 0;
		PilaProyecto aux = new PilaProyecto();
		int men = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
			int cont = 0;
			Materia mat = Z.eli();
			PilaProyecto C = mat.getListaProyecto();
			while(!C.esVacia()) {
				Proyecto proyX = C.eli();
				ColaCircularParticipante cp = proyX.getListaParticipante();
				int nroP = cp.nroElem();
				cont = cont + nroP;
				aux.adi(proyX);
			}
			C.vaciar(aux);
			if(cont < men) {
				men = cont;
				k++;
			}
			Z.adi(mat);
		}
		if(k == 0) {
			men = -1;
			return men;
		}
		return men;
	}

}
