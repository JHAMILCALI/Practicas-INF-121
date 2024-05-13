package ejer_9;

import java.util.Scanner;

public class Deporte {
	private
	String nombre,categoria,regla;
	public Deporte() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Deporte(String nombre, String categoria, String regla) {
		super();
		this.nombre = nombre;
		this.categoria = categoria;
		this.regla = regla;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre deporte>  ");
		nombre=sc.next();
		System.out.println("Intro categortia> ");
		categoria=sc.next();
		System.out.println("Intro regla> ");
		regla=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("CATEGORIA: "+categoria);
		System.out.println("REGLA: "+regla);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getRegla() {
		return regla;
	}
	public void setRegla(String regla) {
		this.regla = regla;
	}
	
}
