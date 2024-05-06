package ejer_5;

import java.util.Scanner;

public class LS_CircularProducto extends ListaSimpleProducto{
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
				NodoProducto r = p;
				while(r.getSig()!=p) {
					c++;
					r=r.getSig();
				}
				c++;
			}
			return c;
		}
		void adiFinal(Producto x){
			NodoProducto nuevo = new NodoProducto();
			nuevo.setproducto(x);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoProducto r = p;
				while (r.getSig()!=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
			}
		}
		void mostrar() {
			NodoProducto r =p;
			System.out.println("\t***LISTA DE PRODUCTOS***");
			while (r.getSig()!=p) {
//				System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
				r.producto.mosttra();
				System.out.println("");
				r=r.getSig();
			}
			//System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
			r.producto.mosttra();
		}
		void adiPrincipio(Producto x) {
			NodoProducto nuevo = new NodoProducto();
			nuevo.setproducto(x);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoProducto r=p;
				while (r.getSig() !=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
				p=nuevo;
			}
		}
		NodoProducto eliPrincipio() {
			NodoProducto x = null;
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					x=p;
					
					NodoProducto r = p;
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
		NodoProducto eliFinal() {
			NodoProducto x = new NodoProducto();
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					NodoProducto s = new NodoProducto();
					NodoProducto r = p;
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
			for (int i = 0; i < n; i++) {
				Producto z = new Producto();
				z.leer();
				adiPrincipio(z);
			}
		}
		void llenar2(int n) {
			
			for (int i = 0; i < n; i++) {
				Producto z = new Producto();
				z.leer();
				adiFinal(z);
			}
		}
}
