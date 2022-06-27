package com.jpcode.app.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@MappedSuperclass
public abstract class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	protected int id;
	
	@NotEmpty (message = "Ingrese un nombre valido")
	@Size (min=2, message = "Longitud minima 2 caracteres")
	@Column(name = "nombre")
	protected String nombre;
	
	@NotEmpty (message = "Ingrese un apellido valido")
	@Size (min=2, message = "Longitud minima 2 caracteres")
	@Column(name = "apellido")
	protected String apellido;
	
	@NotBlank
	@Size (min=8, message = "Longitud Minima 8 caracteres")
	@Column(name = "clave")
	protected String clave;
	
	@NotEmpty (message = "Seleccione una opcion")
	@Column(name = "genero")
	protected String genero;
	
	@NotEmpty (message = "Ingrese un email valido")
	@Pattern(regexp = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$", message = "Ingrese un formato de email valido")
	@Column(name = "email")
	protected String email;
	
	@Min(value = 1, message = "Ingresar un dni valido")
	@Max(value = 60000000, message = "numero muy alto, Ingrese un dni valido")
	@Column(name = "dni")
	protected int dni;
	
	@NotEmpty (message = "Seleccione una fecha")
	@Column(name = "fechaDeNacimiento")
	protected String fechaDeNacimiento;
	
	@Column(name = "isEstadoActivo")
	protected boolean isEstadoActivo;
	
	public Usuario() {
	}
	
	public Usuario(String nombre, String apellido, String clave, String genero, String email, int dni, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.clave = clave;
		this.genero = genero;
		this.email = email;
		this.dni = dni;
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	
	public int getId() {
		return id;
	}
	
	/*public void setId(int id) {
		this.id = id;
	}*/

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String mail) {
		this.email = mail;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}

	public boolean isEstadoActivo() {
		return isEstadoActivo;
	}

	public void setEstadoActivo(boolean isEstadoActivo) {
		this.isEstadoActivo = isEstadoActivo;
	}

}