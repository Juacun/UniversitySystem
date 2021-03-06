package com.jpcode.app.model;

import javax.persistence.*;
import javax.validation.constraints.*;

@MappedSuperclass
public abstract class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@NotEmpty (message = "Ingrese un nombre valido")
	@Size (min=2, message = "Longitud minima 2 caracteres")
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty (message = "Ingrese un apellido valido")
	@Size (min=2, message = "Longitud minima 2 caracteres")
	@Column(name = "apellido")
	private String apellido;
	
	@NotEmpty (message = "Seleccione una opcion")
	@Column(name = "genero")
	private String genero;
	
	@NotEmpty (message = "Ingrese un email valido")
	@Pattern(regexp = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$", message = "Ingrese un formato de email valido")
	@Column(name = "email")
	private String email;
	
	@Min(value = 1, message = "Ingresar un dni valido")
	@Max(value = 60000000, message = "numero muy alto, Ingrese un dni valido")
	@Column(name = "dni")
	private int dni;
	
	@NotEmpty (message = "Seleccione una fecha")
	@Column(name = "fechaDeNacimiento")
	private String fechaDeNacimiento;
	
	
	public Usuario() {
	}
	
	public Usuario(String nombre, String apellido, String genero, String email, int dni, String fechaDeNacimiento) {
		this.nombre = nombre;
		this.apellido = apellido;
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
	
}