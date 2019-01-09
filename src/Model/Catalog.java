package Model;

import java.util.ArrayList;

public class Catalog {
	private String grupa;
	private ArrayList<Nota> note;
	
	public Catalog(){
		this.note = new ArrayList<Nota>();
		this.grupa = "";
	}
	
	public Catalog(ArrayList<Nota> note, String grupa){
		this.note = note;
		this.grupa = grupa;
	}

	public ArrayList<Nota> getNote() {
		return note;
	}

	public void setNote(ArrayList<Nota>  note) {
		this.note = note;
	}

	public String getGrupa() {
		return grupa;
	}

	public void setGrupa(String grupa) {
		this.grupa = grupa;
	}

	public void addNota(Nota nota) {
		if(this.grupa.equals(nota.getStudent().getGrupa())) {
			note.add(nota);
		}else {
			System.out.println("Studentul nu apartine acestei grupe!");
		}
	}

	@Override
	public String toString() {
		return "Catalog [grupa=" + grupa + ", note=" + note + "]";
	}
	
}
