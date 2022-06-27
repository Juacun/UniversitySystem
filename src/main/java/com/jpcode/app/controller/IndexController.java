package com.jpcode.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class IndexController {
	
	@RequestMapping("inicio")
	public String muestraPaginaIndex2() {
		
		return "index";
	}
	
	@RequestMapping("/novedades")
	public String muestraPaginaNovedades() {
		
		return "novedades";
	}
	
	@RequestMapping("/contacto")
	public String muestraPaginaContacto() {
		
		return "contact";
	}
	
}
