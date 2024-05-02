package ejer_5;

import java.util.Scanner;

public class LS_CircularNiño extends ListaSimpleNiño{
	public
		boolean esVacia() {
		if (p==null) {
			return true;
		}
		return false;
		}
		int nroNodos() {
			int c=0;
			if (p!=null) {
				NodoNiño r = p;
				while(r.getSig()!=p) {
					c++;
					r=r.getSig();
				}
				c++;
			}
			return c;
		}
		void adiFinal(String nom, double d){
			NodoNiño nuevo = new NodoNiño();
//			nuevo.setNom(nom);
//			nuevo.setEdad(edad);
			nuevo.x.setNombre(nom);
			nuevo.x.setEdad(d);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoNiño r = p;
				while (r.getSig()!=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
			}
		}
		void mostrar() {
			NodoNiño r =p;
			System.out.println("\t***LISTA DE NIÑOS***");
			while (r.getSig()!=p) {
//				System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
				r.x.mostrar();
				System.out.println("");
				r=r.getSig();
			}
			//System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
			r.x.mostrar();
		}
		void adiPrincipio(String nom, int edad) {
			NodoNiño nuevo = new NodoNiño();
//			nuevo.setNom(nom);
//			nuevo.setEdad(edad);
			nuevo.x.leer();
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoNiño r=p;
				while (r.getSig() !=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
				p=nuevo;
			}
		}
		NodoNiño eliPrincipio() {
			NodoNiño x = null;
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					x=p;
					
					NodoNiño r = p;
					while (r.getSig()!=p) {
						r=r.getSig();
					}
					p=p.getSig();
					r.setSig(p);
					x.setSig(null);
				}
			}
			return x;
		}
		NodoNiño eliFinal() {
			NodoNiño x = new NodoNiño();
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					NodoNiño s = new NodoNiño();
					NodoNiño r = p;
					while (r.getSig()!=p) {
						s=r;
						r=r.getSig();
					}
					x=r;
					x.setSig(null);
					s.setSig(p);
				}
			}
			return x;
		}
		void llenar1(int n) {
			String nom;
			int edad;
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				nom=sc.next();
				edad=sc.nextInt();
				adiFinal(nom,edad);
			}
		}
		void llenar2(int n) {
			String nom;
			int edad;
			Scanner sc = new Scanner(System.in);
			for (int i = 0; i < n; i++) {
				nom=sc.next();
				edad=sc.nextInt();
				adiPrincipio(nom,edad);
			}
		}
}
