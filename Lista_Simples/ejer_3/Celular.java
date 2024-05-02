package ejer_3;

import java.util.Scanner;

public class Celular {
	private
	int numeroCel;
	String asunto,fecha,hora,texto;
	public Celular(int numeroCel, String asunto, String fecha, String hora, String texto) {
		super();
		this.numeroCel = numeroCel;
		this.asunto = asunto;
		this.fecha = fecha;
		this.hora = hora;
		this.texto = texto;
	}
	public Celular() {
		super();
		this.numeroCel = 0;
		this.asunto = "";
		this.fecha = "";
		this.hora = "";
		this.texto = "";
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro numreoo del celular: ");
		numeroCel=sc.nextInt();
		System.out.println("Intro asunto: ");
		asunto=sc.next();
		System.out.println("Intro fecha: ");
		fecha=sc.next();
		System.out.println("Intro hora: ");
		hora=sc.next();
		System.out.println("Intro texto: ");
		texto=sc.next();
	}
	void mostrar() {
		System.out.println("Numero de Celular: "+numeroCel);
		System.out.println("Asunto: "+asunto);
		System.out.println("Fecha: "+fecha);
		System.out.println("Hora: "+hora);
		System.out.println("Texto: "+texto);
	}
	@Override
	public String toString() {
		return "Celular [numeroCel=" + numeroCel + ", asunto=" + asunto + ", fecha=" + fecha + ", hora=" + hora
				+ ", texto=" + texto + "]";
	}
	public int getNumeroCel() {
		return numeroCel;
	}
	public void setNumeroCel(int numeroCel) {
		this.numeroCel = numeroCel;
	}
	public String getAsunto() {
		return asunto;
	}
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getHora() {
		return hora;
	}
	public void setHora(String hora) {
		this.hora = hora;
	}
	public String getTexto() {
		return texto;
	}
	public void setTexto(String texto) {
		this.texto = texto;
	}
	

}
