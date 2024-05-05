package ejer_7;

import java.util.Scanner;

public class producto {
	private
	String nombre;
	int canEstok;
	double precio;
	public
	producto() {
		
	}
	public producto(String nombre, int canEstok, double precio) {
		super();
		this.nombre = nombre;
		this.canEstok = canEstok;
		this.precio = precio;
	}
	void leer() {
		Scanner sc =  new Scanner(System.in);
		System.out.println("Intro el nombre del producto: ");
		nombre=sc.next();
		System.out.println("Intro cantidad de stock: ");
		canEstok=sc.nextInt();
		System.out.println("Intro precio: ");
		precio=sc.nextDouble();
	}
	void mosttra() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Cantidad de Stock: "+canEstok);
		System.out.println("Precio: "+precio);
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getCanEstok() {
		return canEstok;
	}
	public void setCanEstok(int canEstok) {
		this.canEstok = canEstok;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	
	
}
