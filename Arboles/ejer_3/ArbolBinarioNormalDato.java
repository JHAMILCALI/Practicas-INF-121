
package ejer_3;

import java.util.Scanner;

/**
 *
 * @author print
 */
public class ArbolBinarioNormalDato extends ArbolBinarioDato{

    public ArbolBinarioNormalDato() {
        super();
    }
    
    
	// Crear recursivamente
    public void crear(nodoDato r) {
        Scanner sc = new Scanner(System.in);
        if (r != null) {
            System.out.print("Introduce un número: ");
            int x = sc.nextInt();
            sc.nextLine();  // Consumir la nueva línea después de nextInt()
            r.setA(x);
            
            String ans;
            System.out.println("Tendrá hijo izquierdo? (s/n)");
            ans = sc.nextLine();
            if (ans.equalsIgnoreCase("s")) {
                nodoDato h_izq = new nodoDato();
                r.setIzq(h_izq);
                crear(r.getIzq());
            }
            
            System.out.println("Tendrá hijo derecho? (s/n)");
            ans = sc.nextLine();
            if (ans.equalsIgnoreCase("s")) {
                nodoDato h_der = new nodoDato();
                r.setDer(h_der);
                crear(r.getDer());
            }
        }
    }
    
        
        void preOrden(nodoDato x) {
		if (x != null) {
			System.out.println(x.getA());
                    
                    preOrden(x.getIzq());
                    preOrden(x.getDer());
		}
	}
        
        
        void inOrden(nodoDato x) {
		if (x != null) {
                    inOrden(x.getIzq());
                    System.out.println(x.getA());
                    //x.getA().mostrar();
                    inOrden(x.getDer());
		}
	}
        
        
        void posOrden(nodoDato x) {
		if (x != null) {
                    posOrden(x.getIzq());
                    posOrden(x.getDer());
                    System.out.println(x.getA());
                   // x.getA().mostrar();

		}
	}
    
}
