package ejer_5;

import java.util.Scanner;

public class Laptop {
	private
	String codL,modelo,marca;
	double precio;
	public Laptop() {
		
	}
	public
	Laptop(String codL, String modelo,String marca, double precio) {
		this.codL=codL;
		this.modelo=modelo;
		this.marca=marca;
		this.precio=precio;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("CODL:");
		codL=sc.next();
		System.out.println("MOdelo:");
		modelo=sc.next();
		System.out.println("MARCA: ");
		marca=sc.next();
		System.out.println("PRECIO: ");
		precio=sc.nextDouble();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Laptop [codL=" + codL + ", modelo=" + modelo + ", marca=" + marca + ", precio=" + precio + "]";
	}
	public String getCodL() {
		return codL;
	}
	public void setCodL(String codL) {
		this.codL = codL;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}

}