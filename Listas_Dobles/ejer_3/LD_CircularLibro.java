package ejer_3;
import java.util.Scanner;

public class LD_CircularLibro extends ListaDobleLibro{
	public LD_CircularLibro() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoLibro R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				c++;
				R = R.getSig();
			}
			c++;
		}
		return c;
	}
	void adiPrimero(Libro z){
		NodoLibro nuevo = new NodoLibro();
		nuevo.setLibro(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoLibro R = P.getAnt();
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
			P.setAnt(R);
			R.setSig(P);
		}
	}
	void mostrar() {
		NodoLibro R = P;
		if(!esVacia()) {
			while(R.getSig() != P) {
				R.getLibro().mostrar();
				System.out.println("------------------");
				R = R.getSig();
			}
			R.getLibro().mostrar();
		}
		else
			System.out.println("Lista Vacia");
	}

	void adiFinal(Libro z) {
		NodoLibro nuevo = new NodoLibro();
		nuevo.setLibro(z);
		if(esVacia()) {
			P = nuevo;
			P.setSig(P);
			P.setAnt(P);
		}
		else {
			NodoLibro R = P.getAnt();
			R.setSig(nuevo);
			nuevo.setAnt(R);
			nuevo.setSig(P);
			P.setAnt(nuevo);
		}
	}

	NodoLibro eliPrimero() {
		NodoLibro x = new NodoLibro();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				NodoLibro R = P.getAnt();
				P = P.getSig();
				P.setAnt(R);
				R.setSig(P);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	NodoLibro eliFinal() {
		NodoLibro x = new NodoLibro();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P.getAnt();
				NodoLibro R = x.getAnt();
				R.setSig(P);
				P.setAnt(R);
			}
			x.setSig(null);
			x.setAnt(null);
		}
		return x;
	}

	void leer1(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Libro z = new Libro();
			z.leer();
			adiPrimero(z);
		}
	}

	void leer2(int n) {
		Scanner lee =  new Scanner(System.in);
		for (int i = 1; i <= n; i++) {
			Libro z = new Libro();
			z.leer();
			adiFinal(z);
		}
	}
}
