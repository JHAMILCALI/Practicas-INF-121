package ejer_9;

import java.util.Scanner;

public class Participante {
	private
	String nombre,pais;
	int edad;
	public Participante() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Participante(String nombre, String pais, int edad) {
		super();
		this.nombre = nombre;
		this.pais = pais;
		this.edad = edad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre> ");
		nombre=sc.next();
		System.out.println("Intro edad> ");
		edad=sc.nextInt();
		System.out.println("Intro pais> ");
		pais=sc.next();
	}
	void mostrar() {
		System.out.println("NOMBRE: "+nombre);
		System.out.println("EDAD: "+edad);
		System.out.println("PAIS: "+pais);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
}
