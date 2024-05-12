package ejer_5;
public class ListaSimpleLaboratorio{
	protected NodoLaboratorio P;  //raiz de la lista
	
	public ListaSimpleLaboratorio() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoLaboratorio getP() {
		return P;
	}

	public void setP(NodoLaboratorio p) {
		P = p;
	}
	
}
