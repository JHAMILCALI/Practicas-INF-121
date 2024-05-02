package ejer_7;

import java.util.Iterator;
import java.util.Scanner;

public class Principal2 {

	public static void main(String[] args) {
		Mp_PilaPersona A = new Mp_PilaPersona();
		Persona p1 = new Persona(9914119,"jhamil",18,"masculino");
		Persona p2 = new Persona(5454542,"jose",22,"masculino");
		Persona p3 = new Persona(9445455,"abril",18,"femenino");
		Persona p4 = new Persona(7894566,"ana",34,"femenino");
		Persona p5 = new Persona(6121222,"jhon",45,"masculino");
		Persona p6 = new Persona(9344566,"sergio",19,"masculino");
		Persona p7 = new Persona(6784949,"laura",20,"femenino");
		Persona p8 = new Persona(9233478,"elizabhet",19,"femenino");
		Persona p9 = new Persona(4759960,"alex",18,"masculino");
		Persona p10 = new Persona(2214119,"jhamil",12,"masculino");
		
		A.adicionar(0, p1);
		A.adicionar(0, p2);
		A.adicionar(0, p3);
		A.adicionar(1, p4);
		A.adicionar(1, p5);
		A.adicionar(1, p6);
		A.adicionar(2, p7);
		A.adicionar(2, p8);
		A.adicionar(3, p9);
		A.adicionar(3, p10);
		
		A.setNp(4);
		A.mostrar();
//		a. Mostrar la cantidad de varones y mujeres de cada pila.
		System.out.println("\n\t******INCISO A*******");
		inciso_a(A);
//		b. Ordenar los elementos de la pila con respecto a su edad.
		System.out.println("\n\t******INCISO B*******");
		System.out.println("\t----------DATOS DE LA PILA SIN ORDENAR POR EDAD---------");
		A.mostrar();
		inciso_b(A);
		System.out.println("\n\t----------DATOS DE LA PILA ORDENADA POR EDAD---------");
		A.mostrar();
//		c. Insertar una nueva persona en la i-ésima posición de la múltiple pila y en la
//		j-ésima posición de la pila i-ésima.
		System.out.println("\n\t******INCISO C*******");
		System.out.println("Introduce Iesima posion de la pila multiple: ");
		Scanner sc = new Scanner(System.in);
		int iesima = sc.nextInt();
		System.out.println("Introduce la posion de la pila Jesima a agregar: ");
		int jesima = sc.nextInt();
		inciso_c(A,iesima,jesima);
		System.out.println("\n\t******MULTIPILA INSERTADO UNA PERSONA******");
		A.mostrar();
	}

	private static void inciso_c(Mp_PilaPersona a, int iesima, int jesima) {
		int n = a.getNp();
		Persona elem;
		for (int i = 0; i < n; i++) {
			PilaPersona aux = new PilaPersona();
			if (i == iesima) {
				int nElem = a.nroelem(i);
				int cont=0;
				for (int j = nElem; j >=1; j--) {
					elem = a.eliminar(i);
					cont++;
					System.out.println(elem+" "+j);
					if (j==jesima) {
						Persona p = new Persona();
						System.out.println("ANADIENDO UNA PERSONA EN LA POSCION ["+jesima+"] "
								+ "DE LA PILA ["+iesima+"]");
						p.leer();
						aux.adi(p);
					}
					aux.adi(elem);
				}
				
				a.vaciar(i, aux);
			}

		}

	}

	private static void inciso_b(Mp_PilaPersona a) {
		int n = a.getNp();
		Persona elem;

		for (int i = 0; i < n; i++) {
			PilaPersona aux1 = new PilaPersona();
			PilaPersona aux2 = new PilaPersona();
			while(!a.esvacia(i)) {
				int men = 0;
			while (!a.esvacia(i)) {
				elem = a.eliminar(i);
				
				if (elem.getEdad() > men) {
					men = elem.getEdad();
				}
				aux2.adi(elem);
			}
			a.vaciar(i, aux2);
			while (!a.esvacia(i)) {
				elem = a.eliminar(i);
				if (elem.getEdad()==men) {
					aux1.adi(elem);
				}else {
					aux2.adi(elem);
				}
			}
			a.vaciar(i, aux2);
			}
			a.vaciar(i, aux1);
		}
	}
	private static void inciso_a(Mp_PilaPersona a) {
		int n = a.getNp();
		Persona elem;
		for (int i = 0; i < n; i++) {
			PilaPersona aux = new PilaPersona();
			int contMasculino=0,contFemenino=0;
			while (!a.esvacia(i)) {
				elem = a.eliminar(i);
				if (elem.getGenero().equals("masculino")) {
					contMasculino++;
				}else {
					contFemenino++;
				}
				aux.adi(elem);
			}
			System.out.println("En la pila ["+i+"] la cantidad de Varones ["+contMasculino+"] "
					+ "de Mujeres ["+contFemenino+"]");
			a.vaciar(i, aux);
		}
		
	}

}
