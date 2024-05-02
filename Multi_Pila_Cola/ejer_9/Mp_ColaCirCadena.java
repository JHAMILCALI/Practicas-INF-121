package ejer_9;

import java.util.Scanner;

public class Mp_ColaCirCadena {
	private int n;
	private ColaCirCadena c[] = new ColaCirCadena[100];
	int Nropilas() {
		return (n);
	}
	public int nroElem(int i) {
		return c[i].nroElem();
	}
	public boolean esVacia(int i) {
		if (c[i].esVacia())
			return true;
		return false;
	}
	public boolean esLlena(int i) {
		if (c[i].esLlena())
			return true;
		return false;
	}
	public void adicionar(int i, String est) {
	    if (c[i] == null) {
	        c[i] = new ColaCirCadena();
	    }
	    
	    if (!c[i].esLlena()) {
	        c[i].adi(est);
	    } else {
	        System.out.print("Pila " + i + " está llena");
	    }
	}
	public String eliminar(int i) {
		String e = "";
		if (!c[i].esVacia())
			e = c[i].eli();
		else
			System.out.print("pila " + i + " esta vacia");
		return e;
	}
	public void llenar(int i, int n) {
		c[i].llenar(n);
	}
	public void llenar(int n) {
	    this.n = n;
	    Scanner lee = new Scanner(System.in);
	    for (int i = 0; i < this.n; i++) {
	        c[i] = new ColaCirCadena();
	        System.out.println("nro de estudiantes de la pila");
	        int nroEst = lee.nextInt();
	        c[i].llenar(nroEst);
	    }
	}

	public void mostrar() {
	    for (int i = 0; i < this.n; i++) {
	        if (c[i] != null) {
	        	System.out.println("\t*****Datos de la ColaSimple ["+i+"]*****");
	            c[i].mostrar();
	        } else {
	            System.out.println("La pila en la posición " + i + " no ha sido inicializada");
	        }
	    }
	}
	public void mostrar(int i) {
		c[i].mostrar();
	}
	public void vaciar(int i, ColaCirCadena z) {
		c[i].vaciar(z);
	}
	public void vaciar(int i, int j) {
		c[i].vaciar(c[j]);
	}
	public int getN() {
		return n;
	}
	public void setN(int n) {
		this.n = n;
	}
}
