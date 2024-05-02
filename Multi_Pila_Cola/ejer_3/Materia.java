package ejer_3;
import java.util.*;
public class Materia {
	private String sigla;
	private PilaProyecto listaProyecto;
	
	public Materia() {
		sigla = "";
		listaProyecto = new PilaProyecto();
	}

	public Materia(String sigla, PilaProyecto listaProyecto) {
		super();
		this.sigla = sigla;
		this.listaProyecto = listaProyecto;
	}
	public void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingresa la sigla de la Materia: ");
		sigla = sc.next();
		System.out.println("Ingresa la cantidad de proyectos de la pila: ");
		int p = sc.nextInt();
		listaProyecto.llenar(p);
	}
	public void mostrar() {
		System.out.println("********************** DATOS DE LA MATERIA -******************");
		System.out.println("SIGLA: "+sigla);
		listaProyecto.mostrar();
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public PilaProyecto getListaProyecto() {
		return listaProyecto;
	}

	public void setListaProyecto(PilaProyecto listaProyecto) {
		this.listaProyecto = listaProyecto;
	}
	
}
