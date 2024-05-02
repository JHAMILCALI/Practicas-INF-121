package ejer_7;

import java.util.Scanner;
public class Mp_PilaPersona {

	PilaPersona mp[] = new PilaPersona[20];
	int n = 0;
	Mp_PilaPersona() {
		int i;
		for (i = 0; i < 20; i++)
			mp[i] = new PilaPersona();
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

	void adicionar(int i, Persona L) {
		if (!mp[i].esLlena())
			mp[i].adi(L);
		else
			System.out.print("pila " + i + " esta llena");
	}

	Persona eliminar(int i) {
		Persona e = new Persona();
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

	void vaciar(int i, PilaPersona z) {
		mp[i].vaciar(z);
	}

	public PilaPersona[] getMp() {
		return mp;
	}

	public void setMp(PilaPersona[] mp) {
		this.mp = mp;
	}

	

	public int getNp() {
		return n;
	}

	public void setNp(int np) {
		this.n = np;
	}

	

}