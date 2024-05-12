package ejer_5;
public class ListaSimpleResponsable{
	protected NodoResponsable P;  //raiz de la lista
	
	public ListaSimpleResponsable() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoResponsable getP() {
		return P;
	}

	public void setP(NodoResponsable p) {
		P = p;
	}
	
}
