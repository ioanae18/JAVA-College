package Model;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Profesor profesor1 = new Profesor(1,"Voinescu","Iulia","07-10-1950");
		Profesor profesor2 = new Profesor(1,"Voinea","Claudiu","02-12-1963");
		Profesor profesor3 = new Profesor(2,"Irinescu","Silviu","05-11-1959");
		Profesor profesor4 = new Profesor(2,"Toader","Irina","14-11-1969");
		
		System.out.println(profesor1.toString());
		System.out.println(profesor2.toString());
		System.out.println(profesor3.toString());
		System.out.println(profesor4.toString());
		
		Student student1 = new Student(1,"Popescu","Mihai","01-01-1996","13LF543","Matematica-Informatica");
		Student student2 = new Student(2,"Ivanescu","Aurel","12-12-1997","13LF155","Informatica Aplicata");
		Student student3 = new Student(3,"Tudorel","Ioana","10-09-1996","12LF342","Muzica");
		Student student4 = new Student(4,"Ivanescu","Aurel","12-12-1997","13LF765","Drept");
		
		System.out.println(student1.toString());
		System.out.println(student2.toString());
		System.out.println(student3.toString());
		System.out.println(student4.toString());
		
		Materie materie = new Materie(1,"SEEA","IE",profesor3);
		System.out.println(materie.toString());
		
		Nota nota1 = new Nota(10,"01-01-2018", materie ,student2);
		Nota nota2 = new Nota(8,"01-01-2018",materie,student1);
		Nota nota3 = new Nota(5,"01-01-2018",materie,student4);
		Nota nota4 = new Nota(7,"01-01-2018",materie,student3);
		System.out.println(nota1.toString());
		System.out.println(nota2.toString());
		
		Catalog c1 = new Catalog();
		c1.setGrupa("13LF765");
		c1.addNota(nota1);
		c1.addNota(nota2);
		c1.addNota(nota3);
		c1.addNota(nota4);
		System.out.println(c1.toString());
	}

}
