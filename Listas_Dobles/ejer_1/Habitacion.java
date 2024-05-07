package ejer_1;

import java.util.Scanner;

public class Habitacion {
	private
	String nuemeroHabitacion;
	int capacidad;
	public
	Habitacion() {
		
	}
	public Habitacion(String nuemeroHabitacion, int capacidad) {
		super();
		this.nuemeroHabitacion = nuemeroHabitacion;
		this.capacidad = capacidad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro num de habitacion :");
		nuemeroHabitacion=sc.next();
		System.out.println("Intro capacidad: ");
		capacidad=sc.nextInt();
	}
	void mostrar() {
		System.out.println("NUEMERO DE HABITACION: "+nuemeroHabitacion);
		System.out.println("CAPACIDAD: "+capacidad);
	}
	public String getNuemeroHabitacion() {
		return nuemeroHabitacion;
	}
	public void setNuemeroHabitacion(String nuemeroHabitacion) {
		this.nuemeroHabitacion = nuemeroHabitacion;
	}
	public int getCapacidad() {
		return capacidad;
	}
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}
	
}
