package ejer_3;

import java.util.Scanner;

public class Materias {
	String nomMateria;
	Materias(){
		
	}
	public Materias(String nomMateria) {
		super();
		this.nomMateria = nomMateria;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre de la materia> ");
		nomMateria=sc.next();
	}
	void mostrar() {
		System.out.println("NOM MATERIA: "+nomMateria);
	}
	public String getNomMateria() {
		return nomMateria;
	}
	public void setNomMateria(String nomMateria) {
		this.nomMateria = nomMateria;
	}
	
}
