package ejer_3;

public class LS_NormalCalificacion extends ListaSimpleCalificacion{

	public LS_NormalCalificacion() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Calificacion z) {
		NodoCalificacion nuevo = new NodoCalificacion();
		nuevo.setDato(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Calificacion z) {
		NodoCalificacion nuevo = new NodoCalificacion();
		nuevo.setDato(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoCalificacion R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoCalificacion R = P;   //R apunta  a la raiz P
		System.out.println("*****LISTA DE CalificacionS*****");
		while(R != null) {
			R.getQ().mostrar();
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoCalificacion R = P;
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
	public NodoCalificacion eliPrincipio() {
		NodoCalificacion x = new NodoCalificacion();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoCalificacion eliFinal() {
		NodoCalificacion x = new NodoCalificacion();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoCalificacion R = P;
				NodoCalificacion S = P;
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
