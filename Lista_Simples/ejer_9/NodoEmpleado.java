package ejer_9;
public class NodoEmpleado {
	private Empleado Q;  //define el dato objeto Empleado
	private NodoEmpleado sig; //definiendo el campo enlace sig
	
	public NodoEmpleado() {  //constructor
		sig = null;
	}

	public Empleado getQ() {
		return Q;
	}

	public void setDato(Empleado q) {
		this.Q = q;
	}

	public NodoEmpleado getSig() {
		return sig;
	}

	public void setSig(NodoEmpleado sig) {
		this.sig = sig;
	}
	
}
