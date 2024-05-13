package ejer_9;

public class LS_NormalDeporte extends ListaSimpleDeporte{

	public LS_NormalDeporte() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Deporte z) {
		NodoDeporte nuevo = new NodoDeporte();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Deporte z) {
		NodoDeporte nuevo = new NodoDeporte();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoDeporte R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoDeporte R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE Deportees");
		while(R != null) {
			R.getDeporte().mostrar();
			System.out.println("=========================");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoDeporte R = P;
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
	public NodoDeporte eliPrincipio() {
		NodoDeporte x = new NodoDeporte();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoDeporte eliFinal() {
		NodoDeporte x = new NodoDeporte();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoDeporte R = P;
				NodoDeporte S = P;
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
