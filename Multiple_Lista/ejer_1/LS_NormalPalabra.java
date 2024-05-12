package ejer_1;
import java.util.Scanner;
public class LS_NormalPalabra extends ListaSimplePalabra{

	public LS_NormalPalabra() {
		super();
	}

	public boolean esVacia() {
		if(P == null)
			return true;
		return false;
	}

	public void adiPrincipio(LS_NormalLetra z) {
		NodoPalabra nuevo = new NodoPalabra();
		nuevo.setLetra(z);
		nuevo.setSig(P); //el siguiente del nodo nuevo apunta a nodo raiz
		P = nuevo;      //P apunta a nuevo
	}
	
	public void adiFinal(LS_NormalLetra z) {
		NodoPalabra nuevo = new NodoPalabra();
		nuevo.setLetra(z);
		
		if(esVacia())
			P = nuevo;   //p apunta a nuevo
		else {
			NodoPalabra R = P;
			while( R.getSig() != null ){
			     R = R.getSig();
			}
			R.setSig(nuevo);
		}
	}
	
	
	public void mostrar() {
		NodoPalabra R = P;   //R apunta  a la raiz P
		System.out.println("*****LISTA DE PALABRAS*****");
		while(R != null) {
			R.getLetra().mostrar();
			//System.out.println("-------------------");
			R = R.getSig();
		}
	}

	public int nroNodos() {
		NodoPalabra R = P;
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
		System.out.println("Introduce cant de palabras");
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce cantidad de caracteres: ");
			int carX = sc.nextInt();
			LS_NormalLetra x = new LS_NormalLetra();
			x.llenarFinal(carX);
			adiFinal(x);
			;

		}
	}
	void llenarPrincipio(int n) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce un caracter");
		for (int i = 0; i < n; i++) {
			System.out.println("Introduce cantidad de caracteres: ");
			int carX = sc.nextInt();
			LS_NormalLetra x = new LS_NormalLetra();
			x.llenarFinal(carX);
			adiPrincipio(x);
		}
	}
}
