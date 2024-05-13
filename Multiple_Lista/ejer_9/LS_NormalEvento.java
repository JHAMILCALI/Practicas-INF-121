package ejer_9;

public class LS_NormalEvento extends ListaSimpleEvento{

	public LS_NormalEvento() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Evento z) {
		NodoEvento nuevo = new NodoEvento();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Evento z) {
		NodoEvento nuevo = new NodoEvento();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoEvento R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoEvento R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE Eventos");
		while(R != null) {
			R.getEvento().mostrar();
			System.out.println("=========================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoEvento R = P;
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
	public NodoEvento eliPrincipio() {
		NodoEvento x = new NodoEvento();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoEvento eliFinal() {
		NodoEvento x = new NodoEvento();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoEvento R = P;
				NodoEvento S = P;
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
