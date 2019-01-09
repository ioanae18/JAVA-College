package Model;

public class Profesor {
	private int codProfesor;
	private String Nume;
	private String Prenume;
	private String dataNasterii;
	
	public Profesor() {
		super();
		this.codProfesor = -1;
		this.Nume ="";
		this.Prenume ="";
		this.dataNasterii = "01-01-1990";
	}

	public Profesor(int codProfesor, String nume, String prenume, String dataNasterii) {
		super();
		this.codProfesor = codProfesor;
		this.Nume = nume;
		this.Prenume = prenume;
		this.dataNasterii = dataNasterii;
	}

	public int getCodProfesor() {
		return codProfesor;
	}

	public void setCodProfesor(int codProfesor) {
		this.codProfesor = codProfesor;
	}

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		this.Nume = nume;
	}

	public String getPrenume() {
		return Prenume;
	}

	public void setPrenume(String prenume) {
		this.Prenume = prenume;
	}

	public String getDataNasterii() {
		return dataNasterii;
	}

	public void setDataNasterii(String dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	@Override
	public String toString() {
		return "Profesor [codProfesor=" + codProfesor + ", nume=" + Nume + ", prenume=" + Prenume + ", dataNasterii="
				+ dataNasterii + "]";
	}
	
	
}
