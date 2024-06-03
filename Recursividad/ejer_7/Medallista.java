package ejer_7;

import java.util.Scanner;

public class Medallista {
	private
	String disiplina,nombre,medalla,pais;
	public Medallista() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Medallista(String disiplina, String nombre, String medalla, String pais) {
		super();
		this.disiplina = disiplina;
		this.nombre = nombre;
		this.medalla = medalla;
		this.pais = pais;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce la disiplina: ");
		disiplina=sc.next();
		System.out.println("Intro nombre: ");
		nombre=sc.next();
		System.out.println("Intro medalla: ");
		medalla=sc.next();
		System.out.println("Intro pais: ");
		pais=sc.next();
	}
	void mostrar() {
		System.out.println("DISIPLINA : "+disiplina);
		System.out.println("NOMBRE : "+nombre);
		System.out.println("MEDALLA : "+medalla);
		System.out.println("PAIS : "+pais);
		System.out.println("------------------------");
	}
	public String getDisiplina() {
		return disiplina;
	}
	public void setDisiplina(String disiplina) {
		this.disiplina = disiplina;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getMedalla() {
		return medalla;
	}
	public void setMedalla(String medalla) {
		this.medalla = medalla;
	}
	public String getPais() {
		return pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	

}
