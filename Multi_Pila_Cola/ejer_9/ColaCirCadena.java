package ejer_9;
import java.util.Scanner;

public class ColaCirCadena extends ColaCadena{
	public ColaCirCadena() {
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
	public void adi(String c) {
		if(!esLlena()) {
			fi = (fi + 1) % MAX;
			v[fi] = c;
		}else
			System.out.println("cola circular llena!!!");
	}
	public String eli() {
		String elem = "";
		if(!esVacia()) {
			fr = (fr + 1) % MAX;
			elem = v[fr];
		}else
			System.out.println("Cola circular vacia!!");
		return elem;
	}
	
	public void vaciar(ColaCirCadena z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 1; i <= n; i++) {
			System.out.println("Intro un CARACTER");
			String elem = sc.next();
			this.adi(elem);
		}
	}
	public void mostrar() {
		ColaCirCadena aux = new ColaCirCadena();
		while(!esVacia()) {
			String elem = eli();
			System.out.println(elem);
			aux.adi(elem);
		}
		vaciar(aux);
	}
}
