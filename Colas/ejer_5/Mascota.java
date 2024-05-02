package ejer_5;

import java.util.Scanner;

public class Mascota {
	private
	int idMascota;
	String nombre,sexo,tipo;
	public
	Mascota() {
	}
	public Mascota(int idMascota, String nombre, String sexo, String tipo) {
		super();
		this.idMascota = idMascota;
		this.nombre = nombre;
		this.sexo = sexo;
		this.tipo = tipo;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("IDMascota: ");
		idMascota=sc.nextInt();
		System.out.println("Nombre: ");
		nombre=sc.next();
		System.out.println("Sexo: ");
		sexo=sc.next();
		System.out.println("Tipo: ");
		tipo=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Mascota [idMascota=" + idMascota + ", nombre=" + nombre + ", sexo=" + sexo + ", tipo=" + tipo + "]";
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	

}
