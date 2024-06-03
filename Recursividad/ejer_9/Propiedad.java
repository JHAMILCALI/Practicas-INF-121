package ejer_9;

import java.util.Scanner;

public class Propiedad {
	private  	int num;
	String tipoProp,ciProp;   	public Propiedad() {
		// TODO Esbozo de constructor generado automáticamente
	}
	public Propiedad(int num, String tipoProp, String ciProp) {
		super();
		this.num = num;
		this.tipoProp = tipoProp;
		this.ciProp = ciProp;
	}
	void leer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Intro num: ");
		num=sc.nextInt();
		System.out.println("Intro Tipo de propiedad: ");
		tipoProp=sc.next();
		System.out.println("Intro ci Propietario: ");
		ciProp=sc.next();
	}
	void mostrar() {
		System.out.println("NUM : "+num);
		System.out.println("TIPO DE PROPIEDAD : "+tipoProp);
		System.out.println("CI PROPIETARIO : "+ciProp);
		System.out.println("----------------------");
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getTipoProp() {
		return tipoProp;
	}
	public void setTipoProp(String tipoProp) {
		this.tipoProp = tipoProp;
	}
	public String getCiProp() {
		return ciProp;
	}
	public void setCiProp(String ciProp) {
		this.ciProp = ciProp;
	}
	
	
}
