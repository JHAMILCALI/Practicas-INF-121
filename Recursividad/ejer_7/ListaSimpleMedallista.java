package ejer_7;
public class ListaSimpleMedallista {
	protected NodoMedallista P;  //raiz de la lista
	
	public ListaSimpleMedallista() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoMedallista getP() {
		return P;
	}

	public void setP(NodoMedallista p) {
		P = p;
	}
	
}
