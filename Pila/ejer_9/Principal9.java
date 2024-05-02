package ejer_9;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import ejer_1.Pila;

public class Principal9 {

	public static void main(String[] args) {
		PilaProyectos A = new PilaProyectos();
		A.adi(new Proyectos("App móvil", "Gestión de tareas", "Juan", "10/04/2023", "En progreso"));
		A.adi(new Proyectos("App sofware", "Distribucion de ambintes", "Juan", "11/11/2023", "En progreso"));
		A.adi(new Proyectos("Inteligencia artificial", "Algoritmos de aprendizaje", "Ana", "20/07/2022", "Completado"));
		A.adi(new Proyectos("Inventario", "Gestión de inventario", "Carlos", "05/09/2022", "Pendiente"));
		A.adi(new Proyectos("Deportes", "Veneficios del deporte", "Carlos", "01/01/2020", "Pendiente"));
		A.adi(new Proyectos("Impacto ambiental", "Análisis de planta solar", "Elena", "15/11/2022", "Completado"));
		A.adi(new Proyectos("Falta de agua", "Análisis de lluvias", "Elena", "01/10/2021", "En revisión"));
		
		A.mostrar();
////		a. Mostrar todos los proyectos asignados a un investigador específico, incluyendo
////		el estado de cada proyecto y la fecha límite.
		Scanner sc = new Scanner(System.in);
		System.out.println("\t*****INCISO A *******");
		System.out.println("Introduce el nombre del investigador a busacar: ");
		String invX=sc.next();
		inciso_a(A,invX);
//		b. Agregar nuevos proyectos a la pila de proyectos pendientes
		System.out.println("\t*****INCISO B *******");
		System.out.println("Ingrese la cantidad de nuevos proyectos a agregar :");
		int x = sc.nextInt();
		inciso_b(A,x);
		A.mostrar();
//		c. Mostrar los proyectos del año x entre el intervalo de meses 𝑚𝑖<𝑚𝑗
		
		System.out.println("\t*****INCISO B *******");
		System.out.println("Ingrese el año a buscar :");
		String añox = sc.next();
		System.out.println("Ingrese desde el mes incial: ");
		String mesInicial = sc.next();
		System.out.println("Ingrese el mes Final: ");
		String mesFinal = sc.next();
		inciso_c(A,añox,mesInicial,mesFinal);
	
	}
	
	private static void inciso_a(PilaProyectos a, String invX) {
		PilaProyectos aux = new PilaProyectos();
		System.out.println("*******Los proyectos asigandos al investigador "+invX+" son los siguintes*****");
		boolean sw= false;
		while (!a.esVacia()) {
			Proyectos e = a.eli();
			if (e.getInvestigador().equals(invX)) {
				e.mostrar();
				sw=true;
			}else {
				sw=false;
			}
			aux.adi(e);
		}
		if (sw==false) {
			System.out.println("No existe el investigador.....");
		}
		a.vaciar(aux);	
	}
	private static void inciso_b(PilaProyectos a, int x) {
		PilaProyectos aux = new PilaProyectos();
		for (int i = 1; i <= x; i++) {
			Proyectos e = new Proyectos();
			System.out.println("\t*****PROYECTO ["+i+"]****");
			e.leer();
			a.adi(e);
		}
	}
	private static void inciso_c(PilaProyectos a, String añox, String mesIn, String mesFin) {
		PilaProyectos aux = new PilaProyectos();
		while (!a.esVacia()) {
			Proyectos e = a.eli();
			String año=e.getFecha();
			if(verificarFecha(año,añox,mesIn,mesFin)) {
				e.mostrar();
			}
			aux.adi(e);
			
		}
		a.vaciar(aux);
	}
	private static boolean verificarFecha(String añoP, String añox,String mesIn, String mesFin) {
		String[] partes = añoP.split("/"); 
		String mes = partes[0];
		String año = partes[2];
		int mesP = Integer.parseInt(mes);
		int mesin = Integer.parseInt(mesIn);
		int mesfin = Integer.parseInt(mesFin);
		boolean sw=false;
		if (año.equals(añox)) {
			for (int i = mesin; i <= mesfin; i++) {
				if (mesP==i) {
					sw=true;
				}
			}
		}
		if (sw) {
			return true;
		}else {
			return false;
		}
		
	}

	



}
