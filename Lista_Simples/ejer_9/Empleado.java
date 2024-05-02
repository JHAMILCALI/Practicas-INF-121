package ejer_9;

import java.util.Scanner;

public class Empleado {
	private
	String nombre;
	int edad;
	double salario;
	public Empleado(String nombre, int edad, double salario) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.salario = salario;
	}
	public Empleado() {
		super();
		this.nombre = "";
		this.edad = 0;
		this.salario = 0;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre:");
		nombre=sc.next();
		System.out.println("Intro edad: ");
		edad=sc.nextInt();
		System.out.println("Intro salario: ");
		salario=sc.nextDouble();
	}
	public void mostrar() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Edad: "+edad);
		System.out.println("Salario: "+salario);
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
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
}
