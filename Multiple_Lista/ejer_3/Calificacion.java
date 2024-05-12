package ejer_3;

import java.util.Scanner;

public class Calificacion {
	private
	String nombre;
	double nota;
	Calificacion(){
		
	}
	public Calificacion(String nombre, double nota) {
		super();
		this.nombre = nombre;
		this.nota = nota;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre> ");
		nombre=sc.next();
		System.out.println("Intro nota> ");
		nota=sc.nextDouble();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("NOTA: "+nota);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	
}
