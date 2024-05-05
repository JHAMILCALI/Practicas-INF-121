package ejer_9;
//Lic Aruquipa Marcelo
public class NodoEmpleadoEmp {
	private EmpleadoEmp empleado;
	private NodoEmpleadoEmp ant;
	private NodoEmpleadoEmp sig;
	
	NodoEmpleadoEmp(){
		this.sig = null;
		this.ant = null;
	}

	public EmpleadoEmp getEmpleado() {
		return empleado;
	}

	public void setEmpleado(EmpleadoEmp empleado) {
		this.empleado = empleado;
	}

	public NodoEmpleadoEmp getAnt() {
		return ant;
	}

	public void setAnt(NodoEmpleadoEmp ant) {
		this.ant = ant;
	}

	public NodoEmpleadoEmp getSig() {
		return sig;
	}

	public void setSig(NodoEmpleadoEmp sig) {
		this.sig = sig;
	}
	

//	public EmpleadoEmp getProy() {
//		return proy;
//	}
//
//	public void setProy(EmpleadoEmp proy) {
//		this.proy = proy;
//	}
//
//	public NodoEmpleadoEmp getAnt() {
//		return ant;
//	}
//
//	public void setAnt(NodoEmpleadoEmp ant) {
//		this.ant = ant;
//	}
//
//	public NodoEmpleadoEmp getSig() {
//		return sig;
//	}
//
//	public void setSig(NodoEmpleadoEmp sig) {
//		this.sig = sig;
//	}
	
}
