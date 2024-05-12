package ejer_5;
public class NodoMateria{
	private Materia Materia;  //define el dato objeto Materia
	private LS_NormalEstudiante LEstudiantes;
	private NodoMateria sig; //definiendo el campo enlace sig
	
	public NodoMateria() {  //constructor
		sig = null;
	}

	public Materia getMateria() {
		return Materia;
	}

	public void setMateria(Materia materia) {
		Materia = materia;
	}

	public LS_NormalEstudiante getLEstudiantes() {
		return LEstudiantes;
	}

	public void setLEstudiantes(LS_NormalEstudiante lEstudiantes) {
		LEstudiantes = lEstudiantes;
	}

	public NodoMateria getSig() {
		return sig;
	}

	public void setSig(NodoMateria sig) {
		this.sig = sig;
	}


}
