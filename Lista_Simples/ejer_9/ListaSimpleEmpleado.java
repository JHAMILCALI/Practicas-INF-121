package ejer_9;
public class ListaSimpleEmpleado {
	protected NodoEmpleado P;  //raiz de la lista
	
	public ListaSimpleEmpleado() {
		P = null;		// la raiz apunta a nullo es decir
						// se define una lista simple vacia
	}

	public NodoEmpleado getP() {
		return P;
	}

	public void setP(NodoEmpleado p) {
		P = p;
	}
	
}
