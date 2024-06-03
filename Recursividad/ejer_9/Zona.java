package ejer_9;

import java.util.Iterator;
import java.util.Scanner;

public class Zona {
	private
	String nombreZona,superficie;
	LS_NormalPropiedad propiedad = new LS_NormalPropiedad();
	public Zona() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Zona(String nombreZona, String superficie, LS_NormalPropiedad propiedad) {
		super();
		this.nombreZona = nombreZona;
		this.superficie = superficie;
		this.propiedad = propiedad;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre Zona: ");
		nombreZona=sc.next();
		System.out.println("Intro superficie: ");
		superficie=sc.next();
		System.out.println("Intro LS propiedades :");
		int numX=sc.nextInt();
		for (int i = 0; i < numX; i++) {
			Propiedad pro = new Propiedad();
			pro.leer();
			propiedad.adiFinal(pro);
		}
	}
	void mostrar() {
		System.out.println("ZONA : "+nombreZona);
		System.out.println("SUPERFICIE: "+superficie);
		propiedad.mostrar();
	}
	public String getNombreZona() {
		return nombreZona;
	}
	public void setNombreZona(String nombreZona) {
		this.nombreZona = nombreZona;
	}
	public String getSuperficie() {
		return superficie;
	}
	public void setSuperficie(String superficie) {
		this.superficie = superficie;
	}
	public LS_NormalPropiedad getPropiedad() {
		return propiedad;
	}
	public void setPropiedad(LS_NormalPropiedad propiedad) {
		this.propiedad = propiedad;
	}
	
}
