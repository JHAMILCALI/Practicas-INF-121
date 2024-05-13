package ejer_9;
public class NodoEvento{
	private Evento Evento;  //define el dato objeto Evento
	private NodoEvento sig; //definiendo el campo enlace sig
	
	public NodoEvento() {  //constructor
		sig = null;
	}

	public Evento getEvento() {
		return Evento;
	}

	public void setDato(Evento Evento) {
		this.Evento = Evento;
	}

	public NodoEvento getSig() {
		return sig;
	}

	public void setSig(NodoEvento sig) {
		this.sig = sig;
	}
	
}
