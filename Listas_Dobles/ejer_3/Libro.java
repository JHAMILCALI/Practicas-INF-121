package ejer_3;

import java.util.Scanner;

public class Libro {
	private
	String nombre,area;
	public Libro() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Libro(String nombre, String area) {
		super();
		this.nombre = nombre;
		this.area = area;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nobre: ");
		nombre=sc.next();
		System.out.println("Intro el area: ");
		area=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("AREA: "+area);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	
}
