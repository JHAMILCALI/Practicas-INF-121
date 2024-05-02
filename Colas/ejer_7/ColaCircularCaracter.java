package ejer_7;
import java.util.Scanner;

public class ColaCircularCaracter extends ColaCaracter{
	public ColaCircularCaracter() {
		super();
	}
	public int nroElem() {
		return (fi - fr + MAX) % MAX;
	}
	public boolean esVacia() {
		if(nroElem() == 0)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(nroElem() == MAX-1)
			return true;
		return false;
	}
	public void adi(char elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public char eli() {
		char elem = 0;
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularCaracter z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. un caracter:");
	        char elem = lee.next().charAt(0);
	        this.adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularCaracter aux = new ColaCircularCaracter();
		while(!esVacia()) {
			char elem = eli();
			System.out.print(elem+" ");
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
