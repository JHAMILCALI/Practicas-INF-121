package ejer_5;

import java.util.Scanner;

public class Laboratorio {
	private
	String idLaboratorio,ubicacion;
	Laboratorio(){
		
	}
	public Laboratorio(String idLaboratorio, String ubicacion) {
		super();
		this.idLaboratorio = idLaboratorio;
		this.ubicacion = ubicacion;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Id laboratorio> ");
		idLaboratorio=sc.next();
		System.out.println("Into ubicacion> ");
		ubicacion=sc.next();
	}
	void mostrar() {
		System.out.println("ID LABORATORIO: "+idLaboratorio);
		System.out.println("UBICACION: "+ubicacion);
	}
	public String getIdLaboratorio() {
		return idLaboratorio;
	}
	public void setIdLaboratorio(String idLaboratorio) {
		this.idLaboratorio = idLaboratorio;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
}
