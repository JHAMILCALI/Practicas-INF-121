package ejer_5;

public class Principal {

	public static void main(String[] args) {
//		En una panadería muy famosa la atención al cliente es primordial para su crecimiento.
//		La panadería se toma muy en serio la atención preferencial a adultos mayores y niños.
//		Entonces, Los clientes <nombre, edad, celular>..
		PilaCliente c = new PilaCliente();
		Cliente c1 = new Cliente("jose",12,69454233);
		Cliente c2 = new Cliente("roberto",69,94554233);
		Cliente c3 = new Cliente("ana",8,944233);
		Cliente c4 = new Cliente("manuel",28,7454233);
		Cliente c5 = new Cliente("calixto",34,62454233);
		Cliente c6 = new Cliente("jhamil",11,35454233);
		Cliente c7 = new Cliente("sabina",68,69454233);
		Cliente c8 = new Cliente("jorge",34,54654233);
		
		c.adi(c1);
		c.adi(c2);
		c.adi(c3);
		c.adi(c4);
		c.adi(c5);
		c.adi(c6);
		c.adi(c7);
		c.adi(c8);
		System.out.println("\t******Pila De CLIENTES****** ");
		c.mostrar();
		
//		a. Una vez que ingresan todos a la panadería, serán reordenados y los primeros en
//		salir serán las personas mayores (>60 años) y niños (<12 años). Se pide
//		ordenarlos de esta manera.
		System.out.println("\n\t*****INCISO A******");
		inciso_a(c,60,12);
		c.mostrar();
//		b. Mostrar a los clientes que su celular comience con el número 6.
		System.out.println("\n\t*****INCISO B******");
		inciso_b(c,6);
//		c. Vaciar la panadería, que ya no tenga clientes para atender.
		System.out.println("\n\t*****INCISO C******");
		System.out.println("-----PANADERIA CON CLIENTES---");
		c.mostrar();
		System.out.println("\n-----PANADERIA SIN CLIENTES---");
		inciso_c(c);
		c.mostrar();
		System.out.println("Numero de clientes dentro de la panaderia: "+c.nroElem());

	}

	private static void inciso_c(PilaCliente c) {
		while (!c.esVacia()) {
			c.eli();
		}
	}
	private static void inciso_b(PilaCliente c, int i) {
		PilaCliente aux = new PilaCliente();
		while (!c.esVacia()) {
			Cliente cl = c.eli();
			int dig = primerDigitoClinte(cl);
			if (dig==i) {
				System.out.println("El clinte "+cl.getNombre()+" con el numero de celular: "+cl.getCelular());
			}
			aux.adi(cl);
		}
		c.vaciar(aux);
	}
	private static int primerDigitoClinte(Cliente cl) {
		String numeroStr =Integer.toString(cl.celular);
		char num = numeroStr.charAt(0);
		return Character.getNumericValue(num);
	}

	private static void inciso_a(PilaCliente c, int i, int j) {
		PilaCliente aux = new PilaCliente();
		PilaCliente aux2 = new PilaCliente();
		while (!c.esVacia()) {
			Cliente cl = c.eli();
			if (cl.edad>=i || cl.edad<=j) {
				aux.adi(cl);
			}else {
				aux2.adi(cl);
			}
		}
		c.vaciar(aux2);
		c.vaciar(aux);
	}

}
