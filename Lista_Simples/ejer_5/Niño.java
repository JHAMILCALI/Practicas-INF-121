package ejer_5;

import java.util.Scanner;

public class Niño {
	private
	String nombre;
	double edad;
	public Niño(String nombre, double edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	public Niño() {
		super();
		this.nombre = "";
		this.edad = 0;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introdeuce el nombre: ");
		nombre=sc.next();
		System.out.println("Introduce la edad: ");
		edad=sc.nextDouble();
	}
	void mostrar() {
		System.out.println("\tNOMBRE    :    "+nombre);
		System.out.println("\tEDAD    :    "+edad);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getEdad() {
		return edad;
	}
	public void setEdad(double edad) {
		this.edad = edad;
	}
	

}
