package ejer_3;
public class ListaSimpleCalificacion {
	protected NodoCalificacion P;  //raiz de la lista
	
	public ListaSimpleCalificacion() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoCalificacion getP() {
		return P;
	}

	public void setP(NodoCalificacion p) {
		P = p;
	}
	
}
