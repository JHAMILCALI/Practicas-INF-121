package ejer_7;

public class LS_NormalCanal extends ListaSimpleCanal{

	public LS_NormalCanal() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Canal z) {
		NodoCanal nuevo = new NodoCanal();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Canal z) {
		NodoCanal nuevo = new NodoCanal();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoCanal R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoCanal R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE Canales");
		while(R != null) {
			R.getCanal().mostrar();
			System.out.println("=========================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoCanal R = P;
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
	public NodoCanal eliPrincipio() {
		NodoCanal x = new NodoCanal();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoCanal eliFinal() {
		NodoCanal x = new NodoCanal();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoCanal R = P;
				NodoCanal S = P;
				while(R.getSig() != null) {
					S = R;
					R = R.getSig();
				}
				x = R;
				S.setSig(null);
			}
		}
		return x;
	}
}
