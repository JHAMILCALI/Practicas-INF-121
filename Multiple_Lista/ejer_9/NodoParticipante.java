package ejer_9;
//Lic Aruquipa Marcelo
public class NodoParticipante {
	private Participante Participante;
	private NodoParticipante ant;
	private NodoParticipante sig;
	
	NodoParticipante(){
		this.sig = null;
		this.ant = null;
	}

	public Participante getParticipante() {
		return Participante;
	}

	public void setParticipante(Participante Participante) {
		this.Participante = Participante;
	}

	public NodoParticipante getAnt() {
		return ant;
	}

	public void setAnt(NodoParticipante ant) {
		this.ant = ant;
	}

	public NodoParticipante getSig() {
		return sig;
	}

	public void setSig(NodoParticipante sig) {
		this.sig = sig;
	}

}
