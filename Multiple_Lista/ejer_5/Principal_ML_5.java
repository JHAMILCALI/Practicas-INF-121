package ejer_5;

public class Principal_ML_5 {
	public static void main(String[] args) {
		LS_NormalEstudiante A1 = new LS_NormalEstudiante();
		A1.adiFinal(new Estudiante("jose","78745378",22));
		A1.adiFinal(new Estudiante("jhamil","89475878",24));
		A1.adiFinal(new Estudiante("ana","64648748",19));
		A1.adiFinal(new Estudiante("abril","974757398",30));
		
		LS_NormalEstudiante A2 = new LS_NormalEstudiante();
		A2.adiFinal(new Estudiante("jhoel","764678589",25));
		A2.adiFinal(new Estudiante("jazmin","84674633",34));
		A2.adiFinal(new Estudiante("viktor","78877890",18));
		A2.adiFinal(new Estudiante("anahi","7485737490",27));
		A2.adiFinal(new Estudiante("angela","908547494",18));
		
		LS_NormalEstudiante A3 = new LS_NormalEstudiante();
		A3.adiFinal(new Estudiante("maycol","8573839",23));
		A3.adiFinal(new Estudiante("benjamin","9475749",23));
		
		LS_NormalEstudiante A4 = new LS_NormalEstudiante();
		A4.adiFinal(new Estudiante("maycol","8573839",23));
		A4.adiFinal(new Estudiante("benjamin","9475749",23));
		
		LS_NormalMateria B1 = new LS_NormalMateria();
		B1.adiFinal(new Materia("INF-121"), A1);
		B1.adiFinal(new Materia("INF-111"), A2);
		
		LS_NormalMateria B2 = new LS_NormalMateria();
		B2.adiFinal(new Materia("INF-131"), A3);
		B2.adiFinal(new Materia("INF-221"), A4);
		
		LS_NormalResponsable C1 = new LS_NormalResponsable();
		C1.adiFinal(new Responsable("lucas","2453648"));
		C1.adiFinal(new Responsable("adrian","8976478"));
		
		LS_NormalResponsable C2 = new LS_NormalResponsable();
		C2.adiFinal(new Responsable("lucas","2453648"));
		C2.adiFinal(new Responsable("adrian","8976478"));
		
		LS_NormalLaboratorio D = new LS_NormalLaboratorio();
		D.adiFinal(new Laboratorio("1A","P-2"), B1, C1);
		D.adiFinal(new Laboratorio("2A","P-2"), B1, C1);
		
		D.adiFinal(new Laboratorio("1B","P-1"), B2, C2);
		D.adiFinal(new Laboratorio("2B","P-1"), B2, C2);
		D.mostrar();
		
		//a. Mostrar el idLaboratorio donde se encuentra la 
		//materia con sigla “INF121”
		System.out.println("\t*****INCIISO A******");
		String materiaX="INF-121";
		inciso_a(D,materiaX);
		
	}

	private static void inciso_a(LS_NormalLaboratorio d, String materiaX) {
		NodoLaboratorio R = d.getP();
		while (R!=null) {
			Laboratorio la = R.getLaboratorio();
			NodoMateria S = R.getLMateria().getP();
			while (S!=null) {
				Materia ma = S.getMateria();
				if (ma.getSigla().equals(materiaX)) {
					System.out.println("De la materia "+ma.getSigla()
					+" su ID de laboratorio es: "+la.getIdLaboratorio());
				}
				S=S.getSig();
			}
			R=R.getSig();
		}
	}
}
