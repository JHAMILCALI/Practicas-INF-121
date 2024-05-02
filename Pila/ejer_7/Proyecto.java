package ejer_7;
import java.util.*;
public class Proyecto {
	private 
		String nomProyecto,estado,nomEmpleado;
	
	public Proyecto() {
		nomProyecto = "";
		estado = "";
		nomEmpleado = "";
	}
	
	
	public Proyecto(String nomProyecto, String estado, String nomEmpleado) {
		super();
		this.nomProyecto = nomProyecto;
		this.estado = estado;
		this.nomEmpleado = nomEmpleado;
	}


	public void leer(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Ingrese el nombre del proyecto: ");
		nomProyecto = sc.next();
		System.out.println("Ingresa estado: ");
		estado = sc.next();
		System.out.println("Ingresa el nombre del empleado: ");
		nomEmpleado = sc.next();
		
	}
	public void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Proyecto [nomProyecto=" + nomProyecto + ", estado=" + estado + ", nomEmpleado=" + nomEmpleado + "]";
	}


	public String getEstado() {
		return estado;
	}
	public void setEstado(String a) {
		estado=a;
	}
	public String getnomProy() {
		return nomProyecto;
	}
	public void setnomProy(String a) {
		nomProyecto=a;
	}
	public String getnomEm() {
		return nomEmpleado;
	}
	public void setnomEm(String a) {
		nomEmpleado=a;
	}
		
}
