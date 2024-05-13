package ejer_7;

import java.util.Scanner;

public class Canal {
	private
	int nroCanal;
	String nomCanal, direccion;
	LS_NormalPrograma Lprogramas = new LS_NormalPrograma();
	Canal(){
		
	}
	
	public Canal(int nroCanal, String nomCanal, String direccion, LS_NormalPrograma lprogramas) {
		super();
		this.nroCanal = nroCanal;
		this.nomCanal = nomCanal;
		this.direccion = direccion;
		Lprogramas = lprogramas;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nro Canal> ");
		nroCanal=sc.nextInt();
		System.out.println("Intro nombre del Canal> ");
		nomCanal=sc.next();
		System.out.println("Into direccion> ");
		direccion=sc.next();
		System.out.println("Introduce la cantidad de programas>");
		int cCa=sc.nextInt();
		for (int i = 0; i < cCa; i++) {
			Programa programa = new Programa();
			programa.leer();
			Lprogramas.adiFinal(programa);
		}
	}
	void mostrar() {
		System.out.println("NRO DE CANAL: "+nroCanal);
		System.out.println("NOMBRE DE CANAL: "+nomCanal);
		System.out.println("DIRECCION: "+direccion);
		Lprogramas.mostrar();
	}
	public int getNroCanal() {
		return nroCanal;
	}
	public void setNroCanal(int nroCanal) {
		this.nroCanal = nroCanal;
	}
	public String getNomCanal() {
		return nomCanal;
	}
	public void setNomCanal(String nomCanal) {
		this.nomCanal = nomCanal;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public LS_NormalPrograma getLprogramas() {
		return Lprogramas;
	}
	public void setLprogramas(LS_NormalPrograma lprogramas) {
		Lprogramas = lprogramas;
	}
	
}
