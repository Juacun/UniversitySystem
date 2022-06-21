package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "sanciones")
public class Sancion {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "motivo")
	private String motivo;
	
	@Column(name = "comentarios")
	private String comentarios;
	
	
	public Sancion(String fecha, String motivo, String comentarios) {
		this.fecha = fecha;
		this.motivo = motivo;
		this.comentarios = comentarios;
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

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
}