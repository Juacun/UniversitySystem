package com.jpcode.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

	@RequestMapping("/")
	public String muestraPaginaIndex() {
		
		return "index";
	}
	
}
