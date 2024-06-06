package ejer_5;

import java.util.Scanner;

public class Mascotas {
	private
	String nombre,tipo;
	int edad;
	
	public Mascotas() {
		// TODO Esbozo de constructor generado automáticamente
	}

	public Mascotas(String nombre, String tipo, int edad) {
		super();
		this.nombre = nombre;
		this.tipo = tipo;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre: ");
		nombre=sc.next();
		System.out.println("Intro tipo: ");
		tipo=sc.next();
		System.out.println("Intro edad: ");
		edad=sc.nextInt();
	}
	void mostrar() {
		System.out.println(toString());
	}

	@Override
	public String toString() {
		return "Mascotas [nombre=" + nombre + ", tipo=" + tipo + ", edad=" + edad + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
