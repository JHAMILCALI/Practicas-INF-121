package ejer_1;
public class Principa1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ColaSimpleColor A = new ColaSimpleColor();
		A.adi("Rojo");
		A.adi("Naranjado");
		A.adi("Amarillo");
		A.adi("Verde");
		A.adi("Azul");
		A.adi("Morado");
		A.adi("Turquesa");
		System.out.println("\n******* COLA SIMPLE DE COLORES ****");
		A.mostrar();
		System.out.println("\n----ELIMINAR LOS COLORES CENTRALES------");
		A.mostrar();
		System.out.println("NRO ELEM: "+A.nroElem());
		System.out.println("\n**** COLA SIMPLE DE COLORES CON LOS COLORES CENTRALES ELIMINADOS *****");
		eliminarColorCentral(A);
		A.mostrar();
		System.out.println("NRO ELEM: "+A.nroElem());
		
	}
	static void eliminarColorCentral(ColaSimpleColor Z) {
		ColaSimpleColor aux = new ColaSimpleColor();
		int nroElem = Z.nroElem();
		int cont = 0;
		if(nroElem % 2 == 0) {
			int m = nroElem/2;
			int k = nroElem/2 + 1;
			while(!Z.esVacia()) {
				String color = Z.eli();
				cont ++;
				if(cont!=m && cont!=k ) {
					aux.adi(color);
				}
			}
			Z.vaciar(aux);
		}
		else {
			int k = (int)(nroElem/2) + 1;
			while(!Z.esVacia()) {
				String color = Z.eli();
				cont ++;
				if(cont!=k ) {
					aux.adi(color);
				}
			}
			Z.vaciar(aux);
		}
	}

}
