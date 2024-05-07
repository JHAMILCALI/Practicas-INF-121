package ejer_1;
public class NodoHabitacion {
	private Habitacion Habitacion;
	private NodoHabitacion ant;
	private NodoHabitacion sig;
	
	NodoHabitacion(){
		this.sig = null;
		this.ant = null;
	}

	public Habitacion getHabitacion() {
		return Habitacion;
	}

	public void setHabitacion(Habitacion Habitacion) {
		this.Habitacion = Habitacion;
	}

	public NodoHabitacion getAnt() {
		return ant;
	}

	public void setAnt(NodoHabitacion ant) {
		this.ant = ant;
	}

	public NodoHabitacion getSig() {
		return sig;
	}

	public void setSig(NodoHabitacion sig) {
		this.sig = sig;
	}
	
}
