package ejer_7;
import java.util.*;
public class Principa1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PilaTareaPendiente A = new PilaTareaPendiente();
		TareaPendiente t1 = new TareaPendiente("Crear informe de ventas anual","Alta","10-04-2024","En progreso");
		TareaPendiente t2 = new TareaPendiente("Preparar presentacion para reunion de equipo","Media","05-04-2024","En progreso");
		TareaPendiente t3 = new TareaPendiente("Investigar nuevos proveedores","Baja","20-04-2024","No iniciado");
		TareaPendiente t4 = new TareaPendiente("Actualizar contenido del sitio web","Alta","15-04-2024","Completado");
		TareaPendiente t5 = new TareaPendiente("Organizar evento networking","Media","25-04-2024","Completado");
		TareaPendiente t6 = new TareaPendiente("Revisar y responder correos electronicos","Baja","30-04-2024","En progreso");
		TareaPendiente t7 = new TareaPendiente("Entrenar a nuevos empleados en procedimientos de seguridad","Alta","08-04-2024","No iniciado");
		A.adi(t1);
		A.adi(t2);
		A.adi(t3);
		A.adi(t4);
		A.adi(t5);
		A.adi(t6);
		A.adi(t7);
		System.out.println("------------------------------------------- PILA DE TAREAS PENDIENTES ----------------------------------------");
		A.mostrar();
		
		PilaEmpleadoTarea B = new PilaEmpleadoTarea();
		EmpleadoTarea e1 = new EmpleadoTarea("Sergio","Ventas","Crear informe de ventas anual");
		EmpleadoTarea e2 = new EmpleadoTarea("Jhamil","Marketing","Preparar presentacion para reunion de equipo");
		EmpleadoTarea e3 = new EmpleadoTarea("Elizabeth","IT","Actualizar conntenido del sitio web");
		EmpleadoTarea e4 = new EmpleadoTarea("Dayana","Recursos Humanos","Organizar evento networking");
		EmpleadoTarea e5 = new EmpleadoTarea("Dayana","Finanzas","Revisar y responder correos electronicos");
		B.adi(e1);
		B.adi(e2);
		B.adi(e3);
		B.adi(e4);
		B.adi(e5);
		System.out.println("--------------------------------- PILA DE EMPLEADOS CON TAREAS ASIGNADAS -------------------------------------");
		B.mostrar();
		
		PilaProyecto C = new PilaProyecto();
		Proyecto p1 = new Proyecto("Implementacion de nuevo sistema CRM","En progreso","Sergio");
		Proyecto p2 = new Proyecto("Desarrollo de campaña publicitaria para lanzamientp de producto","En espera","Jhamil");
		Proyecto p3 = new Proyecto("Actualizacion de software de contabilidad","Completado","Elizabeth");
		Proyecto p4 = new Proyecto("Reestructuracion de departamento de Recursos Humanos","En progreso","Dayana");
		Proyecto p5 = new Proyecto("Rediseño de la pagina web","Completado","Dayana");
		C.adi(p1);
		C.adi(p2);
		C.adi(p3);
		C.adi(p4);
		C.adi(p5);
		System.out.println("--------------------------------------- PILA DE PROYECTOS EN CURSO -------------------------------------------");
		C.mostrar();
		
		System.out.println("\n******* Inciso A ******");
		Scanner sc = new Scanner(System.in);
		System.out.println("\nIngresa nuevo estado: ");
		String nuevoEstado = sc.nextLine();
		
		inciso_a(C, nuevoEstado);
		System.out.println("--- PILA DE PROYECTOS EN CURSO ---");
		C.mostrar();
		
		System.out.println("\n****** Inciso B ******");
		inciso_b(A);
		System.out.println("---- PILA DE TAREAS PENDIENTES ----");
		A.mostrar();
		
		System.out.println("\n****** Inciso C **********");
		System.out.println("Ingresa el nombre de un empleado en especifico: ");
		String empleadoX = sc.next();
		inciso_c(A,B, empleadoX);
		
		
		System.out.println("\n******* Inciso D ***********");
		System.out.println("Ingresa el nombre el empleado que se va a despedir: ");
		String nomDesp = sc.next();
		inciso_d(B,C, nomDesp);
		System.out.println("+++ PILAS ACTUALIZADAS +++");
		System.out.println("\n--- PILA DE EMPLEADOS CON TAREAS ASIGNADAS -------");
		B.mostrar();
		System.out.println("\n------ PILA DE PROYECTOS EN CURSO -------");
		C.mostrar();
		
		

	}


	private static void inciso_d(PilaEmpleadoTarea b, PilaProyecto c, String nomDesp) {
		// TODO Auto-generated method stub
		PilaEmpleadoTarea aux1 = new PilaEmpleadoTarea();
		PilaProyecto aux2 = new PilaProyecto();
		while(!b.esVacia()) {
			EmpleadoTarea x = b.eli();
			if(!(x.getNomEmpleado().equals(nomDesp))) {
				aux1.adi(x);
			}
		}
		b.vaciar(aux1);
		while(!c.esVacia()) {
			Proyecto y = c.eli();
			if(!(y.getnomEm().equals(nomDesp))) {
				aux2.adi(y);
			}
		}
		c.vaciar(aux2);
		
	}
	private static void inciso_c(PilaTareaPendiente a, PilaEmpleadoTarea b,String empleadoX) {
		// TODO Auto-generated method stub
		PilaTareaPendiente aux1 = new PilaTareaPendiente();
		PilaEmpleadoTarea aux2 = new PilaEmpleadoTarea();
		while(!b.esVacia()) {
			EmpleadoTarea x = b.eli();
			if(x.getNomEmpleado().equals(empleadoX)) {
				String nombreTarea = x.getNomTarea();
				while(!a.esVacia()) {
					TareaPendiente y = a.eli();
					if(y.getNomTarea().equals(nombreTarea)) {
						String est = y.getEstado();
						String flim = y.getFechaLim();
						System.out.println("La tarea asignada a "+ empleadoX+" es --> "+ y.getNomTarea()+" con estado"
								+ " --> "+est+" Y fecha limite --> "+flim);
						aux1.adi(y);
					}
					else {
						aux1.adi(y);
					}
				}
				aux2.adi(x);
				a.vaciar(aux1);
			}
			else {
				aux2.adi(x);
			}
		}
		b.vaciar(aux2);
	}
	private static void inciso_b(PilaTareaPendiente z) {
		// TODO Auto-generated method stub
		PilaTareaPendiente aux1 = new PilaTareaPendiente();
		PilaTareaPendiente aux2 = new PilaTareaPendiente();
		PilaTareaPendiente aux3 = new PilaTareaPendiente();
		String a ="Alta";
		String b = "Baja";
		while(!z.esVacia()) {
			TareaPendiente elem = z.eli();
			String x = elem.getPrioriadad();
			if(x.equals(a)) {
				aux1.adi(elem);
			}
			else {
				if(x.equals(b)) {
					aux2.adi(elem);
				}
				else {
					aux3.adi(elem);
				}
			}
		}
		z.vaciar(aux2);
		z.vaciar(aux3);
		z.vaciar(aux1);		
	}

	private static void inciso_a(PilaProyecto z, String ne) {
		// TODO Auto-generated method stub
		PilaProyecto aux = new PilaProyecto();
		while(!z.esVacia()) {
			Proyecto est = z.eli();
			String x = est.getEstado();
			if(!(x.equals(ne))) {
				est.setEstado(ne);
			}
			aux.adi(est);
		}
		z.vaciar(aux);		
	}
	
	
	

}
