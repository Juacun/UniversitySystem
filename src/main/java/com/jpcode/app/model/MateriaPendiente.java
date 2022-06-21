package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "materiasPendientes")
public class MateriaPendiente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fechaLimite")
	private String fechaLimite;
	
	@Column(name = "nombreMateria")
	private String nombreMateria;
	
	@Column(name = "notaMateria")
	private int notaMateria;
	
	@Column(name = "nombreProfesor")
	private String nombreProfesor;
	
	
	public MateriaPendiente(String fechaLimite, String nombreMateria, int notaMateria, String nombreProfesor) {
		this.fechaLimite = fechaLimite;
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

	public String getFechaLimite() {
		return fechaLimite;
	}

	public void setFecha(String fechaLimite) {
		this.fechaLimite = fechaLimite;
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