package com.jpcode.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpcode.app.model.Alumno;
import com.jpcode.app.model.Usuario;
import com.jpcode.app.service.IUsuarioService;

@Controller
@RequestMapping("/staff")
public class StaffController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/login")
	public String muestraPaginaProfesorInicio(Model modelo) {
		
		Usuario usuarioStaff = new Alumno();
		modelo.addAttribute("usuarioStaff", usuarioStaff);
		return "paginaLoginStaff";
	}
	
	@RequestMapping("/profesarFormularioLogin")
	public String procesarFormularioLoginStaff(@Valid @ModelAttribute("usuarioStaff") Usuario usuarioStaff,
			BindingResult resultadoValidacion) {
		
		return "paginaHomeStaff";
	}
}