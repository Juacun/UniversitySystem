package com.jpcode.app.model;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class UsuarioLogin {

	@NotEmpty (message = "Ingrese un email valido")
	@Pattern(regexp = "^[^@]+@[^@]+\\.[a-zA-Z]{2,}$", message = "Ingrese un formato de email valido")
	private String email;
	
	@NotBlank
	@Size (min=8, message = "Longitud Minima 8 caracteres")
	private String clave;
	
	public UsuarioLogin() {
		
	}
	
	public UsuarioLogin(String email, String clave) {
		this.email = email;
		this.clave = clave;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getClave() {
		return clave;
	}

	public void setClave(String clave) {
		this.clave = clave;
	}
	
}
