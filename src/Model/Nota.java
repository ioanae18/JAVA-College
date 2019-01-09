package Model;

public class Nota {
	private double Nota;
	private String Data;
	private Materie Materie;
	private Student student;

	public Nota() {
		super();
		this.Nota = -1;
		this.Data = "01-01-1990";
		this.Materie = new Materie();
		this.student = new Student();
	}

	public Nota(double nota, String data, Materie materie, Student student) {
		super();
		this.Nota = nota;
		this.Data = data;
		this.Materie = materie;
		this.student = student;
	}

	public double getNota() {
		return Nota;
	}

	public void setNota(double nota) {
		this.Nota = nota;
	}

	public String getData() {
		return Data;
	}

	public void setData(String data) {
		this.Data = data;
	}

	public Materie getMaterie() {
		return Materie;
	}

	public void setMaterie(Materie materie) {
		this.Materie = materie;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

	@Override
	public String toString() {
		return "Nota [nota=" + Nota + ", data=" + Data + ", materie=" + Materie + ", student=" + student + "]";
	}

}
