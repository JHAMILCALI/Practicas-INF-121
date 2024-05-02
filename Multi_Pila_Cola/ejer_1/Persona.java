package ejer_1;

import java.util.Scanner;

public class Persona {
	private 
	String nombre;
	public
	Persona() {
		
	}
	public Persona(String nombre) {
		super();
		this.nombre = nombre;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Into nombre: ");
		nombre=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	
	
}
