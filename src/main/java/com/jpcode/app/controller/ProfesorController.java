package com.jpcode.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/profesor")
public class ProfesorController {

	@RequestMapping("/inicio")
	public String muestraPaginaProfesorInicio() {
		
		return "paginaProfesorInicio";
	}
}