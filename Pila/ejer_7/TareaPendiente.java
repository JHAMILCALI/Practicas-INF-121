package ejer_7;
import java.util.*;
public class TareaPendiente {
	private String nomTarea;
	private String prioriadad;
	private String fechaLim;
	private String estado;
	
	public TareaPendiente() {
		nomTarea = "";
		prioriadad = "";
		fechaLim = "";
		estado = "";
	}
	
	public TareaPendiente(String nomTarea, String prioriadad, String fechaLim, String estado) {
		super();
		this.nomTarea = nomTarea;
		this.prioriadad = prioriadad;
		this.fechaLim = fechaLim;
		this.estado = estado;
	}

	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese nombre de la tarea: ");
		nomTarea = sc.next();
		System.out.println("Ingrese prioridad: ");
		prioriadad = sc.next();
		System.out.println("Ingrese la fecha limite: ");
		fechaLim = sc.next();
		System.out.println("Ingrese el estado: ");
		estado = sc.next();
	}
	public void mostrar() {
		System.out.println(toString());
	}
	@Override
	public String toString() {
		return "TareaPendiente [nomTarea=" + nomTarea + ", prioriadad=" + prioriadad + ", fechaLim=" + fechaLim
				+ ", estado=" + estado + "]";
	}
	public String getNomTarea() {
		return nomTarea;
	}
	public void setNomTarea(String nomTarea) {
		this.nomTarea = nomTarea;
	}
	public String getPrioriadad() {
		return prioriadad;
	}
	public void setPrioriadad(String prioriadad) {
		this.prioriadad = prioriadad;
	}
	public String getFechaLim() {
		return fechaLim;
	}
	public void setFechaLim(String fechaLim) {
		this.fechaLim = fechaLim;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	
}
