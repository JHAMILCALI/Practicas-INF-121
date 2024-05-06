package ejer_3;

import java.util.Scanner;

public class Area {
	private
	String area;
	int nroLibros;
	public Area() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Area(String area, int nroLibros) {
		super();
		this.area = area;
		this.nroLibros = nroLibros;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro area: ");
		area=sc.next();
		System.out.println("Intro nro de libros: ");
		nroLibros=sc.nextInt();
	}
	void mostrar() {
		System.out.println("AREA: "+area);
		System.out.println("NRO DE LIBORS: "+nroLibros);
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public int getNroLibros() {
		return nroLibros;
	}
	public void setNroLibros(int nroLibros) {
		this.nroLibros = nroLibros;
	}
	
}
