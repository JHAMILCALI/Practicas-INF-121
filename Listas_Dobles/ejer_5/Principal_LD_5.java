package ejer_5;

import java.util.Scanner;

public class Principal_LD_5 {

	public static void main(String[] args) {
		LS_CircularProducto A = new LS_CircularProducto();
		A.adiFinal(new Producto("chetos",0,2.9));
		A.adiFinal(new Producto("arroz",5,10));
		A.adiFinal(new Producto("mayonesa",30,2.5));
		A.adiFinal(new Producto("papas",0,6));
		A.adiFinal(new Producto("coca cola",28,10.5));
		A.adiFinal(new Producto("helado",45,2));
		A.adiFinal(new Producto("cafe",26,1.5));
		A.adiFinal(new Producto("leche",0,6.5));
		A.adiFinal(new Producto("azucar",23,12));
		A.adiFinal(new Producto("sublime",16,2.9));
		A.adiFinal(new Producto("toplime",16,2.9));
		A.adiFinal(new Producto("nana",16,2.9));
		A.mostrar();
		//a)Dividir por la mitad la lista, obteniendo como resultado dos listas simples
		//circulares. No crear nuevos nodos
		System.out.println("\t****INCISO A****");
		LS_CircularProducto B = new LS_CircularProducto();
		inciso_a(A,B);
		System.out.println("\n\tLISTA A");
		A.mostrar();
		System.out.println("\n\tLISTA B");
		B.mostrar();
//		b. Con los ‘k’ primeros nodos, formar una lista simple circular, el 
//		resto se mantienen en la lista circular. No crear nuevos nodos
		Scanner sc = new Scanner(System.in);
		System.out.println("\t****INCISO B****");
		System.out.println("Introduce un valor K: ");
		//int k=sc.nextInt();
		int k=4;
		LS_CircularProducto C = new LS_CircularProducto();
		inciso_b(A,k,C);
		System.out.println("\n\t***LISTA DE PRODUCTOS A****");
		A.mostrar();
		System.out.println("\n\t***LISTA DE PRODUCTOS C****");
		C.mostrar();
	}


	private static void inciso_b(LS_CircularProducto a, int k, LS_CircularProducto c) {
		NodoProducto R = a.getP();
		int totNodos = a.nroNodos(),cont=0;
		if (totNodos>=k) {
			for (int i = 0; i < totNodos; i++) {
				Producto pro = R.getproducto();
				if (i<k) {
					c.adiFinal(pro);
				}
				R=R.getSig();
			}
			R=a.getP();
			int torRes=totNodos-k;
			for (int i = 0; i < totNodos; i++) {
				Producto pro = R.getproducto();
				cont++;
				if (i==k) {
					a.setP(R);
				}
				if (cont==totNodos) {
					R.setSig(a.getP());
				}
				R=R.getSig();
			}
		}else {
			System.out.println("No ay la cabtidad de "+k+" Productos en la lista A!!!!");
		}
		
	}


	private static void inciso_a(LS_CircularProducto a, LS_CircularProducto b) {
		NodoProducto R = a.getP();
		int totalNodos = a.nroNodos();
		float MitadNodos = totalNodos / 2;
		System.out.println(MitadNodos);
		int ct = 0;
		for (int i = 0; i < totalNodos; i++) {
			Producto pro = R.getproducto();
			ct++;
			if (ct == MitadNodos + 1) {
				b.adiFinal(pro);
				ct--;
			}
			R = R.getSig();
		}
		R = a.getP();
		ct = 0;
		for (int i = 0; i < totalNodos; i++) {
			Producto pro = R.getproducto();
			ct++;
			if (ct == MitadNodos) {
				R.setSig(a.getP());
				break;
			}
			R = R.getSig();
		}

	}

}
