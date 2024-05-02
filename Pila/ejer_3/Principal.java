package ejer_3;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		PilaPaciente A = new PilaPaciente();
		Paciente c1 = new Paciente("jose", "mamani", "resfriado", 99141156, 7845461);
		Paciente c2 = new Paciente("juan", "perez", "gastritis", 99141157, 7845462);
		Paciente c3 = new Paciente("ana", "lopez", "traumatología", 99141158, 7845463);
		Paciente c4 = new Paciente("maria", "gomez", "dermatología", 99141159, 7845464);
		Paciente c5 = new Paciente("carlos", "rodriguez", "neurología", 99141160, 7845465);
		Paciente c6 = new Paciente("luis", "martinez", "resfriado", 99141161, 7845466);
		Paciente c7 = new Paciente("laura", "rojas", "gastroenterología", 99141162, 7845467);
		Paciente c8 = new Paciente("ana", "santos", "traumatología", 99141163, 7845468);
		Paciente c9 = new Paciente("juan", "garcia", "dermatología", 99141164, 7845469);
		Paciente c10 = new Paciente("maria", "hernandez", "resfriado", 99141165, 7845470);

		A.adi(c1);
		A.adi(c2);
		A.adi(c3);
		A.adi(c4);
		A.adi(c5);
		A.adi(c6);
		A.adi(c7);
		A.adi(c8);
		A.adi(c9);
		A.adi(c10);
		PilaMedico B = new PilaMedico();
		Medico m1 = new Medico("traumatología", "ana");
		Medico m2 = new Medico("gastroenterología", "raul");
		Medico m3 = new Medico("dermatología", "luisa");
		Medico m4 = new Medico("neurología", "carlos");
		Medico m5 = new Medico("cardiología", "maria");
		Medico m6 = new Medico("pediatría", "javier");
		Medico m7 = new Medico("oncología", "laura");
		B.adi(m1);
		B.adi(m2);
		B.adi(m3);
		B.adi(m4);
		B.adi(m5);
		B.adi(m6);
		B.adi(m7);
		A.llenar(5);
		B.llenar(7);
		System.out.println("\t*****PILA DE PACINTES******");
		A.mostrar();
		System.out.println("\t******PILA DE MEDICOS ******");
		B.mostrar();
//		a. Mostrar todos los pacientes que fueron por la especialidad X
		System.out.println("\t******INCISO A******");
		System.out.println("Into especialidad X:");
		Scanner sc = new Scanner(System.in);
		//String espx=sc.next();
		String espx="traumatología";
		incisoA(A,espx);
		System.out.println("\t******INCISO B******");
//		b. Añadir dos especialidades nuevas.
		incisoB(B,2);
		System.out.println("\t******AGREGADO******");
		B.mostrar();
		System.out.println("\t******INCISO C******");
//		c. Mostrar el nombre del doctor que atendió al paciente 
//		de nombre X y apellido Y.
		String x = "maria";
		String y = "gomez";
		incisoB(A,B,x,y);
	}

	private static void incisoB(PilaPaciente a, PilaMedico b, String x, String y) {
		PilaPaciente aux = new PilaPaciente();
		while (!a.esVacia()) {
			Paciente elem = a.eli();
				if (elem.getNombre().equals(x)) {
					if (elem.getApellido().equals(y)) {
						String espe = elem.getEspecialidad();
						String atendido= doctor(espe,b);
						System.out.println("El nombre del doctor que atendio a "
								+ ""+elem.getNombre()+" es "+atendido);
					}
				}
			aux.adi(elem);
		}
		a.vaciar(aux);
	}

	private static String doctor(String espe, PilaMedico b) {
		PilaMedico aux = new PilaMedico();
		String nombre = "";
		while (!b.esVacia()) {
			Medico m = b.eli();
			if (m.getNomEspecialidad().equals(espe)) {
				nombre=m.getNomDoctor();
			}
			aux.adi(m);
		}
		b.vaciar(aux);
		return nombre;
	}

	private static void incisoB(PilaMedico b,int agregar) {
		for (int i = 1; i <= agregar; i++) {
			System.out.println("\tAGREGANDO ESPECIALIDAD ["+i+"]");
			Medico e = new Medico();
			e.llenar();
			b.adi(e);
		}
		
	}

	private static void incisoA(PilaPaciente a, String espx) {
		PilaPaciente aux = new PilaPaciente();
		while (!a.esVacia()) {
			Paciente elem = a.eli();
				if (elem.getEspecialidad().equals(espx)) {
					elem.mostrar();
				}
			aux.adi(elem);
		}
		a.vaciar(aux);
	}


}
