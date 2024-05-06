package ejer_3;
public class NodoArea {
	private Area Area;
	private NodoArea ant;
	private NodoArea sig;
	
	NodoArea(){
		this.sig = null;
		this.ant = null;
	}

	public Area getArea() {
		return Area;
	}

	public void setArea(Area Area) {
		this.Area = Area;
	}

	public NodoArea getAnt() {
		return ant;
	}

	public void setAnt(NodoArea ant) {
		this.ant = ant;
	}

	public NodoArea getSig() {
		return sig;
	}

	public void setSig(NodoArea sig) {
		this.sig = sig;
	}
	
}
