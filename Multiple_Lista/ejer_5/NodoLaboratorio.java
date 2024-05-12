package ejer_5;
public class NodoLaboratorio{
	private Laboratorio laboratorio;  //define el dato objeto Estudiante
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

	public NodoLaboratorio getSig() {
		return sig;
	}

	public void setSig(NodoLaboratorio sig) {
		this.sig = sig;
	}

	

}
