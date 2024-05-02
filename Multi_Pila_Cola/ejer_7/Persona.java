package ejer_7;

import java.util.Scanner;

public class Persona {
	private
	int ci,edad;
	String nombre,genero;
	Persona(){
		
	}
	public Persona(int ci, String nombre, int edad, String genero) {
		super();
		this.ci = ci;
		this.edad = edad;
		this.nombre = nombre;
		this.genero = genero;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("CI: ");
		ci=sc.nextInt();
		System.out.println("NOMBRE: ");
		nombre=sc.next();
		System.out.println("EDAD: ");
		edad=sc.nextInt();
		System.out.println("GENERO: ");
		genero=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Persona [ci=" + ci + ", edad=" + edad + ", nombre=" + nombre + ", genero=" + genero + "]";
	}
	public int getCi() {
		return ci;
	}
	public void setCi(int ci) {
		this.ci = ci;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

}
