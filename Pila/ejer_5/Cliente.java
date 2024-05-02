package ejer_5;

import java.util.Scanner;

public class Cliente {
	private
	String nombre;
	int edad, celular;
	public
	Cliente(){
		
	}
	public Cliente(String nombre, int edad, int celular) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.celular = celular;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nombre: ");
		nombre=sc.next();
		System.out.println("Edad: ");
		edad=sc.nextInt();
		System.out.println("Celular: ");
		celular=sc.nextInt();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Cliente [nombre=" + nombre + ", edad=" + edad + ", celular=" + celular + "]";
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	
	
	

}
