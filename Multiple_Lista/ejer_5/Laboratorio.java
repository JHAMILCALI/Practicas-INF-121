package ejer_5;

import java.util.Iterator;
import java.util.Scanner;

public class Laboratorio {
	private
	String idLaboratorio,ubicacion;
	LS_NormalResponsable LResponsable = new LS_NormalResponsable();
	LS_NormalMateria LMatarias = new LS_NormalMateria();
	Laboratorio(){
		
	}

	public Laboratorio(String idLaboratorio, String ubicacion, LS_NormalResponsable lResponsable,
			LS_NormalMateria lMatarias) {
		super();
		this.idLaboratorio = idLaboratorio;
		this.ubicacion = ubicacion;
		LResponsable = lResponsable;
		LMatarias = lMatarias;
	}



	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro Id laboratorio> ");
		idLaboratorio=sc.next();
		System.out.println("Into ubicacion> ");
		ubicacion=sc.next();
		Responsable a = new Responsable();
		System.out.println("Intro cantidad de responsables");
		int cR=sc.nextInt();
		for (int i = 0; i < cR; i++) {
			a.leer();
			LResponsable.adiFinal(a);
		}
		System.out.println("Intro la cantidad de materias: ");
		int cM=sc.nextInt();
		for (int i = 0; i < cM; i++) {
			System.out.println("Introduc el nombre de la matria: ");
			Materia nomMa = new Materia();
			nomMa.leer();
			System.out.println("Intro la cantidad de estudiantes: ");
			int cEs=sc.nextInt();
			LS_NormalEstudiante LE = new LS_NormalEstudiante();
			for (int j = 0; j < cEs; j++) {
				Estudiante es = new Estudiante();
				es.leer();
				LE.adiFinal(es);
			}
			LMatarias.adiFinal(nomMa, LE);
			
		}		
		
	}
	void mostrar() {
		System.out.println("ID LABORATORIO: "+idLaboratorio);
		System.out.println("UBICACION: "+ubicacion);
		LResponsable.mostrar();
		LMatarias.mostrar();
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

	public LS_NormalResponsable getLResponsable() {
		return LResponsable;
	}

	public void setLResponsable(LS_NormalResponsable lResponsable) {
		LResponsable = lResponsable;
	}

	public LS_NormalMateria getLMatarias() {
		return LMatarias;
	}

	public void setLMatarias(LS_NormalMateria lMatarias) {
		LMatarias = lMatarias;
	}
	
	
}
