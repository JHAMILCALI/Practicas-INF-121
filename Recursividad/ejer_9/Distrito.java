package ejer_9;

import java.util.Iterator;
import java.util.Scanner;

public class Distrito {
	private
	int nroDis;
	String ubicacion;
	LS_NormalZona zona = new LS_NormalZona();
	public Distrito() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Distrito(int nroDis, String ubicacion, LS_NormalZona zona) {
		super();
		this.nroDis = nroDis;
		this.ubicacion = ubicacion;
		this.zona = zona;
	}
	
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nro Distrito: ");
		nroDis=sc.nextInt();
		System.out.println("Intro ubicacion: ");
		ubicacion=sc.next();
		System.out.println("Intro cantidad de zonas: ");
		int canX=sc.nextInt();
		for (int i = 0; i < canX; i++) {
			Zona x = new Zona();
			x.leer();
			zona.adiFinal(x);
		}
	}
	void mostrar() {
		System.out.println("NRO DISTRITO : "+nroDis);
		System.out.println("UBICACION : "+ubicacion);
		zona.mostrar();
		System.out.println("=========================");
	}

	public int getNroDis() {
		return nroDis;
	}
	public void setNroDis(int nroDis) {
		this.nroDis = nroDis;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public LS_NormalZona getZona() {
		return zona;
	}
	public void setZona(LS_NormalZona zona) {
		this.zona = zona;
	}
	
}
