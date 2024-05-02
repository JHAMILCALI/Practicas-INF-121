package ejer_9;

import java.util.Scanner;

public class Principal_Empleado {
	public static void main(String[] args) {
		LS_NormalEmpleado A = new LS_NormalEmpleado();
		A.adiFinal(new Empleado("Jose",23,5034));
		A.adiFinal(new Empleado("Sabina",30,7099));
		A.adiFinal(new Empleado("Jhamil",34,2509));
		A.adiFinal(new Empleado("Calixto",25,15000));
		A.adiFinal(new Empleado("Maria",21,8000));
		A.adiFinal(new Empleado("Aron",19,5000));
		A.adiFinal(new Empleado("Marcelo",36,7500));
		
		A.mostrar();
		//a. Calcular el promedio de salarios de los empleados.
		System.out.println("\n\t*****INCISO A******");
		double promedio = inciso_a(A);
		System.out.println("El promedio de los salarios de los empleados es: "+promedio);
		//b. Encontrar al empleado más joven y al más viejo.
		System.out.println("\n\t*****INCISO B******");
		inciso_b(A);
//		c. Aumentar el salario en un porcentaje dado para todos los empleados menores
//		de 30 años.
		System.out.println("\n\t*****INCISO C******");
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el porcentaje a dar a los empledos menores a 30 años:");
		//int porcentaje=sc.nextInt();
		int porcentaje=10;
		inciso_c(A,porcentaje);
		System.out.println("-----AÑADIENDO LOS SALARIOS DADOS----");
		A.mostrar();
//		d. Eliminar a los empleados cuyo salario esté por 
		//debajo de cierto umbral.
		System.out.println("\n\t*****INCISO D******");
		System.out.println("Introduce el umbral para poder eliminar salarios: ");
		//double umbral=sc.nextDouble();
		double umbral=7000;
		inciso_d(A,umbral);
		A.mostrar();
		
		
	}

	private static void inciso_d(LS_NormalEmpleado a, double umbral) {
		NodoEmpleado R = a.getP();
		NodoEmpleado S = R;
		while (R!=null) {
			Empleado e = R.getQ();
			if (e.getSalario()<umbral) {
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
		
	}

	private static void inciso_c(LS_NormalEmpleado a, int porcentaje) {
		NodoEmpleado R = a.getP();
		while (R!=null) {
			Empleado e = R.getQ();
			if (Empleado_menor_a_30(e)) {
				int adiSalario = salario_aumentar(e,porcentaje);
				System.out.println("El salario que se le aumentara a "+e.getNombre()+" es "+adiSalario);
				double salario_tot=e.getSalario()+adiSalario;
				e.setSalario(salario_tot);
			}
			R=R.getSig();
		}
		
	}

	private static int salario_aumentar(Empleado e, int porcentaje) {
		double total_100 = e.getSalario()/100;
		int salario_aumentar = (int) (total_100*porcentaje);
		return salario_aumentar;
	}

	private static boolean Empleado_menor_a_30(Empleado e) {
		if (e.getEdad()<30) {
			return true;
		}else {
			return false;
		}
	}

	private static void inciso_b(LS_NormalEmpleado a) {
		NodoEmpleado R = a.getP();
		int menor = menorEdad(a);
		int mayor = mayorEdad(a);
		while (R!=null) {
			Empleado e = R.getQ();
			if (e.getEdad()==mayor) {
				System.out.println("\t****EMPLEADO CON MAYOR EDAD****");
				e.mostrar();
			}
			if (e.getEdad()==menor) {
				System.out.println("\t****EMPLEADO CON MENOR EDAD****");
				e.mostrar();
			}
			
			R=R.getSig();
		}
	}

	private static int mayorEdad(LS_NormalEmpleado a) {
		NodoEmpleado R = a.getP();
		int mayor= Integer.MIN_VALUE;
		while (R!=null) {
			Empleado e = R.getQ();
			if (e.getEdad()>mayor) {
				mayor=e.getEdad();
			}
			R=R.getSig();
		}
		return mayor;
	}

	private static int menorEdad(LS_NormalEmpleado a) {
		NodoEmpleado R = a.getP();
		int menor= Integer.MAX_VALUE;
		while (R!=null) {
			Empleado e = R.getQ();
			if (e.getEdad()<menor) {
				menor=e.getEdad();
			}
			R=R.getSig();
		}
		return menor;
	}

	private static double inciso_a(LS_NormalEmpleado a) {
		NodoEmpleado R = a.getP();
		double total=0,promedio;
		int cont=0;
		while (R!=null) {
			Empleado e = R.getQ();
			cont++;
			total+=e.getSalario();
			R=R.getSig();
		}
		promedio=total/cont;
		return promedio;
	}
}
