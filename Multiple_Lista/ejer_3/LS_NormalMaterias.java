package ejer_3;

public class LS_NormalMaterias extends ListaSimpleMaterias{

	public LS_NormalMaterias() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(Materias z,LS_NormalEstudiante LEstudiante, LS_NormalCalificacion LCalificaciones) {
		NodoMaterias nuevo = new NodoMaterias();
		nuevo.setQ(z);
		nuevo.setLEstudiante(LEstudiante);
		nuevo.setlCalificacion(LCalificaciones);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(Materias z,LS_NormalEstudiante LEstudiante, LS_NormalCalificacion LCalificaciones) {
		NodoMaterias nuevo = new NodoMaterias();
		nuevo.setQ(z);
		nuevo.setLEstudiante(LEstudiante);
		nuevo.setlCalificacion(LCalificaciones);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoMaterias R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoMaterias R = P;   //R apunta  a la raiz P
		System.out.println("\t*****LISTA DE Materias*****");
		while(R != null) {
			R.getQ().mostrar();
			R.getLEstudiante().mostrar();
			R.getlCalificacion().mostrar();
			System.out.println();
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoMaterias R = P;
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
	public NodoMaterias eliPrincipio() {
		NodoMaterias x = new NodoMaterias();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoMaterias eliFinal() {
		NodoMaterias x = new NodoMaterias();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoMaterias R = P;
				NodoMaterias S = P;
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
