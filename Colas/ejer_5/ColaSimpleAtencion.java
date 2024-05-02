package ejer_5;
import java.util.Scanner;
public class ColaSimpleAtencion extends ColaAtencion{

	public ColaSimpleAtencion() {
		super();
	}
	public boolean esVacia() {
		if(fr == fi)
			return true;
		return false;
		
	}
	public boolean esLlena() {
		if(fi == MAX-1)
			return true;
		return false;
	}
	public void adi(Atencion elem) {
		if(esLlena())
			System.out.println("cola simple llena!!!");
		else {
			fi++;
			v[fi] = elem;
		}
	}
	public Atencion eli() {
		Atencion elem = new Atencion();
		if(esVacia())
			System.out.println("Cola simple vacia!!");
		else {
			fr++;
			elem = v[fr];
		}
		return elem;
	}
	public int nroElem() {
		return (fi - fr);
	}
	public void vaciar(ColaSimpleAtencion z) {
		while(!z.esVacia()) {
			adi(z.eli());
		}
	}
	public void llenar(int n) {
		for (int i = 1; i <= n; i++) {
			Atencion elem =new Atencion();
			elem.leer();
			adi(elem);
		}
	}
	public void mostrar() {
		ColaSimpleAtencion aux = new ColaSimpleAtencion();
		Atencion x;
		while(!esVacia()) {
			x = eli();
			x.mostrar();
			aux.adi(x);
		}
		vaciar(aux);
	}
}