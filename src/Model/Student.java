package Model;

public class Student {
	private int nrMatricol;
	private String Nume;
	private String Prenume;
	private String dataNasterii;
	private String Grupa;
	private String Facultate;
	
	public Student() {
		super();
		this.nrMatricol = -1;
		this.Nume ="";
		this.Prenume = "";
		this.dataNasterii = "";
		this.Grupa = "";
	}
	
	public Student(int nrMatricol,String nume, String prenume, String dataNasterii, String grupa, String facultate) {
		super();
		this.nrMatricol = nrMatricol;
		this.Nume = nume;
		this.Prenume = prenume;
		this.dataNasterii = "01-01-1900";;
		this.Grupa = grupa;
		this.Facultate = facultate;
	}

	
	public int getNrMatricol() {
		return nrMatricol;
	}

	public void setNrMatricol(int nrMatricol) {
		this.nrMatricol = nrMatricol;
	}

	public String getNume() {
		return Nume;
	}

	public void setNume(String nume) {
		Nume = nume;
	}

	public String getPrenume() {
		return Prenume;
	}

	public void setPrenume(String prenume) {
		Prenume = prenume;
	}

	public String getDataNasterii() {
		return dataNasterii;
	}

	public void setDataNasterii(String dataNasterii) {
		this.dataNasterii = dataNasterii;
	}

	public String getGrupa() {
		return Grupa;
	}

	public void setGrupa(String grupa) {
		Grupa = grupa;
	}

	public String getFacultate() {
		return Facultate;
	}

	public void setFacultate(String facultate) {
		Facultate = facultate;
	}

	@Override
	public String toString() {
		return "Student [nrMatricol=" + nrMatricol + ", Nume=" + Nume + ", Prenume=" + Prenume + ", dataNasterii="
				+ dataNasterii + ", Grupa=" + Grupa + ", Facultate=" + Facultate + "]";
	}
	
	

	

	
	
}
