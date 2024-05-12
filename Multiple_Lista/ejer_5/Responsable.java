package ejer_5;

import java.util.Scanner;

public class Responsable {
	private
	String nombre,ci;
	Responsable(){
		
	}
	public Responsable(String nombre, String ci) {
		super();
		this.nombre = nombre;
		this.ci = ci;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre> ");
		nombre=sc.next();
		System.out.println("Intro CI> ");
		ci=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRRE: "+nombre);
		System.out.println("CI: "+ci);
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
	
}
