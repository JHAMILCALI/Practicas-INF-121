package ejer_9;

public class LS_NormalDistrito extends ListaSimpleDistrito{

	public LS_NormalDistrito() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Distrito z) {
		NodoDistrito nuevo = new NodoDistrito();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Distrito z) {
		NodoDistrito nuevo = new NodoDistrito();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoDistrito R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoDistrito R = P;   //R apunta  a la raiz P
		System.out.println("*****LISTA DE DistritoS*****");
		while(R != null) {
			R.getQ().mostrar();
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoDistrito R = P;
		int c = 0;
		if(this.esVacia())
			return 0;
		else {
			while(R != null) {
				c++;
				R = R.getSig();
			}
		}
		return c;
	}
}
