package ejer_ejemplo;

public class Persona {
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
	}
	
	public Persona() {
		this.nombre = "";
		this.edad = 0;
	}
	public void mostrar() {
		System.out.println("Nombre:  "+nombre);
		System.out.println("Edad:    "+edad);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	
}
