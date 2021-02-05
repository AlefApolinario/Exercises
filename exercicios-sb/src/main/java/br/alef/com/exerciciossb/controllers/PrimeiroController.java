package br.alef.com.exerciciossb.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		
		String c = "Olá Spring Boot";
		
		return c;
	}
}
