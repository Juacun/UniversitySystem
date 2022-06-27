package com.jpcode.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpcode.app.service.IUsuarioService;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/home")
	public String muestraPaginaHomeProfesor( ) {
		
		return "paginaHomeProfesor";
	}
}
