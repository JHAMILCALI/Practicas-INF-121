package ejer_3;
import java.util.Scanner;
public class Paciente {
	private
	String nombre,especialidad,apellido; 
	int ci, celular;
	public
	Paciente(){
		
	}
	Paciente(String nombre, String apellido, String especialidad, int ci, int celular) {
		super();
		this.nombre = nombre;
		this.especialidad = especialidad;
		this.apellido = apellido;
		this.ci = ci;
		this.celular = celular;
	}
	void llenar() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre=sc.next();
		System.out.println("Apellido: ");
		apellido=sc.next();
		System.out.println("CI :");
		ci=sc.nextInt();
		System.out.println("Celualr: ");
		celular=sc.nextInt();
		System.out.println("Especialidad: ");
		especialidad=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", especialidad=" + especialidad + ", apellido=" + apellido + ", ci=" + ci
				+ ", celular=" + celular + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEspecialidad() {
		return especialidad;
	}
	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
}
