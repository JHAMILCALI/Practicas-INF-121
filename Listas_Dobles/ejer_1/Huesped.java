package ejer_1;

import java.util.Scanner;

public class Huesped {
	private
	String nomFamilia,nroHabitacion;
	int cantidad_de_mienbros;
	public
	Huesped() {
		
	}
	public Huesped(String nomFamilia, int cantidad_de_mienbros, String nroHabitacion) {
		super();
		this.nomFamilia = nomFamilia;
		this.cantidad_de_mienbros = cantidad_de_mienbros;
		this.nroHabitacion = nroHabitacion;
	}
	void leer() {
		Scanner sc= new Scanner(System.in);
		System.out.println("Intro Nombre de la Familia: "+nomFamilia);
		nomFamilia=sc.next();
		System.out.println("Intro cantidad de miembros: "+cantidad_de_mienbros);
		cantidad_de_mienbros =sc.nextInt();
		System.out.println("Intro Numero de habitacion: ");
		nroHabitacion=sc.next();
	}
	void mostra() {
		System.out.println("NOMBRE FAMILIA: "+nomFamilia);
		System.out.println("CANTIDAD DE MIEMBORS :"+cantidad_de_mienbros);
		System.out.println("NRO DE HABITACION: "+nroHabitacion);
	}
	public String getNomFamilia() {
		return nomFamilia;
	}
	public void setNomFamilia(String nomFamilia) {
		this.nomFamilia = nomFamilia;
	}
	public int getCantidad_de_mienbros() {
		return cantidad_de_mienbros;
	}
	public void setCantidad_de_mienbros(int cantidad_de_mienbros) {
		this.cantidad_de_mienbros = cantidad_de_mienbros;
	}
	public String getNroHabitacion() {
		return nroHabitacion;
	}
	public void setNroHabitacion(String nroHabitacion) {
		this.nroHabitacion = nroHabitacion;
	}
	
}
