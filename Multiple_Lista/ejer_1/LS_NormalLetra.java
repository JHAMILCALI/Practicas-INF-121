package ejer_1;
import java.util.Scanner;
public class LS_NormalLetra extends ListaSimpleLetra{

	public LS_NormalLetra() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(char z) {
		NodoLetra nuevo = new NodoLetra();
		nuevo.setLetra(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(char z) {
		NodoLetra nuevo = new NodoLetra();
		nuevo.setLetra(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoLetra R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoLetra R = P;   //R apunta  a la raiz P
		System.out.println("\n\tLISTA DE CARACTERES");
		while(R != null) {
			System.out.print(R.getLetra()+" ");
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoLetra R = P;
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
	void llenarFinal(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		for (int i = 0; i < n; i++) {
			char x = sc.next().charAt(0);
			adiFinal(x);;
		}
	}
	void llenarPrincipio(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		for (int i = 0; i < n; i++) {
			char x = sc.next().charAt(0);
			adiPrincipio(x);
		}
	}
	public NodoLetra eliPrincipio() {
		NodoLetra x = new NodoLetra();
		if(!esVacia()) {
			x = P;
			P = P.getSig();
			x.setSig(null);
		}
		return x;
	}
	
	public NodoLetra eliFinal() {
		NodoLetra x = new NodoLetra();
		if(!esVacia()) {
			if(nroNodos() == 1) {
				x = P;
				P = null;
			}
			else {
				NodoLetra R = P;
				NodoLetra S = P;
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
