package ejer_3;
//Lic Aruquipa Marcelo
public class LD_NormalArea extends ListaDobleArea{
	public LD_NormalArea() {
		super();
	}
	boolean esVacia() {
		if(this.P == null)
			return true;
		return false;
	}
	int nroNodos() {
		int c = 0;
		NodoArea R = this.P;
		while(R != null) {
			c++;
			R = R.getSig();
		}
		return c;
	}
	void adiPrimero(Area z){
		NodoArea nuevo = new NodoArea();
		nuevo.setArea(z);
		if(esVacia())
			P = nuevo;
		else {
			nuevo.setSig(P);
			P.setAnt(nuevo);
			P = nuevo;
		}
	}
	void mostrar() {
		NodoArea R = P;
		System.out.println("\tLISTA DE AREAS");
		while(R != null) {
			R.getArea().mostrar();
			System.out.println("-------------------");
			R = R.getSig();
		}
	}
	void adiFinal(Area z) {
		NodoArea nuevo =  new NodoArea();
		nuevo.setArea(z);
		if(esVacia())
			P = nuevo;
		else {
			NodoArea R = P;
			while(R.getSig() != null) {
				R = R.getSig();
			}
			R.setSig(nuevo);
			nuevo.setAnt(R);
		}
	}
	
	NodoArea eliPrimero() {
		NodoArea x = new NodoArea();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				x = P;
				P = P.getSig();
				P.setAnt(null);
				x.setSig(null);
			}
		}
		return x;
	}
	
	NodoArea eliFinal() {
		NodoArea x = new NodoArea();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}else {
				NodoArea R = P;
				while(R.getSig() != null) {
					R = R.getSig();
				}
				x = R;
				NodoArea aux = R.getAnt();
				aux.setSig(null);
				x.setAnt(null);
			}
		}
		return x;
	}
	
	void leer1(int n) {
		for (int i = 1; i <= n; i++) {
			Area z = new Area();
			z.leer();
			adiPrimero(z);
		}
	}
	
	void leer2(int n) {
		for (int i = 1; i <= n; i++) {
			Area z = new Area();
			z.leer();
			adiFinal(z);
		}
	}
}
