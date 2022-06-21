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
import com.jpcode.app.service.IUsuarioService;
import com.jpcode.app.service.UsuarioServiceImpl;

@Controller
@RequestMapping("/alumno")
public class AlumnoController {

	@Autowired
	private IUsuarioService usuarioService;
	
	@RequestMapping("/acceder")
	public String muestraPaginaAlumnoInicio() {

		return "paginaInicioAlumno";
	}

	@RequestMapping("/registrarse")
	public String muestraFormularioRegistroAlumno(Model modelo) {

		Usuario alumnoNuevo = new Alumno();
		modelo.addAttribute("alumnoNuevo", alumnoNuevo);

		return "formularioRegistroAlumno";
	}

	@RequestMapping("/procesarFormularioRegistro")
	public String procesaFormularioRegistroAlumno(@Valid @ModelAttribute("alumnoNuevo") Alumno alumnoNuevo,
			BindingResult resultadoValidacion) {
		
		if (resultadoValidacion.hasErrors()) {

			return "formularioRegistroAlumno";
		} else {
			
			usuarioService.save(alumnoNuevo);
			return "paginaInicioAlumno";
		}
	}
	
	@InitBinder
	public void myInitBinder(WebDataBinder myWebDataBinder) {
		
		StringTrimmerEditor myStringTrimmerEditor = new StringTrimmerEditor(true);
		myWebDataBinder.registerCustomEditor(String.class, myStringTrimmerEditor);
		
	}
}
