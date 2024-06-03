package ejer_5;

import java.util.Scanner;

public class Motocicleta {
	private
	String color,marca, placa;
	public Motocicleta() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Motocicleta(String color, String marca, String placa) {
		super();
		this.color = color;
		this.marca = marca;
		this.placa = placa;
	}
	void leer()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce color: ");
		color=sc.next();
		System.out.println("Into marca: ");
		marca=sc.next();
		System.out.println("Into placa: ");
		placa=sc.next();
	}
	void mostrar() {
		System.out.println("COLOR : "+color);
		System.out.println("MARCA : "+marca);
		System.out.println("PLACA : "+placa);
		System.out.println("-------------------");
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	
}
