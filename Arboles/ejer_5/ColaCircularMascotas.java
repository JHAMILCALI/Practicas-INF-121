package ejer_5;
import java.util.Scanner;

public class ColaCircularMascotas extends ColaMascotas{
	public ColaCircularMascotas() {
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
	public void adi(nodoMascotas nodoMascotas) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = nodoMascotas;
		}else
			System.out.println("cola circular llena!!!");
	}
	public nodoMascotas eli() {
		nodoMascotas elem = new nodoMascotas();
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularMascotas z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
//	public void llenar(int n) {
//		Scanner lee = new Scanner(System.in);
//		
//		for (int i = 1; i <= n; i++) {
//			System.out.println("Intr. un Mascotas:");
//			nodoMascotas elem = new nodoMascotas();
//			elem.leer();
//	        this.adi(elem);
//		}
//	}
//	public void mostrar() {
//		ColaCircularMascotas aux = new ColaCircularMascotas();
//		while(!esVacia()) {
//			nodoMascotas elem = eli();
//			elem.mostrar();
//			aux.adi(elem);
//		}
//		vaciar(aux);
//	}
}
