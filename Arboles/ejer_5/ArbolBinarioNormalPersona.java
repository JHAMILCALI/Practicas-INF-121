
package ejer_5;

import java.util.Scanner;

/**
 *
 * @author print
 */
public class ArbolBinarioNormalPersona extends ArbolBinarioPersona{

    public ArbolBinarioNormalPersona() {
        super();
    }
    
    
	// Crear recursivamente
	void crear(nodoPersona r) {
            Scanner Leer=new Scanner(System.in);
		if (r != null) {
                    Persona x=new Persona();
                    x.leer();
                    r.setA(x);
			String ans;
			System.out.println("tendra izq?");
			ans = Leer.nextLine();
			if (ans.equals("s")) {
				nodoPersona h_izq = new nodoPersona();
				r.setIzq(h_izq);
				crear(r.getIzq());
			}

			System.out.println("der?");
			ans = Leer.nextLine();
			if (ans.equals("s")) {
				nodoPersona h_der = new nodoPersona();
				r.setDer(h_der);
				crear(r.getDer());
			}
		}
	}
    
        
        void preOrden(nodoPersona x) {
		if (x != null) {
                    x.getA().mostrar();
                    preOrden(x.getIzq());
                    preOrden(x.getDer());
		}
	}
        
        
        void inOrden(nodoPersona x) {
		if (x != null) {
                    inOrden(x.getIzq());
                    x.getA().mostrar();
                    inOrden(x.getDer());
		}
	}
        
        
        void posOrden(nodoPersona x) {
		if (x != null) {
                    posOrden(x.getIzq());
                    posOrden(x.getDer());
                    x.getA().mostrar();

		}
	}
    
}
