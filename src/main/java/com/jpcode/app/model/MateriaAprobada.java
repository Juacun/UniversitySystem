package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "materiasAprobadas")
public class MateriaAprobada {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "nombreMateria")
	private String nombreMateria;
	
	@Column(name = "notaMateria")
	private int notaMateria;
	
	@Column(name = "nombreProfesor")
	private String nombreProfesor;
	
	
	public MateriaAprobada(String fecha, String nombreMateria, int notaMateria, String nombreProfesor) {
		this.fecha = fecha;
		this.nombreMateria = nombreMateria;
		this.notaMateria = notaMateria;
		this.nombreProfesor = nombreProfesor;
	}


	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	public int getNotaMateria() {
		return notaMateria;
	}

	public void setNotaMateria(int notaMateria) {
		this.notaMateria = notaMateria;
	}

	public String getNombreProfesor() {
		return nombreProfesor;
	}

	public void setNombreProfesor(String nombreProfesor) {
		this.nombreProfesor = nombreProfesor;
	}
	
}