package com.jpcode.app.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jpcode.app.model.Alumno;
import com.jpcode.app.model.Usuario;
import com.jpcode.app.model.UsuarioLogin;
import com.jpcode.app.service.IUsuarioService;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/login")
	public String muestraPaginaLoginAlumno(Model modelo) {

		Usuario alumnoLogin = new Alumno();
		modelo.addAttribute("alumnoLogin", alumnoLogin);
		
		return "paginaLoginAlumno";
	}

	@RequestMapping("/procesarFormularioLogin")
	public String procesaFormularioLoginAlumno(@Valid @ModelAttribute("alumnoLogin") Alumno alumnoLogin,
			BindingResult resultadoValidacion) {
		
		if (resultadoValidacion.hasErrors()) {

			return "formularioRegistroAlumno";
		} else {
			
			usuarioService.save(alumnoLogin);
			return "paginaInicioAlumno";
		}
	}
	
	@RequestMapping("/register")
	public String muestraPaginaRegistroAlumno(Model modelo) {

		Usuario alumnoNuevo = new Alumno();
		modelo.addAttribute("alumnoNuevo", alumnoNuevo);

		return "paginaRegistroAlumno";
	}

	@RequestMapping("/procesarFormularioRegistro")
	public String procesaFormularioRegistroAlumno(@Valid @ModelAttribute("alumnoNuevo") Alumno alumnoNuevo,
			BindingResult resultadoValidacion) {
		
		if (resultadoValidacion.hasErrors()) {

			return "formularioRegistroAlumno";
		} else {
			
			usuarioService.save(alumnoNuevo);
			return "paginaHomeAlumno";
		}
	}
	
	@InitBinder
	public void myInitBinder(WebDataBinder myWebDataBinder) {
		
		StringTrimmerEditor myStringTrimmerEditor = new StringTrimmerEditor(true);
		myWebDataBinder.registerCustomEditor(String.class, myStringTrimmerEditor);
		
	}
}
