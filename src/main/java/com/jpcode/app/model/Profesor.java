package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "profesores")
public class Profesor extends Usuario{

	@Column(name = "fechaDeAlta")
	private String fechaDeAlta;
	
	@Column(name = "fechaDeBaja")
	private String fechaDeBaja;
	
	@Column(name = "materiasQueEnsenia")
	private String materiasQueEnsenia;
	
	@Column(name = "turnosQueTrabaja")
	private String turnosQueTrabaja;
	
	@Column(name = "sueldo")
	private String sueldo;
	
	@Column(name = "inasistencias")
	private int inasistencias;
	
	@Column(name = "sanciones")
	private String sanciones;

	
	public Profesor() {
	}

	public Profesor(String nombre, String apellido, String genero, String email, int dni, String fechaDeNacimiento, 
			String fechaDeAlta, String fechaDeBaja, String materiasQueEnsenia, String turnosQueTrabaja, String sueldo,
			int inasistencias, String sanciones) {
		
		super(nombre, apellido, genero, email, dni, fechaDeNacimiento);
		this.fechaDeAlta = fechaDeAlta;
		this.fechaDeBaja = fechaDeBaja;
		this.materiasQueEnsenia = materiasQueEnsenia;
		this.turnosQueTrabaja = turnosQueTrabaja;
		this.sueldo = sueldo;
		this.inasistencias = inasistencias;
		this.sanciones = sanciones;
	}

	
	public String getFechaDeAlta() {
		return fechaDeAlta;
	}

	public void setFechaDeAlta(String fechaDeAlta) {
		this.fechaDeAlta = fechaDeAlta;
	}

	public String getFechaDeBaja() {
		return fechaDeAlta;
	}

	public void setFechaDeBaja(String fechaDeBaja) {
		this.fechaDeBaja = fechaDeBaja;
	}
	public String getMateriasQueEnsenia() {
		return materiasQueEnsenia;
	}

	public void setMateriasQueEnsenia(String materiasQueEnsenia) {
		this.materiasQueEnsenia = materiasQueEnsenia;
	}

	public String getTurnosQueTrabaja() {
		return turnosQueTrabaja;
	}

	public void setTurnosQueTrabaja(String turnosQueTrabaja) {
		this.turnosQueTrabaja = turnosQueTrabaja;
	}

	public String getSueldo() {
		return sueldo;
	}

	public void setSueldo(String sueldo) {
		this.sueldo = sueldo;
	}

	public int getInasistencias() {
		return inasistencias;
	}

	public void setInasistencias(int inasistencias) {
		this.inasistencias = inasistencias;
	}

	public String getSanciones() {
		return sanciones;
	}

	public void setSanciones(String sanciones) {
		this.sanciones = sanciones;
	}

}
