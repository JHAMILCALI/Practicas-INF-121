package ejer_9;

import java.util.Scanner;

public class Evento {
	private
	String nombre,lugar,fecha,nombreDeporte;
	LD_NormalParticipante LDParticipante = new LD_NormalParticipante();
	public Evento() {
		// TODO Esbozo de constructor generado automáticamente
	}
	
	public Evento(String nombre, String lugar, String fecha, String nombreDeporte,
			LD_NormalParticipante lDParticipante) {
		super();
		this.nombre = nombre;
		this.lugar = lugar;
		this.fecha = fecha;
		this.nombreDeporte = nombreDeporte;
		LDParticipante = lDParticipante;
	}

	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro nombre evento>");
		nombre=sc.next();
		System.out.println("Intro lugar> ");
		lugar=sc.next();
		System.out.println("Intro fecha> ");
		fecha=sc.next();
		System.out.println("Intro nom Deporte> ");
		nombreDeporte=sc.next();
		System.out.println("Intreoduce la cantidad de particpantes> ");
		int partX=sc.nextInt();
		LDParticipante.leer1(partX);
	}
	void mostrar() {
		System.out.println("NOMBRE DEL EVENTO: "+nombre);
		System.out.println("LUGAR: "+lugar);
		System.out.println("FECHA: "+fecha);
		System.out.println("NOMBRE DEPORTE: "+nombreDeporte);
		LDParticipante.mostrar();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreDeporte() {
		return nombreDeporte;
	}

	public void setNombreDeporte(String nombreDeporte) {
		this.nombreDeporte = nombreDeporte;
	}

	public LD_NormalParticipante getLDParticipante() {
		return LDParticipante;
	}

	public void setLDParticipante(LD_NormalParticipante lDParticipante) {
		LDParticipante = lDParticipante;
	}
	
	
}
