package ejer_1;

import java.util.Scanner;

public class LS_CircularHuesped extends ListaSimpleHuesped{
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
				NodoHuesped r = p;
				while(r.getSig()!=p) {
					c++;
					r=r.getSig();
				}
				c++;
			}
			return c;
		}
		void adiFinal(Huesped x){
			NodoHuesped nuevo = new NodoHuesped();
			nuevo.setHuesped(x);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoHuesped r = p;
				while (r.getSig()!=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
			}
		}
		void mostrar() {
			NodoHuesped r =p;
			System.out.println("\t***LISTA DE Huespedes***");
			while (r.getSig()!=p) {
//				System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
				r.Huesped.mostra();
				System.out.println("");
				r=r.getSig();
			}
			//System.out.println("Nombre ["+r.getNom()+"] , Edad ["+r.getEdad()+"]");
			r.Huesped.mostra();
		}
		void adiPrincipio(Huesped x) {
			NodoHuesped nuevo = new NodoHuesped();
			nuevo.setHuesped(x);
			if (p==null) {
				p=nuevo;
				p.setSig(p);
			}else {
				NodoHuesped r=p;
				while (r.getSig() !=p) {
					r=r.getSig();
				}
				r.setSig(nuevo);
				nuevo.setSig(p);
				p=nuevo;
			}
		}
		NodoHuesped eliPrincipio() {
			NodoHuesped x = null;
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					x=p;
					
					NodoHuesped r = p;
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
		NodoHuesped eliFinal() {
			NodoHuesped x = new NodoHuesped();
			if (!esVacia()) {
				if (p.getSig()==p) {
					x=p;
					x.setSig(null);
					p=null;
				}else {
					NodoHuesped s = new NodoHuesped();
					NodoHuesped r = p;
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
				Huesped z = new Huesped();
				z.leer();
				adiPrincipio(z);
			}
		}
		void llenar2(int n) {
			
			for (int i = 0; i < n; i++) {
				Huesped z = new Huesped();
				z.leer();
				adiFinal(z);
			}
		}
		public void removeHuesped(String numHabitacion, String nomFamilia) {
		    NodoHuesped anterior = null;
		    NodoHuesped actual = p;
		    boolean encontrado = false;
		    while (!encontrado && actual!= null) {
		        if (actual.getHuesped().getNroHabitacion().equals(numHabitacion) && actual.getHuesped().getNomFamilia().equals(nomFamilia)) {
		            encontrado = true;
		        } else {
		            anterior = actual;
		            actual = actual.getSig();
		        }
		    }
		    if (encontrado) {
		        if (anterior == null) {
		            p = p.getSig();
		        } else {
		            anterior.setSig(actual.getSig());
		        }
		    }
		}
}
