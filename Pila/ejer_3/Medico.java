package ejer_3;

import java.util.Scanner;

public class Medico {
	private
	String nomEspecialidad, nomDoctor;
	public
	Medico() {
		
	}
	public Medico(String nomEspecialidad, String nomDoctor) {
		super();
		this.nomEspecialidad = nomEspecialidad;
		this.nomDoctor = nomDoctor;
	}
	void llenar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("NOM Especialidad: ");
		nomEspecialidad=sc.next();
		System.out.println("NOM Doctoor: ");
		nomDoctor=sc.next();
	}
	void mostrar() {
		System.out.println(toString());
	}
	public String getNomEspecialidad() {
		return nomEspecialidad;
	}
	public void setNomEspecialidad(String nomEspecialidad) {
		this.nomEspecialidad = nomEspecialidad;
	}
	public String getNomDoctor() {
		return nomDoctor;
	}
	public void setNomDoctor(String nomDoctor) {
		this.nomDoctor = nomDoctor;
	}
	@Override
	public String toString() {
		return "Medico [nomEspecialidad=" + nomEspecialidad + ", nomDoctor=" + nomDoctor + "]";
	}
	
}
