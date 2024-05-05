package ejer_7;

import java.util.Scanner;

public class Principal_LD_7 {
	public static void main(String[] args) {
		LD_NormalProducto A = new LD_NormalProducto();
		A.adiFinal(new producto("chetos",0,2.9));
		A.adiFinal(new producto("arroz",5,10));
		A.adiFinal(new producto("mayonesa",30,2.5));
		A.adiFinal(new producto("papas",0,6));
		A.adiFinal(new producto("coca cola",28,10.5));
		A.adiFinal(new producto("helado",45,2));
		A.adiFinal(new producto("cafe",26,1.5));
		A.adiFinal(new producto("leche",0,6.5));
		A.adiFinal(new producto("azucar",23,12));
		A.adiFinal(new producto("sublime",16,2.9));
		
		A.mostrar();
		//a. Calcular el valor total del inventario.
		System.out.println("\t*******Inciso A*****");
		double valorTotalInventario= inciso_a(A);
		System.out.println("El valor total del inventario es: "+valorTotalInventario);
		//b. Encontrar el producto más caro y el más barato.
		System.out.println("\t*******Inciso B*****");
		inciso_b(A);
		//Incrementar la cantidad en stock de un producto específico.
		System.out.println("\t*******Inciso C*****");
		System.out.println("Introduce el nombre del productoX a incrementar: ");
		String proX="ublime";
		inciso_c(A,proX);
		A.mostrar();
		//d. Eliminar todos los productos que tengan una cantidad en stock igual a cero.
		System.out.println("\t*******Inciso D*****");
		inciso_d(A);
		A.mostrar();
		
	}

	private static void inciso_d(LD_NormalProducto a) {
		Nodoproducto R = a.getP();
		while (R!=null) {
			producto pro = R.getproducto();
			if (pro.getCanEstok()==0) {
				if (R==a.getP()) {
					if (R.getSig()!=null) {
						R=R.getSig();
						a.setP(R);
						R.setAnt(null);
					}
				}else {
					if (R.getSig()!=null) {
						R.getSig().setAnt(R.getAnt());
					}
					R.getAnt().setSig(R.getSig());
					R=R.getSig();
				}
			}else {
				R=R.getSig();
			}
			
		}
		
	}

	private static void inciso_c(LD_NormalProducto a, String proX) {
		Nodoproducto R = a.getP();
		Scanner sc = new Scanner(System.in);
		boolean sw=false;
		while (R!=null) {
			producto pro = R.getproducto();
			if (pro.getNombre().equals(proX)) {
				System.out.println("Introduce la cantidad de Stock a incrementar: ");
				int stockX=sc.nextInt();
				pro.setCanEstok(stockX);
				sw=true;
			}
			R=R.getSig();
		}
		if (!sw) {
			System.out.println("No se encontro el producto "+proX);
		}
		
	}

	private static void inciso_b(LD_NormalProducto a) {
		Nodoproducto R = a.getP();
		Nodoproducto S = a.getP();
		double menor = menor_Precio(a);
		double mayor = mayor_precio(a);
		System.out.println("\tEL PRODUCTO MAS BARATO");
		while (R!=null) {
			producto pro = R.getproducto();
			if (pro.getPrecio()==menor) {
				pro.mosttra();
			}
			R=R.getSig();
		}
		System.out.println("\tEL PRODUCTO MAS CARRO");
		while (S!=null) {
			producto pro = S.getproducto();
			if (pro.getPrecio()==mayor) {
				pro.mosttra();
			}
			S=S.getSig();
		}
		
		
	}

	private static double mayor_precio(LD_NormalProducto a) {
		Nodoproducto R = a.getP();
		double max=Integer.MIN_VALUE;
		while (R!=null) {
			producto pr = R.getproducto();
			if (pr.getPrecio()>max) {
				max=pr.getPrecio();
			}
			R=R.getSig();
		}
		return max;
	}

	private static double menor_Precio(LD_NormalProducto a) {
		Nodoproducto R = a.getP();
		double men=Integer.MAX_VALUE;
		while (R!=null) {
			producto pr = R.getproducto();
			if (pr.getPrecio()<men) {
				men=pr.getPrecio();
			}
			R=R.getSig();
		}
		return men;
	}

	private static double inciso_a(LD_NormalProducto a) {
		Nodoproducto R = a.getP();
		double contador=0,total=0;
		while (R!=null) {
			producto dato = R.getproducto();
			total=dato.getPrecio()*dato.getCanEstok();
			contador+=total;
			R=R.getSig();
		}
		return contador;
	}
}
