package ejer_5;

public class LS_NormalResponsable extends ListaSimpleResponsable{

	public LS_NormalResponsable() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Responsable z) {
		NodoResponsable nuevo = new NodoResponsable();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Responsable z) {
		NodoResponsable nuevo = new NodoResponsable();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoResponsable R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoResponsable R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE RESPONSABLES");
		while(R != null) {
			R.getQ().mostrar();
			System.out.println("------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoResponsable R = P;
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
	public NodoResponsable eliPrincipio() {
		NodoResponsable x = new NodoResponsable();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoResponsable eliFinal() {
		NodoResponsable x = new NodoResponsable();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoResponsable R = P;
				NodoResponsable S = P;
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
