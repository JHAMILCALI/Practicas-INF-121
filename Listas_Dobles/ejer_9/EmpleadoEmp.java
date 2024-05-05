package ejer_9;

import java.util.Scanner;

public class EmpleadoEmp {
	private
	String nombre,departamento;
	int edad;
	public EmpleadoEmp() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public EmpleadoEmp(String nombre, String departamento, int edad) {
		super();
		this.nombre = nombre;
		this.departamento = departamento;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new  Scanner(System.in);
		System.out.println("Intro nombre: ");
		nombre=sc.next();
		System.out.println("Intro edad: ");
		edad=sc.nextInt();
		System.out.println("Intro departamento: ");
		departamento=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("DEPARTAMENTO: "+departamento);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
