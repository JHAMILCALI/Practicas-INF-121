package ejer_9;

import java.util.Scanner;

public class Proyectos {
	private
	String titulo,descripcion,investigador,fecha,estado;
	public
	Proyectos() {
		
	}
	public Proyectos(String titulo, String descripcion, String investigador, String fecha, String estado) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.investigador = investigador;
		this.fecha = fecha;
		this.estado=estado;
	}
	void leer() {
	    Scanner sc = new Scanner(System.in);
	    System.out.println("Intro Titulo: ");
	    titulo = sc.nextLine();
	    System.out.println("Intro Descripcion: ");
	    descripcion = sc.nextLine();
	    System.out.println("Intro Investigador: ");
	    investigador = sc.nextLine();
	    System.out.println("Intro fecha: ");
	    fecha = sc.nextLine();
	    System.out.println("Intro el estado del proyecto: ");
	    estado = sc.nextLine();
	}

	void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "Proyectos [titulo=" + titulo + ", descripcion=" + descripcion + ", investigador=" + investigador
				+ ", fecha=" + fecha + ", estado=" + estado + "]";
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getInvestigador() {
		return investigador;
	}
	public void setInvestigador(String investigador) {
		this.investigador = investigador;
	}
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
