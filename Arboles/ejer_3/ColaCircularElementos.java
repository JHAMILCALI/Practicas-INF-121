package ejer_3;
import java.util.Scanner;

public class ColaCircularElementos extends ColaElementos{
	public ColaCircularElementos() {
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
	public void adi(nodoDato elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public nodoDato eli() {
		nodoDato elem = new nodoDato();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularElementos z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. un Elementos:");
//			nodoDato elem = lee.nextInt();
//	        this.adi(elem);
//		}
//	}
	public void mostrar() {
		ColaCircularElementos aux = new ColaCircularElementos();
		while(!esVacia()) {
			nodoDato elem = eli();
			System.out.print(elem+" ");
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
