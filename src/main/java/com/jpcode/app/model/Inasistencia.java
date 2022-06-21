package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "inasistencias")
public class Inasistencia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "fecha")
	private String fecha;
	
	@Column(name = "isJustificado")
	private String isJustificado;
	
	@Column(name = "urlJustificado")
	private String urlJustificado;
	
	@Column(name = "comenetarios")
	private String comentarios;
	
	
	public Inasistencia(String fecha, String isJustificado, String urlJustificado, String comentarios) {
		this.fecha = fecha;
		this.isJustificado = isJustificado;
		this.urlJustificado = urlJustificado;
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

	public String getIsJustificado() {
		return isJustificado;
	}

	public void setIsJustificado(String isJustificado) {
		this.isJustificado = isJustificado;
	}

	public String getUrlJustificado() {
		return urlJustificado;
	}

	public void setUrlJustificado(String urlJustificado) {
		this.urlJustificado = urlJustificado;
	}

	public String getComentarios() {
		return comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}
	
	
}