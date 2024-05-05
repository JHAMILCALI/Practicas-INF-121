package ejer_7;
//Lic Aruquipa Marcelo
public class Nodoproducto {
	private producto producto;
	private Nodoproducto ant;
	private Nodoproducto sig;
	
	Nodoproducto(){
		this.sig = null;
		this.ant = null;
	}

	public producto getproducto() {
		return producto;
	}

	public void setproducto(producto producto) {
		this.producto = producto;
	}

	public Nodoproducto getAnt() {
		return ant;
	}

	public void setAnt(Nodoproducto ant) {
		this.ant = ant;
	}

	public Nodoproducto getSig() {
		return sig;
	}

	public void setSig(Nodoproducto sig) {
		this.sig = sig;
	}
	

//	public producto getProy() {
//		return proy;
//	}
//
//	public void setProy(producto proy) {
//		this.proy = proy;
//	}
//
//	public Nodoproducto getAnt() {
//		return ant;
//	}
//
//	public void setAnt(Nodoproducto ant) {
//		this.ant = ant;
//	}
//
//	public Nodoproducto getSig() {
//		return sig;
//	}
//
//	public void setSig(Nodoproducto sig) {
//		this.sig = sig;
//	}
	
}
