package ejer_7;
import java.util.*;
public class EmpleadoTarea {
	private String nomEmpleado;
	private String departamento;
	private String nomTarea;
	
	public EmpleadoTarea() {
		nomEmpleado = "";
		departamento = "";
		nomTarea = "";
	}
	
	
	public EmpleadoTarea(String nomEmpleado, String departamento, String nomTarea) {
		super();
		this.nomEmpleado = nomEmpleado;
		this.departamento = departamento;
		this.nomTarea = nomTarea;
	}


	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa el nombre del empleado: ");
		nomEmpleado = sc.next();
		System.out.println("Ingresa el departamento: ");
		departamento = sc.next();
		System.out.println("Ingrese nombre de la tarea: ");
		nomTarea = sc.next();
	}
	public void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "EmpleadoTarea [nomEmpleado=" + nomEmpleado + ", departamento=" + departamento + ", nomTarea=" + nomTarea
				+ "]";
	}

	public String getNomEmpleado() {
		return nomEmpleado;
	}

	public void setNomEmpleado(String nomEmpleado) {
		this.nomEmpleado = nomEmpleado;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getNomTarea() {
		return nomTarea;
	}

	public void setNomTarea(String nomTarea) {
		this.nomTarea = nomTarea;
	}
	
}
