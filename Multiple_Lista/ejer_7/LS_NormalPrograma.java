package ejer_7;

public class LS_NormalPrograma extends ListaSimplePrograma{

	public LS_NormalPrograma() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Programa z) {
		NodoPrograma nuevo = new NodoPrograma();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Programa z) {
		NodoPrograma nuevo = new NodoPrograma();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPrograma R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPrograma R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE ProgramaS");
		while(R != null) {
			R.getPrograma().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPrograma R = P;
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
	public NodoPrograma eliPrincipio() {
		NodoPrograma x = new NodoPrograma();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoPrograma eliFinal() {
		NodoPrograma x = new NodoPrograma();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoPrograma R = P;
				NodoPrograma S = P;
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
