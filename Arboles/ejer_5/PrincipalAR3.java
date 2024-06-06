package ejer_5;

/**
 *
 * @author print
 */
public class PrincipalAR3{
        
    
        //
    
    
        //
    
    
        //
    
    
	public static void main(String[] args) {
		ArbolBinarioNormalPersona A=new ArbolBinarioNormalPersona();
                nodoPersona raiz=new nodoPersona();
                A.setRaiz(raiz);
                A.crear(A.getRaiz());
                A.preOrden(A.getRaiz());
                
                
	}
}
