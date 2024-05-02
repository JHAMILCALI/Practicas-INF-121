package ejer_3;
import java.util.Scanner;

public class ColaCircularNum extends ColaNum{
	public ColaCircularNum() {
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
	public void adi(int elem) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = elem;
		}else
			System.out.println("cola circular llena!!!");
	}
	public int eli() {
		int elem = 0;
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCircularNum z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner lee = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intr. numero entero");
			int elem = lee.nextInt();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaCircularNum aux = new ColaCircularNum();
		while(!esVacia()) {
			int elem = eli();
			System.out.print(elem+" ");
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
