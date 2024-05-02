package ejer_5;

import java.util.Scanner;

public class Atencion {
	private
	String fecha;
	int idMascota;
	public
	Atencion() {
	}
	public Atencion(String fecha, int idMascota) {
		super();
		this.fecha = fecha;
		this.idMascota = idMascota;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("FECHA: ");
		fecha=sc.next();
		System.out.println("ID Mascota: ");
		idMascota=sc.nextInt();
	}
	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Atencion [fecha=" + fecha + ", idMascota=" + idMascota + "]";
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public int getIdMascota() {
		return idMascota;
	}
	public void setIdMascota(int idMascota) {
		this.idMascota = idMascota;
	}
	
}
