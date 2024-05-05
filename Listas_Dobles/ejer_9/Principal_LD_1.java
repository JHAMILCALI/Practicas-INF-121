package ejer_9;
import java.util.Scanner;

public class Principal_LD_1 {

	public static void main(String[] args) {
		LD_NormalEmpleado A = new LD_NormalEmpleado();
		A.adiFinal(new EmpleadoEmp("Jose","ventas",45));
		A.adiFinal(new EmpleadoEmp("Ana","marketing",34));
		A.adiFinal(new EmpleadoEmp("Mateo","finanzas",27));
		A.adiFinal(new EmpleadoEmp("Gabriel","marketing",22));
		A.adiFinal(new EmpleadoEmp("Jhamil","marketing",19));
		A.adiFinal(new EmpleadoEmp("Julio","finanzas",46));
		A.adiFinal(new EmpleadoEmp("Pepe","finanzas",56));
		A.adiFinal(new EmpleadoEmp("Jhoseline","ventas",32));
		A.adiFinal(new EmpleadoEmp("divar","ventas",46));
		A.mostrar();
		//a. Mostrar a todos los empleados del departamento X.
		System.out.println("\t****INCISO A*****");
		System.out.println("Introduce el departamentoa a busacar: ");
		Scanner sc = new Scanner(System.in);
		//String departamntoX=sc.next();
		String departamntoX="marketing";
		iniciso_a(A,departamntoX);
		//b. Cambiar el departamento de un empleado específico.
		System.out.println("\t****INCISO B*****");
		System.out.println("Introduce el nombre del empleado X: ");
		//String nombreX=sc.next();
		String nombreX="Jhamil";
		System.out.println("Introduce al deparatamento que desea cambiar :");
		//String departamento=sc.next();
		String departamentoX="ventas";
		inciso_b(A,nombreX,departamentoX);
		A.mostrar();
		//c. Eliminar a los empleados mayores de cierta edad.
		System.out.println("\t****INCISO C*****");
		System.out.println("introdude la edad x para eliminar empleados mayores de edad: ");
		int edadX = 45;
		inciso_c(A,edadX);
		A.mostrar();
		//d. Insertar un nuevo empleado después del empleado con nombre X.
		System.out.println("\t****INCISO D*****");
		System.out.println("Introduce el nomnbre de la personaX para que se adicione despues un empleado: ");
		//String nomX=sc.next();
		String nomX="abriel";
		inciso_d(A,nomX);
		A.mostrar();
		
	}

	private static void inciso_d(LD_NormalEmpleado lista, String nombreX) {
	    NodoEmpleadoEmp R = lista.getP();
	    boolean sw=false;
	    while (R != null) {
	        EmpleadoEmp empleado = R.getEmpleado();
	        if (empleado.getNombre().equals(nombreX)) {
	            NodoEmpleadoEmp nuevoNodo = new NodoEmpleadoEmp();
	            EmpleadoEmp nuevoEmpleado = new EmpleadoEmp();
	            nuevoEmpleado.leer();
	            nuevoNodo.setEmpleado(nuevoEmpleado);
	            nuevoNodo.setSig(R.getSig());
	            nuevoNodo.setAnt(R);
	            if (R.getSig() != null) {
	                R.getSig().setAnt(nuevoNodo);
	            }
	            R.setSig(nuevoNodo);
	            sw=true;
	        }
	        R = R.getSig();
	    }
	    if (!sw) {
	    	System.out.println("No exixte el nombre de "+nombreX+" no se puede añadir");
		}
	}


	private static void inciso_c(LD_NormalEmpleado a, int edadX) {
		NodoEmpleadoEmp R = a.getP();
		while (R!=null) {
			EmpleadoEmp empleado = R.getEmpleado();
			if (empleado.getEdad()>=edadX) {
				if (R==a.getP()) {
					if (R.getSig()!=null) {
						R=R.getSig();
						a.setP(R);
						R.setAnt(null);
					}
				}else{
					if (R.getSig()!=null) {
						R.getSig().setAnt(R.getAnt());
					}
					R.getAnt().setSig(R.getSig());
					R=R.getSig();
				}
			}else {
				R=R.getSig();
			}	
		}
		
	}

	private static void inciso_b(LD_NormalEmpleado a, String nombreX, String departamentoX) {
		NodoEmpleadoEmp R = a.getP();
		while (R!=null) {
			EmpleadoEmp empleado = R.getEmpleado();
			if (empleado.getNombre().equals(nombreX)) {
				empleado.setDepartamento(departamentoX);
				System.out.println("\n\tSE CAMBIO EL DEPARTAMENTO a "+empleado.getNombre());
				empleado.mostrar();
			}
			R=R.getSig();
		}
		
	}

	private static void iniciso_a(LD_NormalEmpleado a, String departamntoX) {
		NodoEmpleadoEmp R = a.getP();
		while (R!=null) {
			EmpleadoEmp empleado = R.getEmpleado();
			if (empleado.getDepartamento().equals(departamntoX)) {
				empleado.mostrar();
			}
			R=R.getSig();
		}
		
	}

}
