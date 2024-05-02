package ejer_3;
import java.util.*;
public class Proyecto {
	private String tituloProy;
	private ColaCircularParticipante listaParticipante;
	
	public Proyecto() {
		tituloProy = "";
		listaParticipante = new ColaCircularParticipante();
	}

	public Proyecto(String tituloProy, ColaCircularParticipante listaParticipante) {
		super();
		this.tituloProy = tituloProy;
		this.listaParticipante = listaParticipante;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese el titulo del Proyecto: ");
		tituloProy = sc.next();
		System.out.println("Ingresa la cantidad de participantes de este proyecto: ");
		int part = sc.nextInt();
		listaParticipante.llenar(part);
	}
	public void mostrar() {
		System.out.println("TITULO DEL PROYECTO: "+tituloProy);
		System.out.println("----------------- Participantes -------------");
		listaParticipante.mostrar();
		System.out.println("");
	}

	public String getTituloProy() {
		return tituloProy;
	}

	public void setTituloProy(String tituloProy) {
		this.tituloProy = tituloProy;
	}

	public ColaCircularParticipante getListaParticipante() {
		return listaParticipante;
	}

	public void setListaParticipante(ColaCircularParticipante listaParticipante) {
		this.listaParticipante = listaParticipante;
	}
	
	
}
