package com.jpcode.app.model;

import javax.persistence.*;

@Entity
@Table(name = "estudios_alumnos")
public class EstudioAlumno {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.DETACH, CascadeType.MERGE, CascadeType.REFRESH})
	@JoinColumn(name = "alumnoId")
	private Alumno alumnoId;
	
	@Column(name = "estadoEstudio")
	private String estadoEstudio;
	
	@Column(name = "tipoEstudio")
	private String tipoEstudio;
	
	@Column(name = "nombreEstudio")
	private String nombreEstudio;
	
	@Column(name = "cantidadMateriaAprobada")
	private int cantidadMateriaAprobada;
	
	@Column(name = "cantidadMateriaDesaprobada")
	private int cantidadMateriaDesaprobada;
	
	@Column(name = "cantidadMateriaPendiente")
	private int cantidadMateriaPendiente;
	
	
	public EstudioAlumno(String estadoEstudio, String tipoEstudio, String nombreEstudio, int cantidadMateriaAprobada, int cantidadMateriaDesaprobada, 
			int cantidadMateriaPendiente) {
		
		this.estadoEstudio = estadoEstudio;
		this.tipoEstudio = tipoEstudio;
		this.nombreEstudio = nombreEstudio;
		this.cantidadMateriaAprobada = cantidadMateriaAprobada;
		this.cantidadMateriaDesaprobada  = cantidadMateriaDesaprobada;
		this.cantidadMateriaPendiente = cantidadMateriaPendiente;
	}


	public int getId() {
		return id;
	}

	/*public void setId(int id) {
		this.id = id;
	}*/

	public Alumno getAlumnoId() {
		return alumnoId;
	}

	public void setAlumnoId(Alumno alumnoId) {
		this.alumnoId = alumnoId;
	}

	public String getEstadoEstudio() {
		return estadoEstudio;
	}
	
	public void setEstadoEstudio(String estadoEstudio) {
		this.estadoEstudio = estadoEstudio;
	}
	
	public String getTipoEstudio() {
		return tipoEstudio;
	}

	public void setTipoEstudio(String tipoEstudio) {
		this.tipoEstudio = tipoEstudio;
	}

	public String getNombreEstudio() {
		return nombreEstudio;
	}

	public void setNombreEstudio(String nombreEstudio) {
		this.nombreEstudio = nombreEstudio;
	}

	public int getCantidadMateriaAprobada() {
		return cantidadMateriaAprobada;
	}

	public void setCantidadMateriaAprobada(int cantidadMateriaAprobada) {
		this.cantidadMateriaAprobada = cantidadMateriaAprobada;
	}

	public int getCantidadMateriaDesaprobada() {
		return cantidadMateriaDesaprobada;
	}

	public void setCantidadMateriaDesaprobada(int cantidadMateariaDesaprobada) {
		this.cantidadMateriaDesaprobada = cantidadMateariaDesaprobada;
	}

	public int getCantidadMateriaPendiente() {
		return cantidadMateriaPendiente;
	}

	public void setCantidadMateriaPendiente(int cantidadMateriaPendiente) {
		this.cantidadMateriaPendiente = cantidadMateriaPendiente;
	}
	
}