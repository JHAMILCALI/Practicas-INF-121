package ejer_5;

import java.util.Scanner;
public class Mp_PilaLibro {

	PilaLibro mp[] = new PilaLibro[20];
	int n = 0;
	Mp_PilaLibro() {
		int i;
		for (i = 0; i < 20; i++)
			mp[i] = new PilaLibro();
	}

	int Nropilas() {
		return (n);
	}

	int nroelem(int i) {
		return (mp[i].nroElem());
	}

	boolean esvacia(int i) {
		if (mp[i].esVacia())
			return true;
		return false;
	}

	boolean esllena(int i) {
		if (mp[i].esLlena())
			return true;
		return false;
	}

	void adicionar(int i, Libro L) {
		if (!mp[i].esLlena())
			mp[i].adi(L);
		else
			System.out.print("pila " + i + " esta llena");
	}

	Libro eliminar(int i) {
		Libro e = new Libro();
		if (!mp[i].esVacia())
			e = mp[i].eli();
		else
			System.out.print("pila " + i + " esta vacia");
		return e;
	}

	void mostrar(int i) {
		mp[i].mostrar();
	}

	void mostrar() {
		int i;
		for (i = 0; i < n; i++) {
			System.out.println("\nDatos Pila " + i + " ");
			mp[i].mostrar();
		}
	}

	void vaciar(int i, PilaLibro z) {
		mp[i].vaciar(z);
	}

	public PilaLibro[] getMp() {
		return mp;
	}

	public void setMp(PilaLibro[] mp) {
		this.mp = mp;
	}

	

	public int getNp() {
		return n;
	}

	public void setNp(int np) {
		this.n = np;
	}

	

}