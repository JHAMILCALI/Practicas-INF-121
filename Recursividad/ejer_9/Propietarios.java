package ejer_9;

import java.util.Scanner;

public class Propietarios {
	private
	String ci,nombre,paterno,materno;
	public Propietarios() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Propietarios(String ci, String nombre, String paterno, String materno) {
		super();
		this.ci = ci;
		this.nombre = nombre;
		this.paterno = paterno;
		this.materno = materno;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro CI =>");
		ci=sc.next();
		System.out.println("Intro nombre =>");
		nombre=sc.next();
		System.out.println("Intro paterno =>");
		paterno=sc.next();
		System.out.println("Intro materno =>");
		materno=sc.next();
	}
	void mostrar() {
		System.out.println("CI : "+ci);
		System.out.println("NOMBRE : "+nombre);
		System.out.println("PATERNO : "+paterno);
		System.out.println("MATERNO : "+materno);
		System.out.println("");
	}
	public String getCi() {
		return ci;
	}
	public void setCi(String ci) {
		this.ci = ci;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPaterno() {
		return paterno;
	}
	public void setPaterno(String paterno) {
		this.paterno = paterno;
	}
	public String getMaterno() {
		return materno;
	}
	public void setMaterno(String materno) {
		this.materno = materno;
	}
	
}
