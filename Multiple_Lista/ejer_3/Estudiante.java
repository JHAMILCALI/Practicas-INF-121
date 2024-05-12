package ejer_3;

import java.util.Scanner;

public class Estudiante {
	private
	String nombre;
	int edad;
	Estudiante(){
		
	}
	public Estudiante(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre> ");
		nombre=sc.next();
		System.out.println("Intro edad> ");
		edad=sc.nextInt();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	

}
