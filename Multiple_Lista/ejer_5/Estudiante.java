package ejer_5;

import java.util.Scanner;

public class Estudiante {
	 private
	 String nombre,ci;
	 int edad;
	 Estudiante(){
		 
	 }
	public Estudiante(String nombre, String ci, int edad) {
		super();
		this.nombre = nombre;
		this.ci = ci;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre> ");
		nombre=sc.next();
		System.out.println("Into CI> ");
		ci=sc.next();
		System.out.println("Intro edad> ");
		edad=sc.nextInt();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("CI: "+ ci);
		System.out.println("EDAD: "+edad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
