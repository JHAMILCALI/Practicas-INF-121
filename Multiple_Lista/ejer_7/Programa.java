package ejer_7;

import java.util.Scanner;

public class Programa {
	private
		String nomPrograma,tipo,horarioInicio,dia;
		int duracion;
		public
		Programa() {
			
		}
		public Programa(String nomPrograma, String tipo, String horarioInicio, String dia, int duracion) {
			super();
			this.nomPrograma = nomPrograma;
			this.tipo = tipo;
			this.horarioInicio = horarioInicio;
			this.dia = dia;
			this.duracion = duracion;
		}
		void leer() {
			Scanner sc = new Scanner(System.in);
			System.out.println("Introduce el nombre del programa> ");
			nomPrograma=sc.next();
			System.out.println("Intro tipo> ");
			tipo=sc.next();
			System.out.println("Intro horario de Inicio> ");
			horarioInicio=sc.next();
			System.out.println("Intro Duracion> ");
			duracion=sc.nextInt();
			System.out.println("Intro dia> ");
			dia=sc.next();
		}
		void mostrar() {
			System.out.println("NOMBRE: "+nomPrograma);
			System.out.println("TIPO: "+tipo);
			System.out.println("HORA DE INICIO: "+horarioInicio);
			System.out.println("DIA: "+dia);
			System.out.println("DURACION : "+duracion);
		}
		public String getNomPrograma() {
			return nomPrograma;
		}
		public void setNomPrograma(String nomPrograma) {
			this.nomPrograma = nomPrograma;
		}
		public String getTipo() {
			return tipo;
		}
		public void setTipo(String tipo) {
			this.tipo = tipo;
		}
		public String getHorarioInicio() {
			return horarioInicio;
		}
		public void setHorarioInicio(String horarioInicio) {
			this.horarioInicio = horarioInicio;
		}
		public String getDia() {
			return dia;
		}
		public void setDia(String dia) {
			this.dia = dia;
		}
		public int getDuracion() {
			return duracion;
		}
		public void setDuracion(int duracion) {
			this.duracion = duracion;
		}
}
