
package ejer_5;

import java.util.Scanner;

/**
 *
 * @author print
 */
public class ArbolBinarioNormalMascotas extends ArbolBinarioMascotas{

    public ArbolBinarioNormalMascotas() {
        super();
    }
    
    
	// Crear recursivamente
	void crear(nodoMascotas r) {
            Scanner Leer=new Scanner(System.in);
		if (r != null) {
                    Mascotas x=new Mascotas();
                    x.leer();
                    r.setA(x);
			String ans;
			System.out.println("tendra izq?");
			ans = Leer.nextLine();
			if (ans.equals("s")) {
				nodoMascotas h_izq = new nodoMascotas();
				r.setIzq(h_izq);
				crear(r.getIzq());
			}

			System.out.println("der?");
			ans = Leer.nextLine();
			if (ans.equals("s")) {
				nodoMascotas h_der = new nodoMascotas();
				r.setDer(h_der);
				crear(r.getDer());
			}
		}
	}
    
        
        void preOrden(nodoMascotas x) {
		if (x != null) {
                    x.getA().mostrar();
                    preOrden(x.getIzq());
                    preOrden(x.getDer());
		}
	}
        
        
        void inOrden(nodoMascotas x) {
		if (x != null) {
                    inOrden(x.getIzq());
                    x.getA().mostrar();
                    inOrden(x.getDer());
		}
	}
        
        
        void posOrden(nodoMascotas x) {
		if (x != null) {
                    posOrden(x.getIzq());
                    posOrden(x.getDer());
                    x.getA().mostrar();

		}
	}
    
}
