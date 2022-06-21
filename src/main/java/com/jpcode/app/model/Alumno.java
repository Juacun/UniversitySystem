package com.jpcode.app.model;

import java.util.*;
import javax.persistence.*;

@Entity
@Table(name = "alumnos")
public class Alumno extends Usuario{	
	
	@OneToMany(mappedBy = "alumnoId", cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
	private List<EstudioAlumno> estudiosAlumno;
	
	
	public Alumno() {
		super();
	}

	public Alumno(String nombre, String apellido, String genero, String email, int dni, String fechaDeNacimiento) {
		
		super(nombre, apellido, genero, email, dni, fechaDeNacimiento);
	}

	
	public List<EstudioAlumno> getEstudiosAlumno() {
		return estudiosAlumno;
	}

	public void setEstudiosAlumno(List<EstudioAlumno> estudiosAlumno) {
		this.estudiosAlumno = estudiosAlumno;
	}
	
	public void addEstudioAlumno(EstudioAlumno nuevoEstudioAlumno) {
		
		if(this.estudiosAlumno == null) this.estudiosAlumno = new ArrayList<EstudioAlumno>();
		
		this.estudiosAlumno.add(nuevoEstudioAlumno);
		nuevoEstudioAlumno.setAlumnoId(this);
	}
	
}
