package ejer_5;

import java.util.Scanner;

public class Materia {
	private
	String sigla;
	Materia(){
		
	}
	public Materia(String sigla) {
		super();
		this.sigla = sigla;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro materia> ");
		sigla=sc.next();
	}
	void mostrar() {
		System.out.println("\tSIGLA: "+sigla);
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	
}
