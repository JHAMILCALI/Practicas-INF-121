package ejer_5;
public class NodoLaboratorio{
	private Laboratorio laboratorio;  //define el dato objeto Estudiante
	private LS_NormalResponsable LResponsable;
	private LS_NormalMateria LMateria;
	private NodoLaboratorio sig; //definiendo el campo enlace sig
	
	public NodoLaboratorio() {  //constructor
		sig = null;
	}

	public Laboratorio getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}

	public LS_NormalResponsable getLResponsable() {
		return LResponsable;
	}

	public void setLResponsable(LS_NormalResponsable lResponsable) {
		LResponsable = lResponsable;
	}

	public LS_NormalMateria getLMateria() {
		return LMateria;
	}

	public void setLMateria(LS_NormalMateria lMateria) {
		LMateria = lMateria;
	}

	public NodoLaboratorio getSig() {
		return sig;
	}

	public void setSig(NodoLaboratorio sig) {
		this.sig = sig;
	}

}
