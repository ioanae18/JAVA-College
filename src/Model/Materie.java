package Model;

public class Materie {
	private int codMaterie;
	private String Facultate;
	private String Specializare;
	private Profesor Profesor;
	
	public Materie() {
		super();
		this.codMaterie = -1;
		this.Facultate = "";
		this.Specializare = "";
		this.Profesor = new Profesor();

	}
	
	
	public Materie(int codMaterie, String facultate, String specializare, Profesor profesor) {
		super();
		this.codMaterie = codMaterie;
		this.Facultate = facultate;
		this.Specializare = specializare;
		this.Profesor = profesor;
	}
	
	public int getCodMaterie() {
		return codMaterie;
	}


	public void setCodMaterie(int codMaterie) {
		this.codMaterie = codMaterie;
	}


	public String getFacultate() {
		return Facultate;
	}


	public void setFacultate(String facultate) {
		Facultate = facultate;
	}


	public String getSpecializare() {
		return Specializare;
	}


	public void setSpecializare(String specializare) {
		Specializare = specializare;
	}


	public Profesor getProfesor() {
		return Profesor;
	}


	public void setProfesor(Profesor profesor) {
		Profesor = profesor;
	}


	@Override
	public String toString() {
		return "Materie [codMaterie=" + codMaterie + ", Facultate=" + Facultate + ", Specializare=" + Specializare
				+ ", Profesor=" + Profesor + "]";
	}
	
	
	
}